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


import com.dao.WenzhangzhuanlanDao;
import com.entity.WenzhangzhuanlanEntity;
import com.service.WenzhangzhuanlanService;
import com.entity.vo.WenzhangzhuanlanVO;
import com.entity.view.WenzhangzhuanlanView;

@Service("wenzhangzhuanlanService")
public class WenzhangzhuanlanServiceImpl extends ServiceImpl<WenzhangzhuanlanDao, WenzhangzhuanlanEntity> implements WenzhangzhuanlanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WenzhangzhuanlanEntity> page = this.selectPage(
                new Query<WenzhangzhuanlanEntity>(params).getPage(),
                new EntityWrapper<WenzhangzhuanlanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WenzhangzhuanlanEntity> wrapper) {
		  Page<WenzhangzhuanlanView> page =new Query<WenzhangzhuanlanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WenzhangzhuanlanVO> selectListVO(Wrapper<WenzhangzhuanlanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WenzhangzhuanlanVO selectVO(Wrapper<WenzhangzhuanlanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WenzhangzhuanlanView> selectListView(Wrapper<WenzhangzhuanlanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WenzhangzhuanlanView selectView(Wrapper<WenzhangzhuanlanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
