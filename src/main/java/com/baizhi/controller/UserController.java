package com.baizhi.controller;


import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import com.baizhi.utils.ValidateImageCodeUtils;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author: timor
 * @date: 2020/7/16 16:25
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //登录
    @PostMapping("/login")
    public String login(String username, String password) {
        User login = userService.login(username, password);
        if (login!=null) {
            return "redirect:/emp/findAll";
        } else {
            return "redirect:/index";
        }
    }

    //注册
    @PostMapping("/register")
    public String register(User user, String code, HttpSession session) {

        String sessionCode = (String) session.getAttribute("code");
        if (sessionCode.equalsIgnoreCase(code)) {
            userService.register(user);
            return "redirect:/index";
        } else {
            return "redirect:/toRegister";
        }

    }


    @GetMapping("/code")
    public void getImage(HttpSession session, HttpServletResponse response) throws IOException {
        //生成验证码
        String securityCode = ValidateImageCodeUtils.getSecurityCode();
        BufferedImage image = ValidateImageCodeUtils.createImage(securityCode);
        session.setAttribute("code", securityCode);
        ServletOutputStream os = response.getOutputStream();
        ImageIO.write(image,"png",os);
    }
}
