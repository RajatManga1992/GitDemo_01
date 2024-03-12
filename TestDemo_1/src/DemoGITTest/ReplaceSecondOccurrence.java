package DemoGITTest;

public class ReplaceSecondOccurrence {
    public static void main(String[] args) {
        String inputString = "ToMorrow";
        char targetChar = 'O';
        char replacementChar = '$';

        String result = replaceSecondOccurrence(inputString, targetChar, replacementChar);

        System.out.println("Original String: " + inputString);
        System.out.println("Modified String: " + result);
    }

    private static String replaceSecondOccurrence(String input, char target, char replacement) {
        int firstOccurrenceIndex = input.indexOf(target);
        int secondOccurrenceIndex = input.indexOf(target, firstOccurrenceIndex + 1);

        if (firstOccurrenceIndex != -1 && secondOccurrenceIndex != -1) {
            char[] charArray = input.toCharArray();
            charArray[secondOccurrenceIndex] = replacement;
            return new String(charArray);
        }

        if (firstOccurrenceIndex == -1 ) {
        	// add item in new string
        }
        
        // Return the original string if the target character is not found or if there is no second occurrence
        return input;
    }
}
