public class ConnectedConditions {
    public static void main(String[] args) {
        int degreesInCelsius = 20;
        boolean isWarm = degreesInCelsius > 16;

        int age = 22;
        boolean hasPassedDrivingTest = true;

        if(isWarm) {
            System.out.println("It's warm outside");
        }

        // this here is another if
        if(age >= 16 && hasPassedDrivingTest) {
            System.out.println("You are legally allowed to drive");
        }

        // && - first taken
        // || - comes second
        if(age <= 6 && hasPassedDrivingTest || degreesInCelsius < 10) {
            System.out.println("Obscure condition evaluated to true");
        }

        /*
        if(isWarm) {
            System.out.println("It is warm today");
        } else if(degreesInCelsius > 5 && degreesInCelsius <= 16) {
            System.out.println("It's kinda okay outside today");
        }  else{
            System.out.println("It is freezingly cold today");
        }
        */
    }
}
