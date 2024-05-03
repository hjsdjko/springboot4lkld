package com.entity.view;

import com.entity.WenzhangzhuanlanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文章专栏
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 19:42:08
 */
@TableName("wenzhangzhuanlan")
public class WenzhangzhuanlanView  extends WenzhangzhuanlanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WenzhangzhuanlanView(){
	}
 
 	public WenzhangzhuanlanView(WenzhangzhuanlanEntity wenzhangzhuanlanEntity){
 	try {
			BeanUtils.copyProperties(this, wenzhangzhuanlanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
