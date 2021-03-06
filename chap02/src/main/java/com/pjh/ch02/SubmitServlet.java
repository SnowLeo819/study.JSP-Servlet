package com.pjh.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SubmitServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String resi01 = request.getParameter("resi01");
		String resi02 = request.getParameter("resi02");
		String ID = request.getParameter("ID");
		String PW = request.getParameter("PW");
		String PW_test = request.getParameter("PW_test");
		String mailId = request.getParameter("mailId");
		String mailDomain = request.getParameter("mailDomain");
		String postNum = request.getParameter("postNum");
		String address = request.getParameter("address");
		String detail = request.getParameter("detail");
		String HP = request.getParameter("HP");
		String job = request.getParameter("job");
		String subscribe = request.getParameter("subscribe");
		String likes [] = request.getParameterValues("like");
		
		out.println("<html>");
		out.println("<body>");
		out.println("<p>");
		
		out.println("이름 : "+name+"<br>");
		out.println("주민등록번호 : "+resi01+"-"+resi02+"<br>");
		out.println("아이디 : "+ID+"<br>");
		out.println("비밀번호 : "+PW+"<br>");
		out.println("이메일 : "+mailId+"@"+mailDomain+"<br>");
		out.println("우편번호 : "+ postNum+"<br>");
		out.println("주소 : "+address+" "+detail+"<br>");
		out.println("핸드폰번호 : "+HP +"<br>");
		out.println("직업 : "+job +"<br>");
		out.print("관심분야 : ");
		for(int i=0;i<likes.length;i++) {
			out.print(likes[i]+" ");
		}
		
		out.println("</p>");
		
		out.println("<a href='javascript:history.back();'> 돌아가기 </a>");
		
		out.println("</body>");
		out.println("</html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
