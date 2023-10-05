package applicantexample;
import applicantexample.resources.Applicant;
import applicantexample.resources.CreateRandomName;
import applicantexample.resources.CreateRandomSalaryExpectation;

public class Case1 {
    public static void main(String[] args) throws Exception {
        double salarioBase = 2000;

        // Still doesn't learn about ArrayList to push new values, so will follow using a fixed size object array

        // Create my random apllicants

        Applicant a1 = new Applicant("default", 0);
        Applicant a2 = new Applicant("default", 0);
        Applicant a3 = new Applicant("default", 0);
        Applicant a4 = new Applicant("default", 0);
        Applicant a5 = new Applicant("default", 0);

        Applicant[] applicants = {a1,a2,a3,a4,a5}; // There should be a better way to do this.

        System.out.println(applicants[1].getName() + " " + applicants[1].getSalaryRange());

        // Populate Random applicants with data
        

        for (Applicant a : applicants){
            String applicantName = CreateRandomName.main();
            double applicantSalaryExpectation = CreateRandomSalaryExpectation.main();

            a.setName(applicantName);
            a.setSalaryRange(applicantSalaryExpectation);
        }

        for (Applicant a : applicants){
            if (a.getSalaryRange() > salarioBase){

                a.setStatus("LIGAR PARA O CANDIDATO");

            } else if (a.getSalaryRange() == salarioBase){

                a.setStatus("LIGAR PARA O CANDIDATO, COM CONTRA PROPOSTA");
                
            } else {
                a.setStatus("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS.");
            }

        }

        for (Applicant a : applicants){
            System.out.println(a.getName() +" "+ a.getSalaryRange() +" "+ a.getStatus() );
        }

        


        
    }
}
