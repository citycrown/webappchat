package com.bootdo.advert.controller;

import com.bootdo.advert.domain.AdvertDO;
import com.bootdo.advert.service.AdvertService;
import com.bootdo.common.utils.PageUtils;
import com.bootdo.common.utils.Query;
import com.bootdo.common.utils.R;
import com.bootdo.common.utils.RestResult;
import com.bootdo.shop.domain.TGoodsDO;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * 广告管理
 * <p>
 *
 * @author ：陈冕
 * @version : 1.0.0
 * @date : 2018/8/7
 */

@Controller
@RequestMapping("/advert")
public class AdvertController {

    @Autowired
    private AdvertService advertService;

    @ResponseBody
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public RestResult<AdvertDO> test(){
        AdvertDO advertDO = advertService.getById(1L);
        return R.success("执行成功", advertDO);
    }

    @ResponseBody
    @GetMapping("/index")
    public R index(){

        AdvertDO advertDO = advertService.getById(1L);
        return R.ok().put("data", advertDO);
    }


    @ResponseBody
    @GetMapping("/info/{advertId}")
    public R getAdvertInfo(@PathVariable("advertId") Long advertId){
        AdvertDO advertDO = advertService.getById(advertId);
        return R.ok().put("data", advertDO);
    }

    @ResponseBody
    @GetMapping("/list")
    @ApiResponses({
            @ApiResponse(code = 200, message = "请求处理成功"),
            @ApiResponse(code = 400001, message = "缺少必要的请求参数")
    })
    @ApiImplicitParams(
            @ApiImplicitParam(paramType = "query", dataType="string", name = "token", value = "访问凭证", required = true)
    )
    //@RequiresPermissions("shop:tGoods:tGoods")
    public RestResult<PageUtils> list(@RequestParam Map<String, Object> params){
        //查询列表数据
        Query query = new Query(params);
        List<AdvertDO> tGoodsList = advertService.list(query);
        int total = advertService.count(query);
        PageUtils pageUtils = new PageUtils(tGoodsList, total);
        return R.success("成功", pageUtils);
    }
}
