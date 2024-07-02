package Day_02_Review;

import java.util.HashMap;

public class GenerateDocumentProblem {

    public static void main(String[] args) {

        String list = "!veDJaCyde vaeo perelo xw";
        String document = "Cydeo Java Developer";
        System.out.println(generateDocumentBruteForce(list,document));
        System.out.println(generateDocumentOptimal(list,document));



    }

    public static boolean generateDocumentBruteForce(String list, String document){
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            int documentCharFreq = countCharFreq(character, document);
            int charListFreq = countCharFreq(character,list);
            if (documentCharFreq > charListFreq) return false;


        }
        return true;
    }

    public static int countCharFreq(Character character, String str){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (character==str.charAt(i)) count++;
        }
        return count;
    }


    public static boolean generateDocumentOptimal(String list, String document){
        //Create HashMap(char, int)
        HashMap<Character, Integer>charCounts = new HashMap<>();
        //iterate and count chars in the list
        for (int i = 0; i < list.length(); i++) {
            char character = list.charAt(i);
            charCounts.put(character,charCounts.getOrDefault(character,0)+1);
        }
        //iterate doc string and update char freq from hashmap
        for (int i = 0; i < document.length(); i++) {
            char character = document.charAt(i);
            if (!charCounts.containsKey(character) || charCounts.get(character) ==0)return false;
            charCounts.put(character, charCounts.get(character) -1); // updated the count

        }
        //return true if prev looop is completed without false
        return true;
    }

}
