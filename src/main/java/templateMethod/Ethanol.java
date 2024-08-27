package templateMethod;

public class Ethanol extends Fuel {

    @Override
    public double calculateLiters(double amountToRefuel) {
        return amountToRefuel * this.getPricePerLiter();
    }

    public void setPricePerLiterEthanol(double pricePerLiter) {
        this.setPricePerLiter(pricePerLiter);
    }

    @Override
    public String getType() {
        return "Ethanol";
    }
}
