package com.baizhi.entity;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;

@Data
@Table(name = "user")
public class User implements Serializable {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    @Column(name = "name")//数据库列名与属性名不一致 起别名
    private String username;
    @Transient//标明这个属性不是数据库的字段
    private String status;
    @Transient
    @JSONField(format = "yyyy-MM-dd: HH:mm:ss")
    @DateTimeFormat(pattern = "yyyy-MM-dd: HH:mm:ss")
    private Date bir;





}