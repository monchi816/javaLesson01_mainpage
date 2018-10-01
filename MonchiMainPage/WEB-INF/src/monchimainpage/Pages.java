package monchimainpage;

import java.awt.Desktop;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Properties;


/**
 * URLを開くクラス
 * @author hiroto
 */

public class Pages {

	/**
	 * 選択されたページのURLを開くメソッド
	 * @param pages
	 * @return result
	 */
	public String DoPages(String[] pages){

		//戻り値の準備
		String result = null;

		//設定ファイルの取得
		final Properties prop = new Properties();
		try {
			InputStream inStream = this.getClass().getResourceAsStream("monchiMainPage.properties");
			prop.load(inStream);
		} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
		}


		//URLを開くためのインスタンスを生成する
		Desktop desktop = Desktop.getDesktop();

		//チェックされたページをブラウザで開く
		//チェックが入っているページの個数分ループ
		for(int i = 0 ; i < pages.length ; i++){

			//選択されたページとすべてのページを照合
			for(int j = 0 ; j < 20 ; j++){

				//一致した場合はページを開く
				if(pages[i].equals("page"+j)){
					try {
						try {

							//チェックの入ったページを開く
							desktop.browse(new URI(prop.getProperty("page"+j)));
							//戻り値にページを開いたことを格納
							result = "ok";

						} catch (URISyntaxException e) {
							//自動生成された catch ブロック
							e.printStackTrace();
						}
					} catch (IOException e) {
						//自動生成された catch ブロック
						e.printStackTrace();
					}
				}
			}
		}

	//戻り値を返却
	return result;

	}
}

