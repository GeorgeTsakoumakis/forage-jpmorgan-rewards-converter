import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        // Test 1: $100 = 28571 miles
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        int miles = rewardValue.getMilesValue();
        assertEquals(28571, miles);
        assertEquals(0.0035, RewardValue.MILES_TO_CASH_CONVERSION_RATE);
    }

    @Test
    void convert_from_miles_to_cash() {
        // Test 2: 10000 miles = $35
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double cash = rewardValue.getCashValue();
        assertEquals(35, cash);
        assertEquals(0.0035, RewardValue.MILES_TO_CASH_CONVERSION_RATE);
    }
}
