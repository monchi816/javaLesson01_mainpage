package monchimainpage;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

/**
 * 処理を実行するメインクラス
 * @throws IOException
 */


public class Main {


	/**
	 * 処理を実行するメソッド
	 * @throws IOException
	 */
	public static String doProgram(HttpServletRequest req){

		String apps[] = null;
		String pages[] = null;
		String images[] = null;

		//押されたボタンを区別し、フォームの情報をリストに格納する
		if(req.getParameter("Apps") != null){
			apps = req.getParameterValues("apps");
		}
		else if(req.getParameter("Pages") != null){
			pages = req.getParameterValues("pages");
		}
		else if(req.getParameter("Images") != null){
			images = req.getParameterValues("image");
		}

		//戻り値の準備
		String result = null;

		//「Favorite Pages」が実行された場合Pagesインスタンスを生成する
		if(pages != null){

			Pages p = new Pages();
			result = p.DoPages(pages);

		}
		//「Favorite Applications」が実行された場合はApplicationsインスタンスを生成する
		if(apps != null){

			Applications applications = new Applications();
			result = applications.DoApplications(apps);
		}
		//「View Images」が実行された場合はImagesインスタンスを生成する
		if(images != null){

			Images img = new Images();
			result = img.DoImages(images);
		}
		else{
			//要検討
		}

	//戻り値を返却
	return result;

	}

}
