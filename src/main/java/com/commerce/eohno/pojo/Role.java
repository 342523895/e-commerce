package com.commerce.eohno.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

@Data
@Builder
@Table(name = "tb_role")
public class Role implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 描述
     */
    private String desc;

    private static final long serialVersionUID = 1L;

}