/**
 * A simple counter, that keeps track of a count
 * and increments it using inc(step).
 */
public class Counter {


    /**
     * Keeps track of the curent count of this counter.
     */
    private int count;

    /**
     * Initialize counter with default value.
     * @param initial The initial value of the counter
     */
    public Counter(final int initial) {
        this.count = initial;
    }

    /**
     * Increment the counter by step.
     * @param step An Integer step to increment the counter with
     * @return the updated value, current count + step.
     */
    public final int inc(final int step) {
        count = count + step;
        return count;
    }

    /**
     *
     * @return The current count of the counter
     */
    public final int getCount() {
        return count;
    }
}
