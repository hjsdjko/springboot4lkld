package com.dao;

import com.entity.DiscusshuiyuanfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshuiyuanfenxiangVO;
import com.entity.view.DiscusshuiyuanfenxiangView;


/**
 * 会员分享评论表
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:42:09
 */
public interface DiscusshuiyuanfenxiangDao extends BaseMapper<DiscusshuiyuanfenxiangEntity> {
	
	List<DiscusshuiyuanfenxiangVO> selectListVO(@Param("ew") Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
	
	DiscusshuiyuanfenxiangVO selectVO(@Param("ew") Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
	
	List<DiscusshuiyuanfenxiangView> selectListView(@Param("ew") Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);

	List<DiscusshuiyuanfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
	
	DiscusshuiyuanfenxiangView selectView(@Param("ew") Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
	
}
