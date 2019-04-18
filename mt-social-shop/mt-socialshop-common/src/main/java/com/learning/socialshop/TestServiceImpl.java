package com.learning.socialshop;

import com.learning.socialshop.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: TestServiceImpl <br>
 * @Description
 * @Author: jieqiong.wu
 * @since: 2019/4/16 11:39
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public String test() {
        return "TestServiceImpl.test11()";
    }
}
