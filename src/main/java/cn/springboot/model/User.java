package cn.springboot.model;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "MY_USER_T")
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1883838431615170196L;

    @Id
    private String id;
    //昵称
    private String nickname;
    //登录名
    private String username;
    //密码
    private String password;
    //手机
    private String phone;
    //邮箱
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        super.toString();
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", phone=" + phone
                + ", email=" + email + "]";
    }

}
