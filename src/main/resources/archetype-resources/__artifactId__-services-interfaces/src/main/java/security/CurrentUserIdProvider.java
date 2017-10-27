#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.security;

import ${package}.exceptions.UnauthenticatedException;

import java.util.Optional;

/**
 * Defines behaviour for an object in charge of providing the current
 * {@link ${package}.models.User} {@code id}
 * (i.e the authenticated user in the ongoing request).
 */
public interface CurrentUserIdProvider {


    /**
     * @return A nullable {@link Optional} containing the {@code id}
     * of the current {@link ${package}.models.User}
     * (i.e the authenticated user in the ongoing request).
     */
    Optional<Long> currentUserIdOptional();

    /**
     * @return The {@code id} of the current {@link ${package}.models.User}
     * (i.e the authenticated user in the on going request).
     * @throws UnauthenticatedException If no {@link ${package}.models.User}
     *                                  is authenticated, or if the request is anonymous.
     */
    default long currentUserId() throws UnauthenticatedException {
        return currentUserIdOptional().orElseThrow(UnauthenticatedException::new);
    }
}
