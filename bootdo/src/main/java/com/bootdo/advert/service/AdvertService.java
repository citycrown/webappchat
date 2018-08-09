package com.bootdo.advert.service;

import com.bootdo.advert.domain.AdvertDO;

/**
 * 广告管理
 * <p>
 *
 * @author ：陈冕
 * @version : 1.0.0
 * @date : 2018/8/8
 */
public interface AdvertService {

    /**
     * 根据id查询
     */
    AdvertDO getById(Long id);
}
