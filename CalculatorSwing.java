import javax.swing.*;
public class CalculatorSwing{
    JFrame f;
	JTextField t;
       CalculatorSwing(){
		//create the frame and text field
        f = new JFrame("Calculator");
        t = new JTextField();
        f.setSize(400, 500);
        f.setVisible(true);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setResizable(false);
        t.setBounds(30, 40, 280, 30);
        f.add(t);
}//end of CalculatorSwing	
    public static void main(String[] args){
        new CalculatorSwing();
    }//end of main
}//end of class
