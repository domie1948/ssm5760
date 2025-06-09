package com.entity.vo;

import com.entity.KaoshengchengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 考生成绩
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
public class KaoshengchengjiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
