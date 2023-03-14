package day11_string;

public class ReallyNeverMind {
    public static void main(String[] args) {
        String w="rasdfgly";
        if (w.endsWith("ly")) System.out.println("really?");
        else System.out.println("never mind");

//M Way:String lastTwoChars = word.substring( word.length()-2 ); //kelimenin sondan 2.sinden baslayan substring yaratmis
//if(lastTwoChars.equals("ly")){
//            System.out.println("really???");
//        }else{
//            System.out.println("Never mind");
//        }

    }
}
/*
4. Create a class named ReallyNeverMind. Ask the user to enter a word.
if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
 */