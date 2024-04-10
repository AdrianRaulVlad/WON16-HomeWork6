public class Bottle {
    private double totalCapacity;
    private double availableLiquid;
    private boolean isOpen;

    public Bottle(double totalCapacity, double availableLiquid, boolean isOpen) {
        this.totalCapacity = totalCapacity;
        this.availableLiquid = availableLiquid;
        this.isOpen = isOpen;
    }

    public boolean hasMoreLiquid() {
        return availableLiquid > 0;
    }

    public double getAvailableLiquid() {
        return availableLiquid;
    }

    public double getEmptyCapacity() {
        return totalCapacity - availableLiquid;
    }

    public String openBottle() {
        if (!isOpen) {
            isOpen = true;
            return "Bottle is opened";
        } else {
            return "Bottle is already open";
        }
    }

    public String closeBottle() {
        if (isOpen) {
            isOpen = false;
            return "Bottle is closed";
        } else {
            return "Bottle is already closed";
        }
    }

    public String drink(double amount) {
        if (!isOpen) {
            return "The bottle is closed. Please open it first.";
        } else if (amount > availableLiquid) {
            return "There is not enough liquid in the bottle.";
        } else {
            availableLiquid -= amount;
            return String.format("Drank %.2f ml. Remaining liquid: %.2f ml", amount, availableLiquid);
        }
    }
}
