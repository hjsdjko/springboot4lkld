package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HuiyuanfenxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HuiyuanfenxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HuiyuanfenxiangView;


/**
 * 会员分享
 *
 * @author 
 * @email 
 * @date 2021-01-05 19:42:08
 */
public interface HuiyuanfenxiangService extends IService<HuiyuanfenxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HuiyuanfenxiangVO> selectListVO(Wrapper<HuiyuanfenxiangEntity> wrapper);
   	
   	HuiyuanfenxiangVO selectVO(@Param("ew") Wrapper<HuiyuanfenxiangEntity> wrapper);
   	
   	List<HuiyuanfenxiangView> selectListView(Wrapper<HuiyuanfenxiangEntity> wrapper);
   	
   	HuiyuanfenxiangView selectView(@Param("ew") Wrapper<HuiyuanfenxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HuiyuanfenxiangEntity> wrapper);
   	
}

