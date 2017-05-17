package cn.springBoot.model;

import java.io.Serializable;

/**
 * 基础类：时间用long表示
 * 
 * @author Administrator
 *
 */
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 4645944526377343850L;

    private Long versionNum;

    private Long createTime;

    private String createUserId;

    private Long updateTime;

    private String updateUserId;

    public Long getVersionNum() {
        return versionNum;
    }

    public void setVersionNum(Long versionNum) {
        this.versionNum = versionNum;
    }

    public String getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(String createUserId) {
        this.createUserId = createUserId;
    }

    public String getUpdateUserId() {
        return updateUserId;
    }

    public void setUpdateUserId(String updateUserId) {
        this.updateUserId = updateUserId;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "BaseEntity [versionNum=" + versionNum + ", createTime=" + createTime + ", createUserId="
                + createUserId + ", updateTime=" + updateTime + ", updateUserId=" + updateUserId + "]";
    }
}
