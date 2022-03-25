package com.company;

public class Student {
    private String name = "jorn";
    private String classes = "C02";

    public Student() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }
}
class Test{
    public static void main(String[] args) {
        Student student1  = new Student();
        System.out.println(student1);
        student1.setName("hùng");
        student1.setClasses("c0222i1");
        System.out.println(student1);
    }

}
