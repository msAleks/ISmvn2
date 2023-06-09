package ru.netology.services;

public class CountMonthService {
    public CountMonthService() {
    }

    public int calculate(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                count = count + 1;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }

        return count;
    }
}

