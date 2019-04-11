package com.baizhi.entity;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
//下面的注解是使用了通用mapper之后使用的注解根据实体类生成sql语句
@Table(name = "t_student")//作用在类上表名数据库表
public class Student {
    @Id//标明主键
    @KeySql(useGeneratedKeys = true)//自增长
    private Integer stu_id;
    private String stu_name;
    private Integer stu_age;
    private Integer stu_gender;
    private Integer is_delete=0;



}
