package exercises;

import company.Project;
import company.User;
import enums.Gender;
import enums.Status;

import java.util.List;

public class StreamDemoTest {
    public static void main(String[] args) {

        System.out.println("All Projects");
        StreamDemo.getListOfProject().stream().forEach(project -> System.out.println(project));


        System.out.println("Projects Filtered by Manager");
        StreamDemo.getListOfProject(DataGenerator.manager1).stream().forEach(project -> System.out.println(project));

        System.out.println("Projects Filtered by Status");

        StreamDemo.getListOfProject(Status.UAT_TEST).stream().forEach(project -> System.out.println(project));

        System.out.println("Projects Filtered by Project Code");
        StreamDemo.getProjectByProjectCode("PRJ005").stream().forEach(project -> System.out.println(project));

        System.out.println("First Name Filtered Users");

        StreamDemo.getUserByFirstName("Sarah").stream().forEach(user -> System.out.println(user));


        System.out.println(StreamDemo.getUserByUserId((long) 2));

        //StreamDemo.updateProjectStatus(Status.OPEN, Status.IN_PROGRESS).stream().forEach(project -> System.out.println(project.getProjectStatus()));

        System.out.println(StreamDemo.findProjectByManager(DataGenerator.manager1).stream().count());

        System.out.println(StreamDemo.totalProjectDurationForManager(DataGenerator.manager1));

        System.out.println(StreamDemo.findTotalMaleFemaleInCompany(Gender.FEMALE));


    }
}
