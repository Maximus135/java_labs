package lab6;

import java.math.BigDecimal;

public class Temp {
    public void check() {
        final String str = "str";
        // System.out.println(str instanceof Integer); // instanceof - это ключевое
        // слово. Это двоичный оператор,
        // используемый для проверки, является ли объект (экземпляр)
        // подтипом данного типа. Даже не дает запустить
        final BigDecimal bigDecimal = new BigDecimal(100); // final неизменный
        final BigDecimal bigDecimal1 = new BigDecimal(100);
        final BigDecimal bigDecimal2 = bigDecimal.add(bigDecimal1);
        // BigDecimal bigDecimal3 = bigDecimal + bigDecimal1;
    }
}
