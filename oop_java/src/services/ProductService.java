package services;

import java.util.List;
import java.util.function.Predicate;

import entities.ProductLambda;

public class ProductService {
    public double filteredSum(List<ProductLambda> list, Predicate<ProductLambda> pred) {
        double sum = 0.0;
        for(ProductLambda p : list) {
            if (pred.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
