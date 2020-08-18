package edu.escuelaing.arep.model;

import java.util.List;

public class StandardDeviation implements Calculate {
    private String result;

    @Override
    public String getResult() {
        return result;
    }

    @Override
    public void calculateResult(List<Double> data) {
        double counter = 0;
        Double mean = calculateMean(data);
        for (Double number : data) {
            counter += Math.pow((number - mean),2);
        }

        try {
            this.result = String.valueOf(Math.sqrt((counter / (data.size() - 1))));
        } catch (Exception e) {
            this.result = "Hubo un error, verifique los datos ingresados ej. (1,2,3,4)";
            throw new ArithmeticException("Division by zero!");
        }
    }

    private Double calculateMean(List<Double> data) {
        double counterMean = 0;
        for (Double number : data) {
            counterMean += number;
        }
        try {
            return  counterMean / data.size();
        } catch (Exception e) {
            throw new ArithmeticException("Division by zero!");
        }
    }
}
