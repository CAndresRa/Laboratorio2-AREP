package edu.escuelaing.arep.model;

import java.util.List;

public class Mean implements Calculate{

    private String result;
    @Override
    public String getResult() {
        return result;
    }

    @Override
    public void calculateResult(List<Double> data) {
        double counter = 0;
        for (Double number : data) {
            counter += number;
        }
        try {
            this.result = String.valueOf(counter / data.size());
        } catch (Exception e) {
            this.result = "Hubo un error, verifique los datos ingresados ej. (1,2,3,4)";
            throw new ArithmeticException("Division by zero!");
        }
    }
}
