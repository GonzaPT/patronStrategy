package Strategy;

public class fibonacciSecuence implements secuenceStrategy {

    @Override
    public void secuence(int number) {
        System.out.println("FIBONACCI");
        System.out.println("0");

        int n1 = 0;
        int n2 = 1;
        int suma = 1;

        for (int i = 0; i < number; i++) {
            System.out.println(suma);
            suma = n1 + n2;
            n1 = n2;
            n2 = suma;
        }

    }

}
