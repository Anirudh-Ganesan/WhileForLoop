import java.util.Scanner;

public class WhileForLoop {
    public static void main(String[] args) {

    Scanner userLanguage = new Scanner(System.in);

        //looping allows parts of code to repeat
        //repetition can be a predefined number of times or a user choice amount
        //times or a user choice amount
        //two main kinds of loops: while and for
        //both are similar, but vary in syntax setup

        //while loops require a "counter" to be made OUTSIDE the loop
        //"counter" checked in condition
        //"counter" updated inside the loop
        //leaves when counter check is false
        //while loops are "nicer" when dealing with user choice

        System.out.println("Enter a language to see how to say \"hello\". Enter \"finished\" to quit.");

        String language = userLanguage.nextLine();

        //without updating the "counter" we will end up in an infinite loop as our condition
        //check will never be changing
        //we are looping the way below to leave the number of times to loop up to user choice
        //we will continue to loop until they enter the word "finished"
        //have a number or word the user must enter to stop a loop is known as a
        //SENTINEL value

        while(!"finished".equals(language)) {

            if("french".equalsIgnoreCase(language)) {

                System.out.println("Bonjour");

            } else if("spanish".equalsIgnoreCase(language)) {

                System.out.println("Hola");

            } else if("chinese".equalsIgnoreCase(language)) {

                System.out.println("Ni Hao");

            } else if("italian".equalsIgnoreCase(language)) {

                System.out.println("Ciao");

            } else {

                System.out.println("Sorry not recognized");

            }

            System.out.println("Enter a lang or finish to quit.");

            language = userLanguage.nextLine();

        }//end while user not finished

        //sometimes we want to loop a predetermined amount of time
        //this can be done with a while loop
        //remember counter outside, check counter, and update counter inside

        int counter = 0;
        while (counter < 5) {
             System.out.println("Counter: " + counter);
             counter++;
        }

        //for loop is "cleaner" when we have a predetermined number of times to loop the concepts of:
        //make counter, check counter, update counter still happen
        //they all happen on one line

        //syntax: for loops have 3 sections in header
        //for (this is a keyword)
        //parenthesis ( ; ; )
        //  the sections are separated by ;

        //first section: init (we make the counter)
        //                      this is only run once
        //
        //second section: condition check
        //                      (terminating clause)
        //
        //third section: update counter

        for (int i = 0; i < 3; i++) {

            System.out.println("Enter a lang or finish to quit.");

            language = userLanguage.nextLine();

            if("portuguese".equalsIgnoreCase(language)) {

                System.out.println("Oi");

            } else if("japanese".equalsIgnoreCase(language)) {

                System.out.println("Konnichiwa");

            } else {

                System.out.println("Sorry");

            }
        }
    }//end of main method
}//end of class
