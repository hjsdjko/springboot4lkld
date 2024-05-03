package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshuiyuanfenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshuiyuanfenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshuiyuanfenxiangView;


/**
 * 会员分享评论表
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:42:09
 */
public interface DiscusshuiyuanfenxiangService extends IService<DiscusshuiyuanfenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshuiyuanfenxiangVO> selectListVO(Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
   	
   	DiscusshuiyuanfenxiangVO selectVO(@Param("ew") Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
   	
   	List<DiscusshuiyuanfenxiangView> selectListView(Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
   	
   	DiscusshuiyuanfenxiangView selectView(@Param("ew") Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshuiyuanfenxiangEntity> wrapper);
   	
}

