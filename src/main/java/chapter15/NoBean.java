package chapter15;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns= {"/chapter15/nobean"})
public class NoBean extends HttpServlet{
	public void doGet(
			HttpServletRequset requset, HttpServletResponse response
		) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		Page.header(out);
	}
	

}
