package com.learning.socialshop;

import com.learning.socialshop.service.TestService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName: OneTest <br>
 * @Description
 * @Author: jieqiong.wu
 * @since: 2019/4/16 12:42
 */
@RestController
@RequestMapping("one")
@EnableAutoConfiguration
public class OneTest {

    @Resource
    private TestService testService;

    @RequestMapping("first")
    public String first(){
        return "oneTest";
    }

    @RequestMapping("two")
    public String two(){
       return testService.test();
    }
}
