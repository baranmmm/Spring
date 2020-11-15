package com.carpet.services.floor;

import com.carpet.interfaces.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Kitchen implements Floor {

    @Value("${radius}")
    private int radius;


    @Override
    public double getArea() {

        double area=Math.PI*radius*radius;
        return area;
    }
}
