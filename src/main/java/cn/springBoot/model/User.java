package cn.springBoot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="T_USER_T")
public class User extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1883838431615170196L;
    @Id
    @NotNull
    private String id;
    @Column(name="Name")
    private String name;
    @Column(name="PASSWORD")
    private String password;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    
}
