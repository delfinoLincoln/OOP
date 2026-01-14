package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class WildcardDelimited {
    public static void main(String[] args) {
        List<Shape> myShapes = new ArrayList<>();
        myShapes.add(new Rectangle(3.0, 2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + String.format("%.2f", totalArea(myShapes)));
    }

    public static double totalArea(List<? extends Shape> list) {
        double sum = 0.0;
        for (Shape s : list) {
            sum += s.area();
        }
        return sum;
    }
}

/*  nota: principio get/put -> get(ler da lista) = covariância(extends): só vai ITERAR/ler da coleção(subtipos) 
                            -> put(escrever na lista) = contravariância(super): só vai ADICIONAR na coleção(supertipos)
                            -> <T> generico: Vai LER E ESCREVER e possui Controle total da lista
*/