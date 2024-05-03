package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DongmanfenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DongmanfenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DongmanfenleiView;


/**
 * 动漫分类
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:42:08
 */
public interface DongmanfenleiService extends IService<DongmanfenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DongmanfenleiVO> selectListVO(Wrapper<DongmanfenleiEntity> wrapper);
   	
   	DongmanfenleiVO selectVO(@Param("ew") Wrapper<DongmanfenleiEntity> wrapper);
   	
   	List<DongmanfenleiView> selectListView(Wrapper<DongmanfenleiEntity> wrapper);
   	
   	DongmanfenleiView selectView(@Param("ew") Wrapper<DongmanfenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DongmanfenleiEntity> wrapper);
   	
}

