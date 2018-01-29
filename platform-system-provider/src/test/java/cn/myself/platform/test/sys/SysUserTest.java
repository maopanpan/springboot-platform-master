package cn.myself.platform.test.sys;

import cn.myself.platform.common.utils.LoggerHelper;
import cn.myself.platform.model.sys.SysUser;
import cn.myself.platform.service.sys.SysUserService;
import cn.myself.platform.test.BaseTest;
import com.alibaba.fastjson.JSON;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/26
 * @author 【时间】11:10
 * @author 【说明】
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.test.sys
 */
public class SysUserTest extends BaseTest {

    @Autowired
    private SysUserService sysUserService;

    @Test
    public void test_getSysUserById() {
        SysUser sysUser = sysUserService.getSysUserById(1);
        //LoggerHelper.fmtDebug(SysUserTest.class, "请求结果：%s", JSON.toJSONString(sysUser));
        System.out.println(JSON.toJSONString(sysUser));
        Assert.assertNotNull(sysUser);
    }

    @Test
    public void test_getSysuserByUserName() {
        SysUser sysUser = sysUserService.getSysuserByUserName("15011479990");
        LoggerHelper.fmtDebug(SysUserTest.class, "请求结果：%s", JSON.toJSONString(sysUser));
        Assert.assertNotNull(sysUser);
    }

}
