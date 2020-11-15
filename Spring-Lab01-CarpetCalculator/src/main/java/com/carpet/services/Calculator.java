package com.carpet.services;

import com.carpet.enums.City;
import com.carpet.services.floor.Bedroom;
import com.carpet.services.floor.Kitchen;
import com.carpet.services.floor.LivingRoom;
import com.carpet.services.states.CarpetTX;
import com.carpet.services.states.CarpetVA;
import com.sun.source.doctree.SerialDataTree;
import org.springframework.stereotype.Component;


@Component
public class Calculator {
    CarpetTX carpetTX;
    CarpetVA carpetVA;
    Bedroom bedroom;
    Kitchen kitchen;
    LivingRoom livingRoom;


    public Double bedroomCarpetPrice(int area) {

        double area1 = bedroom.getArea();
        return area1;


    }
}
