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

    @RequestBody
    @GetMapping("/info")
    public AdvertDO getAdvertInfo(@PathVariable("advertId") Long advertId){
        return advertService.getById(advertId);
    }
}
