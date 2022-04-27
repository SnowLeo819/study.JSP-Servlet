package com.TISpjh.controller.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.TISpjh.model.BoardDao;
import com.TISpjh.model.BoardDto;
import com.TISpjh.util.ScriptWriter;

@WebServlet("/board/WriteProcess.do")
public class WriteProcessController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WriteProcessController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		BoardDto boardDto = new BoardDto();
		
		//dto 의 값 지정.. 
		boardDto.setSubject(request.getParameter("user_subject"));
		boardDto.setName(request.getParameter("user_name"));
		boardDto.setEmail(request.getParameter("user_email"));
		boardDto.setPassword(request.getParameter("user_pw"));
		boardDto.setContents(request.getParameter("user_contents"));
					
		BoardDao boardDao = new BoardDao();
		int result = boardDao.insertBoard(boardDto);
		
		if(result > 0) {
			ScriptWriter.alertAndNext(response, "게시글이 작성되었습니다", "../board/BoardList.do");
		} else {
			ScriptWriter.alertAndBack(response, "DB 오류입니다.");
		}
	}
}
