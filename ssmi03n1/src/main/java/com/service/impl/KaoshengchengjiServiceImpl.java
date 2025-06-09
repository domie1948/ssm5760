package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.KaoshengchengjiDao;
import com.entity.KaoshengchengjiEntity;
import com.service.KaoshengchengjiService;
import com.entity.vo.KaoshengchengjiVO;
import com.entity.view.KaoshengchengjiView;

@Service("kaoshengchengjiService")
public class KaoshengchengjiServiceImpl extends ServiceImpl<KaoshengchengjiDao, KaoshengchengjiEntity> implements KaoshengchengjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshengchengjiEntity> page = this.selectPage(
                new Query<KaoshengchengjiEntity>(params).getPage(),
                new EntityWrapper<KaoshengchengjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshengchengjiEntity> wrapper) {
		  Page<KaoshengchengjiView> page =new Query<KaoshengchengjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshengchengjiVO> selectListVO(Wrapper<KaoshengchengjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshengchengjiVO selectVO(Wrapper<KaoshengchengjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshengchengjiView> selectListView(Wrapper<KaoshengchengjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshengchengjiView selectView(Wrapper<KaoshengchengjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
