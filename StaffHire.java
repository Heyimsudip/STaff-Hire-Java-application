
public class StaffHire
//create staffhire class//
{
    private int VacancyNumber;
    private String Designation;
    private String JobType;
//declare class variable//
    StaffHire( int VacancyNumber, String Designation, String JobType)
    {
        this.VacancyNumber = VacancyNumber;
        this.Designation = Designation;
        this.JobType = JobType;
    } 

    public int getVacancyNumber()
    {
        return VacancyNumber;
    }
//using get method//  
    public void setVacancyNumber(int VacancyNumber)
    {
        this.VacancyNumber = VacancyNumber;
    }
//using set method//  
    public String getDesignation()
    {
        return Designation;
    }
//using get method//    
    public void setDesignation(String Designation)
    {
        this.Designation = Designation;
    }
//using set method//  
    public String getJobType()
    {
        return JobType;
    }
//using get method//   
    public void setJobType(String Jobtype)
    {
        this.JobType = Jobtype;
    }
//sing set method//
    public void display()
    {
        System.out.println("Vacancy Number is: "+this.getVacancyNumber());
        System.out.println("Designation is: "+this.getDesignation());
        System.out.println("Job Type is: "+this.getJobType());
    } 
//display function//
}
