package com.commerce.eohno.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;
@Data
@Builder
@Table(name = "tb_order_item")
public class OrderItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    /**
     * 商品id
     */
    @Column(name = "item_id")
    private String itemId;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private String orderId;

    /**
     * 商品购买数量
     */
    private Integer num;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品单价
     */
    private Long price;

    /**
     * 商品总金额
     */
    @Column(name = "total_fee")
    private Long totalFee;

    /**
     * 商品图片地址
     */
    @Column(name = "pic_path")
    private String picPath;

    private static final long serialVersionUID = 1L;

}