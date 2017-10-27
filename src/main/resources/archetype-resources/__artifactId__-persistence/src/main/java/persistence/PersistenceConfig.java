#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Configuration class to set up persistence layer.
 */
@Configuration
@EnableJpaRepositories(basePackages = {
        "${package}.persistence.daos",
})
@EntityScan("${package}.models")
public class PersistenceConfig {
}
