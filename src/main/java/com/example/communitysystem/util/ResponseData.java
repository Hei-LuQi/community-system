package com.example.communitysystem.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseData<T> {

    /**
     * 状态码
     */
    private String Code;

    /**
     * 数据对象
     */
    private T data;


}
