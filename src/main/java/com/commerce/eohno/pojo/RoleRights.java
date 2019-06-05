package com.commerce.eohno.pojo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import javax.persistence.*;

@Data
@Builder
@Table(name = "tb_role_rights")
public class RoleRights implements Serializable {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 权限ID
     */
    @Column(name = "rights_id")
    private Long rightsId;

    private static final long serialVersionUID = 1L;

}