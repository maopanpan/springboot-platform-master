package cn.myself.platform.service.sys;

import cn.myself.platform.model.sys.SysUser;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】15:43
 * @author 【说明】系统用户服务
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.service.sys
 */
public interface SysUserService {

    /**
     * 根据用户Id,获取用户信息
     *
     * @param id
     * @return
     */
    public SysUser getSysUserById(int id);

    /**
     * 根据用户名获取用户信息
     *
     * @param mobile
     * @return
     */
    public SysUser getSysuserByUserName(String mobile);
}
