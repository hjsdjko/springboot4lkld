package com.dao;

import com.entity.HuiyuanfenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HuiyuanfenxiangVO;
import com.entity.view.HuiyuanfenxiangView;


/**
 * 会员分享
 * 
 * @author 
 * @email 
 * @date 2021-01-05 19:42:08
 */
public interface HuiyuanfenxiangDao extends BaseMapper<HuiyuanfenxiangEntity> {
	
	List<HuiyuanfenxiangVO> selectListVO(@Param("ew") Wrapper<HuiyuanfenxiangEntity> wrapper);
	
	HuiyuanfenxiangVO selectVO(@Param("ew") Wrapper<HuiyuanfenxiangEntity> wrapper);
	
	List<HuiyuanfenxiangView> selectListView(@Param("ew") Wrapper<HuiyuanfenxiangEntity> wrapper);

	List<HuiyuanfenxiangView> selectListView(Pagination page,@Param("ew") Wrapper<HuiyuanfenxiangEntity> wrapper);
	
	HuiyuanfenxiangView selectView(@Param("ew") Wrapper<HuiyuanfenxiangEntity> wrapper);
	
}
