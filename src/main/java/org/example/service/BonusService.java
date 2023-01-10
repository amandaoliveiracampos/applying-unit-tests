package org.example.service;

import org.example.entities.Employee;

import java.math.BigDecimal;

public class BonusService {

    public BigDecimal calcularBonus(Employee employee) {
        BigDecimal value = employee.getWage().multiply(new BigDecimal("0.1"));
        if (value.compareTo(new BigDecimal("1000")) > 0) {
            value = BigDecimal.ZERO;

        }
        return value;
    }
}
