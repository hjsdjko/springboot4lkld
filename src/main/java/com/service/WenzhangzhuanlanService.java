package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WenzhangzhuanlanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WenzhangzhuanlanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WenzhangzhuanlanView;


/**
 * 文章专栏
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:42:08
 */
public interface WenzhangzhuanlanService extends IService<WenzhangzhuanlanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WenzhangzhuanlanVO> selectListVO(Wrapper<WenzhangzhuanlanEntity> wrapper);
   	
   	WenzhangzhuanlanVO selectVO(@Param("ew") Wrapper<WenzhangzhuanlanEntity> wrapper);
   	
   	List<WenzhangzhuanlanView> selectListView(Wrapper<WenzhangzhuanlanEntity> wrapper);
   	
   	WenzhangzhuanlanView selectView(@Param("ew") Wrapper<WenzhangzhuanlanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WenzhangzhuanlanEntity> wrapper);
   	
}

