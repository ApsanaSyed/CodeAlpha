
package com.codealpha.student;
import java.util.Scanner;

public class StudentGradeTracker {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Enter the number of students:");
	        int numStudents = scanner.nextInt();

	        int[] grades = new int[numStudents];

	        for (int i = 0; i < numStudents; i++) {
	            System.out.println("Enter the marks for student-" + (i + 1)+":");
	            grades[i] = scanner.nextInt();
	        }

	        int sum = 0;
	        int highest = grades[0];
	        int lowest = grades[0];

	        for (int grade : grades) {
	            sum += grade;
	            if (grade > highest) {
	                highest = grade;
	            }
	            if (grade < lowest) {
	                lowest = grade;
	            }
	        }

	        double average = (double) sum / numStudents;

	        System.out.println("Average Grade " + average);
	        System.out.println("Highest Grade " + highest);
	        System.out.println("Lowest Grade " + lowest);
	    }

}
