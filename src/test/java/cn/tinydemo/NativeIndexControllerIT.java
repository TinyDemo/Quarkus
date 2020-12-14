package cn.tinydemo;

import cn.tinydemo.controller.IndexControllerTest;
import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeIndexControllerIT extends IndexControllerTest {

    // Execute the same tests but in native mode.
}