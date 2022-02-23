package com.epam.serhii_zubenko.java.lecture7.HW5.types;

public class Course {

    private String nameCourse;
    private int durationInHours;

    public Course(String nameCourse, int duration) {
        this.nameCourse = nameCourse;
        this.durationInHours = duration;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public int getDurationInHours() {
        return durationInHours;
    }

    public void setDurationInHours(int durationInHours) {
        this.durationInHours = durationInHours;
    }

    public String toString(){

    return "Course [name - " + nameCourse+ ", " + "duration in hours - " + durationInHours + "]";
    }
}
