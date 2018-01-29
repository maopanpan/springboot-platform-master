package cn.myself.platform.web.controller.sys;

import cn.myself.platform.common.annotation.Log;
import cn.myself.platform.common.api.RequestObject;
import cn.myself.platform.common.api.ResponseObject;
import cn.myself.platform.common.global.ResponseStatus;
import cn.myself.platform.common.utils.StringHelper;
import cn.myself.platform.model.sys.SysUser;
import cn.myself.platform.service.sys.SysUserService;
import cn.myself.platform.web.common.controller.BaseController;
import com.alibaba.fastjson.JSON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author 【name】毛攀攀
 * @author 【date】2018/01/25
 * @author 【时间】18:10
 * @author 【说明】用户管理
 * @author 【工程】springboot-platform-master
 * @author 【目录】cn.myself.platform.web.controller.sys
 */
@RestController
@RequestMapping("/sys")
public class UserController extends BaseController {

    @Autowired
    private SysUserService sysUserService;

    @PostMapping("/findSysUserById")
    @Log("/sys/findSysUserById")
    public Object findSysUserById(@RequestBody RequestObject requestObject) {
        //校验请求格式
        boolean flag = this.checkRequestObject(requestObject);
        if (!flag) {
            return new ResponseObject(ResponseStatus.ILLEGALARGUMENT, this.requestUUID);
        }

        /**
         * 获取请求参数
         */
        Map<String, Object> params = requestObject.getParams();
        int id = Integer.valueOf(params.get("id").toString());
        SysUser sysUser = sysUserService.getSysUserById(id);
        if (StringHelper.isEmpty(sysUser)) {
            return new ResponseObject(ResponseStatus.SUCCESS, this.requestUUID);
        }
        return new ResponseObject(ResponseStatus.SUCCESS, this.requestUUID, sysUser);
    }

    @PostMapping("/findSysUserByMobile")
    @Log
    public Object findSysUserByMobile(@RequestBody RequestObject requestObject) {
        //校验请求格式
        boolean flag = this.checkRequestObject(requestObject);
        if (!flag) {
            return new ResponseObject(ResponseStatus.ILLEGALARGUMENT, this.requestUUID);
        }

        /**
         * 获取请求参数
         */
        Map<String, Object> params = requestObject.getParams();
        String mobile = String.valueOf(params.get("mobile"));
        SysUser sysUser = sysUserService.getSysuserByUserName(mobile);
        if (StringHelper.isEmpty(sysUser)) {
            return new ResponseObject(ResponseStatus.SUCCESS, this.requestUUID);
        }

        return new ResponseObject(ResponseStatus.SUCCESS, this.requestUUID, sysUser);
    }

    public static void main(String[] args) {
        RequestObject requestObject = new RequestObject();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        requestObject.setRequestDate(sdf.format(new Date()));
        requestObject.setRequestUIID(UUID.randomUUID().toString().replace("-", ""));

        Map<String, Object> params = new HashMap<>();
        params.put("id", 1);
        params.put("mobile", "15011479990");
        requestObject.setParams(params);

        System.out.println(JSON.toJSONString(requestObject));
        //{"params":{"mobile":"15011479990","id":1},"requestDate":"2018-01-26 14:05:03","requestUIID":"20e7100a64ba4587875ef9893e90b7a0"}
    }

}
