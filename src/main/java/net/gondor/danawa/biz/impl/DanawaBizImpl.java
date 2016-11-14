package net.gondor.danawa.biz.impl;

import net.gondor.danawa.biz.DanawaBiz;
import net.gondor.danawa.common.util.pager.Pager;
import net.gondor.danawa.common.util.pager.PagerFactory;
import net.gondor.danawa.dao.DanawaDao;
import net.gondor.danawa.vo.DanawaListVO;
import net.gondor.danawa.vo.DanawaSearchVO;
import net.gondor.danawa.vo.DanawaVO;

public class DanawaBizImpl implements DanawaBiz{
	DanawaDao danawaDao;

	public void setDanawaDao(DanawaDao danawaDao) {
		this.danawaDao = danawaDao;
	}

	@Override
	public DanawaListVO getAllDanawaList(DanawaSearchVO searchVO) {
		DanawaListVO danawaList = new DanawaListVO();
		int count = danawaDao.getDanawaCount(searchVO);
		
		Pager pager = PagerFactory.getPager(true);
		pager.setTotalArticleCount(count);
		pager.setPageNumber(searchVO.getPageNumber());
		searchVO.setStartNumber(pager.getStartArticleNumber());
		searchVO.setEndNumber(pager.getEndArticleNumber());
		
		danawaList.setDanawaList(danawaDao.getAllDanawaList(searchVO));
		danawaList.setPager(pager);
		return danawaList;
	}

	@Override
	public boolean removeDanawaById(String id) {
		// TODO Auto-generated method stub
		return danawaDao.removeDanawaById(id)>0;
	}

	@Override
	public boolean addDanawa(DanawaVO danawaVO) {
		// TODO Auto-generated method stub
		return danawaDao.addDanawa(danawaVO)>0;
	}

	@Override
	public DanawaVO getDanawaById(String id) {
		// TODO Auto-generated method stub
		return danawaDao.getDanawaById(id);
	}

	@Override
	public boolean editDanawa(DanawaVO danawaVO) {
		// TODO Auto-generated method stub
		return danawaDao.editDanawa(danawaVO)>0;
	}
	
	
}
