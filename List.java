
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

// import java.io.PrintWriter;


import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class List {

    private int voter, vote;
    private String dateTime, party;


    public void List(int num, int value)throws IOException {

        dateTime = currentDateTime();
        voter = num;
        vote = value;

        if(vote == 1)
            party = "Party 1";
        else if(vote == 2)
            party = "Party 2";
        else if(vote == 3)
            party = "Party 3";
        else
            party = "NOTA   ";

        try {
                String data = "\n\t Voter :" +voter +" gives a vote to " +party +" on " +dateTime;

            File f1 = new File("D:\JavaProg\CMD\E-Poll\list.txt"); 

            if(!f1.exists()) {
                f1.createNewFile();
            }
            else if(voter == 1){
                f1.delete();
                f1.createNewFile();
            }

            FileWriter fw = new FileWriter(f1.getName(),true);
            BufferedWriter bw = new BufferedWriter(fw);
			
            bw.write(data);
            bw.close();

        } catch(IOException e){
            e.printStackTrace();
        }

    }
    public String currentDateTime() {

        String dt;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss:ms");
        LocalDateTime now = LocalDateTime.now();

        dt = dtf.format(now);

        return dt;
    }

    // Read more: https://www.java67.com/2015/07/how-to-append-text-to-existing-file-in-java-example.html#ixzz6vjKKWtj3
}
