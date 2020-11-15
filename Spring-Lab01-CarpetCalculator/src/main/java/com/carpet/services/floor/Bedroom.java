package com.carpet.services.floor;

import com.carpet.interfaces.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bedroom implements Floor {

    @Value("${bedroomWidth}")
    private int width;


    @Override
    public double getArea() {
        int area = width*width;
        return area;
    }
}
