package com.entity.model;

import com.entity.JibiezhuanyeEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 级别专业
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
public class JibiezhuanyeModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 专业名称
	 */
	
	private String zhuanyemingcheng;
		
	/**
	 * 封面
	 */
	
	private String fengmian;
		
	/**
	 * 年龄要求
	 */
	
	private String nianlingyaoqiu;
		
	/**
	 * 考试地址
	 */
	
	private String kaoshidizhi;
		
	/**
	 * 报考费用
	 */
	
	private String baokaofeiyong;
		
	/**
	 * 考试时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaoshishijian;
		
	/**
	 * 报考条件
	 */
	
	private String baokaotiaojian;
		
	/**
	 * 倒计结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date reversetime;
				
	
	/**
	 * 设置：专业名称
	 */
	 
	public void setZhuanyemingcheng(String zhuanyemingcheng) {
		this.zhuanyemingcheng = zhuanyemingcheng;
	}
	
	/**
	 * 获取：专业名称
	 */
	public String getZhuanyemingcheng() {
		return zhuanyemingcheng;
	}
				
	
	/**
	 * 设置：封面
	 */
	 
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
				
	
	/**
	 * 设置：年龄要求
	 */
	 
	public void setNianlingyaoqiu(String nianlingyaoqiu) {
		this.nianlingyaoqiu = nianlingyaoqiu;
	}
	
	/**
	 * 获取：年龄要求
	 */
	public String getNianlingyaoqiu() {
		return nianlingyaoqiu;
	}
				
	
	/**
	 * 设置：考试地址
	 */
	 
	public void setKaoshidizhi(String kaoshidizhi) {
		this.kaoshidizhi = kaoshidizhi;
	}
	
	/**
	 * 获取：考试地址
	 */
	public String getKaoshidizhi() {
		return kaoshidizhi;
	}
				
	
	/**
	 * 设置：报考费用
	 */
	 
	public void setBaokaofeiyong(String baokaofeiyong) {
		this.baokaofeiyong = baokaofeiyong;
	}
	
	/**
	 * 获取：报考费用
	 */
	public String getBaokaofeiyong() {
		return baokaofeiyong;
	}
				
	
	/**
	 * 设置：考试时间
	 */
	 
	public void setKaoshishijian(Date kaoshishijian) {
		this.kaoshishijian = kaoshishijian;
	}
	
	/**
	 * 获取：考试时间
	 */
	public Date getKaoshishijian() {
		return kaoshishijian;
	}
				
	
	/**
	 * 设置：报考条件
	 */
	 
	public void setBaokaotiaojian(String baokaotiaojian) {
		this.baokaotiaojian = baokaotiaojian;
	}
	
	/**
	 * 获取：报考条件
	 */
	public String getBaokaotiaojian() {
		return baokaotiaojian;
	}
				
	
	/**
	 * 设置：倒计结束时间
	 */
	 
	public void setReversetime(Date reversetime) {
		this.reversetime = reversetime;
	}
	
	/**
	 * 获取：倒计结束时间
	 */
	public Date getReversetime() {
		return reversetime;
	}
			
}
