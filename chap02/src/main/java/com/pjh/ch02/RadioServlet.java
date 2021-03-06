package com.pjh.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RadioServlet")
public class RadioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public RadioServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8"); // 회신 정보에 따라 달라짐.
		PrintWriter out = response.getWriter();
		
		String gender = request.getParameter("gender"); // 무조건 String 값으로 회신됨. 1개 값...(정수면 Integer.parseint  필요
														// checkbox는 배열
														// select 는 단일값
		out.println("<html>");
		out.println("<body>");
		out.println("<p>");

		out.println("당신의 성별은 "+gender+" 입니다");
		
		out.println("<a href='javascript:history.back();'>돌아가기</a>");
		
		out.println("</p>");
		out.println("</body>");
		out.println("</html>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
