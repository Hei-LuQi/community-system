package com.example.communitysystem.controller;

import com.example.communitysystem.entity.HomeInfo;
import com.example.communitysystem.entity.InitMenu;
import com.example.communitysystem.entity.LogoInfo;
import com.example.communitysystem.entity.MenuInfo;
import com.example.communitysystem.util.ResponseData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@Controller
public class PageController {

    @GetMapping("/")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/index")
    public String indexPage(){
        return "index";
    }

    @GetMapping("/logout")
    @ResponseBody
    public ResponseData logoutPage(HttpServletRequest request){
        HttpSession session = request.getSession();
        session.removeAttribute("user");
        return new ResponseData("0",null);
    }

    @GetMapping("/residentInsert")
    public String residentInsert(HttpServletRequest request){
        return "residentInsert";
    }

    @GetMapping("/about")
    public String about(HttpServletRequest request){
        return "about";
    }

    @GetMapping("/initMenu")
    @ResponseBody
    public String initMenu(HttpServletRequest request) throws JsonProcessingException {
        String path = request.getContextPath();
        System.out.println("path:" + path);
        //设置主页的标题和地址
        HomeInfo homeinfo = new HomeInfo("首页", path + "/welcome");
        //设置logo的标题和图片地址和跳转地址
        LogoInfo logoinfo = new LogoInfo("社区后台管理",path + "/layui/images/logo.png",path);

        //设置菜单列表
        List<MenuInfo> menuInfo = new ArrayList<>();
        //设置一级菜单列表
        List<MenuInfo> childInfo = new ArrayList<>();

        //设置二级菜单列表并添加成菜单组
        List<MenuInfo> bookInfo = new ArrayList<>();
        bookInfo.add(new MenuInfo("社区机构管理", "fa fa-address-book", path + "/institution_list", "_self",null));
        bookInfo.add(new MenuInfo("居民档案管理", "fa fa-bandcamp", path + "/resident_list", "_self",null));
        bookInfo.add(new MenuInfo("出租房屋登记", "fa fa-id-card-o", path + "/house_list", "_self",null));
        bookInfo.add(new MenuInfo("常住人口管理", "fa fa-futbol-o", path + "/person_list", "_self",null));
        childInfo.add(new MenuInfo("基本管理服务", "fa fa-linode", "", "_self", bookInfo));

        //设置二级菜单列表并添加成菜单组
        List<MenuInfo> userInfo = new ArrayList<>();
        userInfo.add(new MenuInfo("志愿者信息管理", "fa fa-bullhorn", path + "/volunteer_list", "_self",null));
        userInfo.add(new MenuInfo("下岗职工管理", "fa fa-calculator", path + "/worker_list", "_self",null));
        userInfo.add(new MenuInfo("群众服务组织", "fa fa-calendar-o", path + "/organizationService_list", "_self",null));
        childInfo.add(new MenuInfo("社区服务管理", "fa fa-camera-retro", "", "_self", userInfo));

        //设置二级菜单列表并添加成菜单组
        List<MenuInfo> borrowInfo = new ArrayList<>();
        borrowInfo.add(new MenuInfo("救济救灾记录", "fa fa-caret-square-o-right", path + "/help_list", "_self",null));
        borrowInfo.add(new MenuInfo("低保户管理", "fa fa-clock-o", path + "/lowIncomeFamily_list", "_self",null));
        borrowInfo.add(new MenuInfo("残疾人管理", "fa fa-coffee", path + "/disabled_list", "_self",null));
        childInfo.add(new MenuInfo("民政工作管理", "fa fa-eye", "", "_self", borrowInfo));

        //设置二级菜单列表并添加成菜单组
        List<MenuInfo> workManager = new ArrayList<>();
        workManager.add(new MenuInfo("治安记录管理", "fa fa-file-archive-o", path + "/publicSecurity_list", "_self",null));
        workManager.add(new MenuInfo("纠纷记录管理", "fa fa-gift", path + "/dispute_list", "_self",null));
        workManager.add(new MenuInfo("社区市民学校", "fa fa-hand-peace-o", path + "/school_list", "_self",null));
        childInfo.add(new MenuInfo("综合工作治理", "fa fa-keyboard-o", "", "_self", workManager));

        //设置二级菜单列表并添加成菜单组
        List<MenuInfo> settings = new ArrayList<>();
        settings.add(new MenuInfo("系统用户管理", "fa fa-graduation-cap", path + "/user_list", "_self",null));
        settings.add(new MenuInfo("关于系统", "fa fa-plus-circle", path + "/welcome", "_self",null));
        childInfo.add(new MenuInfo("系统设置", "fa fa-snowflake-o", "", "_self", settings));


        //把一级菜单添加到菜单列表
        menuInfo.add(new MenuInfo("常规管理", "fa fa-adn", "", "_self", childInfo));
        //初始化菜单列表信息（主页信息、logo信息、菜单列表信息）
        InitMenu initMenu = new InitMenu(homeinfo, logoinfo, menuInfo);
        //把初始化的菜单信息转化成json传给前端
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(initMenu);
    }

    @GetMapping("/welcome")
    public String welcome(HttpServletRequest request){
        return "welcome";
    }

    @GetMapping("/institution_list")
    public String institution_list(HttpServletRequest request){
        return "institution_list";
    }

    @GetMapping("/institution_add")
    public String institution_add(HttpServletRequest request){
        return "institution_add";
    }

    @GetMapping("/institution_edit")
    public String institution_edit(HttpServletRequest request){
        return "institution_edit";
    }

    @GetMapping("/resident_list")
    public String resident_list(HttpServletRequest request){
        return "resident_list";
    }

    @GetMapping("/resident_add")
    public String resident_add(HttpServletRequest request){
        return "resident_add";
    }

    @GetMapping("/resident_edit")
    public String resident_edit(HttpServletRequest request){
        return "resident_edit";
    }

    @GetMapping("/house_list")
    public String house_list(HttpServletRequest request){
        return "house_list";
    }

    @GetMapping("/house_add")
    public String house_add(HttpServletRequest request){
        return "house_add";
    }

    @GetMapping("/house_edit")
    public String house_edit(HttpServletRequest request){
        return "house_edit";
    }

    @GetMapping("/person_list")
    public String person_list(HttpServletRequest request){
        return "person_list";
    }

    @GetMapping("/person_add")
    public String person_add(HttpServletRequest request){
        return "person_add";
    }

    @GetMapping("/person_edit")
    public String person_edit(HttpServletRequest request){
        return "person_edit";
    }

    @GetMapping("/organizationService_list")
    public String organizationService_list(HttpServletRequest request){
        return "organizationService_list";
    }

    @GetMapping("/organizationService_add")
    public String organizationService_add(HttpServletRequest request){
        return "organizationService_add";
    }

    @GetMapping("/organizationService_edit")
    public String organizationService_edit(HttpServletRequest request){
        return "organizationService_edit";
    }

    @GetMapping("/volunteer_list")
    public String volunteer_list(HttpServletRequest request){
        return "volunteer_list";
    }

    @GetMapping("/volunteer_add")
    public String volunteer_add(HttpServletRequest request){
        return "volunteer_add";
    }

    @GetMapping("/volunteer_edit")
    public String volunteer_edit(HttpServletRequest request){
        return "volunteer_edit";
    }

    @GetMapping("/worker_list")
    public String worker_list(HttpServletRequest request){
        return "worker_list";
    }

    @GetMapping("/worker_add")
    public String worker_add(HttpServletRequest request){
        return "worker_add";
    }

    @GetMapping("/worker_edit")
    public String worker_edit(HttpServletRequest request){
        return "worker_edit";
    }

    @GetMapping("/help_list")
    public String help_list(HttpServletRequest request){
        return "help_list";
    }

    @GetMapping("/help_add")
    public String help_add(HttpServletRequest request){
        return "help_add";
    }

    @GetMapping("/help_edit")
    public String help_edit(HttpServletRequest request){
        return "help_edit";
    }

    @GetMapping("/lowIncomeFamily_list")
    public String lowIncomeFamily_list(HttpServletRequest request){
        return "lowIncomeFamily_list";
    }

    @GetMapping("/lowIncomeFamily_add")
    public String lowIncomeFamily_add(HttpServletRequest request){
        return "lowIncomeFamily_add";
    }

    @GetMapping("/lowIncomeFamily_edit")
    public String lowIncomeFamily_edit(HttpServletRequest request){
        return "lowIncomeFamily_edit";
    }

    @GetMapping("/disabled_list")
    public String disabled_list(HttpServletRequest request){
        return "disabled_list";
    }

    @GetMapping("/disabled_add")
    public String disabled_add(HttpServletRequest request){
        return "disabled_add";
    }

    @GetMapping("/disabled_edit")
    public String disabled_edit(HttpServletRequest request){
        return "disabled_edit";
    }

    @GetMapping("/publicSecurity_list")
    public String publicSecurity_list(HttpServletRequest request){
        return "publicSecurity_list";
    }

    @GetMapping("/publicSecurity_add")
    public String publicSecurity_add(HttpServletRequest request){
        return "publicSecurity_add";
    }

    @GetMapping("/publicSecurity_edit")
    public String publicSecurity_edit(HttpServletRequest request){
        return "publicSecurity_edit";
    }

    @GetMapping("/dispute_list")
    public String dispute_list(HttpServletRequest request){
        return "dispute_list";
    }

    @GetMapping("/dispute_add")
    public String dispute_add(HttpServletRequest request){
        return "dispute_add";
    }

    @GetMapping("/dispute_edit")
    public String dispute_edit(HttpServletRequest request){
        return "dispute_edit";
    }

    @GetMapping("/school_list")
    public String school_list(HttpServletRequest request){
        return "school_list";
    }

    @GetMapping("/school_add")
    public String school_add(HttpServletRequest request){
        return "school_add";
    }

    @GetMapping("/school_edit")
    public String school_edit(HttpServletRequest request){
        return "school_edit";
    }

    @GetMapping("/user_list")
    public String user_list(HttpServletRequest request){
        return "user_list";
    }

    @GetMapping("/user_add")
    public String user_add(HttpServletRequest request){
        return "user_add";
    }

    @GetMapping("/user_edit")
    public String user_edit(HttpServletRequest request){
        return "user_edit";
    }

}
