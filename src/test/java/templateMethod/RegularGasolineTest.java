package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RegularGasolineTest {

    @Test
    void shouldReturnRefuelingInformation() {
        RegularGasoline fuel = new RegularGasoline();
        fuel.setPricePerLiterRegular(5.65);
        fuel.setRefuelAmount(100);
        assertEquals("Refueling with Regular gasoline completed. Total refueled (liters): 565.0", fuel.getInfo());
    }

}
