package nl.rodriguezmontaldo.Techiteasy;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice

public class ExceptionController {
    @ExceptionHandler
    public ResponseEntity<Object> exception(nl.rodriguezmontaldo.Techiteasy.Exceptions.RecordNotFoundException exception) {
        return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);

    }


}
