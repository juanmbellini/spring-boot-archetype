#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.error_handlers;

import ${package}.exceptions.ValidationException;
import ${package}.web.Constants;
import ${package}.web.controller.dtos.api_errors.ValidationErrorDto;
import com.bellotapps.utils.error_handler.ErrorHandler;
import com.bellotapps.utils.error_handler.ExceptionHandler;
import com.bellotapps.utils.error_handler.ExceptionHandlerObject;

/**
 * {@link ExceptionHandler} in charge of handling {@link ValidationException}.
 * Will result into a <b>422 Unprocessable Entity</b> response.
 */
@ExceptionHandlerObject
/* package */ class ValidationViolationExceptionHandler implements ExceptionHandler<ValidationException> {

    @Override
    public ErrorHandler.HandlingResult handle(ValidationException exception) {
        return new ErrorHandler.HandlingResult(Constants.MissingHttpStatuses.UNPROCESSABLE_ENTITY.getStatusCode(),
                new ValidationErrorDto(exception.getErrors()));
    }
}
