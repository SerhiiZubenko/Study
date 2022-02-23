package com.epam.serhii_zubenko.java.lecture7.HW5.utils;

import com.epam.serhii_zubenko.java.lecture7.HW5.types.Course;
import com.epam.serhii_zubenko.java.lecture7.HW5.types.Curriculum;
import com.epam.serhii_zubenko.java.lecture7.HW5.types.Student;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Data {

    public static Student[] studentData(Calendar currentTime){

        Course courses[] = new Course[] {
                new Course("Java Servlets",16), new Course("Struts Framework", 24),
                new Course("Java", 8), new Course("JFC/Swing ", 16),
                new Course("JDBC", 20), };

        Curriculum j2EEDeveloper = new Curriculum("J2EE Developer", courses[0], courses[1]);
        Curriculum javaDeveloper = new Curriculum("Java Developer", courses[2], courses[3], courses[4]);

        currentTime.set(Calendar.MILLISECOND, 0);
        currentTime.set(Calendar.SECOND, 0);
        currentTime.set(Calendar.MINUTE, 0);

        Calendar startTime1 = new GregorianCalendar();
        Calendar startTime2 = new GregorianCalendar();
        startTime1 = (Calendar) currentTime.clone();
        startTime2 = (Calendar) currentTime.clone();

        startTime1.add(Calendar.DATE, -2);
        startTime2.add(Calendar.DATE, -2);

        Student students[] = new Student[] {new Student("Ivanov Ivan", j2EEDeveloper, startTime1),
                new Student("Petrov Petr", javaDeveloper, startTime2) };

        return students;
    }
}
