package com.heima.estatemanagement.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.heima.estatemanagement.dao.CommunityMapper;
import com.heima.estatemanagement.domain.Community;
import com.heima.estatemanagement.service.CommunityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.util.StringUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @Override
    public Page<Community> search(Map searchMap) {
        /*
        *tkmapper通用多条件查询，标准写法
        * 1.初始化分页条件
        *pageNum第几页
        * pageSize每页条数
        *
         */
        Example example = new Example(Community.class);//制定查询的表tb_community
        int pageNum = 1;
        int pageSize = 2;
        if (searchMap != null) {
            Example.Criteria criteria = example.createCriteria();
            if (StringUtil.isNotEmpty((String) searchMap.get("startTime"))) {
                /*
                * 如果前端传来的参数不为空，是startTime
                * 那么这个时间要在create_time(表字段是这个)  update_time之间
                * 转化成实体类的属性，去掉下划线并驼峰
                * */
                criteria.andGreaterThanOrEqualTo("createTime", searchMap.get("startTime"));
            }
            if (StringUtil.isNotEmpty((String) searchMap.get("endTime"))) {
                criteria.andLessThanOrEqualTo("createTime", searchMap.get("endTime"));
            }
            /*
            * 小区名称，模糊查询,,模糊搜索，前后加百分号
            * */
            if (StringUtil.isNotEmpty((String) searchMap.get("name"))) {
                criteria.andLike("name", "%"+(String) searchMap.get("name")+"%");
            }
            /*
            * 分页条件
            * */
            if (StringUtil.isNotEmpty((String) searchMap.get("pageNum"))) {
                pageNum = Integer.parseInt((String) searchMap.get("pageNum")) ;
            }
            if (StringUtil.isNotEmpty((String) searchMap.get("pageSize"))) {
                pageSize = Integer.parseInt((String) searchMap.get("pageSize")) ;
            }
            
        }

        /*
        * 然后再引入dao
        * 分页条件
        * */
        PageHelper.startPage(pageNum,pageSize);
        Page<Community> communities = (Page<Community>) communityMapper.selectByExample(example);
        return communities;
    }


}
