package com.lr.po;

import lombok.Data;

import java.io.Serializable;

/**
 * @author liurui
 * @date 2019/11/30 17:13
 */
@Data
public class Student implements Serializable {
    private Integer id;
    private String studentName;
    private Integer studentAge;
}
