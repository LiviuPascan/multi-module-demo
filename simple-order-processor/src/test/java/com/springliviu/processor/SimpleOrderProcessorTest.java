package com.springliviu.processor;

import org.testng.annotations.Test;

import java.io.StringReader;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/** Тестируем SimpleOrderProcessor */
class SimpleOrderProcessorTest {

    @Test
    void testProcess() throws Exception {
        String csv = "userId,amount\n" +
                "u1,100.0\n" +
                "u2,50.5\n" +
                "u1,25.0\n";
        SimpleOrderProcessor proc = new SimpleOrderProcessor();
        OrderStats stats = proc.process(new StringReader(csv));

        Map<String, Integer> counts = stats.getCountPerUser();
        Map<String, Double>  sums   = stats.getSumPerUser();

        assertEquals(2, counts.get("u1"));
        assertEquals(1, counts.get("u2"));

        assertEquals(125.0, sums.get("u1"));
        assertEquals(50.5, sums.get("u2"));
    }
}