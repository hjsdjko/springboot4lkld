package com.dao;

import com.entity.RemendongmanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RemendongmanVO;
import com.entity.view.RemendongmanView;


/**
 * 热门动漫
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:42:08
 */
public interface RemendongmanDao extends BaseMapper<RemendongmanEntity> {
	
	List<RemendongmanVO> selectListVO(@Param("ew") Wrapper<RemendongmanEntity> wrapper);
	
	RemendongmanVO selectVO(@Param("ew") Wrapper<RemendongmanEntity> wrapper);
	
	List<RemendongmanView> selectListView(@Param("ew") Wrapper<RemendongmanEntity> wrapper);

	List<RemendongmanView> selectListView(Pagination page,@Param("ew") Wrapper<RemendongmanEntity> wrapper);
	
	RemendongmanView selectView(@Param("ew") Wrapper<RemendongmanEntity> wrapper);
	
}
