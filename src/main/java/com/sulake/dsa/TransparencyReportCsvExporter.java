package com.sulake.dsa;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Johno Crawford (johno@sulake.com)
 */
public class TransparencyReportCsvExporter {

    public static void generateTransparencyCSVs(String serviceName) throws IOException, SQLException {
        for (TransparencyTemplate tmpl : TransparencyTemplate.values()) {
            CsvMapper csvMapper = new CsvMapper();
            csvMapper.disable(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
            CsvSchema schema = csvMapper.schemaFor(tmpl.getDtoClass()).withHeader();
            @SuppressWarnings("unchecked")
            List<Object> rows;
            try (InputStream in = TransparencyReportCsvExporter.class
                    .getClassLoader()
                    .getResourceAsStream(tmpl.getResourcePath())) {
                rows = csvMapper.readerFor(tmpl.getDtoClass()).with(schema).readValues(in)
                        .readAll();
            } catch (IOException e) {
                throw new UncheckedIOException(e);
            }

            tmpl.getProcessor().process(rows, serviceName);

            File out = new File(tmpl.formatOutputFile(serviceName));
            try (Writer w = Files.newBufferedWriter(
                    out.toPath(),
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING
            )) {
                w.write('\uFEFF');
                csvMapper.writerFor(tmpl.getDtoClass())
                        .with(schema.withHeader())
                        .writeValues(w)
                        .writeAll(rows);
            }
        }
    }
}
