package tem;

public class spilt {

    public static void main(String[] args) {
        String sentenceString = " this is code to show how to convert a String to uppercase";
        String[] words = sentenceString.split(" ");
        for (String word : words) {
            String upperCaseString = word.toUpperCase();
            System.out.println(upperCaseString);
        }
    }
}
