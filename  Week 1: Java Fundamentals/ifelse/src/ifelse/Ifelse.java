/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ifelse;

/**
 *
 * @author edward
 */
public class Ifelse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String Edward = "Hello Edward";
        int age = 21;

        if (age == 20) {
            System.out.println("Hello " + Edward + " Your age is :" + age);
        } else {
            System.out.println("You're not Edward!");
        }

        //this is for switch case
        int date = 4;
        switch (date) {
            case 1:
                System.out.println("Monday");

                break;
            case 2:
                System.out.println("Tuesday");

                break;
            case 3:
                System.out.println("Wednesday");

                break;
            case 4:
                System.out.println("Thursday");

                break;
            case 5:
                System.out.println("Friday");

                break;
            case 6:
                System.out.println("Saturday");

                break;
            case 7:
                System.out.println("Sunday");

                break;
            default:
                throw new AssertionError();
        }

        //this is for loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }

}
