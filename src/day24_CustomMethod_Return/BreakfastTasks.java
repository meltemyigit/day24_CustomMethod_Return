package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {
        initials("Meltem", "Yigit");
        initial2("cydeo","school");
        domain("meltemyigitt@gmail.com");
    }

    //Create a method that can display initials of the person.
    public static void initials(String firstName, String lastName){
        System.out.println(firstName + " " + lastName);
    }

    //Create a method that can display initials of the strings' first letter(First letters must be upper case).
    public static void initial2(String firstName, String lastName){
       String initials2 = firstName.charAt(0)+ "." +lastName.charAt(0);
       initials2 = initials2.toUpperCase();
       System.out.println(initials2);
    }

    //Create a method that can display the domain of the email.
    public static void domain(String email){
        String domain = email.substring(email.indexOf("@")+1 , email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }


}
