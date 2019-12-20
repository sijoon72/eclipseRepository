package kr.pe.myblog.team.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import kr.pe.myblog.team.dao.TeaminfoDAO;
import kr.pe.myblog.team.dto.TeaminfoVO;


@Service
public class TeaminfoServiceImpl implements TeaminfoService {

//	 DAO 추가 후 @Inject 어노테이션 추가 필요
	@Inject
	private	TeaminfoDAO	dao;
	
	
	@Override
	public List<TeaminfoVO> selectTeaminfo() throws Exception {
		// TODO Auto-generated method stub
		return dao.selectTeaminfo();
	}

}
