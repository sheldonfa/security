package com.imooc.security.core.validate;

import java.awt.image.BufferedImage;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class ImageCode extends ValidateCode{

    private BufferedImage image;
    private String code;
    private LocalDateTime expireTime;

    public ImageCode(BufferedImage image, String code, int expireIn) {
        this.image = image;
        this.code = code;
        this.expireTime = LocalDateTime.now().plusSeconds(expireIn);
    }

    public boolean isExpired(){
        return LocalDateTime.now().isAfter(expireTime);
    }


    public BufferedImage getImage() {
        return image;
    }

    public ImageCode setImage(BufferedImage image) {
        this.image = image;
        return this;
    }

    public String getCode() {
        return code;
    }

    public ImageCode setCode(String code) {
        this.code = code;
        return this;
    }

    public LocalDateTime getExpireTime() {
        return expireTime;
    }

    public ImageCode setExpireTime(LocalDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }
}
