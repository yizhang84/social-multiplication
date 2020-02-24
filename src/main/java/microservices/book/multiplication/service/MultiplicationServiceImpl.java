package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MultiplicationServiceImpl implements MultiplicationService {
    private RandomGeneratorService randomGenerateorService;

    @Autowired
    public MultiplicationServiceImpl(RandomGeneratorService randomGenerateorService){
        this.randomGenerateorService = randomGenerateorService;
    }

    @Override
    public Multiplication createRandomMultiplication(){
        int factorA = randomGenerateorService.generateRandomFactor();
        int factorB = randomGenerateorService.generateRandomFactor();
        return new Multiplication(factorA,factorB);
    }

    @Override
    public boolean checkAttempt(final MultiplicationResultAttempt resultAttempt){
        return resultAttempt.getResultAttempt() == resultAttempt.getMultiplication().getFactorA() *
                resultAttempt.getMultiplication().getFactorB();
    }
}
