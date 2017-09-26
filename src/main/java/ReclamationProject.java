/*
 * The following code needs a lot of TLC. So give it some!
 *
 * 1. Fix all checkstyle errors
 * 2. Determine what it does (it's going to be tough before you finish #1)
 * 3. Improve the name of the methods and variables
 * 4. Add comments and Javadoc comments where needed
 * 5. Remove unnecessary comments as appropriate
 */




/**
 * This class compares two strings and returns the pattern to the user.
 * else, prints a blank string.
 *
 */
public class ReclamationProject {
    /**
     *This is Reclamation Project.
     *
     *
     *@param args
     *These are the project's arguments for main.
     */
    public static void main(final String[] args) {



        String temp = findFirstMatch("BBBBAABA", "ABAB");

        System.out.println("Result: " + temp);
        //Runs the method and returns the result.
    }
    /**
     *findFirstMatch returns a substring.
     * @param firstParameter
     * This is the first string we input
     * @param secondParameter
     * This is the second string we input
     * @return value
     * Returns a matching substring
     *
     */
    public static String findFirstMatch(final String firstParameter, final String secondParameter) {
        String biggerString = firstParameter;
        String smallerString = secondParameter;
        if (biggerString.length() > smallerString.length()) {
            String c = biggerString; // TODO Sets a swap variable
            biggerString = smallerString;
            smallerString = c;
            //swaps the positions so first
        }
        String result = "";
        if (biggerString.equals(smallerString)) {
            //If they are equal to each other, return "";
            result = "";
        }
        for (int i = 0; i < biggerString.length(); i++) {
            //Scans through all of the characters in the first string.

            for (int j = biggerString.length() - i; j > 0; j--) {
                //Iterates through the first string
                for (int k = 0; k < smallerString.length() - j; k++) {
                    //goes backwards from the smallerString

                    if (biggerString.regionMatches(i, smallerString, k, j) && j > result.length()) {
                        //compares the second String with the first String and checks if they match

                        result = biggerString.substring(i,  i + j);
                        //returns the given substring that matches between 1 & 2 string.

                    } else {

                        result = "";
                        //no matching substrings
                        //returns ""

                    }
                        }
                }
        }
        //returns the substring (either a String or "")
        return result;
        }
}

