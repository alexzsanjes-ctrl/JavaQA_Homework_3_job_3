public class Main {
    public static void main(String[] args) {
        CreditPaymentService Service = new CreditPaymentService();
        int PaymentForOneYears = Service.Calculate(1_000_000, 12, 9.99);
        System.out.println("Платёж по кредиту на сумму 1 000 000 рублей, сроком на 1 год, с процентной ставкой 9.99% составит: " + (PaymentForOneYears) + " рублей в месяц");
        int PaymentForTwoYears = Service.Calculate(1_000_000, 24, 9.99);
        System.out.println("Платёж по кредиту на сумму 1 000 000 рублей, сроком на 1 год, с процентной ставкой 9.99% составит: " + (PaymentForTwoYears) + " рублей в месяц");
        int PaymentForThreeYears = Service.Calculate(1_000_000, 36, 9.99);
        System.out.println("Платёж по кредиту на сумму 1 000 000 рублей, сроком на 1 год, с процентной ставкой 9.99% составит: " + (PaymentForThreeYears) + " рублей в месяц");

    }
}
