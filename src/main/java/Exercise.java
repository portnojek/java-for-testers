public class Exercise {
    static void main(String[] args) {
        Exercise exercise = new Exercise();
        int year = exercise.timeJump();
        System.out.println("Target Year: " + year);
    }

    public int timeJump() {
        int initialYear = 1985;

        // Create a new variable called timeJump
        // Add it to the initialYear and assign the result to targetYear
        // so that the targetYear becomes 2015

        int targetYear = 0;

        // TODO: Your code goes here
        int timeJump = 30;
        targetYear = initialYear + timeJump;
        return targetYear;
    }

    public String toLowerCase(String text) {
        text = text.toLowerCase();
        return text;
    }

    public String trimText(String text) {
        text = text.trim();
        return text;
    }

    public String replaceText(String originalText, String target, String replacement) {
        // TODO: return a string that replaces all the copies of the target text
        // with the replacement text in originalText.
        return originalText.replace(target, replacement);
    }

}
