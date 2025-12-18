public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int paymentForOneYears = service.calculate(1_000_000, 12, 9.99);
        System.out.println("Платёж по кредиту на сумму 1 000 000 рублей, сроком на 1 год, с процентной ставкой 9.99% составит: " + (paymentForOneYears) + " рублей в месяц");
        int paymentForTwoYears = service.calculate(1_000_000, 24, 9.99);
        System.out.println("Платёж по кредиту на сумму 1 000 000 рублей, сроком на 2 года, с процентной ставкой 9.99% составит: " + (paymentForTwoYears) + " рублей в месяц");
        int paymentForThreeYears = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Платёж по кредиту на сумму 1 000 000 рублей, сроком на 3 года, с процентной ставкой 9.99% составит: " + (paymentForThreeYears) + " рублей в месяц");

    }
}
