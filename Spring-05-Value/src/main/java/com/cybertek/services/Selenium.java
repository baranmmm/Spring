package com.cybertek.services;

import com.cybertek.interfaces.Course;
import com.cybertek.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {

    //Field Injection
    @Autowired
    @Qualifier("mockInterviewHours")
    private ExtraSessions extraSessions;

//    //Setter Injection
//    @Autowired
//    public void setOfficeHours(ExtraSessions extraSessions) {
//        this.extraSessions = extraSessions;
//    }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (25+ extraSessions.getHours()));

    }
}
