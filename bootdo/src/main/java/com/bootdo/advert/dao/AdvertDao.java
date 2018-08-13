package com.bootdo.advert.dao;

import com.bootdo.advert.domain.AdvertDO;
import com.bootdo.shop.domain.TGoodsDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

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

    /**
     * 分页查询列表
     * @param map
     * @return
     */
    List<AdvertDO> list(Map<String, Object> map);

    /**
     * 总条数
     * @param map
     * @return
     */
    int count(Map<String, Object> map);
}
