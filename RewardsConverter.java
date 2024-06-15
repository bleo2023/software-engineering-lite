import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    }
}

class RewardValue{
    private double value;
    private int miles;

    public RewardValue(double value){
        this.value = value;
    }
    public RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue() {
        return value;
    }

    // Method to get miles value
    public int getMilesValue() {
        return miles;
    }

    // Method to convert miles to cash at a rate of 0.0035
    public double convertMilesToCash(int miles) {
        return miles * 0.0035;
    }

}