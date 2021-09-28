import org.joda.time.DateTime;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int ID;
    private String username;
    private ArrayList<Course> courses;
    private ArrayList<Module> modules;

    public Student(String name,
                   int age,
                   DateTime dateOfBirth,
                   ArrayList<Course> courses,
                   ArrayList<Module> modules
        ) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.courses = courses;
        this.modules = modules;

        this.ID = 123143;
        this.username = getUsername();
    }

    public String getUsername() {
        this.username = this.name + "-" + this.age;
        return this.username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}