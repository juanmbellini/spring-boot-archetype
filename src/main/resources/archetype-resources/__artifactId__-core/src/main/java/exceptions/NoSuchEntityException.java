#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.exceptions;

/**
 * {@link RuntimeException} thrown when searching an entity that does not exist.
 */
public class NoSuchEntityException extends RuntimeException {

    /**
     * Default constructor.
     */
    public NoSuchEntityException() {
        super();
    }

    /**
     * Constructor which can set a {@code message}.
     *
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     */
    public NoSuchEntityException(String message) {
        super(message);
    }

    /**
     * Constructor which can set a mes{@code message} and a {@code cause}.
     *
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     * @param cause   The cause (which is saved for later retrieval by the {@link ${symbol_pound}getCause()} method).
     *                For more information, see {@link RuntimeException${symbol_pound}RuntimeException(Throwable)}.
     */
    public NoSuchEntityException(String message, Throwable cause) {
        super(message, cause);
    }
}
