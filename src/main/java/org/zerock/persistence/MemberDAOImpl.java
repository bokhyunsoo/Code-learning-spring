package org.zerock.persistence;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.zerock.domain.MemberVO;

@Repository
public class MemberDAOImpl implements MemberDAO {

	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public String getTime() {
		return sqlSession.selectOne("member.getTime");
	}

	@Override
	public void insertMember(MemberVO vo) {
		sqlSession.insert("member.insertMember",vo);
	}

	@Override
	public MemberVO readmember(String userid) throws Exception {
		MemberVO vo = sqlSession.selectOne("member.selectMember", userid);
		return vo;
	}

	@Override
	public MemberVO readWithPW(String userid, String userpw) throws Exception {
		Map<String, String> paramMap = new HashMap<String, String>();
		paramMap.put("userid", userid);
		paramMap.put("userpw", userpw);
		return sqlSession.selectOne("member.readWithPW", paramMap);
	}
	
}
