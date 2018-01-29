package cn.myself.platform.service.sys.impl;

import cn.myself.platform.common.global.UserStatus;
import cn.myself.platform.dao.sys.SysUserMapper;
import cn.myself.platform.model.sys.SysUser;
import cn.myself.platform.service.sys.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/25
 * @author 【时间】17:40
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】com.myself.platform.service.sys.impl
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    @Cacheable(value = "users", key = "#p0")
    public SysUser getSysUserById(int id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

    @Override
    @Cacheable(value = "userInfo", key = "#p0")
    public SysUser getSysuserByUserName(String mobile) {
        Map<String, Object> params = new HashMap<>();
        params.put("mobile", mobile);
        params.put("userStatus", UserStatus.UNUSABLE.getStatus());
        return sysUserMapper.getSysuserByUserName(params);
    }
}
