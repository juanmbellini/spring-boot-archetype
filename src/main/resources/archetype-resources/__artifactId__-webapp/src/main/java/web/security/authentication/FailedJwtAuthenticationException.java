#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.security.authentication;

import org.springframework.security.core.AuthenticationException;
import org.springframework.util.Assert;

/**
 * {@link AuthenticationException} thrown when there are JWT issues
 * (e.g invalid token, expired token, wrong or missing signature, blacklisted, etc).
 * <p>
 * This exception acts as a wrapper of {@link JwtException},
 * to be used in the spring security exception handling mechanism.
 */
/* package */ class FailedJwtAuthenticationException extends AuthenticationException {

    /**
     * Constructor which can set a {@code cause}.
     *
     * @param cause The original {@link JwtException} thrown that caused this exception to be created.
     */
    /* package */ FailedJwtAuthenticationException(JwtException cause) {
        this("", cause);
    }

    /**
     * Constructor which can set a mes{@code message} and a {@code cause}.
     *
     * @param message The detail message, which is saved for later retrieval by the {@link ${symbol_pound}getMessage()} method.
     * @param cause   The original {@link JwtException} thrown that caused this exception to be created.
     */
    /* package */ FailedJwtAuthenticationException(String message, JwtException cause) {
        super(message, cause);
        Assert.notNull(cause, "The JwtException must not be null");
    }

    /**
     * @return The original {@link JwtException} thrown that caused this exception to be created.
     */
    /* package */ JwtException getOriginalJwtException() {
        return (JwtException) this.getCause();
    }
}
