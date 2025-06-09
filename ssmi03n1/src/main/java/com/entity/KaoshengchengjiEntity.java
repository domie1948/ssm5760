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
 * 考生成绩
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
@TableName("kaoshengchengji")
public class KaoshengchengjiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoshengchengjiEntity() {
		
	}
	
	public KaoshengchengjiEntity(T t) {
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
	 * 考生号
	 */
					
	private String kaoshenghao;
	
	/**
	 * 考生账号
	 */
					
	private String kaoshengzhanghao;
	
	/**
	 * 考生姓名
	 */
					
	private String kaoshengxingming;
	
	/**
	 * 考生成绩
	 */
					
	private String kaoshengchengji;
	
	/**
	 * 评语
	 */
					
	private String pingyu;
	
	/**
	 * 登记时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date dengjishijian;
	
	
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
	 * 设置：考生号
	 */
	public void setKaoshenghao(String kaoshenghao) {
		this.kaoshenghao = kaoshenghao;
	}
	/**
	 * 获取：考生号
	 */
	public String getKaoshenghao() {
		return kaoshenghao;
	}
	/**
	 * 设置：考生账号
	 */
	public void setKaoshengzhanghao(String kaoshengzhanghao) {
		this.kaoshengzhanghao = kaoshengzhanghao;
	}
	/**
	 * 获取：考生账号
	 */
	public String getKaoshengzhanghao() {
		return kaoshengzhanghao;
	}
	/**
	 * 设置：考生姓名
	 */
	public void setKaoshengxingming(String kaoshengxingming) {
		this.kaoshengxingming = kaoshengxingming;
	}
	/**
	 * 获取：考生姓名
	 */
	public String getKaoshengxingming() {
		return kaoshengxingming;
	}
	/**
	 * 设置：考生成绩
	 */
	public void setKaoshengchengji(String kaoshengchengji) {
		this.kaoshengchengji = kaoshengchengji;
	}
	/**
	 * 获取：考生成绩
	 */
	public String getKaoshengchengji() {
		return kaoshengchengji;
	}
	/**
	 * 设置：评语
	 */
	public void setPingyu(String pingyu) {
		this.pingyu = pingyu;
	}
	/**
	 * 获取：评语
	 */
	public String getPingyu() {
		return pingyu;
	}
	/**
	 * 设置：登记时间
	 */
	public void setDengjishijian(Date dengjishijian) {
		this.dengjishijian = dengjishijian;
	}
	/**
	 * 获取：登记时间
	 */
	public Date getDengjishijian() {
		return dengjishijian;
	}

}
