<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="./include/header.jsp"%>
<main>
	<div class="inner">
		<h2 class="subTitle">VIEW</h2>
		<div id="contents">
			<!-- 데이터 받아서 처리하기....forward방식으로 데이터 보여주기....  -->
			<div class="form">
				<table>
					<colgroup>
						<col style="width: 10%">
						<col style="width: 40%">
						<col style="width: 10%">
						<col style="width: 40%">
					</colgroup>
					<tbody>
						<tr>
							<th>NAME</th>
							<td class="left">${replyBoardDto.name }</td>
							<th>HIT</th>
							<td class="left">${replyBoardDto.hit }</td>
						</tr>
						<tr>
							<th>EMAIL</th>
							<td class="left">${replyBoardDto.email }</td>
							<th>DATE</th>
							<td class="left">${replyBoardDto.regDate }</td>

						</tr>
						<tr>
							<th>SUBJECT</th>
							<td colspan="3" class="left">${replyBoardDto.subject }</td>
						</tr>
						<tr>
							<th>CONTENTS</th>
							<td colspan="3" class="left">${replyBoardDto.contents }</td>
						</tr>
					</tbody>
				</table>
				<!-- 다음글 이전글 -->
				<div class="prevAndNext">
					<div class="item">
						<span class="inner">prev</span>
						<a href="이전 글 링크">이전 글 제목</a>
					</div>
					<div class="item">
						<span class="inner">prev</span>
						<a href="다음 글 링크">다음 글 제목</a>
					</div>
				</div>
				
				<div class="btns">
					<a href="Write.do" class="btn btnConfirm">새글쓰기</a> <a
						href="ReplyWrite.do?no=${replyBoardDto.no }&reGroup=${replyBoardDto.reGroup}&reLevel=${replyBoardDto.reLevel}&reStep=${replyBoardDto.reStep}"
						class="btn btnConfirm">답글쓰기</a> <a href="BoardList.do"
						class="btn btnCancel">글목록</a> <a href="Update.do?no=${replyBoardDto.no }"
						class="btn btnConfirm">수정</a> <a href="Delete.do?no=${replyBoardDto.no }"
						class="btn btnCancel">삭제</a>
				</div>
			</div>
		</div>
	</div>
</main>
<%@ include file="./include/footer.jsp"%>






