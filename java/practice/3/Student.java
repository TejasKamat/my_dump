import java.io.*;

public class Student {
    private String studentName;
    private String studentId;
    private String studentAddress;

    public Student(String studentName, String studentId, String studentAddress) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.studentAddress = studentAddress;
    }
    public Student() {
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }
    public String getStudentName() {
        return this.studentName;
    }
    public String getStudentId() {
        return this.studentId;
    }
    public String getStudentAddress() {
        return this.studentAddress;
    }
    public void displayStudentInfo() {
        System.out.println("Student Name : " + getStudentName());
        System.out.println("Student ID : " + studentId);
        System.out.println("Student Address : " + studentAddress);
    }
}