import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<City> city = new ArrayList<City>();
        ArrayList<Student> student = new ArrayList<Student>();

        city.add(new City("Sweden", "Stockholm"));
        city.add(new City("Sweden", "Göteborg"));
        city.add(new City("USA", "los Angeles"));


        student.add(new Student(0, "Arvid"));
        student.add(new Student(1, "Simon"));
        student.add(new Student(2, "Selma"));
        student.add(new Student(3, "Amanda"));

        student.get(0).setBuddy(student.get(1));
        student.get(1).setBuddy(student.get(0));

        student.get(2).setBuddy(student.get(3));
        student.get(3).setBuddy(student.get(2));

        student.get(0).setHomeTown(city.get(0));
        student.get(1).setHomeTown(city.get(0));
        student.get(2).setHomeTown(city.get(1));
        student.get(3).setHomeTown(city.get(2));

        System.out.println(student.get(0).getName() + "'s buddy is " + student.get(0).reportBuddyName());
        System.out.println(student.get(0).getName() + "'s buddy's student id is " + student.get(0).getBuddy().getStudentId());
        System.out.println(student.get(0).getName() + "'s buddy's home country and town is " + student.get(0).getBuddy().getHomeTown().getCountry() + " and " + student.get(0).getBuddy().getHomeTown().getName());


    }
}