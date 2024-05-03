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


import com.dao.DiscusshuiyuanfenxiangDao;
import com.entity.DiscusshuiyuanfenxiangEntity;
import com.service.DiscusshuiyuanfenxiangService;
import com.entity.vo.DiscusshuiyuanfenxiangVO;
import com.entity.view.DiscusshuiyuanfenxiangView;

@Service("discusshuiyuanfenxiangService")
public class DiscusshuiyuanfenxiangServiceImpl extends ServiceImpl<DiscusshuiyuanfenxiangDao, DiscusshuiyuanfenxiangEntity> implements DiscusshuiyuanfenxiangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshuiyuanfenxiangEntity> page = this.selectPage(
                new Query<DiscusshuiyuanfenxiangEntity>(params).getPage(),
                new EntityWrapper<DiscusshuiyuanfenxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshuiyuanfenxiangEntity> wrapper) {
		  Page<DiscusshuiyuanfenxiangView> page =new Query<DiscusshuiyuanfenxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshuiyuanfenxiangVO> selectListVO(Wrapper<DiscusshuiyuanfenxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshuiyuanfenxiangVO selectVO(Wrapper<DiscusshuiyuanfenxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshuiyuanfenxiangView> selectListView(Wrapper<DiscusshuiyuanfenxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshuiyuanfenxiangView selectView(Wrapper<DiscusshuiyuanfenxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
