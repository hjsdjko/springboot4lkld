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


import com.dao.HuiyuanfenxiangDao;
import com.entity.HuiyuanfenxiangEntity;
import com.service.HuiyuanfenxiangService;
import com.entity.vo.HuiyuanfenxiangVO;
import com.entity.view.HuiyuanfenxiangView;

@Service("huiyuanfenxiangService")
public class HuiyuanfenxiangServiceImpl extends ServiceImpl<HuiyuanfenxiangDao, HuiyuanfenxiangEntity> implements HuiyuanfenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HuiyuanfenxiangEntity> page = this.selectPage(
                new Query<HuiyuanfenxiangEntity>(params).getPage(),
                new EntityWrapper<HuiyuanfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HuiyuanfenxiangEntity> wrapper) {
		  Page<HuiyuanfenxiangView> page =new Query<HuiyuanfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HuiyuanfenxiangVO> selectListVO(Wrapper<HuiyuanfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HuiyuanfenxiangVO selectVO(Wrapper<HuiyuanfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HuiyuanfenxiangView> selectListView(Wrapper<HuiyuanfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HuiyuanfenxiangView selectView(Wrapper<HuiyuanfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
