package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 级别专业
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
@TableName("jibiezhuanye")
public class JibiezhuanyeEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JibiezhuanyeEntity() {
		
	}
	
	public JibiezhuanyeEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 考试名称
	 */
					
	private String kaoshimingcheng;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：考试名称
	 */
	public void setKaoshimingcheng(String kaoshimingcheng) {
		this.kaoshimingcheng = kaoshimingcheng;
	}
	/**
	 * 获取：考试名称
	 */
	public String getKaoshimingcheng() {
		return kaoshimingcheng;
	}
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
