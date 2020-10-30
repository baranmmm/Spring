package com.cybertek;

import com.cybertek.configs.CybertekAppConfig;
import com.cybertek.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CybertekAppConfig.class);

        Course javaCourse = (Course) container.getBean("java");

        javaCourse.getTeachingHours();

    }

}
