package com.gyw.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Emp {

    private String id;
    private String name;
    private String slary;
    private String age;
    private Date bir;
}