import javax.swing.*;
public class java1 {
JFrame f;
java1(){
    f = new JFrame();
    JRadioButton r1 = new JRadioButton("ayush");
    JRadioButton r2 = new JRadioButton("piyush");

    r1.setBounds(75,50,100,30);
    r2.setBounds(75,100,100,30);
    ButtonGroup  bg = new ButtonGroup();
    bg.add(r1);bg.add(r2);
    f.add(r1);f.add(r2);
    f.setSize(200,900);
    f.setLayout(null);
    f.setVisible(true);


}

    public static void main(String[] args) {
        new java1();
    }
}
