package com.github.iamcathal;

import org.junit.Test;
import java.util.ArrayList;
import org.joda.time.DateTime;

import static org.junit.Assert.*;

public class CourseTest {

    @Test
    public void setupTestCourseWithValidDetails() {
        String expectedCourseName = "CT414";

        Course testCourse = new Course(
                expectedCourseName,
                new ArrayList<>(),
                new ArrayList<>(),
                new DateTime(),
                new DateTime()
        );

        assertEquals(testCourse.getCourseName(), expectedCourseName);
        assertEquals(testCourse.getStudents().size(), 0);
        assertEquals(testCourse.getModules().size(), 0);
        assertNotNull(testCourse.getStartTime());
        assertNotNull(testCourse.getEndTime());
    }


    @Test
    public void setupTestCourseWithNoNameReturnsInvalid(){
        String expectedCourseName = "INVALID";

        Course testCourse = new Course(
                "",
                new ArrayList<>(),
                new ArrayList<>(),
                new DateTime(),
                new DateTime()
        );
        assertEquals(testCourse.getCourseName(), expectedCourseName);
    }




}