package com.commerce.eohno.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Data
@Builder
@Table(name = "tb_content")
public class Content implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 内容类目ID
     */
    @Column(name = "category_id")
    private Long categoryId;

    /**
     * 内容标题
     */
    private String title;

    /**
     * 子标题
     */
    @Column(name = "sub_title")
    private String subTitle;

    /**
     * 标题描述
     */
    @Column(name = "title_desc")
    private String titleDesc;

    /**
     * 链接
     */
    private String url;

    /**
     * 图片绝对路径
     */
    private String pic;

    /**
     * 图片2
     */
    private String pic2;

    private Date created;

    private Date updated;

    /**
     * 内容
     */
    private String content;

    private static final long serialVersionUID = 1L;
}