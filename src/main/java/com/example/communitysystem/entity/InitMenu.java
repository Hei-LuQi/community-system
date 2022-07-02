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
public class InitMenu {
    //主页信息
    private HomeInfo homeInfo;
    //logo信息
    private LogoInfo logoInfo;
    //左侧导航菜单信息
    private List<MenuInfo> menuInfo;

}
