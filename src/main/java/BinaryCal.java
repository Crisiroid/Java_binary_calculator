import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class BinaryCal {
    public static void calculate(){
        //creating required variables
        int num, iL;
        int b[] = new int[100];
        StringBuilder finalr = new StringBuilder();
        //creating a new list to sort the data
        List<Integer> blist = new ArrayList<Integer>();
        num = Integer.parseInt(JOptionPane.showInputDialog("Enter your decimal number: "));
        iL = 0;
        //creating a while loop to calculate the binary number and setting it to b list
        while(num != 0){
            b[iL] = num%2;
            num = num/2;
            iL++;
        }
        //adding blist items into a list of integers
        for(int i = iL-1; i >=0; i--){
            blist.add(b[i]);
        }
        //converting list of integers into stringBuilder
        for(int j = 0; j < blist.size(); j++){
             finalr.append(blist.get(j));
        }
        //showing the result
        String result = finalr.toString();
        JOptionPane.showMessageDialog(null, "binary value is: " + result);


    }
}
