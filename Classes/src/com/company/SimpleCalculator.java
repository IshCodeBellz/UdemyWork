package com.company;

public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;


    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult() {
        double additionResult;
        additionResult = getFirstNumber() + getSecondNumber();
        return additionResult;
    }

    public double getSubtractionResult() {
        double subtractionResult;
        subtractionResult = getFirstNumber() - getSecondNumber();
        return subtractionResult;
    }

    public double getMultiplicationResult() {
        return getFirstNumber() * getSecondNumber();
    }

    public double getDivisionResult() {
        double divisionResult;
        if(getSecondNumber() == 0 || getFirstNumber() == 0) {
            divisionResult = 0;
            return divisionResult;
        }else{
            return divisionResult = getFirstNumber()/getSecondNumber();
        }

    }
}
