
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Helper {

    public static void input_Votes() throws IOException {

        int i = 1;
        boolean invalidInput = true;
        int tempInput;

        ArrayList<Integer> lst = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);


        List l = new List();


        while(invalidInput) {

            System.out.print("Voter "+i+" : ");

            if (in.hasNextInt()) {

                tempInput = in.nextInt();

                    if (tempInput >= 1 && tempInput <= 4) {

                        lst.add(tempInput);
                        l.List(i, tempInput);
                        i++;
                    }
                    else if(tempInput == 0){

                        if(lst.isEmpty())

                            System.out.println("pls give some input");

                        else
                            invalidInput = false;

                    }
                    else{
                        System.out.println("Please enter the appropriate number. Try again.");
                        System.out.println("Press (1) for Party1, (2) for Party2, (3) for Party3, (4) for NOTA ");
                        System.out.println();
                    }

            } // end of if (in.hasNextInt()) check

            else{

                            System.out.println("You have entered an invalid input. Try again.");
                            System.out.println("Press (1) for Party1, (2) for Party2, (3) for Party3, (4) for NOTA ");
                            System.out.println();
                            in.next();

            }


        }// end of while loop

        //To show summary of voting on console as well as in summary file
            Summary s = new Summary();
            s.Summary(lst);
            s.summaryFile();


    }
}