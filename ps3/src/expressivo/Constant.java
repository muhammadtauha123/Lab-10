package expressivo;

import java.util.Objects;

/**
 * Represents a constant number in the expression.
 */
public final class Constant implements Expression {
    private final double value;

    // Constructor
    public Constant(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        // Return the string representation of the constant value
        return String.valueOf(value);
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        Constant constant = (Constant) thatObject;
        return Double.compare(constant.value, value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
