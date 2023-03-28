public class CalcDiscont {
    public static double calculateDiscount(int i, int after18) {
        double discount = 0.0;
        if (i % 2 == 0) { // если i - четное число, то даем скидку 2%
            discount += 0.02;
        }
        if (after18 == 1) { // если покупка совершена после 18:00, то даем скидку 2%
            discount += 0.02;
        }
        return discount;
    }

}
