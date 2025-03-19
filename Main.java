import java.util.Scanner;
class Employee {
public String eNo;
public String eName;
public int eSalary;
public Employee(String eNo, String eName, int eSalary)
{
this.eNo = eNo;
this.eName = eName;
this.eSalary = eSalary;
}
}
public class Main {
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
System.out.print("Enter count of the employee list: ");
int count = Integer.parseInt(scan.nextLine());
Employee[] employees = new Employee[count];
for (int i=0; i<count; i++)
{
System.out.print("Enter number of employee: ");
String eNo = scan.nextLine();
System.out.print("Enter name of employee: ");
String eName = scan.nextLine();
System.out.print("Enter salary of employee: ");
int eSalary = Integer.parseInt(scan.nextLine());
employees[i] = new Employee(eNo,eName,eSalary);
}
System.out.println("Enter the number of employee to be filtered out: ");
String search = scan.nextLine();
for (int i=0;i<count;i++){
if(employees[i].eNo.equals(search))
{
System.out.println("Employee Number : "+employees[i].eNo);
System.out.println("Employee Name : "+employees[i].eName);
System.out.println("Employee Salary : "+employees[i].eSalary);
}
}
}
}


