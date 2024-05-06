package rest.fm;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

@ToString(callSuper = true)
@Getter
@Schema(name="AddressResultViewDto", allOf = { FinderResultViewDto.class })
public class AddressResultViewDto extends FinderResultViewDto {
    private String jsonTypeInfo = "AddressResultViewDto";
    private String addressResultView;
}