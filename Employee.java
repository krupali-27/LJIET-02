import java.util.*;
 class EmpCount 
{
    static int count_of_object=0;
    
    public EmpCount()
    {
        count_of_object++;
    }
    public  static int getCount()
    {
        return count_of_object;
    }
    
}

public class Employee
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of the array");
        int arr_size=sc.nextInt();
        EmpCount e[]=new EmpCount[arr_size];
        for(int i=0;i<e.length;i++)
        {
            e[i]=new EmpCount();
        }
     //calling static method
        System.out.println("count of number of employee is="+EmpCount.getCount());
    }
}
