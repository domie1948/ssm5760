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
 * 考生
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
@TableName("kaosheng")
public class KaoshengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KaoshengEntity() {
		
	}
	
	public KaoshengEntity(T t) {
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
	 * 考生账号
	 */
					
	private String kaoshengzhanghao;
	
	/**
	 * 考生姓名
	 */
					
	private String kaoshengxingming;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 邮箱
	 */
					
	private String youxiang;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 专业
	 */
					
	private String zhuanye;
	
	/**
	 * 省份
	 */
					
	private String shengfen;
	
	/**
	 * 学校
	 */
					
	private String xuexiao;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：邮箱
	 */
	public void setYouxiang(String youxiang) {
		this.youxiang = youxiang;
	}
	/**
	 * 获取：邮箱
	 */
	public String getYouxiang() {
		return youxiang;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：专业
	 */
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
	/**
	 * 设置：省份
	 */
	public void setShengfen(String shengfen) {
		this.shengfen = shengfen;
	}
	/**
	 * 获取：省份
	 */
	public String getShengfen() {
		return shengfen;
	}
	/**
	 * 设置：学校
	 */
	public void setXuexiao(String xuexiao) {
		this.xuexiao = xuexiao;
	}
	/**
	 * 获取：学校
	 */
	public String getXuexiao() {
		return xuexiao;
	}

}
