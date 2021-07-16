

public class PartTimeStaffHire extends StaffHire
{
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shifts;
    private boolean joined;
    private boolean terminated;
   
//diclare class variable//

    PartTimeStaffHire(int VacancyNumber, String Designation, String JobType, int workingHour, int wagesPerHour, String shifts)
    {
        super (VacancyNumber, Designation, JobType);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        this.staffName = "";
        this.joiningDate = "";
        this.qualification = "";
        this.appointedBy = "";
        this.joined = false;
        this.terminated = false;
    }

    public int getworkingHour()
    {
        return workingHour;
    }
//using get method//   
    public int getwagesPerHour()
    {
        return wagesPerHour;
    }
//using get method//
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
    public String getshifts()
    {
        return shifts;
    }
//using get method//
    public boolean getjoined()
    {
        return joined;
    }
//using get method//
    public boolean getterminated()
    {
        return terminated;
    }
//using get method//
    public void setshifts(String Shifts)
    {
        if(joined==false)
        {
            this.shifts = Shifts;
        }
        else
        {
            System.out.println("No changes in shift");
        }
    }
//using set method//
//function set salary//
//using if and else//
    public void HirePartTimeStaff(String staffName, String joiningDate, String qualification, String appointedBy)
    {
        if(joined == false)
        {
            this.staffName = staffName;
            this.joiningDate = joiningDate;
            this.qualification = qualification;
            this.appointedBy = appointedBy;
            this.joined = true;
            this.terminated = false;
        }
        else if(joined == true)
        {
            System.out.println("Staff is already appointed.");
            System.out.println("Staff Name :" + this.getstaffName());
            System.out.println("Joining Date:"+ this.getjoiningDate());
        }
    }
//fuction hire parttime//

    public void terminateStaff()
    {
        if(terminated == false)
        {
            this.staffName = "";
            this.joiningDate = "";
            this.qualification = "";
            this.shifts = "";
            this.joined = false;
            this.appointedBy = "";
            this.terminated = true;
            System.out.println("The Staff has been terminated.");
        }
        else if(terminated == true)
        {
            System.out.println("Staff has already been terminated.");
        }
    }
//function termination staff//
    public void display()
    {
        super.display();
        if(joined == true)
        {
            System.out.println("Staff Name:"+ this.staffName);
            System.out.println("Joining Date:"+ this.joiningDate);
            System.out.println("Qualification:"+ this.qualification);
            System.out.println("Shift"+ this.shifts);
            System.out.println("Appointed By:"+ this.appointedBy);
            System.out.println("Working Hour:"+ this.workingHour);
            System.out.println("Wages Per Hour"+ this.wagesPerHour);
            System.out.println("Income Per Day:"+(wagesPerHour * workingHour));
        }
    }
 //function display//  
  }
