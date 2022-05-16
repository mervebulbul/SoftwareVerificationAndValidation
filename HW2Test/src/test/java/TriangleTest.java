import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TriangleTest {

    Triangle triangle = new Triangle();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    public void test1() {
       final TriangleType type = Triangle.classify(20,30,50);
       assertEquals(TriangleType.INVALID, type);
    } //end test

    @Test
    public void test2() {
        final TriangleType type = Triangle.classify(0,-5,185);
        assertEquals(TriangleType.INVALID, type);
    } //end test

    @Test
    public void test3() {
        final TriangleType type = Triangle.classify(45,45,90);
        assertEquals(TriangleType.RIGHT, type);
    } //end test

    @Test
    public void test4() {
        final TriangleType type = Triangle.classify(120,30,30);
        assertEquals(TriangleType.OBTUSE, type);
    } //end test

    @Test
    public void test5() {
        final TriangleType type = Triangle.classify(60,60,60);
        assertEquals(TriangleType.ACUTE, type);
    } //end test
}




