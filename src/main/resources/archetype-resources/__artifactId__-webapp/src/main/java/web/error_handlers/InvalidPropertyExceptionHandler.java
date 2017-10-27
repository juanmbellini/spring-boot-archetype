#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.error_handlers;

import ${package}.exceptions.InvalidPropertiesException;
import ${package}.web.controller.dtos.api_errors.IllegalParamValueErrorDto;
import com.bellotapps.utils.error_handler.ErrorHandler;
import com.bellotapps.utils.error_handler.ExceptionHandler;
import com.bellotapps.utils.error_handler.ExceptionHandlerObject;

/**
 * {@link ExceptionHandler} in charge of handling {@link InvalidPropertiesException}.
 * Will result in the return value of
 * {@link IllegalParamValueExceptionHandler${symbol_pound}illegalParamValueHandlingResult(IllegalParamValueErrorDto)}.
 */
@ExceptionHandlerObject
/* package */ class InvalidPropertyExceptionHandler implements ExceptionHandler<InvalidPropertiesException> {

    @Override
    public ErrorHandler.HandlingResult handle(InvalidPropertiesException exception) {
        return IllegalParamValueExceptionHandler
                .illegalParamValueHandlingResult(new IllegalParamValueErrorDto(exception.getErrors()));
    }
}
