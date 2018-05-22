<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, com.cinema.ticket.model.vo.*"%>

<% 
	//List<Ticket> mlist = (List<Ticket>)request.getAttribute("tlist"); 
	List<Map<String, String>> mlist = (List<Map<String, String>>)request.getAttribute("tlist"); 
	String g = (String)request.getAttribute("glist");
	System.out.println(g);
	
%>
<%@ include file="/WEB-INF/views/common/header.jsp" %>
<script>
 

</script>
<style>
.ticketList table{text-align:center; border-top:3px solid #1986ff;}
.ticketList table th{padding:15px 10px; background:#f9f9f9; font-weight:bold; border:none; border-bottom:1px solid #e0e0e0;}
.ticketList table td{padding:15px; border:none; border-bottom:1px solid #e0e0e0; }
.button_tab{padding:10px;}
.button_tab div{display:inline-block; height:10px; border-right:1px solid #e0e0e0;}
.button_tab span{ display:inline-block; padding:10px; cursor:pointer; font-size:12px; color:#333; }
.button_tab span:hover{color:#1985ff;}

.button_tab .checked{font-weight:bold; color:#1985ff;}
</style>
<% if(userSession != null){ %>

<div class="button_tab">
	<span onclick="location.href='/cinema/users?type=viewInfo'">내정보보기/수정</span>
	<div></div>
	<span onclick="location.href='/cinema/users?type=viewTicket'">예매확인/취소</span>
</div>
<div class="ticketList">
	<table>
	<tr>
		<th>NO</th>
		<th>예매번호</th>
		<th>영화포스터</th>
		<th>영화명</th>
		<th>영화관</th>
		<th>상영관</th>
		<th>상영일시</th>
		<th>예매일</th>
		<th>좌석</th>
	</tr>

	<% int i=0;  for(Map <String, String> m : mlist){ %>
		<tr onclick='fn_showTicketDetail("<%=m %>")'>
		<td><%=m.get("BID") %></td>
		<td>T9049-005-11<%=m.get("BID") %></td>
		<td><img src="/cinema/upload/movie/<%=m.get("POSTER") %>" alt="" width="70"/></td>
		<td><%=m.get("MNAME") %></td>
		<td><%=m.get("TNAME") %></td>
		<td><%=m.get("RNAME") %></td>
		<td><%=m.get("STIME") %></td>
		<td><%=m.get("REGDATE") %></td>
		<td><%=m.get("SEATNUM") %></td>
		</tr>
	<% i++; } %>

	</table>
		<div id="pageBar"><%=request.getAttribute("pageBar") %></div>
</div>
<% }else{}%>
<script>
$(function(){
	
});

function fn_showTicketDetail(value){


	console.log(value);
	
	
}

function strMapToObj(strMap) {
    let obj = Object.create(null);
    for (let [k,v] of strMap) {
        // We don’t escape the key '__proto__'
        // which can cause problems on older engines
        obj[k] = v;
    }
    return obj;
}


</script>
<%@ include file="/WEB-INF/views/common/footer.jsp" %>