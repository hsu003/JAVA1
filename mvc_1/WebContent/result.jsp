<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*"%>
<!-- result.jsp -->
<%
		List<String> list = (List)request.getAttribute("advice"); //����Ʈ Ÿ���� ����ȯ �� ������ �޾� ����
		if (list==null || list.size()==0){%>
		<script type="text/javascript">
			alert("�߸��Է��ϼ̽��ϴ�.")
		</script>
<%	}else {%> 
		<ul>		
<%		for(String msg : list){%>
			<li><h2><%=msg%></h2></li>
<%		}%>
		</ul>
<%	}	%>		