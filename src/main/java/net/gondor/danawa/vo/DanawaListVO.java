package net.gondor.danawa.vo;

import java.util.List;

import net.gondor.danawa.common.util.pager.Pager;

public class DanawaListVO {
	List<DanawaVO> danawaList;
	
	Pager pager;



	public List<DanawaVO> getDanawaList() {
		return danawaList;
	}

	public void setDanawaList(List<DanawaVO> danawaList) {
		this.danawaList = danawaList;
	}

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}
	
	
	
}
