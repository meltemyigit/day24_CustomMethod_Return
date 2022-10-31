public class PracticesTasks {

    public static void main(String[] args) {
        oddNumbers();
        System.out.println();
        evenNumbers();
        System.out.println();
        personIsEligibleForAlcohol(19);
        System.out.println();
        eligibleToVote(19, "USA");

    }


    // create a method that can print odd numbers between 1~100 in a
    //same line saperated by space
    public static void oddNumbers() {
        for (int i = 1; i < 101; i += 2) {
            System.out.print(i + " ");

        }
    }

    //create a method that can print even numbers between 1~100 in a
    //same line saperated by space
    public static void evenNumbers() {
        for (int i = 0; i < 101; i += 2) {
            System.out.print(i + " ");

        }
    }

    //create a method that can check if a person is eligible to buy
    //alcohol
    public static void personIsEligibleForAlcohol(int age) {
        if (age >= 18) {
            System.out.println("eligible");
        } else {
            System.out.println("not eligible");
        }
    }

    /*create a method that can check if a person is eligible to vote
    Ex:
    eligibleToVote(19, "USA");
    output:
    You are not eligible to vote!
*/
    public static void eligibleToVote(int age, String country) {
        if (age >= 24 && country == "USA") {
            System.out.println("You are  eligible to vote!");
        } else {
            System.out.println("You are not eligible to vote!");
        }
    }

   /*create a method that can calculate the grade of the student based
    on the score*/


}
