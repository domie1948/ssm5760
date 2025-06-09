package com.entity.vo;

import com.entity.BaomingxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 报名信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
public class BaomingxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 考试时间
	 */
	
	private String kaoshishijian;
		
	/**
	 * 考生号
	 */
	
	private String kaoshenghao;
		
	/**
	 * 报考费用
	 */
	
	private String baokaofeiyong;
		
	/**
	 * 考试地址
	 */
	
	private String kaoshidizhi;
		
	/**
	 * 专业名称
	 */
	
	private String zhuanyemingcheng;
		
	/**
	 * 考生账号
	 */
	
	private String kaoshengzhanghao;
		
	/**
	 * 考生姓名
	 */
	
	private String kaoshengxingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
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
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 头像
	 */
	
	private String touxiang;
		
	/**
	 * 报名时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date baomingshijian;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：考试时间
	 */
	 
	public void setKaoshishijian(String kaoshishijian) {
		this.kaoshishijian = kaoshishijian;
	}
	
	/**
	 * 获取：考试时间
	 */
	public String getKaoshishijian() {
		return kaoshishijian;
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
	 * 设置：报名时间
	 */
	 
	public void setBaomingshijian(Date baomingshijian) {
		this.baomingshijian = baomingshijian;
	}
	
	/**
	 * 获取：报名时间
	 */
	public Date getBaomingshijian() {
		return baomingshijian;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}
