/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student;

/**
 *
 * @author malik
 */
public class StudentList {
    public static void main(String[] args) {
      // Student s1 = new Student("s1","malik");
       Student[] studentList = new Student[3];
       studentList[0]= new Student("s1","Malik");
       studentList[1]= new Student("s2","John");
       studentList[2]= new Student("s3","Kevin");
       
        for (Student studentList1 : studentList) {
            System.out.println(studentList1.getStudentName());
        }
    }
    
}
