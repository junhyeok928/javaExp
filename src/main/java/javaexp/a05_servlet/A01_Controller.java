package javaexp.a05_servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class A01_Controller
 */
@WebServlet(name = "mvc.do", urlPatterns = { "/mvc.do" })
public class A01_Controller extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public A01_Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

   /**
    * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
    * // jsp ==> .java ==> .class ==> html 전송
    */
    
   protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // TODO Auto-generated method stub
      //#controller
      //1. 요청값 처리
      
      //2. model 데이터 설정
	  //	key / value 형식으로 모델데이터를 만들어 넣을 수 있다.
	  request.setAttribute("kor", 85);
	  request.setAttribute("math", 15);
	  request.setAttribute("eng", 50);
      //3. view단 호출
	  String viewPage="a00_exp\\12\\ex7.jsp";
      RequestDispatcher rd = request.getRequestDispatcher(viewPage);
      rd.forward(request, response);
   }

}