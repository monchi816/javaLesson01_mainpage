package monchimainpage;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * フロントコントローラクラス
 */

@WebServlet("/FrontControllerServlet")
public class FrontControllerServlet extends HttpServlet {


	//オペレーションID
	private static final String index = "1";
	private static final String result = "2";

    /**
	 * サーブレットのサービス
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest,
	 * javax.servlet.http.HttpServletResponse)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		doGet(req, res);
	}

	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		try {
		String page = "";
		String flag = req.getParameter("flag");

		//ページの設定
		if (flag.equals(index)) {
			page = "/index.jsp";
		}else if(flag.equals(result)){
			page = "/result.jsp";
		}

		getServletContext().getRequestDispatcher(page).forward(req,res);

		} catch (Exception e) {
		try {
			PrintWriter pw;
			res.setContentType("text/html;charset=UTF-8");
			pw = res.getWriter();
			pw.print("URLエラー");
			pw.close();
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		}
	}

}
