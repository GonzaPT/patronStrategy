package Strategy;

public class mainStrategy {

    public static void main(String[] args) {
        int number = 27;

        System.out.println("----------------------------------------");

        secuenceContext context = new secuenceContext();
        // context.setStrategy(new fibonacciSecuence());
        context.setStrategy(new primosSecuence());
        context.secuence(number);

        System.out.println("\n----------------------------------------");
    }
}
