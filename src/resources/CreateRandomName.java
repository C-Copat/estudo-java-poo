package resources;

import java.util.concurrent.ThreadLocalRandom;

public class CreateRandomName {

    public static String main() {
        String[] names = {"Márcia","Carlos","João","Maria","Roberto","Francisco"};

        int selectedName = ThreadLocalRandom.current().nextInt(0,names.length);

        return names[selectedName];
    } 
    
}
