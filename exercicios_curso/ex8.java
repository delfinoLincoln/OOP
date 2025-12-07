import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial;
        int horaFinal;
        int duracao;

        System.out.print("Digite a hora inicial: ");
        horaInicial = sc.nextInt();

        System.out.print("Digite a hora final: ");
        horaFinal = sc.nextInt();

        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        }
        else { 
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O Jogo durou " + duracao + " hora(s)");

        sc.close();
    }  
}
//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
// começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.