package sample.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class GradleMainTest {
    @Test
    public void testAdd() {
        assertEquals(3, Sample.add(1, 2));
    }
}
