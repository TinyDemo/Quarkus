package cn.tinydemo.service;

import cn.tinydemo.model.dto.FundDTO;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@QuarkusTest
public class FundServiceTest {
    @Inject
    FundService fundService;

    @Test
    public void testGetBaseInfo() {
        HashSet<String> codes = new HashSet<>();
        codes.add("110011");
        List<FundDTO.Fund> funds = fundService.getBaseInfo(codes);
        Assertions.assertEquals(1, funds.size());
    }
}
