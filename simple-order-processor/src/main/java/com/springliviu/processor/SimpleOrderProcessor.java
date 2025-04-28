package com.springliviu.processor;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

import java.io.Reader;
import java.util.*;
import java.util.stream.*;

/**
 * Читает CSV (userId,amount), группирует и считает статистику.
 */
public class SimpleOrderProcessor {

    /**
     * @param csvReader Reader, отдающий CSV с заголовком userId,amount
     * @return OrderStats со статистикой по каждому userId
     */
    public OrderStats process(Reader csvReader) throws Exception {
        List<CSVRecord> records = CSVFormat.DEFAULT
                .withHeader("userId","amount")
                .withFirstRecordAsHeader()
                .parse(csvReader)
                .getRecords();

        // Группировка сумм по userId
        Map<String, Double> sumPerUser = records.stream()
                .collect(Collectors.groupingBy(
                        r -> r.get("userId"),
                        Collectors.summingDouble(r -> Double.parseDouble(r.get("amount")))
                ));

        // Группировка количества по userId
        Map<String, Integer> countPerUser = records.stream()
                .collect(Collectors.groupingBy(
                        r -> r.get("userId"),
                        Collectors.reducing(0, r -> 1, Integer::sum)
                ));

        return new OrderStats(countPerUser, sumPerUser);
    }

}