package com.example.communitysystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@TableName("public_security")
public class PublicSecurity {

    @TableId(type = IdType.INPUT,value = "id")
    private String id;

    @TableField(value = "code")
    private String code;

    @TableField(value = "dependent_office")
    private String dependentOffice;

    @TableField(value = "create_date")
    //设置日期的返回格式
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    //设置日期传入的格式
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    @TableField(value = "type")
    private String type;


}
