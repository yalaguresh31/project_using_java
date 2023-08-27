import javax.swing.*;
public class CalculatorSwing{
    JFrame f;
	JTextField t;
    JButton[] b = new JButton[17];
    String[] bText = {"7", "8","9","/","4","5", "6", "*","1","2", "3","-","0",".","=","+","C"};
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
        //set buttons size
        int x = 40,y = 100,index = 0;
        for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				b[index] = new JButton(bText[index]);
                b[index].setBounds(x, y, 50, 40);
				f.add(b[index]);
				x = x+70;
				index++;
			}
			x = 40;
			y = y+70;
		}//end of for

    b[16] = new JButton(bText[16]);
    b[16].setBounds(110,380,100,40);
    f.add(b[16]);
}//end of CalculatorSwing	
    public static void main(String[] args){
        new CalculatorSwing();
    }//end of main
}//end of class
