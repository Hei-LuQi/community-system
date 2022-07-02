package com.example.communitysystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@TableName("volunteer")
public class Volunteer {

    @TableId(type = IdType.INPUT,value = "id")
    private String id;

    @TableField(value = "name")
    private String name;

    @TableField(value = "email")
    private String email;

    @TableField(value = "sex")
    private String sex;

    @TableField(value = "phone")
    private String phone;

}
