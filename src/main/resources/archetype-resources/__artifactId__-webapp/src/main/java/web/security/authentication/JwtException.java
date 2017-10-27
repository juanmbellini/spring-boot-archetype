#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.security.authentication;

import ${package}.exceptions.UnauthenticatedException;

/**
 * Exception thrown when there are JWT issues
 * (e.g invalid token, expired token, wrong or missing signature, blacklisted, etc).
 */
/* package */ class JwtException extends UnauthenticatedException {

    /**
     * Default constructor.
     */
    /* package */ JwtException() {
        super();
    }

    /**
     * Constructor which can set a {@code message}.
     *
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     */
    /* package */ JwtException(String message) {
        super(message);
    }

    /**
     * Constructor which can set a mes{@code message} and a {@code cause}.
     *
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     * @param cause   The cause (which is saved for later retrieval by the {@link ${symbol_pound}getCause()} method).
     *                For more information, see {@link RuntimeException${symbol_pound}RuntimeException(Throwable)}.
     */
    /* package */ JwtException(String message, Throwable cause) {
        super(message, cause);
    }
}
