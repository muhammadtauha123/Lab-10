package expressivo;

import org.junit.Test;
import static org.junit.Assert.*;

public class ExpressionTest {
    @Test
    public void testConstantToString() {
        Expression e = new Constant(3.14);
        assertEquals("3.14", e.toString());
    }

    @Test
    public void testVariableToString() {
        Expression e = new Variable("x");
        assertEquals("x", e.toString());
    }

    @Test
    public void testAddition() {
        Expression e = new Addition(new Constant(1), new Variable("x"));
        assertEquals("(1.0 + x)", e.toString());
    }

    @Test
    public void testMultiplication() {
        Expression e = new Multiplication(new Constant(3), new Variable("y"));
        assertEquals("(3.0 * y)", e.toString());
    }

    @Test
    public void testEquals() {
        Expression e1 = new Addition(new Constant(1), new Variable("x"));
        Expression e2 = new Addition(new Constant(1), new Variable("x"));
        assertTrue(e1.equals(e2));
    }

    @Test
    public void testHashCode() {
        Expression e1 = new Addition(new Constant(1), new Variable("x"));
        Expression e2 = new Addition(new Constant(1), new Variable("x"));
        assertEquals(e1.hashCode(), e2.hashCode());
    }
}
