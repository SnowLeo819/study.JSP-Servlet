package com.pjh.ch02;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GugudanCheckbox2")
public class GugudanCheckbox2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public GugudanCheckbox2() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html; charset=utf-8");
    	PrintWriter out = response.getWriter();
    	int danCount = 0;
    	
    	String select [] = request.getParameterValues("gugudan");
    	
    	out.println("<html>");
    	out.println("<body>");
    	
    	out.println("<table border='1'>");
    	out.println("<thead><tr>");
    	for(int j=0;j<select.length;j++) {
    		danCount = Integer.parseInt(select[j]); 
    		out.println("<th>"+danCount+" 단</th>");
    	}
    	out.println("</tr></thead>");
    	
    	out.println("<tbody>");
    	
    	for(int i=1;i<10;i++) {
    	out.println("<tr>");

    		for(int j=0;j<select.length;j++) {
    			danCount = Integer.parseInt(select[j]); 
    			out.println("<td>"+danCount+" x "+i+" = "+danCount*i+"</td>");
    		}
    		out.println("<tr>");
    	}
    	out.println("</tbody>");
    	out.println("</table>");

    	out.println("<a href='javascript:history.back();'>돌아가기</a>");
    	
    	out.println("</body>");
    	out.println("</html>");
    
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
