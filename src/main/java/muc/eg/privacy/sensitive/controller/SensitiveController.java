package muc.eg.privacy.sensitive.controller;

import muc.eg.privacy.entity.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensitive")
public class SensitiveController {

    @RequestMapping("/getUserInfo")
    public UserInfo getUserInfo(@RequestParam String id) {
        UserInfo userInfo = new UserInfo();
        userInfo.setId(id);
        userInfo.setName("zhangsan");
        userInfo.setMobile("18011112222");
        userInfo.setEmail("123@example.com");
        userInfo.setIdCard("44010119900101001X");
        userInfo.setRegisterTime("2025-01-01 00:00:00");
        return userInfo;
    }
}
