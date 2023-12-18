package org.example.Lesson6;

public class Employee {
    private String name;
    private String lastName;
    private String position;
    private int salary;

    public Employee(String name, String lastName, String position, int salary) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }
    public void setSalary(int newSalary){
        salary = newSalary;
    }
}
