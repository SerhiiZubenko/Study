package com.epam.serhii_zubenko.java.lecture7.HW5.utils;

import com.epam.serhii_zubenko.java.lecture7.HW5.types.Student;

import java.util.Calendar;
import java.util.ResourceBundle;


import static com.epam.serhii_zubenko.java.lecture7.HW5.utils.Time.ENDTIMEHOUR;
import static com.epam.serhii_zubenko.java.lecture7.HW5.utils.Time.STARTTIMEHOUR;

public class PrintResult {

    public static void printReportShort (Student[] students, Calendar currentTime, ResourceBundle rb) {

        for (Student currentStudent:students){

            System.out.print(currentStudent.getNameStudent() +
                    " - " + currentStudent.getCurriculumStudent().getCurriculumName());

            if (Time.timeProgrammPassed(currentStudent, currentTime)) {
                System.out.print(rb.getString("complete"));
            }
            else {
                System.out.print(rb.getString("notcomplete"));
            }

            int workhours=Time.getDiffWorkTimeInHours(currentStudent, currentTime);

            int day=workhours/(ENDTIMEHOUR-STARTTIMEHOUR);
            int hours=workhours%(ENDTIMEHOUR-STARTTIMEHOUR);

            System.out.println(day+ rb.getString("day")+ hours + rb.getString("hours"));

        }




    }

}
