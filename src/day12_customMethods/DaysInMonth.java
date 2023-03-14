package day12_customMethods;

public class DaysInMonth {
    //----UO Way--------------------------------------------------------------------------------------------------
    public static void howManyDays(int num) {
        String nameOfTheMonth = (num == 1) ? "Jan" : (num == 2) ? "Feb" : (num == 3) ? "Mar" : (num == 4) ? "Apr" : (num == 5) ? "May" : (num == 6) ? "Jun"
                : (num == 7) ? "Jul" : (num == 8) ? "Aug" : (num == 9) ? "Sep" : (num == 10) ? "Oct" : (num == 11) ? "Nov" : "Dec";
        int day = 0;                                  //int result ile swich araina String result yazinca problem oldu
        switch (num) {
            case 2:
                day = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                day = 30;
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                day = 31;
                break;
        }

        System.out.println(nameOfTheMonth + " has " + day + " days");
    }
//----M Way----------------------------------------------------------------------------------------------------

    public static void numberOfDays(String month) {
        month = ("" + month.charAt(0)).toUpperCase() + month.substring(1);

        String result = month + " has ";

        switch (month) {
            case "February":
                result += 28 + " days";
                break;

            case "April":
            case "June":
            case "September":
            case "November":
                result += 30 + " days";
                break;

            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                result += 31 + " days";
                break;

            default:
                result = "Invalid month";
        }

        System.out.println(result);
    }

    //----Test----------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        howManyDays(2);
        numberOfDays("maiy");
    }

}
//1, 3, 5, 7, 8, 10, 12
//4, 6, 9, 11
/*
5. Create a method that can print how many days a month has
    Ex:
        month("June")
        output:June has 30 days
 */