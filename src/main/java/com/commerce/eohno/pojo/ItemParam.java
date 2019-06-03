package com.commerce.eohno.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;
@Data
@Builder
@Table(name = "tb_item_param")
public class ItemParam implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 商品类目ID
     */
    @Column(name = "item_cat_id")
    private Long itemCatId;

    private Date created;

    private Date updated;

    /**
     * 参数数据，格式为json格式
     */
    @Column(name = "param_data")
    private String paramData;

    private static final long serialVersionUID = 1L;

}