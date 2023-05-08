public class RewardValue {
    private double cashValue;
    public static final double MILES_TO_CASH_CONVERSION_RATE = 0.0035;

    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
    }

    public RewardValue(int milesValue) {
        this.cashValue = milesValue * MILES_TO_CASH_CONVERSION_RATE;
    }

    public int getMilesValue() {
        return ConvertCashToMiles(this.cashValue);
    }

    private static double ConvertMilesToCash(int milesValue) {
        return (milesValue * MILES_TO_CASH_CONVERSION_RATE);
    }

    private static int ConvertCashToMiles(double cashValue) {
        return (int) (cashValue / MILES_TO_CASH_CONVERSION_RATE);
    }

    public double getCashValue() {
        return this.cashValue;
    }
}
