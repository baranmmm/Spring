package com.cybertek.services;

import com.cybertek.com.cybertek.interfaces.Course;
import com.cybertek.com.cybertek.interfaces.ExtraSessions;

public class Java implements Course {

    OfficeHours officeHours;
    ExtraSessions extraSessions;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    public Java(ExtraSessions extraSessions){
        this.extraSessions=extraSessions;
    }



    @Override
    public void getTeachingHours() {

        System.out.println("Weekly Teaching Hours : 20");

    }


    public void getTotalTeachingHours(){

        System.out.println("Weekly Total Teaching Hours : " + (20 + officeHours.getHours()));

    }


    public void getTotalTeachingHoursThroughInterface() {
        System.out.println("Weekly Total Teaching Hours : "+(20 +extraSessions.getHours()));
    }



//    @Override
//    public void getTotalTeachingHoursThroughInterface(){
//        //If we use interface for
//        System.out.println("Weekly Total Teaching Hours : "+(20 +extraSessions.getHours()));
//    }

}