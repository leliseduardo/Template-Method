package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AdditiveGasolineTest {

    @Test
    void shouldReturnRefuelingInformation() {
        AdditiveGasoline fuel = new AdditiveGasoline();
        fuel.setPricePerLiterAdditive(5.80);
        fuel.setRefuelAmount(100);
        assertEquals("Refueling with Additive gasoline completed. Total refueled (liters): 580.0", fuel.getInfo());
    }

}
