package dao2;

import java.util.List;

import org.springframework.dao.DataAccessException;

import dto2.MemberDTO;

public interface MemberDAO {
	void insertMember(MemberDTO member) throws DataAccessException;  //스프링에서 나오는 익셉션
	void deleteMember(MemberDTO member) throws DataAccessException;  //삭제 할때 필요한 메소드
	void updateMember(MemberDTO member) throws DataAccessException;  //수정 할때 필요한 메소드
	MemberDTO getMember(Integer id) throws DataAccessException;      //값을 가져오는 메소드
	List<MemberDTO> getMembers(Integer team_id) throws DataAccessException; //팀 아이디로 모두 보여주는 리스트 타입의 맴버
	
}
