import interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        ApplicationContext container=new ClassPathXmlApplicationContext("config.xml");

        Course javaCourse = (Course) container.getBean("java");

        Course javaCourse2= (Course) container.getBean("java");
        javaCourse.getTeachingHours();

        ((ClassPathXmlApplicationContext)container).close();





    }
}
