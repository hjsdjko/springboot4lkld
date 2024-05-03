package com.entity.view;

import com.entity.DiscusswenzhangzhuanlanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 文章专栏评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-01-05 19:42:09
 */
@TableName("discusswenzhangzhuanlan")
public class DiscusswenzhangzhuanlanView  extends DiscusswenzhangzhuanlanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusswenzhangzhuanlanView(){
	}
 
 	public DiscusswenzhangzhuanlanView(DiscusswenzhangzhuanlanEntity discusswenzhangzhuanlanEntity){
 	try {
			BeanUtils.copyProperties(this, discusswenzhangzhuanlanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
