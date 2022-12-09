import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable, Comparable<Student> {
    private int studentCode;
    private String Name;
    private int Age;
    private String genDer;
    private String Address;
    private Double GPA;

    public Student() {
    }

    public Student(int studentCode, String name, int age, String genDer, String address, Double GPA) {
        this.studentCode = studentCode;
        Name = name;
        Age = age;
        this.genDer = genDer;
        Address = address;
        this.GPA = GPA;
    }

    public int getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getGenDer() {
        return genDer;
    }

    public void setGenDer(String genDer) {
        this.genDer = genDer;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode=" + studentCode +
                ", Name='" + Name + '\'' +
                ", Age=" + Age +
                ", genDer='" + genDer + '\'' +
                ", Address='" + Address + '\'' +
                ", GPA=" + GPA +
                '}';
    }


    @Override
    public int compareTo(Student o) {
        return (int)(this.getGPA() - o.getGPA());
    }
}
