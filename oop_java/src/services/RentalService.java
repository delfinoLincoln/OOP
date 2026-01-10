package services;

import entidades.CarRental;
import entidades.Invoice;

public class RentalService {
    private Double pricePerHour;
    private Double pricePerDay;

    private BrazilTaxServices bts;

    public RentalService(Double pricePerHour, Double pricePerDay, BrazilTaxServices bts) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.bts = bts;
    }

    public void processInvoice(CarRental carRental) {
        carRental.setInvoice(new Invoice(50.0, 10.0));
    }
}
