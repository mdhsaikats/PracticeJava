package Inheritence2;

public class CseTeacher extends Teacher{
    public String mainSubject = "CSE";

    public static void main(String[] args) {
        CseTeacher obj = new CseTeacher();

        System.out.println(obj.uniName);
        System.out.println(obj.designation);
        System.out.println(obj.mainSubject);
    }
}
