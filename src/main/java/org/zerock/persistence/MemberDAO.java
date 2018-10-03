package org.zerock.persistence;

import org.zerock.domain.MemberVO;

public interface MemberDAO {
	public String getTime();
	
	public void insertMember(MemberVO vo);
	
	public MemberVO readmember(String userid) throws Exception;
	
	public MemberVO readWithPW(String userid, String userpw) throws Exception;
}
