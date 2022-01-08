package com.example.demo.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private double avr;

    public Student(){

    }

    public Student(String name, double avr) {
        this.name = name;
        this.avr = avr;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAvr() {
        return avr;
    }

    public void setAvr(double avr) {
        this.avr = avr;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", avr=" + avr +
                '}';
    }
}
