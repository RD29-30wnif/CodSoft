import java.util.Scanner;
class Course
{

public void showcase()
{
System.out.println("                SANDIP FOUNDATION'S POLYTECHNIC\n\n\n");
System.out.println(" Course Registration Portal \n\n");
System.out.println(" 1. Information Technology \n 2. Computer Engineering \n 3. Civil Engineering \n 4. Mechanical Engineering \n 5. Electrical Engineering \n");
System.out.println(" Enter Your Choice : ");
Scanner sc1 = new Scanner(System.in);
int choice= sc1.nextInt();

switch(choice)
{
case 1:
System.out.println(" The subjects covered in IT Engineering \n\n 1. Java programming \n 2. Python programming \n 3. C++ programming \n");
System.out.println(" Do you want to register for IT Engneering ? \n 1. yes & 2. no \n please enter ");
int ans1 = sc1.nextInt();
System.out.println(" Course code : 2930 ");
break;

case 2:
System.out.println(" The subjects covered in Computer Engineering \n\n 1. Software programming  \n 2. Hardware-Software Testing \n 3. Machine Coding \n");
System.out.println(" Do you want to register for Computer Engneering ? \n 1. yes & 2. no \n please enter ");
int ans2 = sc1.nextInt();
System.out.println(" Course code : 2740 ");
break;

case 3:
System.out.println(" The subjects covered in Civil Engineering \n\n 1. Environmental Engineering  \n 2. Fluid mechanics \n 3. Transportation Engineering \n");
System.out.println(" Do you want to register for Civil Engneering ? \n 1. yes & 2. no \n please enter ");
int ans3 = sc1.nextInt();
System.out.println(" Course code : 2860 ");
break;

case 4:
System.out.println(" The subjects covered in Mechanical Engineering \n\n 1. Material Science \n 2. Applied mechanics \n 3. Manufacturing process \n");
System.out.println(" Do you want to register for Mechanical Engneering ? \n 1. yes & 2. no \n please enter ");
int ans4 = sc1.nextInt();
System.out.println(" Course code : 2380 ");
break;

case 5:
System.out.println(" The subjects covered in Electrical Engineering \n\n 1. Control Systems \n 2. Electrical circuits \n 3. Mathematics\n");
System.out.println(" Do you want to register for Electrical Engneering ? \n 1. yes & 2. no \n please enter ");
int ans5 = sc1.nextInt();
System.out.println(" Course code : 2190");
break;

}
}
int no;
public void studentdetails()
{
Scanner sc2 = new Scanner(System.in);
System.out.println("\n               STUDENT REGISTRATION FORM \n");
System.out.println("\n Enter Candidates Full Name :");
String name = sc2.nextLine();
System.out.println("\n Enter Candidates Email id :");
String email = sc2.nextLine();
System.out.println("\n Enter Candidates Mobile no. :");
no = sc2.nextInt();
System.out.println("\n Enter Course Name :");
String course =sc2.next();
System.out.println("\n Enter Candidates Address (city) :");
String city= sc2.next();
System.out.println("\n\n        INFORMATION SAVED !!! ");
}
public void generate()
{
long rev=0,remainder;
while(no!=0)
{
remainder=no%10;
rev= rev *10+remainder;
no/=10;
}
System.out.println("\n\n Your Registration/Enrollment Id is : " +rev);
}

public void removedata()
{
System.out.println("\n\n Do you want to cancel your registration ? \n 1. Yes\n 2. No");
Scanner sc = new Scanner(System.in);
int choose= sc.nextInt();
if(choose==1)
{
System.out.println("\n Enter your Registration id : ");
int reg= sc.nextInt();
System.out.println("Deleting Data of "+reg);
System.out.println("\n\n\nDeletion Completed !!!");
}
else
{
System.out.println("\n\n\nData Secure and Stored Permenentally ...");
}
}


public static void main(String args[])
{
Course cs = new Course();
cs.showcase();
cs.studentdetails();
cs.generate();
cs.removedata();
}
}