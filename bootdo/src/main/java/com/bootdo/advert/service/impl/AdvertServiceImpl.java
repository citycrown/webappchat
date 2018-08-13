package com.bootdo.advert.service.impl;

import com.bootdo.advert.dao.AdvertDao;
import com.bootdo.advert.domain.AdvertDO;
import com.bootdo.advert.service.AdvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
@Service
public class AdvertServiceImpl implements AdvertService {

    @Autowired
    private AdvertDao advertMapper;

    @Override
    public AdvertDO getById(Long cid){
        return advertMapper.getById(cid);
    }

    @Override
    public List<AdvertDO> list (Map<String, Object> map){
        return advertMapper.list(map);
    }

    @Override
    public int count(Map<String, Object> map){
        return advertMapper.count(map);
    }

}
