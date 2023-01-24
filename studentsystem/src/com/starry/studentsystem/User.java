package com.starry.studentsystem;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 用户类
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    /**
     * 用户名
     */
    private String username;
    /**
     * 密码
     */
    private String password;

    /**
     * 身份证号
     */
    private String personID;

    /**
     * 手机号码
     */
    private String phoneNumber;


}
