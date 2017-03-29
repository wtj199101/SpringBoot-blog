package cn.springBoot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 基础类：时间用long表示
 * 
 * @author Administrator
 *
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 4645944526377343850L;

    @Column(name = "CREATE_TIME", nullable = false, updatable = false)
    private Long createTime;

    @Column(name = "CREATE_USER_ID", nullable = false, updatable = false)
    private String createUserId;

    @Column(name = "UPDATE_TIME")
    private Long updateTime;

    @Column(name = "UPDATE_USER_ID")
    private String updateUserId;
    @Column(name = "IS_DEL")
    private String isDel;

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public String getIsDel() {
        return isDel;
    }

    public void setIsDel(String isDel) {
        this.isDel = isDel;
    }

}
