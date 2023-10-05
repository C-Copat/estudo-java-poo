package resources;
public class Applicant {
     String name = "default";
     double salaryRange = 0;
     String status = "default";

    public Applicant(String name, int salaryRange){

        // Constructor for name + salaryRange
        this.name = name;
        this.salaryRange = salaryRange;
        this.status = status;
    }

    // Instead of using the following methods, we could add 'public' to our variables 'name' and 'salaryRange' and operate externally

    public String getName(){
        return name;
    }

    public double getSalaryRange(){
        return salaryRange;
    }

    public String getStatus(){
        return status;
    }

    public void setName(String newName) {
        name = newName;
    }
    
    public void setSalaryRange(double newSalaryRange) {
        salaryRange = newSalaryRange;
    }

    public void setStatus(String newStatus) {
        status = newStatus;
    }
    
}
