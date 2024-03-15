package com.learning.core.day10;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class D10P03 {
    public static void main(String[] args) {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("student_record.txt"))) {
         
            System.out.println("Roll Number\tName\t\tAge");
          

            while (true) {
                try {
                    Student student = (Student) inputStream.readObject();
                    System.out.println(student.getRollNumber() + "\t\t" + student.getName() + "\t" + student.getAge());
                } catch (EOFException e) {
                    break; 
                }
            }
        } catch (IOException | ClassNotFoundException e) {
             System.out.println("An error occurred while reading the records: " + e.getMessage());
        }
    }
}