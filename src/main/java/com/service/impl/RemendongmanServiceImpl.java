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


import com.dao.RemendongmanDao;
import com.entity.RemendongmanEntity;
import com.service.RemendongmanService;
import com.entity.vo.RemendongmanVO;
import com.entity.view.RemendongmanView;

@Service("remendongmanService")
public class RemendongmanServiceImpl extends ServiceImpl<RemendongmanDao, RemendongmanEntity> implements RemendongmanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RemendongmanEntity> page = this.selectPage(
                new Query<RemendongmanEntity>(params).getPage(),
                new EntityWrapper<RemendongmanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RemendongmanEntity> wrapper) {
		  Page<RemendongmanView> page =new Query<RemendongmanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RemendongmanVO> selectListVO(Wrapper<RemendongmanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RemendongmanVO selectVO(Wrapper<RemendongmanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RemendongmanView> selectListView(Wrapper<RemendongmanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RemendongmanView selectView(Wrapper<RemendongmanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
