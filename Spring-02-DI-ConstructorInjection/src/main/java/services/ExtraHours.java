package services;

import interfaces.ExtraSessions;

public class ExtraHours implements ExtraSessions {
    @Override
    public int getHours() {
        return 100;
    }
}
