public class upper {
    public static void main(String[] args) {
      
        String fristname = "shahul";
        String lastname = "hameed";
        String fullname = fristname + " " + lastname;
        System.out.println("My full name is " + fullname);
        String uppercase = fristname.toUpperCase();
        System.out.println(" the uppercase of my name is " + uppercase);

        String sentenceString = " this is code to show how to convert a String to uppercase";
        String[] words = sentenceString.split(" ");
        for (String word : words) {
            String upperCaseString = word.toUpperCase();
            System.out.println(upperCaseString);
        }
        }
}