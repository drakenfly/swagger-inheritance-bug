package rest.fm;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString(callSuper = true)
@Getter
@Schema(name="DepotResultViewDto", allOf = { FinderResultViewDto.class })
public class DepotResultViewDto extends FinderResultViewDto {

    // @JsonIgnore
    private String jsonTypeInfo = "DepotResultViewDto";
    private List<DepotViewDto> resultList;
}
