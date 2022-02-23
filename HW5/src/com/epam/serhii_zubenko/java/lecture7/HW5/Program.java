package com.epam.serhii_zubenko.java.lecture7.HW5;

import com.epam.serhii_zubenko.java.lecture7.HW5.types.Student;
import com.epam.serhii_zubenko.java.lecture7.HW5.utils.PrintResult;
import com.epam.serhii_zubenko.java.lecture7.HW5.utils.PrintResultFull;

import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Calendar;
import java.util.ResourceBundle;
import static com.epam.serhii_zubenko.java.lecture7.HW5.utils.Data.studentData;

public class Program {

    public static void main(String[] args) {

        Locale localeRU = new Locale("ru", "RU");
        ResourceBundle rbRU = ResourceBundle.getBundle("com.epam.serhii_zubenko.java.lecture7.HW5.utils.report",
                localeRU);

        Calendar currentTime = new GregorianCalendar();
        Student[] students = studentData(currentTime);

        PrintResult.printReportShort(students, currentTime, rbRU);         // - print short version

        PrintResultFull.printResultFull(students, currentTime, rbRU);      // - print long version
    }
}
