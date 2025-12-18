public class CreditPaymentService {
    public int calculate(int credit, int term, double rate) {
        double percent = (rate / 100) / 12; // процентная ставка в месяц
        double payment; // Ежемесячный платёж
        payment = credit * (percent * Math.pow((1 + percent), term)) / ((Math.pow((1 + percent), term)) - 1); // Расчёт ежемесячного платежа
        return (int) payment;
    }
}
