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


import com.dao.KaoshengDao;
import com.entity.KaoshengEntity;
import com.service.KaoshengService;
import com.entity.vo.KaoshengVO;
import com.entity.view.KaoshengView;

@Service("kaoshengService")
public class KaoshengServiceImpl extends ServiceImpl<KaoshengDao, KaoshengEntity> implements KaoshengService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KaoshengEntity> page = this.selectPage(
                new Query<KaoshengEntity>(params).getPage(),
                new EntityWrapper<KaoshengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KaoshengEntity> wrapper) {
		  Page<KaoshengView> page =new Query<KaoshengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KaoshengVO> selectListVO(Wrapper<KaoshengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KaoshengVO selectVO(Wrapper<KaoshengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KaoshengView> selectListView(Wrapper<KaoshengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KaoshengView selectView(Wrapper<KaoshengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
