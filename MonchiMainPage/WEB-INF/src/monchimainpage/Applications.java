package monchimainpage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


/**
 * アプリの起動を行うクラス
 * @author hiroto
 */

public class Applications {


	/**
	 * アプリの起動を実行するメソッド
	 * @param apps
	 * @return
	 */
	public String DoApplications(String[] apps){

				//外部プログラムを起動するためのインスタンスを生成する
				Runtime run = Runtime.getRuntime();

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


				//チェックが入っているアプリの個数分ループ
				for(int i = 0 ; i < apps.length ; i++){

					//選択されたアプリとすべてのアプリを照合
					for(int j = 0 ; j < 20 ; j++){

						//一致した場合はアプリを起動
						if(apps[i].equals("app"+j)){
							try {

								//Program Filesの場合
								if(j == 1 || j == 3){
									//アプリ起動
									run.exec("C:\\Program Files" + prop.getProperty("app"+j));
									//戻り値にアプリを実行したことを格納
									result = "ok";
								}
								//Program Files (x86)の場合
								else{
									//アプリ起動
									run.exec("C:\\Program Files (x86)" + prop.getProperty("app"+j));
									//戻り値にアプリを実行したことを格納
									result = "ok";
								}
							} catch (IOException e) {
								//自動生成された catch ブロック
								e.printStackTrace();
							}
						}
					}
				}

		return result;
	}
}

