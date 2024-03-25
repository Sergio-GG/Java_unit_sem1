package Calculator;

public class Calculator {
    public static double calculatingDiscount(double purchaseAmount, int discountAmount) {

        if(purchaseAmount < 0){
            throw new ArithmeticException("Price cannot be negative");
        }
        if(purchaseAmount == 0){
            throw new ArithmeticException("Price cannot equals zero");
        }
        if(discountAmount < 0){
            throw new ArithmeticException("Discount cannot be negative");
        }
        double result = purchaseAmount - (purchaseAmount * discountAmount / 100);
        return result;
    }
}