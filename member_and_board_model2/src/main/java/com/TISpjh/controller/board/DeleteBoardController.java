package com.TISpjh.controller.board;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteBoard.do")
public class DeleteBoardController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteBoardController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("delete_board.jsp");
		dispatcher.forward(request, response);
	}
}
