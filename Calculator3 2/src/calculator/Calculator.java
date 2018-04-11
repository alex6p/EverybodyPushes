/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author alexpsitos
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CalcViewUi view = new CalcViewUi();
        MathOperations model = new MathOperations(view);
        CalcController ctrl = new CalcController(view, model);

    }

}
