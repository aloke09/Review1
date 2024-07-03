package student_and_course;

import java.util.*;

public class StudentCourseMethods {
    private Map<String, Student> students = new HashMap<>();
    private Map<String, Course> courses = new HashMap<>();
    private Map<String, Set<String>> studentCourseMap = new HashMap<>();
    private Map<String, Set<String>> courseStudentMap = new HashMap<>();

    public void displayAllCourse()
    {
        courses.entrySet().stream().forEach(System.out::println);
    }public void displayAllStudent()
    {
        students.entrySet().stream().forEach(System.out::println);
    }

    public void addStudent(String id, String name) {
        students.put(id, new Student(id, name));
    }

    public void addCourse(String code, String title) {
        courses.put(code, new Course(code, title));
    }

    public void enrollStudentInCourse(String studentId, String courseCode) {
        if (!students.containsKey(studentId)) {
            System.out.println("Student with ID " + studentId + " does not exist.");
            return;
        }
        if (!courses.containsKey(courseCode)) {
            System.out.println("Course with code " + courseCode + " does not exist.");
            return;
        }

        studentCourseMap.computeIfAbsent(studentId, k -> new HashSet<>()).add(courseCode);
        courseStudentMap.computeIfAbsent(courseCode, k -> new HashSet<>()).add(studentId);
    }

    public void displayStudentsForCourse(String courseCode) {
        if (!courses.containsKey(courseCode))
        {
            System.out.println("Course with code " + courseCode + " does not exist.");
            return;
        }

        Set<String> studentIds = courseStudentMap.get(courseCode);//only unique
        if (studentIds.isEmpty())
        {
            System.out.println("No students registered for course " + courseCode);
            return;
        }
        System.out.println("Students registered for course " + courses.get(courseCode).getcName() + ":");
        studentIds.stream().map(students::get).forEach(System.out::println);

    }

    public void displayCoursesForStudent(String studentId) {
        if (!students.containsKey(studentId)) {
            System.out.println("Student with ID " + studentId + " does not exist.");
            return;
        }
        Set<String> courseCodes = studentCourseMap.get(studentId);//only unique
        if (courseCodes.isEmpty()) {
            System.out.println("No courses registered for student " + studentId);
            return;
        }
        System.out.println("Courses registered for student " + students.get(studentId).getsName() + ":");
        courseCodes.stream().map(courses::get).forEach(System.out::println);
    }
}
