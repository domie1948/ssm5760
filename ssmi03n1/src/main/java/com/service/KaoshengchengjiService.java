package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KaoshengchengjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KaoshengchengjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KaoshengchengjiView;


/**
 * 考生成绩
 *
 * @author 
 * @email 
 * @date 2021-01-27 17:09:55
 */
public interface KaoshengchengjiService extends IService<KaoshengchengjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KaoshengchengjiVO> selectListVO(Wrapper<KaoshengchengjiEntity> wrapper);
   	
   	KaoshengchengjiVO selectVO(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
   	
   	List<KaoshengchengjiView> selectListView(Wrapper<KaoshengchengjiEntity> wrapper);
   	
   	KaoshengchengjiView selectView(@Param("ew") Wrapper<KaoshengchengjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KaoshengchengjiEntity> wrapper);
   	
}

