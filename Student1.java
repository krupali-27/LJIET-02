
package Arrayofobjectsdemo;

import java.util.*;

class StudentDetails 
{
    int roll_no;
    String name;
    int marks;
    
    public void setDetails()
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter rollno");
       this.roll_no=sc.nextInt();
       System.out.println(" enter name");
       this.name=sc.next();
       System.out.println("enter marks");
       this.marks=sc.nextInt();
   }
   public void showDetails()
   {
       System.out.println("rollno:"+roll_no);
       System.out.println("name:"+name);
       System.out.println("marks:"+marks);
   }
} 


 public class Student1 
{
    public static void main(String args[])
    {
        StudentDetails batch1[]=new StudentDetails[5];
        
        for(int i=0;i<5;i++)
        {
            batch1[i]=new StudentDetails();
            batch1[i].setDetails();
            batch1[i].showDetails();
            
        }
        
    }
}    
           
   
     
    
    


