package ru.netology.services;


public class Main {
    public static void main(String[] args) {

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        CountMonthService service = new CountMonthService();

        System.out.println(service.calculate(income, expenses, threshold));
    }
}