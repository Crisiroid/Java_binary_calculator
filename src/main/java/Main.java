import javax.swing.*;

public class Main {
    public static void main(String[] args){
        BinaryCal bc = new BinaryCal();
        BinaryToDecimal btd = new BinaryToDecimal();
        int input = Integer.parseInt(JOptionPane.showInputDialog("What do you want to do ? \n 1: convert decimal to binary \n 2: convert binary to decimal"));
        switch (input){
            case 1:
                bc.calculate();
                break;
            case 2:
                btd.calculate();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Wrong number!");
        }
    }
}
