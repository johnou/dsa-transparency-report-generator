package com.sulake.dsa;

import java.io.IOException;
import java.sql.SQLException;

/**
 * @author Johno Crawford (johno@sulake.com)
 */
public class ExportMain {

    public static final String SERVICE_PROVIDER = "ACME";

    public static final String REPORT_START_DATE = "2024-02-17";
    public static final String REPORT_END_DATE = "2025-02-17";
    public static final String REPORT_PERIOD = REPORT_START_DATE + "/" + REPORT_END_DATE;

    public static final String DATE_OF_PUBLICATION_OF_THE_REPORT = "2025-04-17";
    public static final String DATE_OF_PUBLICATION_OF_THE_LATEST_PREVIOUS_REPORT = "2025-04-17";


    public static void main(String[] args) throws IOException, SQLException {
        startExport();
    }

    private static void startExport() throws IOException, SQLException {
        TransparencyReportCsvExporter.generateTransparencyCSVs("Habbo");
    }

}
