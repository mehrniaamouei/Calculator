import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    static String number ="";
    static double result=0;
    static String operation="";

    public static void main(String[] args) {
        JFrame frame = new JFrame("CALCULATOR");
        Dimension dimension = new Dimension(400, 600);
        frame.setSize(dimension);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.gray);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);

        ImageIcon image = new ImageIcon("img.png");
        frame.setIconImage(image.getImage());

        JButton clr = new JButton("CLEAR");
        clr.setBounds(115, 470, 120, 60);
        frame.add(clr);

        JPanel panel = new JPanel();
        panel.setBounds(40, 150, 300, 300);
        panel.setBackground(Color.gray);
        frame.add(panel);

        JButton b1 = new JButton("1");
        panel.add(b1);
        JButton b2 = new JButton("2");
        panel.add(b2);
        JButton b3 = new JButton("3");
        panel.add(b3);
        JButton plus = new JButton("+");
        panel.add(plus);
        JButton b4 = new JButton("4");
        panel.add(b4);
        JButton b5 = new JButton("5");
        panel.add(b5);
        JButton b6 = new JButton("6");
        panel.add(b6);
        JButton minus = new JButton("_");
        panel.add(minus);
        JButton b7 = new JButton("7");
        panel.add(b7);
        JButton b8 = new JButton("8");
        panel.add(b8);
        JButton b9 = new JButton("9");
        panel.add(b9);
        JButton zarb = new JButton("*");
        panel.add(zarb);
        JButton dot = new JButton(".");
        panel.add(dot);
        JButton b0 = new JButton("0");
        panel.add(b0);
        JButton mosavi = new JButton("=");
        panel.add(mosavi);
        JButton tagsim = new JButton("/");
        panel.add(tagsim);
        panel.setLayout(new GridLayout(4, 4));


        JTextField display = new JTextField();
        display.setBounds(40, 40, 300, 40);
        frame.add(display);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "1";
                display.setText(number);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "2";
                display.setText(number);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "3";
                display.setText(number);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "4";
                display.setText(number);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "5";
                display.setText(number);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "6";
                display.setText(number);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "7";
                display.setText(number);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "8";
                display.setText(number);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "9";
                display.setText(number);
            }
        });
        b0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += "0";
                display.setText(number);
            }
        });

        dot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number += ".";
                display.setText(number);
            }
        });

        zarb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("*");
                operation += "*";
                if (operation.length() == 1) {
                    if (result == 0)
                        result++;
                }
                result *= Double.parseDouble(number);
                number = "";
            }
        });
        tagsim.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("/");
                operation += "/";
                if (operation.length() == 1) {
                    if (result == 0)
                        result++;
                    result *= Double.parseDouble(number);
                } else {
                    result /= Double.parseDouble(number);
                }
                number = "";
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("+");
                operation += "+";
                /*if(operation.charAt(operation.length() - 2) == '*' )
                    result*=Double.parseDouble(number);
                else {*/
                result += Double.parseDouble(number);
                number = "";
            }
        });
        minus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("-");
                operation += "-";
                if (operation.length() == 1)
                    result += Double.parseDouble(number);
                else {
                    result -= Double.parseDouble(number);
                }
                number = "";
            }
        });
        mosavi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                if (operation.charAt(operation.length() - 1) == '*') {
                    result *= Double.parseDouble(number);
                }
                if (operation.charAt(operation.length() - 1) == '/') {
                    result /= Double.parseDouble(number);
                }
                if (operation.charAt(operation.length() - 1) == '+') {
                    result += Double.parseDouble(number);
                }
                if (operation.charAt(operation.length() - 1) == '-') {
                    result -= Double.parseDouble(number);
                }
                number = "";
                display.setText(String.valueOf(result));
            }
        });
        clr.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                display.setText("");
                number = "";
                operation = "";
                result = 0;
            }
        });
        frame.setVisible(true);
    }
}