#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.config;

import com.bellotapps.utils.error_handler.EnableErrorHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Configuration class in charge of configuring web concerns.
 */
@Configuration
@ComponentScan({
        "${package}.web.controller",
})
@EnableErrorHandler(basePackages = "${package}.web.error_handlers")
public class WebConfig {
}
