package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscusswenzhangzhuanlanDao;
import com.entity.DiscusswenzhangzhuanlanEntity;
import com.service.DiscusswenzhangzhuanlanService;
import com.entity.vo.DiscusswenzhangzhuanlanVO;
import com.entity.view.DiscusswenzhangzhuanlanView;

@Service("discusswenzhangzhuanlanService")
public class DiscusswenzhangzhuanlanServiceImpl extends ServiceImpl<DiscusswenzhangzhuanlanDao, DiscusswenzhangzhuanlanEntity> implements DiscusswenzhangzhuanlanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusswenzhangzhuanlanEntity> page = this.selectPage(
                new Query<DiscusswenzhangzhuanlanEntity>(params).getPage(),
                new EntityWrapper<DiscusswenzhangzhuanlanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusswenzhangzhuanlanEntity> wrapper) {
		  Page<DiscusswenzhangzhuanlanView> page =new Query<DiscusswenzhangzhuanlanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusswenzhangzhuanlanVO> selectListVO(Wrapper<DiscusswenzhangzhuanlanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusswenzhangzhuanlanVO selectVO(Wrapper<DiscusswenzhangzhuanlanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusswenzhangzhuanlanView> selectListView(Wrapper<DiscusswenzhangzhuanlanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusswenzhangzhuanlanView selectView(Wrapper<DiscusswenzhangzhuanlanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
