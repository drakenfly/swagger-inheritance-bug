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
        defaultImpl = BankProductViewDto.class
)
@JsonSubTypes({
        @JsonSubTypes.Type(value = DepotViewDto.class, name = "DepotViewDto"),
        @JsonSubTypes.Type(value = PortfolioViewDto.class, name = "PortfolioViewDto"),
})
@Schema(name="BankProductViewDto", discriminatorProperty = "jsonTypeInfo",
        allOf = { BaseDto.class },
        discriminatorMapping = {
                @io.swagger.v3.oas.annotations.media.DiscriminatorMapping(value = "DepotViewDto", schema = DepotViewDto.class),
                @io.swagger.v3.oas.annotations.media.DiscriminatorMapping(value = "PortfolioViewDto", schema = PortfolioViewDto.class)
        }
)
public class BankProductViewDto extends BaseDto {
    private String jsonTypeInfo = "BankProductViewDto";
    private String bankProductView;
}