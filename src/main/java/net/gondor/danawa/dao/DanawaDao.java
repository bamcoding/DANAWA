package net.gondor.danawa.dao;

import java.util.List;

import net.gondor.danawa.vo.DanawaSearchVO;
import net.gondor.danawa.vo.DanawaVO;

public interface DanawaDao {

	public int getDanawaCount(DanawaSearchVO searchVO);

	public List<DanawaVO> getAllDanawaList(DanawaSearchVO searchVO);

	public int removeDanawaById(String id);

	public int addDanawa(DanawaVO danawaVO);

	public DanawaVO getDanawaById(String id);

	public int editDanawa(DanawaVO danawaVO);

}
