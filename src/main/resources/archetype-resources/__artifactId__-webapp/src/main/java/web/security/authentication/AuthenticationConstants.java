#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.security.authentication;

/**
 * Class containing constants to be used by the authentication module.
 */
/* package */ class AuthenticationConstants {

    /**
     * Indicates which HTTP header includes the authentication credentials.
     */
    /* package */ static final String AUTHENTICATION_HEADER = "Authorization";

    /**
     * Indicates the authentication scheme supported by the system.
     */
    /* package */ static final String AUTHENTICATION_SCHEME = "Bearer";
}
