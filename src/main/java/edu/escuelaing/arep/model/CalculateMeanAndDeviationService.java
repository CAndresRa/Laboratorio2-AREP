package edu.escuelaing.arep.model;

import java.util.LinkedList;
import java.util.List;

public class CalculateMeanAndDeviationService {
    private final Calculate mean;
    private final Calculate standardDeviation;
    private final List<Double> data;

    /**
     * service class constructor
     * @param input list that contains data
     */
    public CalculateMeanAndDeviationService(List<String> input) {
        this.mean = new Mean();
        this.standardDeviation = new StandardDeviation();
        List<Double> data = new LinkedList<>();
        for (String number : input) {
            data.add(Double.parseDouble(number));
        }
        this.data = data;
    }

    /**
     * Method to calculate Mean of the data
     * @return Mean
     */
    public String calculateMean() {
        mean.calculateResult(data);
        return mean.getResult();
    }

    /**
     * Method to calculate Standard Deviation of the data
     * @return Standard Deviation
     */
    public String calculateStandardDeviation() {
        standardDeviation.calculateResult(data);
        return standardDeviation.getResult();
    }
}