package microservices.book.multiplication.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import microservices.book.multiplication.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/results")
public final class MultiplicationResultAttemptController {
    private final MultiplicationService multiplicationService;

    @Autowired
    MultiplicationResultAttemptController(final MultiplicationService multiplicationService){
        this.multiplicationService = multiplicationService;
    }

    //here we'll implement our POST later

    @RequiredArgsConstructor
    @NoArgsConstructor(force = true)
    @Getter
    private static final class ResultResponse{
        private final boolean correct;
    }
}
