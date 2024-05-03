package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussremendongmanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussremendongmanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussremendongmanView;


/**
 * 热门动漫评论表
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:42:09
 */
public interface DiscussremendongmanService extends IService<DiscussremendongmanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussremendongmanVO> selectListVO(Wrapper<DiscussremendongmanEntity> wrapper);
   	
   	DiscussremendongmanVO selectVO(@Param("ew") Wrapper<DiscussremendongmanEntity> wrapper);
   	
   	List<DiscussremendongmanView> selectListView(Wrapper<DiscussremendongmanEntity> wrapper);
   	
   	DiscussremendongmanView selectView(@Param("ew") Wrapper<DiscussremendongmanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussremendongmanEntity> wrapper);
   	
}

