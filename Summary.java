
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import java.util.ArrayList;

public class Summary {

        private int party1_votes = 0, party2_votes = 0, party3_votes = 0, party4_votes = 0, total_votes;

    public void Summary(ArrayList<Integer> lst){

        total_votes = lst.size();

            for (int s : lst) {

                if (s == 1)
                    party1_votes++;
                else if (s == 2)
                    party2_votes++;
                else if (s == 3)
                    party3_votes++;
                else
                    party4_votes++;
            }

            System.out.println();
            // System.out.println(lst);

            summaryRecord();

    }
    public void summaryRecord(){

        System.out.println();

        System.out.println("Total Voters = " + total_votes);
        System.out.println("count of votes of Party 1 -> in number : " + party1_votes + ", and in percentage : " + (party1_votes * 100) / total_votes + "%");
        System.out.println("count of votes of Party 2 -> in number : " + party2_votes + ", and in percentage : " + (party2_votes * 100) / total_votes + "%");
        System.out.println("count of votes of Party 3 -> in number : " + party3_votes + ", and in percentage : " + (party3_votes * 100) / total_votes + "%");
        System.out.println("count of votes of NOTA    -> in number : " + party4_votes + ", and in percentage : " + (party4_votes * 100) / total_votes + "%");

        System.out.println();
    }
    public void summaryFile(){


        try {

            PrintStream file = new PrintStream(new File("D:\\JavaProg\\CMD\\E-Poll\\Summary.txt"));

            System.setOut(file);

            System.out.println("\t\t E-Poll Summary");
            summaryRecord();


        }
        catch (FileNotFoundException e){

          System.out.println(e);
        }

    }

}
