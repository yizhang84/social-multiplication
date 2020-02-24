package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

public interface MultiplicationService {
    Multiplication createRandomMultiplication();

    /**
     *
     * @param resultAttempt
     * @return true if the attempt matches the result of the
     */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);
}
