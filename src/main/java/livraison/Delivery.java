package livraison;

public class Delivery {
    private static final double STANDARD_COST = 10.0;
    private static final double ADDITIONAL_COST_PER_KM = 0.5;
    private static final double COST_INCREMENT_10_TO_25_KG = 2.0;
    private static final double COST_INCREMENT_ABOVE_25_KG = 5.0;
    private static final double WEIGHT_THRESHOLD_1 = 10.0;
    private static final double WEIGHT_THRESHOLD_2 = 25.0;

    /**
     * Constructor for objects of class Delivery
     */
    public Delivery() {
        // initialise instance variables
    }
    public static double calculateCost(double distance, double weight) {
        double cost = 0.0;

        if (distance < 0.0) {
            throw new IllegalArgumentException("Distance cannot be negative");
        }
        if (weight < 0.0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        if (distance <= 50.0) {
            cost += STANDARD_COST;
        } else {
            cost += STANDARD_COST + ADDITIONAL_COST_PER_KM * (distance - 50.0);
        }

        if (weight >= WEIGHT_THRESHOLD_1 && weight <= WEIGHT_THRESHOLD_2) {
            cost += COST_INCREMENT_10_TO_25_KG;
        } else if (weight > WEIGHT_THRESHOLD_2) {
            cost += COST_INCREMENT_ABOVE_25_KG;
        }

        return cost;
    }
}
