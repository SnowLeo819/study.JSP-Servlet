<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>


<body>
	<form action="SubmitServlet" method="get">     <!-- 전체 : 공백 체크 -->
		<table>
			<tr>
				<td>이름</td>	
				<td><input type="text" name="name" ></td>
			</tr>
			<tr>
				<td>주민등록번호</td>	                 <!-- 자릿수 체크 / 숫자만? -->
				<td>
					<input type="text" name="resi01" >
					<input type="password" name="resi02" >
				</td>
			</tr>
			<tr>
				<td>아이디</td>	
				<td><input type="text" name="ID" ></td>
			</tr>
			<tr>
				<td>비밀번호</td>	
				<td><input type="password" name="PW" ></td>
			</tr>
			<tr>
				<td>비밀번호 확인</td>	
				<td><input type="password" name="PW_test" ></td>
			</tr>
			<tr>
				<td>이메일</td>	
				<td>
					<input type="text" name="mailId" > @ 
					<input type="text" name="domainList">
					<select name="domainList">
						<option value="naver">naver.com</option>
						<option value="daum">daum.net</option>
						<option value="google">gmail.com</option>
					</select>	
				</td>
			</tr>
			<tr>
				<td>우편번호</td>	
				<td><input type="text" name="postNum" ></td>
			</tr>
			<tr>
				<td>주소</td>	
				<td><input type="text" name="address" > <input type="text" name="detail" ></td>
			</tr>
			<tr>
				<td>핸드폰번호</td>	
				<td><input type="text" name="HP" ></td>
			</tr>
			<tr>
				<td>직업</td>	
				<td>
					<select name="job">
						<option value="학생">학생</option>
						<option value="언론인">언론인</option>
						<option value="컴퓨터/인터넷">컴퓨터/인터넷</option>
						<option value="공무원">공무원</option>
					</select>	
				</td>
			</tr>
			<tr>
				<td>메일/SMS 정보 수신</td>	
				<td>
					<label><input type="radio" name="subscribe" value="yes"><span>수신</span></label>
					<label><input type="radio" name="subscribe" value="no"><span>수신거부</span></label>
				</td>
			</tr>
			<tr>
				<td>관심분야</td>	
				<td>
					<label><input type="checkbox" name="like" value="java"><span>java</span></label>
					<label><input type="checkbox" name="like" value="html"><span>html</span></label>
					<label><input type="checkbox" name="like" value="database"><span>database</span></label>
					<label><input type="checkbox" name="like" value="css"><span>css</span></label>
					<label><input type="checkbox" name="like" value="jsp"><span>jsp</span></label>
				</td>
			</tr>
			
		</table>
		<button>회원가입</button>
		<button>취소</button> 
	</form>
</body>
</html>