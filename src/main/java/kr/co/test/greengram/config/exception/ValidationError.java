package kr.co.test.greengram.config.exception;


import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import org.springframework.validation.FieldError;

@Getter
@Builder
@ToString
public class ValidationError {
    private String message;
    private String field;

    public static ValidationError of(final FieldError fieldError) {
        return ValidationError.builder()
                .field(fieldError.getField())
                .message(fieldError.getDefaultMessage())
                .build();
    }

    @Override
    public String toString() {
        return String.format("field: %s, message: %s", field, message);
    }

}

