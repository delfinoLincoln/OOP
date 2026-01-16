package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WildcardDelimited {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);
        copy(myDoubles, myObjs);
        printList(myObjs);
    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {
        for(Number number : source) {
            destiny.add(number);
        }
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj + " ");
        }
        System.out.println();
    }
}

/*  nota: principio get/put -> get(ler da lista) = covariância(extends): só vai ITERAR/ler da coleção(subtipos) 
                            -> put(escrever na lista) = contravariância(super): só vai ADICIONAR na coleção(supertipos)
                            -> <T> generico: Vai LER E ESCREVER e possui Controle total da lista
*/