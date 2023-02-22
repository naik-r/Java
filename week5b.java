import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class Division extends JFrame iplements ActionListener {
    JTextField t1,t2,t3;
    JButton b;
    JLabel L1,L2,L3,L4;
    String s;
    Division e;
public void init() {





    setLayout(new FlowLayout());
    t1=new JTextField(10);
    t2=new JTextField(10); 
    t3=new JTextField(10);
    L1=new JLabel("enter num1");
    L2=new JLabel("enter num2");
    L3=new JLabel("Result is");
    L4=new JLabel("DS");