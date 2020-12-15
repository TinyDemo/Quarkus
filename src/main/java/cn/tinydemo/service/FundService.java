package cn.tinydemo.service;

import cn.tinydemo.manager.FundManager;
import cn.tinydemo.model.dto.FundDTO;
import io.vertx.core.json.JsonObject;
import org.apache.commons.lang3.StringUtils;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author where
 */
@ApplicationScoped
public class FundService {
    private static final String CODE = "code";
    private static final int STATE_OK = 200;
    @Inject
    @RestClient
    FundManager fundManager;

    public List<FundDTO.Fund> getBaseInfo(HashSet<String> codes) {
        String code = StringUtils.join(codes, ",");
        JsonObject result = fundManager.base(code);
        if (result.containsKey(CODE) && STATE_OK == result.getInteger(CODE)) {
            FundDTO fundDTO = result.mapTo(FundDTO.class);
            return fundDTO.data;
        }
        return new ArrayList<>();
    }
}
