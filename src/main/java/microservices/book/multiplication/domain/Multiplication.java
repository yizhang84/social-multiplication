package microservices.book.multiplication.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

/**
 * This represents a Multiplication (a * b)
 */
@RequiredArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public final class Multiplication {
    private final int factorA;
    private final int factorB;

    //Empty constructor for JSON (de)serialization
    Multiplication(){
        this(0,0);
    }

    /*private int factorA;
    private int factorB;
    //the result of the operation A * B
    private int result;

    public Multiplication(int factorA, int factorB) {
        this.factorA = factorA;
        this.factorB = factorB;
        this.result = factorA * factorB;
    }

    public int getFactorA(){
        return factorA;
    }

    public int getFactorB(){
        return factorB;
    }

    public int getResult(){
        return result;
    }

    public String toString(){
        return "Multiplication{"+
                "factorA=" + factorA +
                ", factorB=" + factorB+
                ",result(A*B)="+result+
                '}';
    }*/
}
