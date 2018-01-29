package cn.myself.platform.dao.sys;

import cn.myself.platform.model.sys.SysUser;
import tk.mybatis.mapper.common.Mapper;

import java.util.Map;

public interface SysUserMapper extends Mapper<SysUser> {

    /**
     * 根据用户名，获取用户信息
     *
     * @param params
     * @return
     */
    public SysUser getSysuserByUserName(Map<String, Object> params);
}