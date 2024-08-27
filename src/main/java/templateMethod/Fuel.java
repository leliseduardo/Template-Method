package templateMethod;

public abstract class Fuel {

    private double pricePerLiter;
    private double amountPaid;

    public String getType() {
        return "Regular gasoline";
    }

    public abstract double calculateLiters(double amountToRefuel);

    public void setRefuelAmount(double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public String getInfo() {
        return "Refueling with " + getType() + " completed. Total refueled (liters): " + this.calculateLiters(this.amountPaid);
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }
}
