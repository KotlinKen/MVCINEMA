<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.cinema.movie.model.vo.*"%>
    
<% List<Movie> mlist = (List<Movie>)request.getAttribute("mlist"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> </title>
<style>
*{padding:0px; margin:0px; }
.table_common{border-collapse: collapse;}
.table_common th, .table_common td{border:1px solid #ececec; padding:10px; font-size:12px;}
.mid{width:50px;}
.name{width:300px;}
.ename{width:200px;}
.director{width:100px;}
.grade{width:50px;}
.actor{width:100px;}
.genre{width:80px;}

</style>
</head>

<body>
	<table class="table_common">
		<tr>
			<th class="mid">영화코드</th>
			<th class="name">제목</th>
			<th class="ename">영문제목</th>
			<th class="grade">연령</th>
			<th class="time">시간</th>
			<th class="director">감독</th>
			<th class="actor">출연진</th>
			<th class="genre">장르</th>
			<th class="story">스토리</th>
			<th class="reldate">개봉일</th>	
			<th class="poster">포스트</th>	
			<th class="subimg">서브이미지</th>	
			<th class="trailer">트레일러</th>	
			<th class="regdate">등록일자</th>	
		</tr>
		<%
			if(mlist==null || mlist.isEmpty()){
		%>
		
		<tr>
			<td colspan="9" align="center">데이터가 존재하지 않습니다.</td>
		</tr>
				
		<% }else{		
			for(Movie m : mlist){
		%>	
			<tr>
				<td><%=m.getMid()%></td>
				<td><%=m.getName()%></td>
				<td><%=m.getEname()%></td>
				<td><%=m.getGrade()%></td>
				<td><%=m.getTime()%></td>
				<td><%=m.getDirector()%></td>
				<td><%=m.getActor()%></td>
				<td><%=m.getGenre()%></td>
				<td><%=m.getStory()%></td>
				<td><%=m.getReldate()%></td>
				<td><%=m.getPoster()%></td>
				<td><%=m.getSubimg()%></td>
				<td><%=m.getTrailer()%></td>
				<td><%=m.getRegdate()%></td>
			</tr>	 
			
			<%}
		}%>
		
	
	</table>
</body>
</html>