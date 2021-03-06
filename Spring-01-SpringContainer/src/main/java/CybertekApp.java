import com.cybertek.interfaces.Mentor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CybertekApp {

    public static void main(String[] args) {

        //BeanFactory container = new ClassPathXmlApplicationContext("config.xml");

        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");
        Mentor mentor = (Mentor)container.getBean("fullTimeMentor");
        mentor.createAccount();

        Mentor mentor1= (Mentor) container.getBean("partTimeMentor");
        mentor1.createAccount();

        Mentor partTimeMentor = container.getBean("partTimeMentor", Mentor.class);
        partTimeMentor.createAccount();


    }

}
