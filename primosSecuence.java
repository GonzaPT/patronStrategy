package Strategy;

public class primosSecuence implements secuenceStrategy {

    @Override
    public void secuence(int number) {
        System.out.println("PRIMOS");

        for (int x = 0; x <= number; x++) {
            if (esPrimo(x)) {
                System.out.print(String.valueOf(x) + ",");
            }
        }

    }

    public static boolean esPrimo(int numero) {
        if (numero == 0 || numero == 1 || numero == 4) {
            return false;
        }
        for (int x = 2; x < numero / 2; x++) {
            if (numero % x == 0)
                return false;
        }
        return true;
    }

}
