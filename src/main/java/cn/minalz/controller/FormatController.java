package cn.minalz.controller;

import cn.minalz.domain.User;
import cn.minalz.template.HelloFormatTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author minalz
 * @since 2023/03/17 00:15:20
 */
@RestController
public class FormatController {

    @Autowired
    private HelloFormatTemplate helloFormatTemplate;

    @GetMapping("/format")
    public String format() {
        User user = new User();
        user.setName("minalz");
        user.setAge(18);
        return helloFormatTemplate.doFormat(user);
    }
}
