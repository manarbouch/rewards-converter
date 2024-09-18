public class RewardValue {

        private double cashValue;
        private double milesValue;

        // Constructor that accepts a cash value
        public RewardValue(double cashValue) {
            this.cashValue = cashValue;
            this.milesValue = cashToMiles(cashValue);
        }

        // Constructor that accepts a value in miles
        public RewardValue(int milesValue) {
            this.milesValue = milesValue;
            this.cashValue = milesToCash(milesValue);
        }

        // Method to get the cash value
        public double getCashValue() {
            return cashValue;
        }

        // Method to get the miles value
        public double getMilesValue() {
            return milesValue;
        }

        // Convert cash to miles
        private double cashToMiles(double cash) {
            final double conversionRate = 0.0035;
            return cash / conversionRate;
        }

        // Convert miles to cash
        private double milesToCash(double miles) {
            final double conversionRate = 0.0035;
            return miles * conversionRate;
        }
    }


