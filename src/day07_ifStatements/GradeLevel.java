package day07_ifStatements;

public class GradeLevel {
    public static void main(String[] args) {
//----UO Way-------------------------------------------------------------------------------------------------
        byte gradeL = 0;
        String result = "";

        boolean validNumber=gradeL>=1 && gradeL<=18;

        if (validNumber) {                                             //precondition dogruysaki secenekler
            if (gradeL >= 1 && gradeL <= 5) {
                result = "Elementary school";
            } else if (gradeL >= 6 && gradeL <= 8) {
                result = "Middle school";
            } else if (gradeL >= 9 && gradeL <= 12) {
                result = "High school";
            } else if (gradeL >= 13 && gradeL <= 16) {
                result = "College";
            } else {
                result = "Grad School";
            }

        } else {
            result = "Invalid grade level";        //precondition dogru degilse yani invalid entry
        }
        System.out.println(result);
//----M Way-------------------------------------------------------------------------------------------------

        byte number = gradeL;
        String gradeLevel = "";

        boolean validNumber1 = number >= 1 && number <= 18;

        if(validNumber1){ // 1 ~ 18

            if(number >= 17){
                gradeLevel = "Grad School";
            }else if(number >= 13 ){
                gradeLevel = "College";
            }else if(number >= 9 ){
                gradeLevel = "High School";
            }else if(number >= 6 ){
                gradeLevel = "Middle School";
            }else if(number >= 1 ){
                gradeLevel = "Elementary School";
            }

        }else{
            gradeLevel = "Invalid Grade Level";
        }

        System.out.println(gradeLevel);

    }
}
/*
Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School
                    For Any Other grade: Invalid grade level given
            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */