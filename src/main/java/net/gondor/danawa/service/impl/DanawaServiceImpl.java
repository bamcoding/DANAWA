package net.gondor.danawa.service.impl;

import net.gondor.danawa.biz.DanawaBiz;
import net.gondor.danawa.service.DanawaService;
import net.gondor.danawa.vo.DanawaListVO;
import net.gondor.danawa.vo.DanawaSearchVO;
import net.gondor.danawa.vo.DanawaVO;

public class DanawaServiceImpl implements DanawaService{
	DanawaBiz danawaBiz;

	public void setDanawaBiz(DanawaBiz danawaBiz) {
		this.danawaBiz = danawaBiz;
	}

	@Override
	public DanawaListVO getAllDanawaList(DanawaSearchVO searchVO) {
		// TODO Auto-generated method stub
		return danawaBiz.getAllDanawaList(searchVO);
	}

	@Override
	public boolean removeDanawaById(String id) {
		// TODO Auto-generated method stub
		return danawaBiz.removeDanawaById(id);
	}

	@Override
	public boolean addDanawa(DanawaVO danawaVO) {
		// TODO Auto-generated method stub
		return danawaBiz.addDanawa(danawaVO);
	}

	@Override
	public DanawaVO getDanawaById(String id) {
		// TODO Auto-generated method stub
		return danawaBiz.getDanawaById(id);
	}

	@Override
	public boolean editDanawa(DanawaVO danawaVO) {
		// TODO Auto-generated method stub
		return danawaBiz.editDanawa(danawaVO);
	}
	
	
}
