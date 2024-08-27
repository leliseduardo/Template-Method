package templateMethod;

public class RegularGasoline extends Fuel {

    @Override
    public double calculateLiters(double amountToRefuel) {
        return amountToRefuel * this.getPricePerLiter();
    }

    public void setPricePerLiterRegular(double pricePerLiter) {
        this.setPricePerLiter(pricePerLiter);
    }
}
