package com.dao;

import com.entity.WenzhangzhuanlanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WenzhangzhuanlanVO;
import com.entity.view.WenzhangzhuanlanView;


/**
 * 文章专栏
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:42:08
 */
public interface WenzhangzhuanlanDao extends BaseMapper<WenzhangzhuanlanEntity> {
	
	List<WenzhangzhuanlanVO> selectListVO(@Param("ew") Wrapper<WenzhangzhuanlanEntity> wrapper);
	
	WenzhangzhuanlanVO selectVO(@Param("ew") Wrapper<WenzhangzhuanlanEntity> wrapper);
	
	List<WenzhangzhuanlanView> selectListView(@Param("ew") Wrapper<WenzhangzhuanlanEntity> wrapper);

	List<WenzhangzhuanlanView> selectListView(Pagination page,@Param("ew") Wrapper<WenzhangzhuanlanEntity> wrapper);
	
	WenzhangzhuanlanView selectView(@Param("ew") Wrapper<WenzhangzhuanlanEntity> wrapper);
	
}
