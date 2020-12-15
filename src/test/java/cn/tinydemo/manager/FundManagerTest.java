package cn.tinydemo.manager;

import io.quarkus.test.junit.QuarkusTest;
import io.vertx.core.json.JsonObject;
import org.eclipse.microprofile.rest.client.inject.RestClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class FundManagerTest {
    @Inject
    @RestClient
    FundManager fundManager;

    @Test
    public void testBase() {
        JsonObject json = fundManager.base("110011");
        Assertions.assertTrue(json.containsKey("code"));
        Assertions.assertEquals(200, json.getInteger("code"));
    }
}
