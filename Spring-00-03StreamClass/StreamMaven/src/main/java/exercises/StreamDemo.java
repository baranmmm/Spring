package exercises;

import company.Project;
import company.User;
import enums.Gender;
import enums.Status;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    //Task-1
    public static List<Project> getListOfProject(){
        List<Project> projects = DataGenerator.getProjects();
        return projects;
    }


    //Task-2
    public static List<Project> getListOfProject(Status status){
        List<Project> listOfProject = getListOfProject();
        Stream<Project> projectStream = listOfProject.stream();
        List<Project> statusFilteredProjects = projectStream.filter(project -> project.getProjectStatus().equals(status)).collect(Collectors.toList());

        return statusFilteredProjects;

    }


    //Task-3
    public static List<Project> getListOfProject(User manager){
        List<Project> listOfProject = getListOfProject();
        Stream<Project> projectStream = listOfProject.stream();
        List<Project> managerFilteredProjects = projectStream.filter(project -> project.getAssignedManager().equals(manager)).collect(Collectors.toList());

        return managerFilteredProjects;

    }

    //Task-4
    public static List<Project> getProjectByProjectCode(String projectCode){

        List<Project> listOfProject = getListOfProject();
        Stream<Project> projectStream= listOfProject.stream();
        List<Project> projectCodeFilteredProjects = projectStream.filter(project -> project.getProjectCode().equals(projectCode)).collect(Collectors.toList());
        return projectCodeFilteredProjects;
    }

    //Task-5
    public static List<User> getListOfUsers(){
        List<User> userList = DataGenerator.getUsers();
        return userList;
    }


    //Task-6
    public static List<User> getUserByFirstName(String firstName){

        //Instead of finding the first matching user, finding all matching users make more sense. So here I changed return type to List<User> instead of user
        List<User> firstNameFilteredUsers = getListOfUsers().stream().filter(user -> user.getFirstName().equals(firstName)).collect(Collectors.toList());
        return firstNameFilteredUsers;
    }

    //Task-7
    public static String getUserByUserId(Long id){
        User user1 = getListOfUsers().stream().filter(user -> user.getId() == id).findAny().get();

        return user1.getFirstName() + " " + user1.getLastName();
    }

    //Task-8
    public static List<User> deleteUser(String firstName){
        System.out.println(getListOfUsers().size());
        User deletedUser = getListOfUsers().stream().filter(user -> user.getFirstName().equals(firstName)).findFirst().get();
        List<User> listOfUsers = getListOfUsers();
        listOfUsers.remove(deletedUser);
        System.out.println(listOfUsers.size());
        return listOfUsers;

    }

    //Task-9
    public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus){
        getListOfProject().stream().filter(project -> project.getProjectStatus().equals(oldStatus)).forEach(project -> project.setProjectStatus(newStatus));
        return getListOfProject();
    }


    //Task-10
    public static List<Project> findProjectByManager(User manager){
        List<Project> projectsFilteredByManager = getListOfProject().stream().filter(project -> project.getAssignedManager().equals(manager)).collect(Collectors.toList());
        return projectsFilteredByManager;
    }


    //Task-11
    public static Integer totalProjectDurationForManager(User manager){

        List<Long> projectDays=new ArrayList<>();

        for (Project project : findProjectByManager(manager)) {
            projectDays.add(ChronoUnit.DAYS.between(project.getStartDate(), project.getEndDate()));
        }

        Long totaldays = projectDays.stream().reduce((long) 0, (x, y) -> x + y);
        Integer totalDaysInt = totaldays.intValue();

        return totalDaysInt;

    }

    //Task-12
    public static long findTotalMaleFemaleInCompany(Gender gender){

        long userGenderCount = getListOfUsers().stream().filter(user -> user.getGender().equals(gender)).count();
        long managerGenderCount = DataGenerator.getManagers().stream().filter(manager -> manager.getGender().equals(gender)).count();

        return userGenderCount+managerGenderCount;


    }





}
