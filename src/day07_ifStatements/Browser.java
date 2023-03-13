package day07_ifStatements;

public class Browser {
    public static void main(String[] args){
        String bName="edge";
        String result="";

        boolean validBrowser=  bName.equals("chrome")||bName.equals("firefox")
                             ||bName.equals("opera") ||bName.equals("safari")||bName.equals("edge");

        if(validBrowser){
            if(bName.equals("chrome")){result="chrome";}
            else if(bName.equals("firefox")){result="firefox";}
            else if(bName.equals("opera")){result="opera";}
            else if(bName.equals("safari")){result="safari";}
            else {result="edge";}
        }
         else{result="Invalid Browser Name";}
        System.out.println(bName + " Browser is selected");
    }
}
/*
Create a class called Browser. Write a program that can display the name of selected browser
        1. declare a String variable named browserName
        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge.
        3. if the browser name does not match with the valid browser names, out put should be: Invalid Browser Name
        Ex:
            String browser = "chrome";
        Output:
            Chrome Browser is selected
        Note: MUST use nested if
 */