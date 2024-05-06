package rest;

import io.swagger.v3.oas.annotations.tags.Tag;
import rest.fm.AddressResultViewDto;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;

@Path("/test")
@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
@Consumes(javax.ws.rs.core.MediaType.APPLICATION_JSON)
@Tag(name = "Test", description = "Test")
public interface TestEndpoint {
    @POST
    @Path("/address")
    List<AddressResultViewDto> getAddressResult();

    /* @POST
    @Path("/depots")
    List<DepotViewDto> getDepots();

    @POST
    @Path("/portfolios")
    List<PortfolioViewDto> getPortfolio();*/
}
