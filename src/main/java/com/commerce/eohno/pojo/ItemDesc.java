package com.commerce.eohno.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Data
@Builder
@Table(name = "tb_item_desc")
public class ItemDesc implements Serializable {
    /**
     * 商品ID
     */
    @Id
    @Column(name = "item_id")
    private Long itemId;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 更新时间
     */
    private Date updated;

    /**
     * 商品描述
     */
    @Column(name = "item_desc")
    private String itemDesc;

    private static final long serialVersionUID = 1L;

}