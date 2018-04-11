/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.Container;
import javax.swing.JFrame;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author alexpsitos
 */
public class CalcViewUi extends JFrame {

    JTextField calculations;
    JTextArea prevCalc;

    JButton zeroBtn;
    JButton oneBtn;
    JButton twoBtn;
    JButton threeBtn;
    JButton fourBtn;
    JButton fiveBtn;
    JButton sixBtn;
    JButton sevenBtn;
    JButton eightBtn;
    JButton nineBtn;
    JButton addBtn;
    JButton subtractBtn;
    JButton divideBtn;
    JButton multiplyBtn;
    JButton equalBtn;
    JButton exitBtn;
    JButton clearBtn;
    JButton decimalBtn;

    CalcViewUi() {
        setView();
    }

    private void setView() {

        Container componentPane = getContentPane();
        componentPane.setLayout(new GridBagLayout());

        calculations = new JTextField(20);
        prevCalc = new JTextArea(10, 30);

        zeroBtn = new JButton("0");
        oneBtn = new JButton("1");
        twoBtn = new JButton("2");
        threeBtn = new JButton("3");
        fourBtn = new JButton("4");
        fiveBtn = new JButton("5");
        sixBtn = new JButton("6");
        sevenBtn = new JButton("7");
        eightBtn = new JButton("8");
        nineBtn = new JButton("9");
        decimalBtn = new JButton(".");
        addBtn = new JButton("+");
        subtractBtn = new JButton("-");
        divideBtn = new JButton("/");
        multiplyBtn = new JButton("*");
        equalBtn = new JButton("=");
        exitBtn = new JButton("Exit");
        clearBtn = new JButton("Clear");

        GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
        gridBagConstraints1.gridx = 0;
        gridBagConstraints1.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints1.gridy = 15;
        gridBagConstraints1.fill = GridBagConstraints.BOTH;
        componentPane.add(zeroBtn, gridBagConstraints1);

        GridBagConstraints gridBagConstraints2 = new GridBagConstraints();
        gridBagConstraints2.gridx = 0;
        gridBagConstraints2.gridy = 11;
        gridBagConstraints2.insets = new Insets(5, 5, 5, 5);
        componentPane.add(oneBtn, gridBagConstraints2);

        GridBagConstraints gridBagConstraints3 = new GridBagConstraints();
        gridBagConstraints3.gridx = 1;
        gridBagConstraints3.gridy = 11;
        gridBagConstraints3.insets = new Insets(5, 5, 5, 5);
        componentPane.add(twoBtn, gridBagConstraints3);

        GridBagConstraints gridBagConstraints4 = new GridBagConstraints();
        gridBagConstraints4.gridx = 2;
        gridBagConstraints4.gridy = 11;
        gridBagConstraints4.insets = new Insets(5, 5, 5, 5);
        componentPane.add(threeBtn, gridBagConstraints4);

        GridBagConstraints gridBagConstraints5 = new GridBagConstraints();
        gridBagConstraints5.gridx = 0;
        gridBagConstraints5.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints5.gridy = 7;
        componentPane.add(fourBtn, gridBagConstraints5);

        GridBagConstraints gridBagConstraints6 = new GridBagConstraints();
        gridBagConstraints6.gridx = 1;
        gridBagConstraints6.gridy = 7;
        gridBagConstraints6.insets = new Insets(5, 5, 5, 5);
        componentPane.add(fiveBtn, gridBagConstraints6);

        GridBagConstraints gridBagConstraints7 = new GridBagConstraints();
        gridBagConstraints7.gridx = 2;
        gridBagConstraints7.gridy = 7;
        gridBagConstraints7.insets = new Insets(5, 5, 5, 5);
        componentPane.add(sixBtn, gridBagConstraints7);

        GridBagConstraints gridBagConstraints8 = new GridBagConstraints();
        gridBagConstraints8.gridx = 0;
        gridBagConstraints8.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints8.gridy = 6;
        componentPane.add(sevenBtn, gridBagConstraints8);

        GridBagConstraints gridBagConstraints9 = new GridBagConstraints();
        gridBagConstraints9.gridx = 1;
        gridBagConstraints9.gridy = 6;
        gridBagConstraints9.insets = new Insets(5, 5, 5, 5);
        componentPane.add(eightBtn, gridBagConstraints9);

        GridBagConstraints gridBagConstraints10 = new GridBagConstraints();
        gridBagConstraints10.gridx = 2;
        gridBagConstraints10.gridy = 6;
        gridBagConstraints10.insets = new Insets(5, 5, 5, 5);
        componentPane.add(nineBtn, gridBagConstraints10);

        GridBagConstraints gridBagConstraints11 = new GridBagConstraints();
        gridBagConstraints11.gridx = 3;
        gridBagConstraints11.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints11.gridy = 15;
        componentPane.add(addBtn, gridBagConstraints11);

        GridBagConstraints gridBagConstraints12 = new GridBagConstraints();
        gridBagConstraints12.gridx = 3;
        gridBagConstraints12.gridy = 11;
        gridBagConstraints12.insets = new Insets(5, 5, 5, 5);
        componentPane.add(subtractBtn, gridBagConstraints12);

        GridBagConstraints gridBagConstraints13 = new GridBagConstraints();
        gridBagConstraints13.gridx = 3;
        gridBagConstraints13.gridy = 7;
        gridBagConstraints13.insets = new Insets(5, 5, 5, 5);
        componentPane.add(multiplyBtn, gridBagConstraints13);

        GridBagConstraints gridBagConstraints14 = new GridBagConstraints();
        gridBagConstraints14.gridx = 3;
        gridBagConstraints14.gridy = 6;
        gridBagConstraints14.insets = new Insets(5, 5, 5, 5);
        componentPane.add(divideBtn, gridBagConstraints14);

        GridBagConstraints gridBagConstraints15 = new GridBagConstraints();
        gridBagConstraints15.gridx = 5;
        gridBagConstraints15.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints15.gridy = 11;
        componentPane.add(exitBtn, gridBagConstraints15);

        GridBagConstraints gridBagConstraints19 = new GridBagConstraints();
        gridBagConstraints19.gridx = 2;
        gridBagConstraints19.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints19.gridy = 15;
        componentPane.add(equalBtn, gridBagConstraints19);

        GridBagConstraints gridBagConstraints20 = new GridBagConstraints();
        gridBagConstraints20.gridx = 5;
        gridBagConstraints20.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints20.gridy = 15;
        componentPane.add(clearBtn, gridBagConstraints20);

        GridBagConstraints gridBagConstraints0 = new GridBagConstraints();
        gridBagConstraints0.gridx = 1;
        gridBagConstraints0.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints0.gridy = 15;
        componentPane.add(decimalBtn, gridBagConstraints0);

        GridBagConstraints gridBagConstraints16 = new GridBagConstraints();
        gridBagConstraints16.gridx = 0;
        gridBagConstraints16.insets = new Insets(5, 5, 5, 5);
        gridBagConstraints16.gridy = (int) 4;
        gridBagConstraints16.gridwidth = 4;
        gridBagConstraints16.fill = GridBagConstraints.BOTH;
        componentPane.add(calculations, gridBagConstraints16);

        GridBagConstraints gridBagConstraints17 = new GridBagConstraints();
        gridBagConstraints17.gridx = 0;
        gridBagConstraints17.gridy = (int) 0;
        gridBagConstraints17.gridwidth = 4;
        JScrollPane scrollPane = new JScrollPane(prevCalc);
        componentPane.add(scrollPane, gridBagConstraints17);

        setTitle("Calculator");
        setSize(1000, 1000);
        setLocationRelativeTo(null);

    }

}
