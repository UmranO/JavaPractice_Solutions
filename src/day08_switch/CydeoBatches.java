package day08_switch;

public class CydeoBatches {
    public static void main(String[] args) {

//----if Statement--------------------------------------------------------------------------------------
        String batch="US evening";
        String result="Class times are ";
        boolean validBatch=batch.equals("US morning") || batch.equals("US evening") || batch.equals("EU");
        if (validBatch){
            if(batch.equals("US morning")){result+="10-5 EST. M, T, Th, F.";}
            else if(batch.equals("US evening")){result+="7-10 EST. M, T, W, Th, S, S";}
            else{result+="10-5 EST. M, T, W, Th, F.";}

        }else{result="Invalid Batch If";}
        System.out.println(result);


//----Ternary------------------------------------------------------------------------------------------

        String resultT="";

        resultT=(validBatch)?                                                         //precondition
                 (batch.equals("US morning"))? "Class times are 10-5 EST. M, T, Th, F."
                :(batch.equals("US evening"))? "Class times are7-10 EST. M, T, W, Th, S, S"
                :"Class times are 10-5 EST. M, T, W, Th, F."

                : "Invalid batch Ter";                                                   //else block of precondition

        System.out.println(resultT);

//----Switch------------------------------------------------------------------------------------------

        String resultS="Invalid Batch Sw";

        if (validBatch){

            switch (batch){
                case "US morning" :
                    System.out.println("Class times are 10-5 EST. M, T, Th, F.");
                    break;
                case "US evening" :
                    System.out.println("Class times are7-10 EST. M, T, W, Th, S, S");
                    break;
                default:
                    System.out.println("Class times are 10-5 EST. M, T, W, Th, F.");
            }
        }
        else{
            System.out.println(resultS);
        }

    }
}
/*
4. Create a class named Cydeo batches. In Cydeo we have three batch types:
        US morning, US evening, EU.
        Depending on a batch type (String) print information about the batch.
        	If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
        	If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
        	If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
        	If batch type is invalid, print "Invalid Batch"
        	Note:
			 	Solution 1: use if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */