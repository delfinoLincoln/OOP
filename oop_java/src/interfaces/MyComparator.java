package interfaces;

import java.util.Comparator;
import entities.ProductLambda;

public class MyComparator implements Comparator<ProductLambda> {
    
    @Override
    public int compare(ProductLambda p1,  ProductLambda p2) {
        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
    }
}
