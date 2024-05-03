package com.dao;

import com.entity.DiscusswenzhangzhuanlanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusswenzhangzhuanlanVO;
import com.entity.view.DiscusswenzhangzhuanlanView;


/**
 * 文章专栏评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:42:09
 */
public interface DiscusswenzhangzhuanlanDao extends BaseMapper<DiscusswenzhangzhuanlanEntity> {
	
	List<DiscusswenzhangzhuanlanVO> selectListVO(@Param("ew") Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
	
	DiscusswenzhangzhuanlanVO selectVO(@Param("ew") Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
	
	List<DiscusswenzhangzhuanlanView> selectListView(@Param("ew") Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);

	List<DiscusswenzhangzhuanlanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
	
	DiscusswenzhangzhuanlanView selectView(@Param("ew") Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
	
}
