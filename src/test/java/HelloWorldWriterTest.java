import org.junit.jupiter.api.Test;

public class HelloWorldWriterTest {
    @Test
    public void shouldWriteHelloWorldToTheConsole() {
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNUmercialVariables() {
        final int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;
        long starsInTheGalaxy = 4200000000L;
        double weight = 15.5;
        System.out.println(ageNextYear);
        System.out.printf("Age next year: %d\n", ageNextYear);
        System.out.printf("Stars in the galaxy: %d\n", starsInTheGalaxy);
        System.out.println(weight);
    }

    @Test
    public void workingWithStrings() {
        String firstName = "Sarah-Jane\n";
        String upperCaseFirstName = firstName.toUpperCase();
        String replacedName = firstName.replace("Sarah", "Mary");
        System.out.printf(upperCaseFirstName);
        System.out.printf(replacedName);

    }

    @Test
    public void timeJump() {
        int initialYear = 1985;

        // Create a new variable called timeJump
        // Add it to the initialYear and assign the result to targetYear
        // so that the targetYear becomes 2015

        int targetYear = 0;
        // TODO: Your code goes here
        int timeJump = 40;
        targetYear = initialYear + timeJump;
        //return targetYear; => testy nie mogą zwracać wartości
    }

}