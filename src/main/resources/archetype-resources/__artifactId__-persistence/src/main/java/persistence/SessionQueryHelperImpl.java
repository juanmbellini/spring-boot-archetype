#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence;

import ${package}.exceptions.InvalidPropertiesException;
import ${package}.models.Session;
import ${package}.persistence.query_helpers.SessionQueryHelper;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

/**
 * Concrete implementation of a {@link SessionQueryHelper}.
 */
@Component
public class SessionQueryHelperImpl implements SessionQueryHelper {

    @Override
    public void validatePageable(Pageable pageable) throws InvalidPropertiesException {
        PersistenceHelper.validatePageable(pageable, Session.class);
    }
}
