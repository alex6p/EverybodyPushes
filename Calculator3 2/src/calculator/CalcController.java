/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alexpsitos
 */
public class CalcController {

    CalcViewUi CalcView;

    MathOperations CalcMod;

    double firstnum;
    double secondnum;
    double results;
    String operations;

    public CalcController(CalcViewUi CalcView, MathOperations CalcMod) {

        this.CalcView = CalcView;
        this.CalcMod = CalcMod;
        CalcView.setVisible(true);

        CalcView.addBtn.addActionListener(new Actions());
        CalcView.subtractBtn.addActionListener(new Actions());
        CalcView.multiplyBtn.addActionListener(new Actions());
        CalcView.divideBtn.addActionListener(new Actions());
        CalcView.equalBtn.addActionListener(new Actions());
        CalcView.clearBtn.addActionListener(new Actions());
        CalcView.oneBtn.addActionListener(new Actions());
        CalcView.twoBtn.addActionListener(new Actions());
        CalcView.threeBtn.addActionListener(new Actions());
        CalcView.fourBtn.addActionListener(new Actions());
        CalcView.fiveBtn.addActionListener(new Actions());
        CalcView.sixBtn.addActionListener(new Actions());
        CalcView.sevenBtn.addActionListener(new Actions());
        CalcView.eightBtn.addActionListener(new Actions());
        CalcView.nineBtn.addActionListener(new Actions());
        CalcView.zeroBtn.addActionListener(new Actions());
        CalcView.decimalBtn.addActionListener(new Actions());
        CalcView.addBtn.addActionListener(new Actions());
        CalcView.exitBtn.addActionListener(new Actions());
    }

    class Actions implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {

                if (e.getSource() == CalcView.addBtn) {
                    CalcMod.addOperation();
                } else if (e.getSource() == CalcView.subtractBtn) {
                    CalcMod.subtractOperation();
                } else if (e.getSource() == CalcView.divideBtn) {
                    CalcMod.divideOperation();
                } else if (e.getSource() == CalcView.multiplyBtn) {
                    CalcMod.multiplyOperation();
                } else if (e.getSource() == CalcView.equalBtn) {
                    CalcMod.equals();
                } else if (e.getSource() == CalcView.clearBtn) {
                    CalcView.calculations.setText("");
                } else if (e.getSource() == CalcView.exitBtn) {
                    CalcMod.exitOperation();
                }

                if (e.getSource() == CalcView.oneBtn) {

                    String grabNumber = CalcView.calculations.getText() + CalcView.oneBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.twoBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.twoBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.threeBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.threeBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.fourBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.fourBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.fiveBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.fiveBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.sixBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.sixBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.sevenBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.sevenBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.eightBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.eightBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.nineBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.nineBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.zeroBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.zeroBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                } else if (e.getSource() == CalcView.decimalBtn) {
                    String grabNumber = CalcView.calculations.getText() + CalcView.decimalBtn.getText();
                    CalcView.calculations.setText(grabNumber);
                }
            } catch (Exception ex) {
                System.out.println("There was an ERROR! " + ex);

            }

        }

    }

}
