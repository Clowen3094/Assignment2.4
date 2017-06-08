package session2;

import java.util.Scanner;


class TestDemo{

public static void main(String args[]){

Scanner in = new Scanner(System.in);

System.out.println("Enter a number: ");
int a = in.nextInt();

if ( a == 0){
System.out.println("You Have Entered Zero");
}
if (a > 0){
System.out.println("You Have Entered Positive Value");
}
if (a < 0){
System.out.println("You Have Entered Negative Value");
}


System.out.println("Enter the marks obtained :");
int marks = in.nextInt();
System.out.println("Enter the age :");
int age = in.nextInt();

if ((marks > 70 & age > 15) || (marks > 60 & age <15)){
System.out.println("Grade:A and Age:"+age);
}
if ((marks > 60 & marks <= 70 & age > 15) || (marks > 45 & marks < 61 & age < 15 )){
System.out.println("Grade:B and Age:"+age);
}
if ((marks < 61  & age > 15) || (marks < 45 &  age < 15 )){
System.out.println("Grade:C and Age:"+age);
}
}
}
