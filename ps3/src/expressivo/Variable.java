package expressivo;

import java.util.Objects;

/**
 * Represents a variable in the expression.
 */
public final class Variable implements Expression {
    private final String name;

    // Constructor
    public Variable(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object thatObject) {
        if (this == thatObject) return true;
        if (thatObject == null || getClass() != thatObject.getClass()) return false;
        Variable variable = (Variable) thatObject;
        return Objects.equals(name, variable.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
