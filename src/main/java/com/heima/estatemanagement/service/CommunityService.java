package com.heima.estatemanagement.service;

import com.github.pagehelper.Page;
import com.heima.estatemanagement.domain.Community;
import java.util.List;
import java.util.Map;

/**
 * @Author codeCoffeeSxs
 * @Date 2023/3/16 18:36
 * @Version 1.0
 * @Description：
 */
public interface CommunityService {

    public  List<Community> findAll();

    /*
    * 分页page
    * */
    public Page<Community> search(Map searchMap);

}
