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


import com.dao.DiscussremendongmanDao;
import com.entity.DiscussremendongmanEntity;
import com.service.DiscussremendongmanService;
import com.entity.vo.DiscussremendongmanVO;
import com.entity.view.DiscussremendongmanView;

@Service("discussremendongmanService")
public class DiscussremendongmanServiceImpl extends ServiceImpl<DiscussremendongmanDao, DiscussremendongmanEntity> implements DiscussremendongmanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussremendongmanEntity> page = this.selectPage(
                new Query<DiscussremendongmanEntity>(params).getPage(),
                new EntityWrapper<DiscussremendongmanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussremendongmanEntity> wrapper) {
		  Page<DiscussremendongmanView> page =new Query<DiscussremendongmanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussremendongmanVO> selectListVO(Wrapper<DiscussremendongmanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussremendongmanVO selectVO(Wrapper<DiscussremendongmanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussremendongmanView> selectListView(Wrapper<DiscussremendongmanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussremendongmanView selectView(Wrapper<DiscussremendongmanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
