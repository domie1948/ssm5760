package com.dao;

import com.entity.JibiezhuanyeEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JibiezhuanyeVO;
import com.entity.view.JibiezhuanyeView;


/**
 * 级别专业
 * 
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
public interface JibiezhuanyeDao extends BaseMapper<JibiezhuanyeEntity> {
	
	List<JibiezhuanyeVO> selectListVO(@Param("ew") Wrapper<JibiezhuanyeEntity> wrapper);
	
	JibiezhuanyeVO selectVO(@Param("ew") Wrapper<JibiezhuanyeEntity> wrapper);
	
	List<JibiezhuanyeView> selectListView(@Param("ew") Wrapper<JibiezhuanyeEntity> wrapper);

	List<JibiezhuanyeView> selectListView(Pagination page,@Param("ew") Wrapper<JibiezhuanyeEntity> wrapper);
	
	JibiezhuanyeView selectView(@Param("ew") Wrapper<JibiezhuanyeEntity> wrapper);
	
}
