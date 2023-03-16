package com.heima.estatemanagement.service.Impl;

import com.heima.estatemanagement.dao.CommunityMapper;
import com.heima.estatemanagement.domain.Community;
import com.heima.estatemanagement.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author codeCoffeeSxs
 * @Date 2023/3/16 18:44
 * @Version 1.0
 * @Description：
 */
@Service
public class CommunityServiceImpl implements CommunityService {
    @Autowired
    private CommunityMapper communityMapper;
    @Override
    public List<Community> findAll() {
        List<Community> communities = communityMapper.selectAll();
        return communities;
    }
}
