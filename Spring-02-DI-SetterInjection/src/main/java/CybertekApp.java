import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.Java;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

        Course javaCourse = (Course) container.getBean("java");
        javaCourse.getTeachingHours();

        Course seleniumCourse = (Course) container.getBean("selenium");
        seleniumCourse.getTeachingHours();

        Java javaCourse2= (Java) container.getBean("java2");
        javaCourse2.getTeachingHoursThroughInterface();





    }
}
