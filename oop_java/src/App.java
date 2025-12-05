public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        System.out.println("Livro: " + biblioteca.getLivros().nome);
    }
}