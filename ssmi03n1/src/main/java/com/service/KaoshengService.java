package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshengView;


/**
 * 考生
 *
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
public interface KaoshengService extends IService<KaoshengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshengVO> selectListVO(Wrapper<KaoshengEntity> wrapper);
   	
   	KaoshengVO selectVO(@Param("ew") Wrapper<KaoshengEntity> wrapper);
   	
   	List<KaoshengView> selectListView(Wrapper<KaoshengEntity> wrapper);
   	
   	KaoshengView selectView(@Param("ew") Wrapper<KaoshengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshengEntity> wrapper);
   	
}

