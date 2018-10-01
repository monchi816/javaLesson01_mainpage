package monchimainpage;

import java.util.Random;

/**
 * 画像表示のためのクラス
 * @author hiroto
 *
 */

public class Images {

	/**
	 * ランダムに画像を選択し、そのパスを生成するメソッド
	 * @param images
	 * @return
	 */
	public String DoImages(String[] images){

		 //戻り値の準備
		 String result = null;

		 //複数画像表示のための乱数を生成
		 Random rnd = new Random();
		 int ran = rnd.nextInt(14);

		 //ランダムに選択した画像のパスを生成し、戻り値に格納
		 result = "images/("+ran+").jpg";

		 //戻り値を返却
		 return result;

	 }

}
