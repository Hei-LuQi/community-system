package com.example.communitysystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class LogoInfo {
    //logo标题
    private String title;
    //图片地址
    private String image;
    //点击图片跳转的地址
    private String href;

}
