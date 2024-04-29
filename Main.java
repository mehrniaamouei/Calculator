import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static  String number1="";
    static String number2="";
    static double result=0;
    static String operation="";
    static int p=0;

    public static void main(String[] args) {
        JFrame frame=new JFrame("CALCULATOR");
        Dimension dimension=new Dimension(400,600);
        frame.setSize(dimension);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("img.png");
        frame.setIconImage(image.getImage());

        JButton clr=new JButton("CLEAR");
        clr.setBounds(115,470,120,60);
        frame.add(clr);

        JPanel panel =new JPanel();
        panel.setBounds(40,150,300,300);
        panel.setBackground(Color.gray);
        frame.add(panel);

        JButton b1=new JButton("1");
        panel.add(b1);
        JButton b2=new JButton("2");
        panel.add(b2);
        JButton b3=new JButton("3");
        panel.add(b3);
        JButton plus=new JButton("+");
        panel.add(plus);
        JButton b4=new JButton("4");
        panel.add(b4);
        JButton b5=new JButton("5");
        panel.add(b5);
        JButton b6=new JButton("6");
        panel.add(b6);
        JButton minus=new JButton("_");
        panel.add(minus);
        JButton b7=new JButton("7");
        panel.add(b7);
        JButton b8=new JButton("8");
        panel.add(b8);
        JButton b9=new JButton("9");
        panel.add(b9);
        JButton zarb=new JButton("*");
        panel.add(zarb);
        JButton dot=new JButton(".");
        panel.add(dot);
        JButton b0=new JButton("0");
        panel.add(b0);
        JButton mosavi=new JButton("=");
        panel.add(mosavi);
        JButton tagsim=new JButton("/");
        panel.add(tagsim);
        panel.setLayout(new GridLayout(4,4) );

        JTextField display=new JTextField();
        display.setBounds(40,40,300,40);
        frame.add(display);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="1";
                    display.setText(number1);}
                else{
                    number2+="1";
                    display.setText(number2);}
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="2";
                    display.setText(number1);}
                else{
                    number2+="2";
                    display.setText(number2);}
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="3";
                    display.setText(number1);}
                else{
                    number2+="3";
                    display.setText(number2);}
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="4";
                    display.setText(number1);}
                else{
                    number2+="4";
                    display.setText(number2);}
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="5";
                    display.setText(number1);}
                else{
                    number2+="5";
                    display.setText(number2);}
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="6";
                    display.setText(number1);}
                else{
                    number2+="6";
                    display.setText(number2);}
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="7";
                    display.setText(number1);}
                else{
                    number2+="7";
                    display.setText(number2);}
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="8";
                    display.setText(number1);}
                else{
                    number2+="8";
                    display.setText(number2);}
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="9";
                    display.setText(number1);}
                else{
                    number2+="9";
                    display.setText(number2);}
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (p%2==0){
                    number1+="0";
                    display.setText(number1);}
                else{
                    number2+="0";
                    display.setText(number2);}
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(p%2==0) {
                    number1 += ".";
                    display.setText(number1);
                }
                else{
                    number2+=".";
                    display.setText(number2);
                }
            }
        });

        zarb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("*");
                operation += "*";
                if(result==0)
                    result++;
                if (p%2==0)
                    result*=Double.parseDouble(number1);
                else
                    result*=Double.parseDouble(number2);
                number1="";
                number2 = "";
                p++;
            }
        });
        tagsim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("/");
                operation+="/";
                p=0;
                if(result==0)
                    result++;
                result*=Double.parseDouble(number1);
                number1="";
                number2="";
                p++;
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("+");
                operation+="+";

                if(p%2==0)
                    result+=Double.parseDouble(number1);
                if(p%2==1)
                    result+=Double.parseDouble(number2);
                number1="";
                number2="";
                p++;
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("-");
                operation+="-";
                if(p%2==0)
                    result-=Double.parseDouble(number1);
                if(p%2==1)
                    result-=Double.parseDouble(number2);
                number1="";
                number2="";
                p++;
            }
        });
        mosavi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                if (operation.charAt(operation.length() - 1) == '*') {
                    if (p % 2 == 1)
                        result *= Double.parseDouble(number2);
                    else
                        result *= Double.parseDouble(number1);
                }
                if (operation.charAt(operation.length() - 1) == '/') {
                    if (p % 2 == 1)
                        result /= Double.parseDouble(number2);
                    else
                        result /= Double.parseDouble(number1);
                }
                if (operation.charAt(operation.length() - 1) == '+') {
                    if (p % 2 == 1)
                        result += Double.parseDouble(number2);
                    else
                        result += Double.parseDouble(number1);
                }
                if (operation.charAt(operation.length() - 1) == '-') {
                    if (p % 2 == 1)
                        result -= Double.parseDouble(number2);
                    else
                        result -= Double.parseDouble(number1);
                }
                number2 = "";
                number1 = "";
                display.setText(String.valueOf(result));
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                number1="";
                number2="";
                p=0;
                result=1;
                operation="";
            }
        });
        frame.setVisible(true);
    }
}