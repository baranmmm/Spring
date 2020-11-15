package com.carpet.services.states;

import com.carpet.enums.City;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetTX {
    City[] cities={City.DALLAS,City.AUSTIN, City.SANANTONIO};

    Map<City, Double> unitPrices= new HashMap<>();

    public void setUnitPrices(Map<City, Double> unitPrices) {
        this.unitPrices = unitPrices;
        unitPrices.put(City.DALLAS, 6.49);
        unitPrices.put(City.AUSTIN, 5.49);
        unitPrices.put(City.SANANTONIO, 3.49);
    }

    public Map<City, Double> getUnitPrices() {
        return unitPrices;
    }

}
