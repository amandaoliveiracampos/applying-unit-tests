package org.example.service;

import org.example.entities.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

public class BonusServiceTest {


    @Test
    public void bonusShouldBeZeroForEmployeeWithVeryHighSalary() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calculateBonus(new Employee("Amanda", LocalDate.now(), new BigDecimal("25000")));
        Assert.assertEquals(new BigDecimal("0.00"), bonus);
    }

    @Test
    public void bonusShouldBe10PercentOfsalary() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calculateBonus(new Employee("Amanda", LocalDate.now(), new BigDecimal("2500")));
        Assert.assertEquals(new BigDecimal("250.00"), bonus);
    }

    @Test
    public void bonusShouldBe10PercentForSalaryOf10000() {
        BonusService bonusService = new BonusService();
        BigDecimal bonus = bonusService.calculateBonus(new Employee("Amanda", LocalDate.now(), new BigDecimal("10000")));
        Assert.assertEquals(new BigDecimal("1000.00"), bonus);
    }
}