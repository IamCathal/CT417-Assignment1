import org.junit.Test;
import java.util.ArrayList;
import org.joda.time.DateTime;

import static org.junit.Assert.*;

public class StudentTest {

    Student testStudent;
    ArrayList<Course> testCourseList;
    ArrayList<Module> testModuleList;
    DateTime testStartDate;

    @Test
    public void setupTestStudentWithValidDetails() {
        String expectedName = "Cathal";
        int expectedAge = 21;
        String expectedUsername = expectedName + "-" + expectedAge;
        testCourseList = new ArrayList<>();
        testModuleList = new ArrayList<>();
        Student student = new Student(
                "Cathal",
                21,
                new DateTime(),
                testCourseList,
                testModuleList
        );

        assertEquals(student.getName(), "Cathal");
        assertEquals(student.getAge(), 21);
        assertNotEquals(student.getDateOfBirth(), null);
        assertEquals(student.getCourses().size(), 0);
        assertEquals(student.getModules().size(), 0);
        assertEquals(student.getUsername(), expectedUsername);
    }
}
