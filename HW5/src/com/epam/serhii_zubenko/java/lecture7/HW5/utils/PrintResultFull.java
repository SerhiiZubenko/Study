package com.epam.serhii_zubenko.java.lecture7.HW5.utils;

import com.epam.serhii_zubenko.java.lecture7.HW5.types.Course;
import com.epam.serhii_zubenko.java.lecture7.HW5.types.Student;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Formatter;
import java.util.ResourceBundle;

import static com.epam.serhii_zubenko.java.lecture7.HW5.utils.Time.ENDTIMEHOUR;
import static com.epam.serhii_zubenko.java.lecture7.HW5.utils.Time.STARTTIMEHOUR;

public class PrintResultFull {

    private static int MIN_WIDE_REPORT = 32;
    private static int LENGTH_WORD_CURRENT_DATE = 15;
    private static int LENGTH_HOURSES_COURSE = 4;
    private static int LENGTH_NUMBER_COURSE = 3;

    public static void printResultFull(Student[] students, Calendar currentTime, ResourceBundle rb) {

        int wideReport = getWideReport(students);
        String line = getLine(wideReport);

        StringBuilder sb = new StringBuilder();
        Formatter fmt = new Formatter(sb);

        for (Student currentStudent : students) {

            int minWideSecondColum = wideReport - LENGTH_WORD_CURRENT_DATE;
            String lineFormater = "%-" + LENGTH_WORD_CURRENT_DATE + "s %" + minWideSecondColum + "s\n";

            fmt.format(line + "\n");

            fmt.format(lineFormater, rb.getString("currenttime"), getDateToString(currentTime));

            fmt.format(lineFormater, rb.getString("startdate"), getDateToString(currentStudent.getStartDate()));

            fmt.format(lineFormater, rb.getString("finishdate"), getDateToString(currentStudent.getEndDate()));

            String tmpString = STARTTIMEHOUR + ":00 - " + ENDTIMEHOUR
                    + ":00";
            fmt.format(lineFormater, rb.getString("workingtime"), tmpString);

            fmt.format(lineFormater, rb.getString("student"), currentStudent.getNameStudent());

            fmt.format(lineFormater, rb.getString("CURRICULUM"),
                    currentStudent.getCurriculumStudent().getCurriculumName());
            fmt.format(line + "\n");

            int i = 1;
            lineFormater = "%-" + (wideReport - LENGTH_HOURSES_COURSE - LENGTH_NUMBER_COURSE) + "s %"
                    + LENGTH_HOURSES_COURSE + "s\n";

            for (Course currentCourse : currentStudent.getCurriculumStudent().getListOfCourses()) {

                fmt.format(i + ". " + lineFormater, currentCourse.getNameCourse(), currentCourse.getDurationInHours());
                i++;
            }
            fmt.format(line + "\n");
            fmt.format(rb.getString("TOTAL") + currentStudent.getCurriculumStudent().getTotalNumberOfHours() + "\n");

            if (Time.timeProgrammPassed(currentStudent, currentTime)) {
                fmt.format(rb.getString("completeL"));
            } else {
                fmt.format(rb.getString("notcompleteL"));
            }

            int workhours = Time.getDiffWorkTimeInHours(currentStudent, currentTime);

            int day = workhours / (ENDTIMEHOUR - STARTTIMEHOUR);
            int hours = workhours % (ENDTIMEHOUR - STARTTIMEHOUR);

            fmt.format(day + rb.getString("day") + hours + rb.getString("hours") + "\n\n");

            System.out.println(sb.toString());

            sb.setLength(0);

        }
        fmt.close();
    }

    private static String getDateToString(Calendar time) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
        String tmp = dateFormat.format(time.getTime());
        return tmp;
    }

    private static int getWideReport(Student[] students) {
        int wideReport = MIN_WIDE_REPORT;
        int tmpWideReport = 0;

        for (Student currentStudent : students) {

            int lengthNameStudent = currentStudent.getNameStudent().length();
            int lengthCurriculumStudend = currentStudent.getCurriculumStudent().getCurriculumName().length();

            if (lengthNameStudent > lengthCurriculumStudend) {
                tmpWideReport = lengthNameStudent;
            } else {
                tmpWideReport = lengthCurriculumStudend;
            }

            if ((tmpWideReport + LENGTH_WORD_CURRENT_DATE) > wideReport) {
                wideReport = tmpWideReport + LENGTH_WORD_CURRENT_DATE;
            }
        }
        return wideReport;
    }

    private static String getLine(int wideReport) {

        StringBuilder line = new StringBuilder(wideReport);
        for (int i = 0; i <= wideReport; i++) {
            line.append("-");
        }
        return line.toString();
    }
}
