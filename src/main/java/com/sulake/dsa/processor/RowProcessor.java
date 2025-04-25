package com.sulake.dsa.processor;

import java.util.List;

/**
 * Processor that mutates a list of DTO rows before CSV output.
 */
@FunctionalInterface
public interface RowProcessor<T> {
    void process(List<T> rows, String service);
}
