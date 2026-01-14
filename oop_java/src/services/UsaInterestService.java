package services;

import interfaces.InterestService;

public class UsaInterestService implements InterestService{
    private double interestRate;

    public UsaInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterest(double interestRate) {
        this.interestRate = interestRate;
    }
}