/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Iterator;
import java.util.Vector;

/**
 *
 * @author alexpsitos
 */
public class MathOperations {

    private double firstnum;
    private double secondnum;
    private double results;
    private String operations;

    private final Vector<Double> firstSavedNum = new Vector<>();
    private final Vector<Double> secondSavedNum = new Vector<>();
    private final Vector<Double> resultsSaved = new Vector<>();
    private final Vector<String> operationList = new Vector<>();

    CalcViewUi CalcView;

    public MathOperations(CalcViewUi CalcView) {
        this.CalcView = CalcView;
    }

    public void equals() {
        secondnum = Double.parseDouble(CalcView.calculations.getText());
        secondSavedNum.add(Double.parseDouble(CalcView.calculations.getText()));
        CalcView.calculations.setText("");
        switch (operations) {
            case "+":
                results = firstnum + secondnum;
                resultsSaved.add(results);
                operationList.add(operations);
                CalcView.prevCalc.append((firstnum + " " + operations + " " + secondnum + " " + " = " + (String.format("%s", results)) + "\n"));
                break;

            case "-":
                results = firstnum - secondnum;
                resultsSaved.add(results);
                operationList.add(operations);
                CalcView.prevCalc.append((firstnum + " " + operations + " " + secondnum + " " + " = " + (String.format("%s", results)) + "\n"));
                break;
            case "/":
                results = firstnum / secondnum;
                resultsSaved.add(results);
                operationList.add(operations);
                CalcView.prevCalc.append((firstnum + " " + operations + " " + secondnum + " " + " = " + (String.format("%s", results)) + "\n"));
                break;
            case "*":
                results = firstnum * secondnum;
                resultsSaved.add(results);
                operationList.add(operations);
                CalcView.prevCalc.append((firstnum + " " + operations + " " + secondnum + " " + " = " + (String.format("%s", results)) + "\n"));
                break;
            default:
                break;
        }
    }

    public void addOperation() {
        firstnum = Double.parseDouble(CalcView.calculations.getText());
        firstSavedNum.add(Double.parseDouble(CalcView.calculations.getText()));
        CalcView.calculations.setText("");
        operations = "+";
    }

    public void subtractOperation() {
        firstnum = Double.parseDouble(CalcView.calculations.getText());
        firstSavedNum.add(Double.parseDouble(CalcView.calculations.getText()));
        CalcView.calculations.setText("");
        operations = "-";
    }

    public void divideOperation() {
        firstnum = Double.parseDouble(CalcView.calculations.getText());
        firstSavedNum.add(Double.parseDouble(CalcView.calculations.getText()));
        CalcView.calculations.setText("");
        operations = "/";
    }

    public void multiplyOperation() {
        firstnum = Double.parseDouble(CalcView.calculations.getText());
        firstSavedNum.add(Double.parseDouble(CalcView.calculations.getText()));
        CalcView.calculations.setText("");
        operations = "*";
    }

    public void exitOperation() {
        Iterator iteratorFirst = firstSavedNum.iterator();
        Iterator iteratorSecond = secondSavedNum.iterator();
        Iterator iteratorResults = resultsSaved.iterator();
        Iterator iteratorOperation = operationList.iterator();
        System.out.println("Previous calculations you have done");
        while (iteratorFirst.hasNext()) {
            System.out.println(iteratorFirst.next() + " " + iteratorOperation.next() + " " + iteratorSecond.next() + " = " + iteratorResults.next());
        }
        System.exit(0);
    }

}
