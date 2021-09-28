import java.util.ArrayList;

public class Module {

    private String moduleName;
    private int ID;
    private ArrayList<Student> students;
    private ArrayList<Course> courses;

    public Module(String moduleName,
                  int ID,
                  ArrayList<Student> students,
                  ArrayList<Course> courses
        ) {
        setModuleName(moduleName);
        setID(ID);
        this.students = students;
        this.courses = courses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = (moduleName.equals("")) ? "INVALID" : moduleName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        if ((ID > 0) && (ID < 10000)) {
            this.ID = ID;
        } else {
            this.ID = 0;
        }
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

}