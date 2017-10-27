#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.security.authentication;

import org.springframework.security.core.AuthenticationException;

/**
 * Exception to be thrown in case the set authentication scheme is not supported.
 */
/* package */ class UnsupportedAuthenticationSchemeException extends AuthenticationException {

    /**
     * Default constructor.
     */
    UnsupportedAuthenticationSchemeException(String scheme) {
        super("The set scheme is not supported");
    }
}
