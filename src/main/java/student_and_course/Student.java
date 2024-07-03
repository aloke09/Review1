package student_and_course;

import java.util.List;

public class Student
{
    private String sId;
    private String sName;

    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sId='" + sId + '\'' +
                ", sName='" + sName + '\'' +
                '}';
    }
}
