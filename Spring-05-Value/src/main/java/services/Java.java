package services;

import interfaces.Course;
import interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

    @Value("EU2")
    private String batch;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String [] days;

    @Override
    public String toString() {
        return "Java{" +
                "batch='" + batch + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }


    //    @Autowired
//    @Qualifier("officeHours")
    private ExtraSessions extraSessions;


    @Autowired
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : " + (20+ extraSessions.getHours()));
    }
}