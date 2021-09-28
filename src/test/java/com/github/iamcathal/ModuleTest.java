package com.github.iamcathal;

import org.junit.Test;
import java.util.ArrayList;
import org.joda.time.DateTime;

import static org.junit.Assert.*;

public class ModuleTest {

    @Test
    public void setupTestModuleWithValidDetails() {
        String expectedModuleName = "CT414";
        int expectedID = 1424;

        Module testModule = new Module(
                expectedModuleName,
                expectedID,
                new ArrayList<>(),
                new ArrayList<>()
        );

        assertEquals(testModule.getModuleName(), expectedModuleName);
        assertEquals(testModule.getID(), expectedID);
        assertEquals(testModule.getStudents().size(), 0);
        assertEquals(testModule.getCourses().size(), 0);
    }

    @Test
    public void setupTestModuleWithInvalidModuleNamesReturnsINVALID() {
        String expectedModuleName = "INVALID";
        int expectedID = 1424;

        Module testModule = new Module(
                "",
                expectedID,
                new ArrayList<>(),
                new ArrayList<>()
        );

        assertEquals(testModule.getModuleName(), expectedModuleName);
    }

    @Test
    public void setupTestModuleWithInvalidIDReturnsZero() {
        String expectedModuleName = "CT414";
        int expectedID = 0;

        Module testModule = new Module(
                expectedModuleName,
                10000000,
                new ArrayList<>(),
                new ArrayList<>()
        );

        assertEquals(testModule.getID(), expectedID);
    }



}
