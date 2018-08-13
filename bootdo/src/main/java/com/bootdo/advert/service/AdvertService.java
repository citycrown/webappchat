package com.bootdo.advert.service;

import com.bootdo.advert.domain.AdvertDO;

import java.util.List;
import java.util.Map;

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

    /**
     * 分页查询
     */
    List<AdvertDO> list(Map<String, Object> map);

    /**
     * 总条数
     */
    int count(Map<String, Object> map);

}
