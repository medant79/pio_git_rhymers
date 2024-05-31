package edu.kis.vh.nursery;


/**
 * Klasa defaultCountingOutRhymer implementuje prostą strukturę stosu.
 * Udostępnia metody do dodawania, usuwania, sprawdzania czy stos jest pełny lub pusty oraz podglądania wartości na szczycie stosu.
 */
public class DefaultCountingOutRhymer {

    public static final int DEFAULT_RETURN = -1;

    public static final int MAX_SIZE = 12;
    public static final int ARRAY_FULL = MAX_SIZE - 1;
    public static final int TOTAL_DEFAULT_VALUE = -1;
    public static final int CALL_CHECK_VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = TOTAL_DEFAULT_VALUE;

    /**
     * Dodaje wartość na stos, jeśli stos nie jest pełny.
     *
     * @param in wartość do dodania na stos.
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true, jeśli stos jest pusty, w przeciwnym razie false.
     */
    public boolean callCheck() {
        return total == CALL_CHECK_VALUE;
    }

    public int getTotal() {
        return total;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true, jeśli stos jest pełny, w przeciwnym razie false.
     */
    public boolean isFull() {
        return total == ARRAY_FULL;
    }

    /**
     * Podgląda wartość na szczycie stosu bez jej usuwania.
     *
     * @return wartość na szczycie stosu, jeśli stos nie jest pusty, lub -1, jeśli jest pusty.
     */
    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total];
    }

    /**
     * Usuwa wartość ze szczytu stosu.
     *
     * @return wartość ze szczytu stosu, jeśli stos nie jest pusty, lub -1, jeśli jest pusty.
     */
    public int countOut() {
        if (callCheck())
            return DEFAULT_RETURN;
        return numbers[total--];
    }

}
