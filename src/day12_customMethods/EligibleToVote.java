package day12_customMethods;

public class EligibleToVote {

//----UO Way--------------------------------------------------------------------------------------------------
    public static void eligibleToVote(int age, boolean isAmerican){  //is American ismi degerini cagirdiginda veriyorsun
      if (age>=18 && isAmerican){
          System.out.println(" You are eligible to vote");
      }else System.out.println( "You are ineligible to vote");

    }
//----Test----------------------------------------------------------------------------------------------------
public static void main(String[] args) {
    eligibleToVote(19,false);
}
}
/*
6. Create a method named eligibleToVote that takes two arguments:
        1. age (int)
        2. isAmerican (boolean)
    Then the method should determine if the person eligible to vote
        Ex:
            eligibleToVote(23, true)
        output:
            You are eligible to vote
 */