package cn.minalz.controller;

import cn.minalz.domain.User;
import cn.minalz.template.HelloFormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 对外（API）暴露格式控制器
 * @author zhouwei
 * @date 2023/3/21 13:39
 */
@RequestMapping("/api")
@RestController
public class FormatApiController {

    @Autowired
    private HelloFormatTemplate helloFormatTemplate;

    @PostMapping ("/format")
    public String format() {
        User user = new User();
        user.setName("minalz");
        user.setAge(18);
        return helloFormatTemplate.doFormat(user);
    }
}
