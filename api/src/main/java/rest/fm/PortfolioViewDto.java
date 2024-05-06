package rest.fm;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString(callSuper = true)
@Getter
@Schema(name="PortfolioViewDto", allOf = { BankProductViewDto.class })
public class PortfolioViewDto extends BankProductViewDto {
    private String jsonTypeInfo = "PortfolioViewDto";

    private List<DepotViewDto> depots;

    private String portfolioView;

}
