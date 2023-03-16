package com.heima.estatemanagement.service.Impl;

import com.heima.estatemanagement.domain.Community;
import com.heima.estatemanagement.service.CommunityService;
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
    @Override
    public List<Community> findAll() {
        ArrayList<Community> list = new ArrayList<Community>();
        Community community = new Community();
        community.setId(121);
        community.setName("社区1");
        list.add(community);
        return list;
    }
}
