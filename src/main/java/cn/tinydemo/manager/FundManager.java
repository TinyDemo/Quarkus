package cn.tinydemo.manager;

import cn.tinydemo.model.dto.FundDTO;
import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

/**
 * @author where
 */
@Path("/v1")
@RegisterRestClient
public interface FundManager {
    /**
     * 获取基金的基础信息
     *
     * @param code 基金代码
     * @return 基金基础信息
     */
    @GET
    @Path("/fund")
    @Produces(MediaType.APPLICATION_JSON)
    JsonObject base(@QueryParam("code") String code);
}
