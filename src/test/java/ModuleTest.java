import org.junit.Test;
import java.util.ArrayList;
import org.joda.time.DateTime;

import static org.junit.Assert.*;

public class TestModule {

    @Test
    public void setupTestStudentWithValidDetails() {
        String expectedName = "Cathal";
        int expectedAge = 21;
        String expectedUsername = expectedName + "-" + expectedAge;
        Student student = new Student(
                "Cathal",
                21,
                new DateTime(),
                new ArrayList<>(),
                new ArrayList<>()
        );

        assertEquals(student.getName(), "Cathal");
        assertEquals(student.getAge(), 21);
        assertNotEquals(student.getDateOfBirth(), null);
        assertEquals(student.getCourses().size(), 0);
        assertEquals(student.getModules().size(), 0);
        assertEquals(student.getUsername(), expectedUsername);
        assertNotNull(student.getID());
    }

    @Test
    public void setupTestStudentWithNoNameReturnsJohnDoe() {
        String expectedName = "John Doe";

        Student testStudent = new Student(
                "",
                20,
                new DateTime(),
                new ArrayList<>(),
                new ArrayList<>()
        );

        assertEquals(testStudent.getName(), expectedName);
    }

    @Test
    public void setupTestStudentWithNoAgeReturns20() {
        int expectedAge = 20;

        Student testStudent = new Student(
                "Joe",
                -10,
                new DateTime(),
                new ArrayList<>(),
                new ArrayList<>()
        );

        assertEquals(testStudent.getAge(), expectedAge);
    }

    @Test
    public void setupTestStudentWReturnsCorrectUsername() {
        String expectedName = "Cathal";
        int expectedAge = 21;
        String expectedUsername = expectedName + "-" + expectedAge;

        Student student = new Student(
                expectedName,
                expectedAge,
                new DateTime(),
                new ArrayList<>(),
                new ArrayList<>()
        );

        assertEquals(student.getUsername(), expectedUsername);
    }

    @Test
    public void setupTestStudentWithNoNameOrAgeReturnsDefaultUsername() {
        String expectedUsername = "John Doe"+ "-" + 20;

        Student student = new Student(
                "",
                1249,
                new DateTime(),
                new ArrayList<>(),
                new ArrayList<>()
        );

        assertEquals(student.getUsername(), expectedUsername);
    }


}
