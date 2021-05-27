
import java.io.IOException;

class E_Poll {

    public static void main(String args[]){


        System.out.println();
        System.out.println("For Party1 --> press(1)");
        System.out.println("For Party2 --> press(2)");
        System.out.println("For Party3 --> press(3)");
        System.out.println("For NOTA   --> press(4)");
        System.out.println();

      Helper inp = new Helper();
        try {
            inp.input_Votes(); // take input from user
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
