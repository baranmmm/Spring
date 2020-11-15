package com.carpet.services.floor;

import com.carpet.interfaces.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LivingRoom implements Floor {

    @Value("${livingRoomLength}")
    private int livingRoomLength;

    @Value("${livingRoomWidth}")
    private int livingRoomWidth;


    @Override
    public double getArea() {

        double area=livingRoomLength*livingRoomWidth;
        return area;
    }
}
