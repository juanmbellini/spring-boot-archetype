#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.security;

/**
 * Defines behaviour for an object that provides authorization for operating over
 * {@link ${package}.models.User} instances.
 */
public interface UserPermissionProvider {

    /**
     * Tells whether the currently authenticated {@link ${package}.models.User}
     * can read the {@link ${package}.models.User} with the given {@code id}.
     *
     * @param id The id of the {@link ${package}.models.User} to be read.
     * @return {@code true} if it has permission, or {@code false} otherwise.
     */
    boolean readById(long id);

    /**
     * Tells whether the currently authenticated {@link ${package}.models.User}
     * can read the {@link ${package}.models.User} with the given {@code username}.
     *
     * @param username The username of the {@link ${package}.models.User} to be read.
     * @return {@code true} if it has permission, or {@code false} otherwise.
     */
    boolean readByUsername(String username);

    /**
     * Tells whether the currently authenticated {@link ${package}.models.User}
     * can read the {@link ${package}.models.User} with the given {@code email}.
     *
     * @param email The email of the {@link ${package}.models.User} to be read.
     * @return {@code true} if it has permission, or {@code false} otherwise.
     */
    boolean readByEmail(String email);

    /**
     * Tells whether the currently authenticated {@link ${package}.models.User}
     * can write the {@link ${package}.models.User} with the given {@code id}.
     *
     * @param id The id of the {@link ${package}.models.User} to be writed.
     * @return {@code true} if it has permission, or {@code false} otherwise.
     */
    boolean writeById(long id);

    /**
     * Tells whether the currently authenticated {@link ${package}.models.User}
     * can delete the {@link ${package}.models.User} with the given {@code id}.
     *
     * @param id The id of the {@link ${package}.models.User} to be deleted.
     * @return {@code true} if it has permission, or {@code false} otherwise.
     */
    boolean deleteById(long id);

    /**
     * Tells whether the currently authenticated {@link ${package}.models.User}
     * can delete the {@link ${package}.models.User} with the given {@code username}.
     *
     * @param username The username of the {@link ${package}.models.User}
     *                 to be deleted.
     * @return {@code true} if it has permission, or {@code false} otherwise.
     */
    boolean deleteByUsername(String username);

    /**
     * Tells whether the currently authenticated {@link ${package}.models.User}
     * can delete the {@link ${package}.models.User} with the given {@code email}.
     *
     * @param email The email of the {@link ${package}.models.User} to be deleted.
     * @return {@code true} if it has permission, or {@code false} otherwise.
     */
    boolean deleteByEmail(String email);

    /**
     * Tells whether the currently authenticated {@link ${package}.models.User}
     * is admin (i.e (i.e has {@link ${package}.models.Role${symbol_pound}ROLE_ADMIN} role)
     *
     * @return {@code true} if it is admin, or {@code false} otherwise.
     */
    boolean isAdmin();
}
