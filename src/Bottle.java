public class Bottle {
    private final int totalCapacity;
    private int availableLiquid;
    private boolean isOpen;

    // Constructor to initialize the bottle
    public Bottle(int totalCapacity, int availableLiquid) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.isOpen = false; // Bottle is initially closed
    }

    // Method to check if the bottle has more liquid
    public boolean hasMoreLiquid() {
        return availableLiquid > 0;
    }

    // Method to get the available liquid in the bottle
    public int getAvailableLiquid() {
        return availableLiquid;
    }

    // Method to get the empty capacity of the bottle
    public int getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    // Method to open the bottle
    public String open() {
        if (isOpen) {
            return "Bottle is already opened";
        } else {
            isOpen = true;
            return "Bottle is opened";
        }
    }

    // Method to close the bottle
    public String close() {
        if (!isOpen) {
            return "Bottle is already closed";
        } else {
            isOpen = false;
            return "Bottle is closed";
        }
    }

    // Method to drink a specific amount of liquid
    public String drink(int amount) {
        if (!isOpen) {
            return "Cannot drink from a closed bottle. Please open the bottle first.";
        } else if (availableLiquid == 0) {
            return "No liquid available to drink.";
        } else if (amount <= 0) {
            return "Invalid amount. Please specify a positive amount to drink.";
        } else if (amount > availableLiquid) {
            return "Not enough liquid available to drink " + amount + " ml.";
        } else {
            availableLiquid -= amount;
            return "You drank " + amount + " ml. Remaining liquid: " + availableLiquid + " ml.";
        }
    }
}
