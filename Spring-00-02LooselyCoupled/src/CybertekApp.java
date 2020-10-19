import service.FullTimeMentor;
import service.MentorAccount;
import service.PartTimeMentor;

public class CybertekApp {

    public static void main(String[] args) {
        FullTimeMentor fullTimeMentor=new FullTimeMentor();
        PartTimeMentor partTimeMentor=new PartTimeMentor();



        MentorAccount mentorAccount=new MentorAccount(fullTimeMentor);
        mentorAccount.createAccount();

        MentorAccount mentorAccount1=new MentorAccount(partTimeMentor);
        mentorAccount1.createAccount();

    }

}
