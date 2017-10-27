#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence.query_helpers;

import ${package}.exceptions.InvalidPropertiesException;
import ${package}.models.Session;
import ${package}.models.User;
import org.springframework.data.domain.Pageable;

/**
 * Defines behaviour of an object in charge of helping the task of querying {@link User}s
 * by a {@link ${package}.persistence.daos.UserDao}.
 */
public interface SessionQueryHelper {

    /**
     * Validates that the given {@link Pageable} is valid for querying {@link Session}s.
     *
     * @param pageable The {@link Pageable} to be validated.
     * @throws InvalidPropertiesException If it has a {@link org.springframework.data.domain.Sort}
     *                                    with invalid properties.
     */
    void validatePageable(Pageable pageable) throws InvalidPropertiesException;
}
