package com.example.communitysystem.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MenuInfo {

	//标题
    private String title;
    //图标
    private String icon;
    //地址
    private String href;
    //a标签的跳转方式
    private String target;
    //子级菜单
    private List<MenuInfo> child;


}
