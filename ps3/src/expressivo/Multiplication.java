package expressivo;

import java.util.Objects;

/**
 * Represents a multiplication of two expressions.
 */
public final class Multiplication implements Expression {
    private final Expression left;
    private final Expression right;

    // Constructor
    public Multiplication(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        Multiplication multiplication = (Multiplication) thatObject;
        return left.equals(multiplication.left) && right.equals(multiplication.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
