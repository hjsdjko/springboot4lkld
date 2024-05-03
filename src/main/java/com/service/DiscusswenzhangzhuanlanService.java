package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusswenzhangzhuanlanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusswenzhangzhuanlanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusswenzhangzhuanlanView;


/**
 * 文章专栏评论表
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:42:09
 */
public interface DiscusswenzhangzhuanlanService extends IService<DiscusswenzhangzhuanlanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusswenzhangzhuanlanVO> selectListVO(Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
   	
   	DiscusswenzhangzhuanlanVO selectVO(@Param("ew") Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
   	
   	List<DiscusswenzhangzhuanlanView> selectListView(Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
   	
   	DiscusswenzhangzhuanlanView selectView(@Param("ew") Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusswenzhangzhuanlanEntity> wrapper);
   	
}

