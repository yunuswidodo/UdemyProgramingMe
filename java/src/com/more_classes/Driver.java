package com.more_classes;

public class Driver {
    public static void main(String[] args) {
        /**
        Subject subject1 = new Subject("TPG10AB","Technical Programing");
        Subject subject2 = new Subject("TPG10AB","Technical Programing");

        if (subject1.equals(subject2))
            System.out.println("they are the same");
        System.out.println(subject1);
*/
        Subject subject = new Subject("TGB10AB", "Technical Programing");
        Student student = new Student("yunus", 15);  // no null
        ExamPaper paper = new ExamPaper(student, subject, 100);
       // System.out.println(paper);

        //if want print one
        System.out.println("subject code " + paper.getSubject().getSubjectCode());
        System.out.println("subject code " + paper.getStudent().getStudentNumber());

    }

}
