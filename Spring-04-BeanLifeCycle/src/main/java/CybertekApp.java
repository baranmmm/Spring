import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import services.Java;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

        Course javaCourse = (Course) container.getBean("java");

        Course javaCourse2= (Course) container.getBean("java");

        System.out.println("Pointing to the same object : "+(javaCourse==javaCourse2));

        Course seleniumCourse = (Course) container.getBean("selenium");
        Course seleniumCourse2 = (Course) container.getBean("selenium");

        System.out.println("Pointing to the same object : "+(seleniumCourse==seleniumCourse2));



    }
}
