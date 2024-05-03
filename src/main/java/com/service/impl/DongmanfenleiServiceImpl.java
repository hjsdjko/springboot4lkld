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


import com.dao.DongmanfenleiDao;
import com.entity.DongmanfenleiEntity;
import com.service.DongmanfenleiService;
import com.entity.vo.DongmanfenleiVO;
import com.entity.view.DongmanfenleiView;

@Service("dongmanfenleiService")
public class DongmanfenleiServiceImpl extends ServiceImpl<DongmanfenleiDao, DongmanfenleiEntity> implements DongmanfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DongmanfenleiEntity> page = this.selectPage(
                new Query<DongmanfenleiEntity>(params).getPage(),
                new EntityWrapper<DongmanfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DongmanfenleiEntity> wrapper) {
		  Page<DongmanfenleiView> page =new Query<DongmanfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DongmanfenleiVO> selectListVO(Wrapper<DongmanfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DongmanfenleiVO selectVO(Wrapper<DongmanfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DongmanfenleiView> selectListView(Wrapper<DongmanfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DongmanfenleiView selectView(Wrapper<DongmanfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
