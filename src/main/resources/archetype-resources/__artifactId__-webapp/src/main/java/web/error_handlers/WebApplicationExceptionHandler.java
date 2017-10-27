#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.error_handlers;

import com.bellotapps.utils.error_handler.ErrorHandler;
import com.bellotapps.utils.error_handler.ExceptionHandler;
import com.bellotapps.utils.error_handler.ExceptionHandlerObject;

import javax.ws.rs.WebApplicationException;

/**
 * {@link ExceptionHandler} in charge of handling {@link WebApplicationException}.
 * Will result into the result code obtained from {@link WebApplicationException${symbol_pound}getResponse()}, with no entity.
 */
@ExceptionHandlerObject
/* package */ class WebApplicationExceptionHandler implements ExceptionHandler<WebApplicationException> {

    @Override
    public ErrorHandler.HandlingResult handle(WebApplicationException exception) {
        return new ErrorHandler.HandlingResult(exception.getResponse().getStatus(), null);
    }
}
