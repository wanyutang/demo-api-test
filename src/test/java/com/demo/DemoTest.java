package com.demo;

import com.jpa.AppApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = {AppApplication.class})
@Slf4j
public class DemoTest {

    @Test
    public void demo() {
       log.debug("logRes: {}", "error message");
    }

}
