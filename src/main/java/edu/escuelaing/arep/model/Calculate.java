package edu.escuelaing.arep.model;

import java.util.List;

public interface Calculate {
    /**
     * @return result of operation
     */
    public String getResult();

    /**
     * Allow calculate mean and standard deviation
     * @param data list containing the data for the calculation
     */
    public void calculateResult(List<Double> data);
}

