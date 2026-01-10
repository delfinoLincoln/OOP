package application;

public class ForEach {
    public static void main(String[] args) {
        
        String[] vet = new String[] {
            "Link", "Pedro",  "Heitor", "Julio", "Sena"};

        for(int i = 0; i < vet.length; i++) {
            System.out.println(vet[i]);
        }

        //for each(para cada objeto "nomes" contido no Vetor vet, faça)
        System.out.println("---------------");
        for (String nomes : vet) {
            System.out.println(nomes);
        }
    }
}
