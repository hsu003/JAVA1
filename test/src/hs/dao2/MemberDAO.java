package dao2;

import java.util.List;

import org.springframework.dao.DataAccessException;

import dto2.MemberDTO;

public interface MemberDAO {
	void insertMember(MemberDTO member) throws DataAccessException;  //���������� ������ �ͼ���
	void deleteMember(MemberDTO member) throws DataAccessException;  //���� �Ҷ� �ʿ��� �޼ҵ�
	void updateMember(MemberDTO member) throws DataAccessException;  //���� �Ҷ� �ʿ��� �޼ҵ�
	MemberDTO getMember(Integer id) throws DataAccessException;      //���� �������� �޼ҵ�
	List<MemberDTO> getMembers(Integer team_id) throws DataAccessException; //�� ���̵�� ��� �����ִ� ����Ʈ Ÿ���� �ɹ�
	
}
