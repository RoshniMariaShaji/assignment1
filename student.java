import java.util.*;
class student
{
    Scanner sc=new Scanner(System.in);
    int roll,age;
    String name;
    long phone;
    float cgpa;
    void read()
    {
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter your roll no:");
        roll=sc.nextInt();
        System.out.println("Enter your phone no:");
        phone=sc.nextLong();
        System.out.println("Enter your age:");
        age=sc.nextInt();
        System.out.println("Enter your cgpa:");
        cgpa=sc.nextFloat();
    }
    public static void main(String args[])
    {
        student stud[]=new student[20];
        int i,large=0,young=0;
        long num=0;
        for(i=0;i<10;i++)
        {
            System.out.println("Enter the details of student "+(i+1));
            stud[i]=new student();
            stud[i].read();
        }
        for(i=0;i<10;i++)
        {
            if(stud[i].cgpa>stud[large].cgpa)
                large=i;
            if(stud[i].name.equalsIgnoreCase("anu"))
                num=stud[i].phone;
            if(stud[i].age<stud[young].age)
                young=i;
        }
        System.out.println("Name of student with highest cgpa:"+stud[large].name);
        System.out.println("Phone number of Anu:"+num);
        System.out.println("Roll number of youngest student:"+stud[young].roll);
    }
}