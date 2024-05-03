package com.dao;

import com.entity.DiscussremendongmanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussremendongmanVO;
import com.entity.view.DiscussremendongmanView;


/**
 * 热门动漫评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:42:09
 */
public interface DiscussremendongmanDao extends BaseMapper<DiscussremendongmanEntity> {
	
	List<DiscussremendongmanVO> selectListVO(@Param("ew") Wrapper<DiscussremendongmanEntity> wrapper);
	
	DiscussremendongmanVO selectVO(@Param("ew") Wrapper<DiscussremendongmanEntity> wrapper);
	
	List<DiscussremendongmanView> selectListView(@Param("ew") Wrapper<DiscussremendongmanEntity> wrapper);

	List<DiscussremendongmanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussremendongmanEntity> wrapper);
	
	DiscussremendongmanView selectView(@Param("ew") Wrapper<DiscussremendongmanEntity> wrapper);
	
}
