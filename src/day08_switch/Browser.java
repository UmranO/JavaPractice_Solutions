package day08_switch;

public class Browser {
    public static void main (String[] args){
        String bName="FIREFOX";
        String validBr="Invalid Browser name";
        String result="Selected Browser name is ";

            switch (bName) {
                case "CHROME":          //Bu sekilde yainca CHROME veya chrome ikisini de dogru kabul ediyor
                case "chrome": result+="chrome";
                break;

                case "FIREFOX" :
                case "firefox" : result+="firefox";
                break;

                case "opera" : result+="opera";
                break;

                case "safari": result+="safari";
                break;

                case "edge" : result+="edge";
                default: result="Invalid";
            }
        System.out.println(result);
    }
}
/*
3.  write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, output should be: Invalid Browser
        	Do Not use if statement or ternary
 */