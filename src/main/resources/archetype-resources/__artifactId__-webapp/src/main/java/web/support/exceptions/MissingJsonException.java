#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.support.exceptions;

/**
 * A {@link RuntimeException} that must be thrown when a JSON is expected, but the API consumer did not send any.
 */
public class MissingJsonException extends RuntimeException {

    /**
     * Default constructor.
     */
    public MissingJsonException() {
        super();
    }

    /**
     * Constructor which can set a {@code message}.
     *
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     */
    public MissingJsonException(String message) {
        super(message);
    }

    /**
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     * @param cause   The cause (which is saved for later retrieval by the {@link ${symbol_pound}getCause()} method).
     *                For more information, see {@link RuntimeException${symbol_pound}RuntimeException(Throwable)}.
     */
    public MissingJsonException(String message, Throwable cause) {
        super(message, cause);
    }
}
