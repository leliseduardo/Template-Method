package templateMethod;

public class AdditiveGasoline extends Fuel {

    @Override
    public double calculateLiters(double amountToRefuel) {
        return amountToRefuel * this.getPricePerLiter();
    }

    public void setPricePerLiterAdditive(double pricePerLiter) {
        this.setPricePerLiter(pricePerLiter);
    }

    @Override
    public String getType() {
        return "Additive gasoline";
    }
}
