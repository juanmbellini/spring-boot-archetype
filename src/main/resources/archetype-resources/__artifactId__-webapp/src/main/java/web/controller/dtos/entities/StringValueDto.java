#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.controller.dtos.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Data transfer object for receiving only one value from an API consumer
 */
public class StringValueDto {

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    public StringValueDto() {
        // For Jersey
    }

    public String getValue() {
        return value;
    }

}
