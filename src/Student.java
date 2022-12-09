//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.Serializable;

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
        this.Name = name;
        this.Age = age;
        this.genDer = genDer;
        this.Address = address;
        this.GPA = GPA;
    }

    public int getStudentCode() {
        return this.studentCode;
    }

    public void setStudentCode(int studentCode) {
        this.studentCode = studentCode;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public int getAge() {
        return this.Age;
    }

    public void setAge(int age) {
        this.Age = age;
    }

    public String getGenDer() {
        return this.genDer;
    }

    public void setGenDer(String genDer) {
        this.genDer = genDer;
    }

    public String getAddress() {
        return this.Address;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public Double getGPA() {
        return this.GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public String toString() {
        return "Student{studentCode=" + this.studentCode + ", Name='" + this.Name + "', Age=" + this.Age + ", genDer='" + this.genDer + "', Address='" + this.Address + "', GPA=" + this.GPA + "}";
    }

    public int compareTo(Student o) {
        return (int)(this.getGPA() - o.getGPA());
    }
}
