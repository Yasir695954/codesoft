import java.util.Scanner;

public class Grade {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float mark1,mark2,mark3,mark4,mark5,percent;
    System.out.print("\033[H\033[2J"); // clear screen
    System.out.println("\n\t\tWELCOME TO GRADE CALCULATOR\n");
    System.out.println("Enter the marks out of 100");
    // taking input of marks
    System.out.print("Enter the marks of OOP :");
    mark1=sc.nextFloat();
    System.out.print("Enter the marks of ICT :");
    mark2=sc.nextFloat();
    System.out.print("Enter the marks of CALCULAS :");
    mark3=sc.nextFloat();
    System.out.print("Enter the marks of PHYSICS :");
    mark4=sc.nextFloat();
    System.out.print("Enter the marks of ENGLISH :");
    mark5=sc.nextFloat();
  // calulating total marks and percantage
    float total=mark1+mark2+mark3+mark4+mark5;
    percent=total/5;

    System.out.println("total marks are :"+total);
    System.out.println("Average percantage is :"+percent);
   // assinging grades
    if (percent>=90){
        System.out.println("Grade is :A+");
    }else if(percent<90 && percent>80){
        System.out.println("Grade is :A");
    }
    else if(percent<80 && percent>70){
        System.out.println("Grade is :B+");
    }
    else if(percent<70 && percent>60){
        System.out.println("Grade is :B");
    }
    else if(percent<60 && percent>55){
        System.out.println("Grade is :C");
    }else
    System.out.println("fail");
 



}
}
