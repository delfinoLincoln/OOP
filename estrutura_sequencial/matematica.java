public class matematica {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B , C;

        //Math.sqrt = raiz quadrada
        //Math.pow = potenciação
        //Math.abs = absoluto(tirar o valor negativo caso exista)

        A = Math.sqrt(x);       
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);
        System.out.println("Raiz de " + x + " = " + A);
        System.out.println("Raiz de " + y + " = " + B);
        System.out.println("Raiz de 25 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(x + " elevado a " + y + " = " + A);
        System.out.println(x + " elevado ao quadrado = " + B);
        System.out.println("5 elevado ao quadrado = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("Valor absoluto de " + y + " = " + A);
        System.out.println("Valor absoluto de " + z + " = " + B);

        //fórmula de bhaskara 
        double delta;
        double a = 1, b = 2, c = 3;
        double x1;
        double x2;

        delta = Math.pow(b, 2.0) - 4 * a * c; 

        x1 =(-b + Math.sqrt(delta) / 2.0 * a);
        System.out.println("Valor x1: " + x1);

        x2 =(-b - Math.sqrt(delta) / 2.0 * a);
        System.out.println("Valor x2: " + x2);
    }
}