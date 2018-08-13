package com.bootdo.advert.controller;

import com.bootdo.advert.domain.AdvertDO;
import com.bootdo.advert.service.AdvertService;
import com.bootdo.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/index")
    public R index(){
        AdvertDO advertDO = advertService.getById(75L);
        return R.ok().put("taskScheduleJob", advertDO);
    }


    @ResponseBody
    @GetMapping("/info")
    public R getAdvertInfo(@PathVariable("advertId") Long advertId){
        AdvertDO advertDO = advertService.getById(advertId);
        return R.ok().put("taskScheduleJob", advertDO);
    }
}
