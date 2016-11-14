package net.gondor.danawa.biz;

import net.gondor.danawa.vo.DanawaListVO;
import net.gondor.danawa.vo.DanawaSearchVO;
import net.gondor.danawa.vo.DanawaVO;

public interface DanawaBiz {

	public DanawaListVO getAllDanawaList(DanawaSearchVO searchVO);

	public boolean removeDanawaById(String id);

	public boolean addDanawa(DanawaVO danawaVO);

	public DanawaVO getDanawaById(String id);

	public boolean editDanawa(DanawaVO danawaVO);

}
