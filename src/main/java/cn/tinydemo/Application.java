package cn.tinydemo;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

import java.util.TimeZone;

/**
 * @author where.liu
 */
@QuarkusMain
public class Application {
    public static void main(String[] args) {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Shanghai"));
        Quarkus.run(args);
    }
}
