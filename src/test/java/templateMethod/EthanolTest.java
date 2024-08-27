package templateMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EthanolTest {

    @Test
    void shouldReturnRefuelingInformation() {
        Ethanol fuel = new Ethanol();
        fuel.setPricePerLiterEthanol(4.30);
        fuel.setRefuelAmount(100);
        assertEquals("Refueling with Ethanol completed. Total refueled (liters): 430.0", fuel.getInfo());
    }
}
