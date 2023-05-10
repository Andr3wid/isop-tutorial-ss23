public class CharCounter {
    public static void main(String[] args) {
        String longSentence = "This is a very long sentence written in the english language for the pure purpose of entertaining this awesome Java program and the whole ISOp tutorial class!";
        String testSentence = "EEE eee";

        char characterToCount = 'e';
        int counter = 0;

        // determines if we should count a letter regardless if it's upper- or lowercase
        boolean countCaseInsensitive = false;

        if(countCaseInsensitive) {
            testSentence = testSentence.toLowerCase();
        }

        for(int i = 0; i < testSentence.length(); i++) {
            // that's how you get a character at a specific position
            // contains a single letter from the sentence on position i
            char currentCharacter = testSentence.charAt(i);

            if(characterToCount == currentCharacter) {
                counter++;
            }
        }

        System.out.println("We found the character '" + characterToCount + "' " + counter + " times.");
    }
}
