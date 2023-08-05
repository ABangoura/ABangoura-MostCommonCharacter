import java.util.HashMap;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        HashMap<Character, Integer> characterMap = new HashMap<Character, Integer>();

        // Loop over the string 'str', and populate the hashMap.
        for(int i = 0; i < str.length(); i++) {
            if(characterMap.containsKey(str.charAt(i))) { // If current character in the string is in the map...
                characterMap.put(str.charAt(i), characterMap.get(str.charAt(i)) + 1); // ... increment its integer value by 1.
            } else {
                characterMap.put(str.charAt(i), 1); // Else, insert the character in the map, and set its value to 1 (first occurence).
            }
        }

        // Loop over hashMap and get the most common character.
        char mostCommonCharacter = ' ';
        int value = 0;
        for(char key: characterMap.keySet()) {
            if(characterMap.get(key) > value) { // If the occurance of the current character is greater than 'value'...
                mostCommonCharacter = key; // ... set 'mostCommonCharacter' to that key,
                value = characterMap.get(key); // and update 'value'.
            }
        }

        return mostCommonCharacter;
    }
}
