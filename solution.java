import java.util.*;

class student {
    int rollno;
    String name;
    int marks;
}

public class solution{
    public static void main (String args[]){
    student s1 = new student ();
    student s2 = new student ();
    student s3 = new student ();
    s1.rollno = 1;
    s1.name = "sanjai";
    s1.marks = 100;
    s2.rollno = 2;
    s2.name = "Kumar";
    s2.marks = 880;
    s3.rollno = 3;
    s3.name = "Shalini";
    s3.marks = 400;
    student s4[] = new student[3];
    s4[0] = s1;
    s4[1] = s2;
    s4[2] = s3;

    for(int i=0;i<s4.length;i++){
        System.out.println(s4[i].name+" "+s4[i].rollno+" "+s4[i]);
    }

}
   }