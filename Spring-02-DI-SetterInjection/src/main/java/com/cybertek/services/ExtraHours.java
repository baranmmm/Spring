package com.cybertek.services;

import com.cybertek.com.cybertek.interfaces.ExtraSessions;

public class ExtraHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 100;
    }
}
