package com.example.shiro.entity;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author shizhiguo
 * @version 1.0.
 * @Description
 * @Date 2020/1/15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors
public class Role {
    private String id;
    private String roleName;
    /**
     * 角色对应权限集合
     */
    private Set<Permissions> permissions;
}
