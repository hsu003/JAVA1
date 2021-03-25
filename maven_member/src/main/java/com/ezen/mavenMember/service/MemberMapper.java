package com.ezen.mavenMember.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ezen.mavenMember.model.MemberDTO;

@Service
public class MemberMapper {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<MemberDTO> listMember(){
		return sqlSession.selectList("listMember"); 
	}
	
	public MemberDTO getMember(int no){
		return  sqlSession.selectOne("getMember", no);
	}
	
	public List<MemberDTO> findMember(String search, String searchString){
		java.util.Map<String, String> map = new java.util.Hashtable<String, String>();
		if (search == null || searchString==null){
			search = "";
			searchString = "";
		}
		map.put("search", search);
		map.put("searchString", searchString);
		return sqlSession.selectList("findMember", map);
	}
	
	public boolean checkMember
							(String name, String ssn1, String ssn2){
		java.util.Map<String, String> map = new java.util.Hashtable<>();
		map.put("ssn1", ssn1);
		map.put("ssn2", ssn2);
		MemberDTO dto = sqlSession.selectOne("checkMember", map);
		if (dto == null) return false;
		return true;
	}

	public int insertMember(MemberDTO dto){
		return sqlSession.insert("insertMember", dto);
	}

	public int deleteMember(int no){
		return sqlSession.delete("deleteMember", no);
	}

	public int updateMember(MemberDTO dto){
		return sqlSession.update("updateMember", dto);
	}
}












