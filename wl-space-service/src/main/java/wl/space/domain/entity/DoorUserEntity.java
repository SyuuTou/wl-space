package wl.space.domain.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import wl.space.domain.base.BaseEntityBean;


@EqualsAndHashCode(callSuper = true)
@Data
public class DoorUserEntity extends BaseEntityBean {

    private Long id;
    /**
     * 登录名称
     */
    private String loginName;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 密码
     */
    private String password;
    /**
     * unionID
     */
    private String unionId;
    /**
     * 小程序openID
     */
    private String appletOpenId;
    /**
     * 公众号openID
     */
    private String mpOpenId;
}
