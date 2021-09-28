package com.github.iamcathal;

import java.util.ArrayList;
import org.joda.time.DateTime;

public class Course {

    private String courseName;
    private ArrayList<Module> modules;
    private ArrayList<Student> students;
    private DateTime startTime;
    private DateTime endTime;

    public Course(String courseName,
                  ArrayList<Module> modules,
                  ArrayList<Student> students,
                  DateTime startTime,
                  DateTime endTime
        ) {
        setCourseName(courseName);

        this.modules = modules;
        this.students = students;

        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = (courseName.equals("") ? "INVALID" : courseName);
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public DateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(DateTime startTime) {
        this.startTime = startTime;
    }

    public DateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(DateTime endTime) {
        this.endTime = endTime;
    }
}
