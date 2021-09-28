import org.joda.time.DateTime;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

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
        setName(name);
        setAge(age);
        this.dateOfBirth = dateOfBirth;
        this.courses = courses;
        this.modules = modules;

        this.ID = generateID();
        this.username = getUsername();
    }

    public String getUsername() {
        this.username = this.name + "-" + this.age;
        return this.username;
    }

    private int generateID() {
        return ThreadLocalRandom.current().nextInt(10000, 1000001);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = (name.equals("")) ?  "John Doe" : name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age > 0) && (age < 115)) {
            this.age = age;
        } else {
            this.age = 20;
        }
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