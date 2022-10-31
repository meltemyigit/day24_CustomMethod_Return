package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Meltem", "Yigit2");
        initial2("cydeo","school");
    }
    public static void initials(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }
    public static void initial2(String firstName, String lastName){
       String initials2 = firstName.charAt(0)+ "." +lastName.charAt(0);
       initials2 = initials2.toUpperCase();
        System.out.println(initials2);
    }
}
