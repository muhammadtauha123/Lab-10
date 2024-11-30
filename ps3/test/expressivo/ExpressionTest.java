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
	public void testConstantEquals() {
	    Expression e1 = new Constant(3.14);
	    Expression e2 = new Constant(3.14);
	    assertTrue(e1.equals(e2));
	}

	@Test
	public void testConstantEqualsDifferentValue() {
	    Expression e1 = new Constant(3.14);
	    Expression e2 = new Constant(2.71);
	    assertFalse(e1.equals(e2));
	}

	@Test
	public void testConstantHashCode() {
	    Expression e1 = new Constant(3.14);
	    Expression e2 = new Constant(3.14);
	    assertEquals(e1.hashCode(), e2.hashCode());
	}

	@Test
	public void testVariableToString() {
	    Expression e = new Variable("x");
	    assertEquals("x", e.toString());
	}

	@Test
	public void testVariableEquals() {
	    Expression e1 = new Variable("x");
	    Expression e2 = new Variable("x");
	    assertTrue(e1.equals(e2));
	}

	@Test
	public void testVariableEqualsDifferentName() {
	    Expression e1 = new Variable("x");
	    Expression e2 = new Variable("y");
	    assertFalse(e1.equals(e2));
	}

	@Test
	public void testVariableHashCode() {
	    Expression e1 = new Variable("x");
	    Expression e2 = new Variable("x");
	    assertEquals(e1.hashCode(), e2.hashCode());
	}

	@Test
	public void testAdditionToString() {
	    Expression e = new Addition(new Constant(1), new Variable("x"));
	    assertEquals("(1.0 + x)", e.toString());
	}

	@Test
	public void testAdditionEquals() {
	    Expression e1 = new Addition(new Constant(1), new Variable("x"));
	    Expression e2 = new Addition(new Constant(1), new Variable("x"));
	    assertTrue(e1.equals(e2));
	}

	@Test
	public void testAdditionEqualsDifferentOperands() {
	    Expression e1 = new Addition(new Constant(1), new Variable("x"));
	    Expression e2 = new Addition(new Constant(2), new Variable("y"));
	    assertFalse(e1.equals(e2));
	}

	@Test
	public void testAdditionHashCode() {
	    Expression e1 = new Addition(new Constant(1), new Variable("x"));
	    Expression e2 = new Addition(new Constant(1), new Variable("x"));
	    assertEquals(e1.hashCode(), e2.hashCode());
	}

	@Test
	public void testMultiplicationToString() {
	    Expression e = new Multiplication(new Constant(3), new Variable("y"));
	    assertEquals("(3.0 * y)", e.toString());
	}

	@Test
	public void testMultiplicationEquals() {
	    Expression e1 = new Multiplication(new Constant(3), new Variable("y"));
	    Expression e2 = new Multiplication(new Constant(3), new Variable("y"));
	    assertTrue(e1.equals(e2));
	}

	@Test
	public void testMultiplicationEqualsDifferentOperands() {
	    Expression e1 = new Multiplication(new Constant(3), new Variable("y"));
	    Expression e2 = new Multiplication(new Constant(2), new Variable("z"));
	    assertFalse(e1.equals(e2));
	}

	@Test
	public void testMultiplicationHashCode() {
	    Expression e1 = new Multiplication(new Constant(3), new Variable("y"));
	    Expression e2 = new Multiplication(new Constant(3), new Variable("y"));
	    assertEquals(e1.hashCode(), e2.hashCode());
	}

}
