package ru.chukhontsev.mathematics;
import static java.lang.Math.pow;
import static java.lang.Double.parseDouble;

public class SummatorNumbers implements NumberSummable {

    public  double sumNumbers(Number... numbers) {
        double sum = 0.0;
        if(numbers.length == 0) throw new IllegalArgumentException("Список значений пуст");
        for (Number number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }

    @Override
    public double power(String x, String y) {
        return pow(parseDouble(x),parseDouble(y) );
    }


}
