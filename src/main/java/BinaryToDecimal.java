import javax.swing.*;
import java.lang.Math;

public class BinaryToDecimal {
    public static void calculate() {

        // Creating required variables and getting user input
        // Binary number is defined as string to handle long binaries
        String BinaryNumber = JOptionPane.showInputDialog("Enter Your Binary Number");
        int DecimalNumber = 0;
        int power;

        // Calculating Decimal Number
        for (int i = BinaryNumber.length() - 1; i >= 0; i--) {
            if (BinaryNumber.charAt(i) == '1') {
                power = BinaryNumber.length() - i - 1;
                DecimalNumber += Math.pow(2, power);
            }
        }

        // Showing The Result
        JOptionPane.showMessageDialog(null, "Decimal Value Is " + DecimalNumber);
    }
}