package com.basics.strings;

public class ReportGenerator {
    static void main(String[] args) {
        //This will change the same object values
        StringBuilder report = new StringBuilder();
        for (int i = 1; i <=5; i++) {
            report.append("Student").append(i).append(" - passed\n");
        }
        System.out.println(report);
        StringBuffer report1 = new StringBuffer();
        for (int i = 1; i <=5; i++) {
            report.append("Student").append(i).append(" - passed\n");
        }
        System.out.println(report);
    }
}
