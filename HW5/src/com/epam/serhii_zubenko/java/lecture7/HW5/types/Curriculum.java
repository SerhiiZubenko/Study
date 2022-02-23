package com.epam.serhii_zubenko.java.lecture7.HW5.types;

public class Curriculum {

    private String curriculumName;
    private Course listOfCourses[];
    private int totalNumberOfHours;

    public Curriculum(String curriculumName, Course... courses) {
        this.curriculumName = curriculumName;
        this.totalNumberOfHours = 0;
        int i = courses.length;
        this.listOfCourses = new Course[i];

        for ( int x = 0; x < i; x++ ){
            this.listOfCourses[x] = new Course(courses[x].getNameCourse(), courses[x].getDurationInHours());
            this.totalNumberOfHours = this.totalNumberOfHours + courses[x].getDurationInHours();
        }
    }


    public int getTotalNumberOfHours() {
        return totalNumberOfHours;
    }

    public String getCurriculumName() {
        return curriculumName;
    }

    public Course[] getListOfCourses() {
        return listOfCourses;
    }

    public void setCurriculumName(String curriculumName) {
        this.curriculumName = curriculumName;
    }
}

