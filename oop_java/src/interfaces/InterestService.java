package interfaces;

import java.security.InvalidParameterException;

import exceptions.DomainException;

public interface InterestService {
    double getInterestRate();
    default double payment(double amount, int months) {
        if(months < 1) {
            throw new InvalidParameterException("Months must be greater than 0!");
        }
        if (amount <= 0) {
            throw new DomainException("Amount must be greater than 0!");
        }
        return amount * Math.pow(1.0 + getInterestRate() / 100.0, months); 
    }
}
