package day17_customClass;

public class Student {
    public String name;
    public char gender;
    public int age;
    public String studentId;
    public int grade;
    public boolean isFullTime;

    public void setInfo(String name, char gender, int age, String studentId, int grade, boolean isFullTime) {
        this.name = name;
        this.gender = gender;
        this.age=age;
        this.studentId=studentId;
        this.grade=grade;
        this.isFullTime=isFullTime;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +                            //String'i '' icinde yazmak icin '\'' kullandik
                ", gender=" + gender +                              //variable' sonrasi (iki variable arasi ,)
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                ", grade=" + grade +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void study(String name){
        System.out.println(name +" is studying");
    }
//----Test-----------------------------------------------------------------------------------------------
public static void main(String[] args) {
    Student student=new Student();
    student.setInfo("Um",'F',52,"Cy124",6,true);
    System.out.println(student);

    student.study("um");
}



}
/*
 Create a custom class named Student
		Attributes:
			name, gender, age, studentId, grade, isFullTime
		Actions:
			setInfo(): sets all the fields of the student object
			toString(): when a car object is passed in print statement,
					it should display all the information of the student object
			study()
 */