package Calculator;
import static org.assertj.core.api.Assertions.*;

public class CalculatorTest {
    public static void main(String[] args) {
        //Task 1.
        System.out.println("Результат: " + Calculator.calculatingDiscount(20, 10));
        assertThat(Calculator.calculatingDiscount(100, 10)).isEqualTo(90);
        assertThat(Calculator.calculatingDiscount(87.5, 10)).isEqualTo(78.75);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(0, 10)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(- 55, 10)
        ).isInstanceOf(ArithmeticException.class);
        assertThatThrownBy(() ->
                Calculator.calculatingDiscount(20, -10)
        ).isInstanceOf(ArithmeticException.class);
    }
}