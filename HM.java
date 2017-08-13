package school;

public class HM {
public static void main(String a[])
{
System.out.println("STUDENT DETAILS");
student s=new student();
s.details();
s.address();
System.out.println("TEACHER DETAILS");
teacher t=new teacher();
t.details();
t.address();
System.out.println("SCHOOL DETAILS");
school sh=new school();
sh.details();
sh.address();
}
}
