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


import com.dao.JibiezhuanyeDao;
import com.entity.JibiezhuanyeEntity;
import com.service.JibiezhuanyeService;
import com.entity.vo.JibiezhuanyeVO;
import com.entity.view.JibiezhuanyeView;

@Service("jibiezhuanyeService")
public class JibiezhuanyeServiceImpl extends ServiceImpl<JibiezhuanyeDao, JibiezhuanyeEntity> implements JibiezhuanyeService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JibiezhuanyeEntity> page = this.selectPage(
                new Query<JibiezhuanyeEntity>(params).getPage(),
                new EntityWrapper<JibiezhuanyeEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JibiezhuanyeEntity> wrapper) {
		  Page<JibiezhuanyeView> page =new Query<JibiezhuanyeView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JibiezhuanyeVO> selectListVO(Wrapper<JibiezhuanyeEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JibiezhuanyeVO selectVO(Wrapper<JibiezhuanyeEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JibiezhuanyeView> selectListView(Wrapper<JibiezhuanyeEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JibiezhuanyeView selectView(Wrapper<JibiezhuanyeEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
