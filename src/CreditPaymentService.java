public class CreditPaymentService {
    public int Calculate(int Credit, int Term, double Rate) {
        double Percent = (Rate / 100) / 12; // процентная ставка в месяц
        double Payment; // Ежемесячный платёж
        Payment = Credit * (Percent * Math.pow((1 + Percent), Term)) / ((Math.pow((1 + Percent), Term)) - 1); // Расчёт ежемесячного платежа
        return (int) Payment;
    }
}
