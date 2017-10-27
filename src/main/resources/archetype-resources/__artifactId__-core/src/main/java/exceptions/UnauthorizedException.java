#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.exceptions;

/**
 * {@link RuntimeException} thrown when trying to perform an action without authorization.
 */
public class UnauthorizedException extends RuntimeException {

    /**
     * Default constructor.
     */
    public UnauthorizedException() {
        super();
    }

    /**
     * Constructor which can set a {@code message}.
     *
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     */
    public UnauthorizedException(String message) {
        super(message);
    }

    /**
     * Constructor which can set a mes{@code message} and a {@code cause}.
     *
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     * @param cause   The cause (which is saved for later retrieval by the {@link ${symbol_pound}getCause()} method).
     *                For more information, see {@link RuntimeException${symbol_pound}RuntimeException(Throwable)}.
     */
    public UnauthorizedException(String message, Throwable cause) {
        super(message, cause);
    }
}
