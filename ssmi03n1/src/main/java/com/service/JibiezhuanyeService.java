package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JibiezhuanyeEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JibiezhuanyeVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JibiezhuanyeView;


/**
 * 级别专业
 *
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
public interface JibiezhuanyeService extends IService<JibiezhuanyeEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JibiezhuanyeVO> selectListVO(Wrapper<JibiezhuanyeEntity> wrapper);
   	
   	JibiezhuanyeVO selectVO(@Param("ew") Wrapper<JibiezhuanyeEntity> wrapper);
   	
   	List<JibiezhuanyeView> selectListView(Wrapper<JibiezhuanyeEntity> wrapper);
   	
   	JibiezhuanyeView selectView(@Param("ew") Wrapper<JibiezhuanyeEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JibiezhuanyeEntity> wrapper);
   	
}

