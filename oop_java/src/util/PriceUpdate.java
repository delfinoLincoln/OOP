package util;

import java.util.function.Consumer;

import entities.ProductLambda;

public class PriceUpdate implements Consumer<ProductLambda>{
    
    @Override
    public void accept(ProductLambda p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
