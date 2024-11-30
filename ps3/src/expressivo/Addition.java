package expressivo;
import java.util.Objects;

/**
 * Represents an addition of two expressions.
 */
public final class Addition implements Expression {
    private final Expression left;
    private final Expression right;

    // Constructor
    public Addition(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        Addition addition = (Addition) thatObject;
        return left.equals(addition.left) && right.equals(addition.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(left, right);
    }
}
