package com.example.shiro.entity;

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
public class Permissions {
    private String id;
    private String permissionsName;
}
