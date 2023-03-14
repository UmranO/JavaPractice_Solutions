package day08_switch;
public class ChooseLanguage {

    public static void main(String[] args){
        int n=5;
        String result="";

        result=(n>=1 && n<=5)?             //Precondition-Gecerli olan sartlar, variabli outer ternary de veriyorsun!
               (n==1)? "Hello, thanks for your call"                           //Gecerli olan secenekler
              :(n==2)? "Hola, gracias para llamar"
              :(n==3)? "Merhaba, aradiginiz icin tesekkurler"
              :(n==4)? "Privet, spasibo za vash zvonok"
              :"Merci ,pour votre appel"                                       //!Buraya ; koyma
        :"Invalid Number";                                                     //else block of the Precondition
        System.out.println(result);

        System.out.println("----------------------------------------------------------------------------------");

        int n1=5;
        String result1="";

        switch (n1){
            case 1: result1="Hello, thanks for your call";
            break;
            case 2: result1="Hola, gracias para llamar";
                break;
            case 3: result1="Merhaba, aradiginiz icin tesekkurler";
                break;
            case 4: result1="Privet, spasibo za vash zvonok";
                break;
            case 5: result1="Merci ,pour votre appel";
                break;
            default:result1="Invalid Number";
        }
        System.out.println(result1);

    }
}
/*
Create a class called ChooseLanguage,
 		Given an integer variable named selection that has a number between 1~5.
 		Write a program that can select the language based on the number that's given in selection and prints the
 		following message:
			for 1: Hello, thanks for your call
			for 2: Hola, gracias para llamar
			for 3: Merhaba, aradiginiz icin tesekkurler
			for 4: Privet, spasibo za vash zvonok
			for 5: Merci ,pour votre appel
			for any other numbers print "Invalid Number"
		Solution 1: Must use ternary
		Solution 2:	MUST use switch statement
 */