package tem.bin;
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
    System.out.println("total sentence " + sentenceString.length());
    System.out.println("total words: " + words.length);
        }
        }
