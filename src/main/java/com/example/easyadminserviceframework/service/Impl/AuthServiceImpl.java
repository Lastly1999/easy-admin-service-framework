package com.example.easyadminserviceframework.service.Impl;

import com.example.easyadminserviceframework.entity.SysUser;
import com.example.easyadminserviceframework.pojo.LoginActionPojo;
import com.example.easyadminserviceframework.service.AuthService;
import com.example.easyadminserviceframework.service.UserService;
import com.example.easyadminserviceframework.vo.CreateCaptchaVo;
import com.google.code.kaptcha.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Base64;
import java.util.UUID;


@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private UserService userService;

    @Autowired
    private Producer kaptchaProducer;

    @Override
    public SysUser loginAction(LoginActionPojo loginActionPojo) {
        return userService.findUser(loginActionPojo);
    }

    /**
     * 生成图片验证码
     * @return CreateCaptchaVo
     * @throws IOException
     */
    @Override
    public CreateCaptchaVo CreateCaptcha() throws IOException {
        CreateCaptchaVo createCaptchaVo = new CreateCaptchaVo();
        // 生成文字验证码
        String text = kaptchaProducer.createText();
        // 生成图片验证码
        ByteArrayOutputStream outputStream = null;
        BufferedImage image = kaptchaProducer.createImage(text);
        outputStream = new ByteArrayOutputStream();
        ImageIO.write(image, "jpg", outputStream);
        //
        createCaptchaVo.setImg(Base64.getEncoder().encodeToString(outputStream.toByteArray()));
        //生成验证码对应的token  以token为key  验证码为value存在redis中
        String codeToken = UUID.randomUUID().toString();
        // todo 未存储redis
        // redisTemplate.opsForValue().set(codeToken, text, Constant.VERIFICATION__CODE_TIME, TimeUnit.MINUTES);
        createCaptchaVo.setImgToken(codeToken);
        return createCaptchaVo;
    }
}
