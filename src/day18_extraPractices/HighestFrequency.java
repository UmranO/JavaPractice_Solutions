package day18_extraPractices;
public class HighestFrequency {
    public static void main(String[] args) {
//----UO Way------------------------------------------------------------------------------------------------------------
        String str = "aaaabbcccddddeeee";
        String result = "";
        int max = 0;                                      //Bu her iki loop'un da disinda tanimlanmali ki reset'lenmesin

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            int count = 0;
                                                           //Once max'i buraya koymustum hata cunku o zaman
            for (int i = 0; i < str.length(); i++) {       //her outer loop'un seferinde sifirliyor!!
                if (ch == str.charAt(i)) {count++; }
            }

            if (count > max) {
                max = count;
                result = ch + "";
            }
            if (count == max && (!(result.contains(ch + "")))) {
                result += ch;
            }

        }
        System.out.println(result);
//----M Way------------------------------------------------------------------------------------------------------------

        String strM = "aaaabbcccddddeeee";
        int highestFrequency = 0;                         //Bu her iki loop'un da disinda tanimlanmali ki reset'lenmesin


        for (int i = 0; i < strM.length(); i++) {
            char chM = strM.charAt(i);
            int countM = 0;
            for (int j = 0; j < strM.length(); j++) {
                if (chM == strM.charAt(j)) {
                    countM++;
                }
            }
            if (countM > highestFrequency) {                    //Ic loop'un disinda ama dis loop'un icinde
                highestFrequency = countM;
            }

        }

        String resultM = "";

        for (int i = 0; i < strM.length(); i++) {
            char chM = strM.charAt(i);
            int countM = 0;
            for (int j = 0; j < strM.length(); j++) {
                if (chM == strM.charAt(j)) {
                    countM++;
                }
            }

            if (countM == highestFrequency && !resultM.contains(chM + "")) {
                resultM += chM;
            }

        }

        System.out.println(resultM);
    }
}
/*
1. Write a program that can return the character that has the highest frequency from a string
	Ex:
		str = "aaabbccccddeeee"
		output:
			c
			e
 */