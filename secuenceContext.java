package Strategy;

/**
 * secuenciaContext
 */
public class secuenceContext {

    private secuenceStrategy strategy;

    public secuenceStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(secuenceStrategy strategy) {
        this.strategy = strategy;
    }

    public void secuence(int number) {
        this.strategy.secuence(number);
    }

}