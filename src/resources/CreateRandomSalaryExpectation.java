package resources;

import java.util.concurrent.ThreadLocalRandom;

public class CreateRandomSalaryExpectation {

    public static int main() {

        int selectedSalaryExpectation = ThreadLocalRandom.current().nextInt(1000,3000);

        return selectedSalaryExpectation;
        
    }
    
}
