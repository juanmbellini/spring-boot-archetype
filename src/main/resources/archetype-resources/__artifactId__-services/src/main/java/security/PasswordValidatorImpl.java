#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.security;

import ${package}.error_handling.errros.ValidationError;
import ${package}.exceptions.ValidationException;
import org.springframework.stereotype.Component;

import java.util.Collections;

/**
 * Concrete implementation of {@link PasswordValidator}.
 */
@Component
public class PasswordValidatorImpl implements PasswordValidator {


    @Override
    public void validate(CharSequence password) throws ValidationException {
        if (password == null) {
            throw new ValidationException(Collections.singletonList(MISSING_PASSWORD));
        }
        // TODO: check password accordingly
    }


    public static final ValidationError MISSING_PASSWORD =
            new ValidationError(ValidationError.ErrorCause.MISSING_VALUE, "password", "The password is missing");
}
