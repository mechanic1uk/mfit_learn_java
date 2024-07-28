package ru.chukhontsev.mathematics;

public class SummatorNumbers implements NumberSummable {

    public  double sumNumbers(Number... numbers) {
        double sum = 0.0;
        if(numbers.length == 0) throw new IllegalArgumentException("Список значений пуст");
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

 }
