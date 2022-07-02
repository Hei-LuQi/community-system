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
@TableName("dispute")
public class Dispute {

    @TableId(type = IdType.INPUT,value = "id")
    private String id;

    @TableField(value = "involved_person")
    private String involvedPerson;

    @TableField(value = "reason")
    private String reason;

    @TableField(value = "result")
    private String result;

    @TableField(value = "contact")
    private String contact;


}
