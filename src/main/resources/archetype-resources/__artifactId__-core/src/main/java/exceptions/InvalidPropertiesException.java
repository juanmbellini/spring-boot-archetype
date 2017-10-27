#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.exceptions;

import java.util.List;

/**
 * {@link RuntimeException} thrown when querying, trying to apply filters to properties that does not exist.
 */
public class InvalidPropertiesException extends RuntimeException {

    /**
     * A {@link List} holding those properties that does not exist.
     */
    private final List<String> invalidProperties;

    /**
     * Default constructor.
     *
     * @param invalidProperties A {@link List} holding those properties that does not exist.
     */
    public InvalidPropertiesException(List<String> invalidProperties) {
        super();
        this.invalidProperties = invalidProperties;
    }

    /**
     * Constructor which can set a {@code message}.
     *
     * @param message           The detail message,
     *                          which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     * @param invalidProperties A {@link List} holding those properties that does not exist.
     */
    public InvalidPropertiesException(String message, List<String> invalidProperties) {
        super(message);
        this.invalidProperties = invalidProperties;
    }

    /**
     * Constructor which can set a {@code message} and a {@code cause}.
     *
     * @param message           The detail message,
     *                          which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     * @param cause             The cause (which is saved for later retrieval by the {@link ${symbol_pound}getCause()} method).
     *                          For more information, see {@link RuntimeException${symbol_pound}RuntimeException(Throwable)}.
     * @param invalidProperties A {@link List} holding those properties that does not exist.
     */
    public InvalidPropertiesException(String message, Throwable cause, List<String> invalidProperties) {
        super(message, cause);
        this.invalidProperties = invalidProperties;
    }

    /**
     * @return The {@link List} holding those properties that does not exist.
     */
    public List<String> getErrors() {
        return invalidProperties;
    }
}
