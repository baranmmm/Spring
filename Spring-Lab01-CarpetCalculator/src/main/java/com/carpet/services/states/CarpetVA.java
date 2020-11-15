package com.carpet.services.states;

import com.carpet.enums.City;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CarpetVA {

    City[] cities ={City.ARLINGTON, City.FAIRFAX, City.MCLEAN};

    Map<City, Double> unitPrices= new HashMap<>();

    public void setUnitPrices(Map<City, Double> unitPrices) {
        this.unitPrices = unitPrices;
        unitPrices.put(City.ARLINGTON, 3.99);
        unitPrices.put(City.FAIRFAX, 2.99);
        unitPrices.put(City.MCLEAN, 4.99);
    }

    public Map<City, Double> getUnitPrices() {
        return unitPrices;
    }

}
