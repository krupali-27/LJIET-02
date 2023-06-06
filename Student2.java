
package Arrayofobjectsdemo;
import java.util.*;

class StudentData
{
    int rollNo;
    String name;
    int marks;
    
    public void setData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rollno");
        this.rollNo=sc.nextInt();
        System.out.println("enter name");
        this.name=sc.next();
        System.out.println("enter marks");
        this.marks=sc.nextInt();
    }
    
    public void showData()
    {
        System.out.println("rollno:"+rollNo);
        System.out.println("name:"+name);
        System.out.println("Marks:"+marks);
    }
}


public class Student2 
{
    public static void main(String args[])
    {
        StudentData batch[]=new StudentData[5];
        int i=0;
        do
        {
            batch[i]=new StudentData();
            batch[i].setData();
            batch[i].showData();
            i++;
        }
        while(i<5);
        
    }
}
