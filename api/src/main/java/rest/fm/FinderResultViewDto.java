package rest.fm;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.EXISTING_PROPERTY,
        property = "jsonTypeInfo",
        defaultImpl = FinderResultViewDto.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = AddressResultViewDto.class, name = "AddressResultViewDto"),
        @JsonSubTypes.Type(value = DepotResultViewDto.class, name = "DepotResultViewDto"),
})
@Schema(name="FinderResultViewDto", discriminatorProperty = "jsonTypeInfo",
        allOf = { BaseDto.class },
        discriminatorMapping = {
                @io.swagger.v3.oas.annotations.media.DiscriminatorMapping(value = "AddressResultViewDto", schema = AddressResultViewDto.class),
                @io.swagger.v3.oas.annotations.media.DiscriminatorMapping(value = "DepotResultViewDto", schema = DepotResultViewDto.class)
        }
)
public class FinderResultViewDto {
    private String jsonTypeInfo = "FinderResultViewDto";
    private String finderResultView;
}
