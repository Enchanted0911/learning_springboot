package icu.junyao.springboot.model;

import lombok.Data;

/**
 * @author wu
 */
@Data
public class User {
    private Integer id;
    private String userName;
    private Integer age;
    private String nick;
    private String phone;
    private String address;
}
