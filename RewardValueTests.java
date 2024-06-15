import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  RewardValueTests {

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
        double cashValue = 100.0;
        RewardValue rewardValue = new RewardValue(cashValue);

        // Calculate expected miles based on the conversion rate (0.0035)
        int expectedMiles = (int) (cashValue / 0.0035);

        // Verify that the calculated miles match the expected miles
        assertEquals(expectedMiles, rewardValue.getMilesValue());
    }
    @Test
    void convert_from_miles_to_cash() {
        int milesValue = 5000;
        RewardValue rewardValue = new RewardValue(milesValue);

        // Calculate expected cash based on the conversion rate (0.0035)
        double expectedCash = milesValue * 0.0035;

        // Verify that the calculated cash value matches the expected cash
        assertEquals(expectedCash, rewardValue.getCashValue());
    }



}
