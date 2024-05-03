package com.entity.view;

import com.entity.DongmanfenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 动漫分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 19:42:08
 */
@TableName("dongmanfenlei")
public class DongmanfenleiView  extends DongmanfenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DongmanfenleiView(){
	}
 
 	public DongmanfenleiView(DongmanfenleiEntity dongmanfenleiEntity){
 	try {
			BeanUtils.copyProperties(this, dongmanfenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
