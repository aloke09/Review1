package student_and_course;

import java.util.List;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args) {
        StudentCourseMethods obj = new StudentCourseMethods();
        obj.addCourse("c1", "java");
        obj.addCourse("c2", "javascript");
        Scanner sc=new Scanner(System.in);
        while(true)
        {
            System.out.println("1.add student");
//            System.out.println("2.add course");
            System.out.println("2.enroll student on a course");
            System.out.println("3.display Students For Course");
            System.out.println("4.display course For student");
            int choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    System.out.println("Enter Student id-");
                    String sId=sc.next();
                    System.out.println("Enter Student name-");
                    String sName=sc.next();
                    obj.addStudent(sId,sName);
                    break;
                case 2:
                    System.out.println("ALL COURSE DETAILS-");
                    obj.displayAllCourse();
                    System.out.println("ALL STUDENT DETAILS-");
                    obj.displayAllStudent();
                    System.out.println("Enter student id-");
                    String sId2=sc.next();
                    System.out.println("Enter course id-");
                    String cId2=sc.next();
                    obj.enrollStudentInCourse(sId2,cId2);
                    break;
                case 3:
//                    System.out.println("display Students For Course");
                    System.out.println("ALL COURSE DETAILS-");
                    obj.displayAllCourse();
                    System.out.println("Enter a valid Course detail-");
                    String cId3=sc.next();

                    obj.displayStudentsForCourse(cId3);
                    break;
                case 4:
                    //display course For student
                    System.out.println("display course For student");
                    System.out.println("ALL STUDENT DETAILS-");
                    obj.displayAllStudent();
                    System.out.println("Enter a valid Student Id");
                    String sId4=sc.next();
                    obj.displayCoursesForStudent(sId4);
                    break;
                default:
                    System.out.println("please enter a valid choice-");
                    System.exit(0);
            }
        }


//        obj.addStudent("S1", "alok");
//        obj.addStudent("S2", "gautam");

//        obj.addCourse("C1", "java");
//        obj.addCourse("C2", "javascript");

//        obj.enrollStudentInCourse("S1", "C1");
//        obj.enrollStudentInCourse("S1", "C2");
//        obj.enrollStudentInCourse("S2", "C1");
//
//        obj.displayStudentsForCourse("C1");
//        System.out.println("***********");
//        obj.displayCoursesForStudent("S1");
    }
}
