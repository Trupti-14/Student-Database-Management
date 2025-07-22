import java.util.Scanner ;
import java.util.ArrayList;
class student{
Scanner S = new Scanner (System.in);
int RollNo ;
String Name ;
double m1, m2, m3, m4, m5 ;
double Grade ;
student()
{
	
}
student(int r, String n , double m1 , double m2, double m3 , double m4 , double m5 )
{
	this.RollNo = r ;
	this.Name = n ;
	this.m1 = m1 ;
	this.m2 = m2 ;
	this.m3 = m3 ;
	this.m4 = m4 ;
	this.m5 = m5 ;
	this.Grade = gradeCal() ;
}
double gradeCal()
{
Grade =  ( m1 + m2 + m3 + m4 + m5 )/ 50.0  ;
return Grade ;
}

void check()
{
	if(Grade >= 8)
	{
			System.out.println(Name+"\t\t"+RollNo+"\t\t"+Grade);
	}
}

void acceptArray()
{
	student s[] = new student[10] ; //Declaration array of student class. //It is an array of an object.
	student p = new student() ;
	System.out.println("Enter the details of student ");

	for(int i = 0 ; i < s.length ; i++ )
	{
	System.out.print("Enter the roll no. of student no. "+(i+1)+" : ") ;
	int RollNo = S.nextInt() ;
	System.out.println(" ") ;
	System.out.print("Enter Name of student no. "+(i+1)+" : ") ;
	String Name = S.next();
	System.out.println(" ") ;
	System.out.println("Enter marks of 5 subjects : ") ;
	System.out.print("Subject 1 : ");
	double m1 = S.nextDouble();
	System.out.print("Subject 2 : ");
	double m2 = S.nextDouble();
	System.out.print("Subject 3 : ");
	double m3 = S.nextDouble();
	System.out.print("Subject 4 : ");
	double m4 = S.nextDouble();
	System.out.print("Subject 5 : ");
	double m5 = S.nextDouble();
	s[i] = new student(RollNo,Name,m1,m2,m3,m4,m5) ;
	}
	int x = 0;
	System.out.println("List of students whose grade is greater than 8. ");
	 System.out.println();
	 System.out.println("Name\t\tRoll No\t\tGrade");
	 for(int i=0 ; i<s.length ; i++)
	 {
	    s[i].check();
	 }
}

void acceptArrayList()
{
	ArrayList<student> al = new ArrayList<student>(10) ; //Default size.
	System.out.print("How many student data you want to store : ");
	int k = S.nextInt() ;
	System.out.println("Enter the details of student ");
	for(int i = 0 ; i < k  ; i++ )
	{
	System.out.print("Enter the roll no. of student no. "+(i+1)+" : ") ;
	int RollNo = S.nextInt() ;
	System.out.println(" ") ;
	System.out.print("Enter Name of student no. "+(i+1)+" : ") ;
	String Name = S.next();
	System.out.println(" ") ;
	System.out.println("Enter marks of 5 subjects : ") ;
	System.out.print("Subject 1 : ");
	double m1 = S.nextDouble();
	System.out.print("Subject 2 : ");
	double m2 = S.nextDouble();
	System.out.print("Subject 3 : ");
	double m3 = S.nextDouble();
	System.out.print("Subject 4 : ");
	double m4 = S.nextDouble();
	System.out.print("Subject 5 : ");
	double m5 = S.nextDouble();
	al.add(new student(RollNo,Name,m1,m2,m3,m4,m5)) ;
	}
	System.out.println("List of students whose grade is greater than 8. ");
	 System.out.println();
	 System.out.println("Name\t\tRoll No\t\tGrade");
	for(int i = 0 ; i<al.size() ; i++)
	{
		al.get(i).check();
	}
}
}

//Main class.
public class Main {
public static void main(String[] args) {

	Scanner S = new Scanner(System.in) ;
    student h = new student() ;
    int choice, a ;
    
do {
	System.out.println("Which operation you want to perform. ") ;
	 System.out.println(" 1] Without ArrayList\r\n"
	 		+ " 2] With ArrayList ") ;
	 System.out.print("Enter choice : ") ;
	 choice = S.nextInt();
	 
	 switch(choice)
	 {
	 
	 case 1 : //Without ArrayList.
		 h.acceptArray();
		 break ;
		 
	 case 2 : //With ArrayList.
		 h.acceptArrayList();		
		 break ;
		 
     default :
    	 
    	 System.out.println("Invalid choice. ");
    	 break ;
		
	 }
	
	 System.out.print("If you want to continue then enter 1.\n"
	 		+ "Enter here : ");
	 a = S.nextInt() ;
	 
}while(a==1) ;

}
}
