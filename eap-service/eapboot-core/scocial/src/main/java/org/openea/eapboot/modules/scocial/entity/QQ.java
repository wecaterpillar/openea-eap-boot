package org.openea.eapboot.modules.scocial.entity;

import org.openea.eapboot.base.EapBaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 */
@Data
@Entity
@Table(name = "t_qq")
@TableName("t_qq")
@ApiModel(value = "QQ用户")
public class QQ extends EapBaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "qq唯一id")
    private String openId;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "头像")
    private String avatar;

    @ApiModelProperty(value = "是否绑定账号 默认false")
    private Boolean isRelated = false;

    @ApiModelProperty(value = "绑定用户账号")
    private String relateUsername;
}