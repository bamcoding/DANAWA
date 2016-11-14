package net.gondor.danawa.dao.impl;

import java.util.List;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import net.gondor.danawa.dao.DanawaDao;
import net.gondor.danawa.vo.DanawaSearchVO;
import net.gondor.danawa.vo.DanawaVO;

public class DanawaDaoImpl extends SqlSessionDaoSupport implements DanawaDao{

	@Override
	public int getDanawaCount(DanawaSearchVO searchVO) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("danawaDao.getDanawaCount", searchVO);
	}

	@Override
	public List<DanawaVO> getAllDanawaList(DanawaSearchVO searchVO) {
		// TODO Auto-generated method stub
		return getSqlSession().selectList("danawaDao.getAllDanawaList", searchVO);
	}

	@Override
	public int removeDanawaById(String id) {
		// TODO Auto-generated method stub
		return getSqlSession().delete("danawaDao.removeDanawaById",id);
	}

	@Override
	public int addDanawa(DanawaVO danawaVO) {
		// TODO Auto-generated method stub
		return getSqlSession().insert("danawaDao.addDanawa", danawaVO);
	}

	@Override
	public DanawaVO getDanawaById(String id) {
		// TODO Auto-generated method stub
		return getSqlSession().selectOne("danawaDao.getDanawaById", id);
	}

	@Override
	public int editDanawa(DanawaVO danawaVO) {
		// TODO Auto-generated method stub
		return getSqlSession().update("danawaDao.editDanawa", danawaVO);
	}

}
