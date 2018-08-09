package com.bootdo.advert.dao;

import com.bootdo.advert.domain.AdvertDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * 广告
 * <p>
 *
 * @author ：陈冕
 * @version : 1.0.0
 * @date : 2018/8/7
 */
@Mapper
public interface AdvertDao {

    /**
     * 根据id查询
     */
    AdvertDO getById(Long id);
}
