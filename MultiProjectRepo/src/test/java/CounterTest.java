
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class CounterTest {


    @org.junit.jupiter.api.Test
    void IncrementDoesNotIncrementMoreThanStep() {
        Counter counter = new Counter(0);
        counter.inc(5);
        Assertions.assertEquals(5, counter.getCount(), "Count does not match original + step");
    }


}