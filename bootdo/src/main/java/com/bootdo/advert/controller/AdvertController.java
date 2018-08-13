package com.bootdo.advert.controller;

import com.bootdo.advert.service.AdvertService;
import com.bootdo.common.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    /**
     * 广告详情
     *
     * @param advertId 广告id
     * @return
     */
    @ResponseBody
    @GetMapping("/info")
    public R getAdvertInfo(@PathVariable("advertId") Long advertId){
        return R.ok().put("data",advertService.getById(advertId));
    }
}
