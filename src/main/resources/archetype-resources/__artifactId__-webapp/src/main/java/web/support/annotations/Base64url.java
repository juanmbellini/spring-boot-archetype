#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.support.annotations;

import java.lang.annotation.*;

/**
 * Indicates that a parameter is encoded using Url-Safe base64 mechanism (i.e RFC 4648, section 5).
 *
 * @see <a href="https://tools.ietf.org/html/rfc4648${symbol_pound}section-5">RFC 4648, section 5 </a>
 */
@Target({ElementType.PARAMETER,})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Base64url {
}
