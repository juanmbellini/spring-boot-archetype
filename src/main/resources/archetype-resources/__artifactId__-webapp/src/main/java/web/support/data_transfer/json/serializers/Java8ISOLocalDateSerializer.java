#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.web.support.data_transfer.json.serializers;

import ${package}.web.support.data_transfer.DateTimeFormatters;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * {@link com.fasterxml.jackson.databind.JsonSerializer} to transform a {@link LocalDate} to a {@link String},
 * using {@link DateTimeFormatters${symbol_pound}ISO_LOCAL_DATE} {@link DateTimeFormatter}.
 */
public class Java8ISOLocalDateSerializer extends StdSerializer<LocalDate> {

    /**
     * Default constructor.
     */
    public Java8ISOLocalDateSerializer() {
        super(LocalDate.class);
    }

    @Override
    public void serialize(LocalDate value, JsonGenerator gen, SerializerProvider provider)
            throws IOException {
        gen.writeString(DateTimeFormatters.ISO_LOCAL_DATE.getFormatter().format(value));

    }
}