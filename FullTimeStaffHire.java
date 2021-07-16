
public class FullTimeStaffHire extends StaffHire
{
 private int salary;
 private int workingHour;
 private String staffName;
 private String joiningDate;
 private String qualification;
 private String appointedBy;
 private boolean joined;
 //disclare class variable//

 public FullTimeStaffHire(int VacancyNumber, String Designation, String JobType,int salary, int workingHour)
 {
  super (VacancyNumber, Designation, JobType);
  this.salary = salary;
  this.workingHour = workingHour;
  staffName = "";
  joiningDate = "";
  qualification = "";
  appointedBy = "";
  joined = false;
 }
 
 public int getsalary()
 {
  return salary;  
 }
 //using get method//
 public int getworkingHour()
 {
  return workingHour;  
 }
 //using set method//
 public String getstaffName()
 {
     return staffName;
 }
 //using get method//
 public String getjoiningDate()
 {
     return joiningDate;
 }
 //using get method//
 public String getqualification()
 {
    return qualification;
 }
 //using get method//
 public String getappointedBy()
 {
    return appointedBy;
 }
 //using get method//
 public boolean getjoined()
 {
     return joined;
 }
//using get method//
 public void setsalary(int salary)
 {
     if(joined == false)
     {
         this.salary = salary;
     } else
     {
         System.out.println("Salary can not be change.");
     } 
 }
//using set method//
//function set salary//
//using if and else//
 public void setworkingHours(int workingHours)
 {
     this.workingHour = workingHours;
 }
//using set method//
 public void hireFullTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
 {
     if (joined == true)
     {
         System.out.println("staff already joined.");
         System.out.println("Staff Name :" +this.getstaffName());
         System.out.println("He joined in " + this.getjoiningDate());
     }
     else
     {   this.staffName = staffName;
         this.joiningDate = joiningDate;
         this.qualification = qualification;
         this.appointedBy = appointedBy;
         joined = true;
         
     }
 }
//function hireFullTimeStaff//
//using if and else//
 public void display()
 {  super.display();
     if (joined == true)
     {
         System.out.println("Staff Name :" + this.staffName);
         System.out.println("Salary :" + this.salary);
         System.out.println("Working Hours :"+ this.workingHour);
         System.out.println("Joining Date :" + this.joiningDate);
         System.out.println("Qualification :" + this.qualification);
         System.out.println("Appointed By :"+ this.appointedBy);
     }
     
 }
 //function display//
}

