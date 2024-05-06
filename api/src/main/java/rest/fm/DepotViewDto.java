package rest.fm;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@Schema(name="DepotViewDto", allOf = { BankProductViewDto.class })
public class DepotViewDto extends BankProductViewDto {
    private String jsonTypeInfo = "DepotViewDto";
    private String depotView;
}
