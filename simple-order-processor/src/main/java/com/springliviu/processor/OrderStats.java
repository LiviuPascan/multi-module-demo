package com.springliviu.processor;

import java.util.Map;

/** Итоговая статистика по пользователям */
public class OrderStats {
    private final Map<String, Integer> countPerUser;
    private final Map<String, Double> sumPerUser;

    public OrderStats(Map<String, Integer> countPerUser, Map<String, Double> sumPerUser) {
        this.countPerUser = countPerUser;
        this.sumPerUser   = sumPerUser;
    }

    public Map<String, Integer> getCountPerUser() { return countPerUser; }
    public Map<String, Double>  getSumPerUser()   { return sumPerUser;   }
}