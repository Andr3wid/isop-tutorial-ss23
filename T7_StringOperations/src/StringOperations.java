public class StringOperations {
    public static void main(String[] args) {
        String s1 = "Hello ISOP class!"; // should be 17
        String s2 = s1 + " How are you doing?";

        char firstCharacterOfSentence = s1.charAt(0);

        int amountOfCharacters = s1.length();
        char lastCharacterOfSentence = s1.charAt(amountOfCharacters - 1);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println("First character of our sentence is: " + firstCharacterOfSentence);
        System.out.println("Last character of our sentence is: " + lastCharacterOfSentence);

        String upperCaseSentence = s1.toUpperCase();
        String lowerCaseSentence = s1.toLowerCase();
        System.out.println("Upper cased sentence: " + upperCaseSentence);
        System.out.println("Lower cased sentence: " + lowerCaseSentence);

        System.out.println("=====================");

        String word1 = "hi";
        String word2 = "hi";

        // always use "equals" when comparing Strings to each other
        if(word1.equals(word2)) {
            System.out.println("The two words are equal");
        } else {
            System.out.println("The two words are NOT equal");
        }

        System.out.println("=====================");

        String paddedString = "          this is our sentence!        ";
        String removedSpaces = paddedString.trim();
        System.out.println(paddedString);
        System.out.println(removedSpaces);

        System.out.println("=====================");
        // STUDENT_ID,POINTS,EXAM_DURATION_TAKEN
        String data = "1234,80,100";

        // split "breaks up" a string with the given separator
        String[] extractedData = data.split(",");

        System.out.println("Student ID: " + extractedData[0]);
        System.out.println("Points: " + extractedData[1]);
        System.out.println("Duration taken for exam: " + extractedData[2]);

        // join "combines" a string with the given separator
        String combinedData = String.join(" || ", extractedData);
        System.out.println(combinedData);

        System.out.println("================");

        String firstFiveLetterOfSentence = s1.substring(0, 5);
        System.out.println(firstFiveLetterOfSentence);
    }
}
