<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR" import="java.util.*"%>
<!-- result.jsp -->
<%
		List<String> list = (List)request.getAttribute("advice"); //리스트 타입의 형변환 한 벨류값 받아 오기
		if (list==null || list.size()==0){%>
		<script type="text/javascript">
			alert("잘못입력하셨습니다.")
		</script>
<%	}else {%> 
		<ul>		
<%		for(String msg : list){%>
			<li><h2><%=msg%></h2></li>
<%		}%>
		</ul>
<%	}	%>		