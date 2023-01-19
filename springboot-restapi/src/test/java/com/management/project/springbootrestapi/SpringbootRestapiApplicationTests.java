package com.management.project.springbootrestapi;

import com.management.project.springbootrestapi.controller.EmployeeController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayContaining;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.core.IsNull.notNullValue;

@SpringBootTest
class SpringbootRestapiApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testEmployeeControllerAnnotation() {
        RestController restController = EmployeeController.class.getAnnotation(RestController.class);

        assertThat(restController, notNullValue());
    }
}
