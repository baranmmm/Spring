import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.Java;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

        Course course= (Course) container.getBean("javaTeachingHours");

        course.getTeachingHours();



    }
}