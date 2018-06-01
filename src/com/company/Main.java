package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //char grade;
        Scanner in = new Scanner(System.in);


        System.out.print("Enter your test score: ");

        int score;
        score =  in.nextInt();


        String grade;
        if (score <= 89 && score >= 87)
            grade = "A+";

        else if (score >=  80 && score <= 82)
            grade = "A-";
        else grade = "A";
        if (score >= 79 && score <= 77) grade = "B+";
        else if (score <= 70 && score >= 72)
            grade = "B-";
        else
            grade = "B";

        if (score <=69 && score >= 67)
            grade = "C+";
        else if (score <= 60 && score >= 62)
            grade = "C-";
        else grade = "C";

        if (score <59 && score >= 57)
            grade = "D+";
        else if (score <= 50 && score >= 52)
            grade = "D-";
        else if (score <= 52 && score >= 57) grade = "D";

        else if (score >= 50) grade = "F";

        if (score > 69)
            System.out.println("Very good! You don't have to retake the exam!");
        else
            System.out.println("Did you even look at the book?");
    }
}
