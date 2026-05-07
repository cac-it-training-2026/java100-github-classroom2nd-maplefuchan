/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題4 注文を受ける
 *
 * 3種類のマカロンを任意の個数購入できるようにします。
 * [問題3]までの表示を行った後で
 * 実行例を参考に処理を追記してください。
 * （ >8 は >を表示した後で入力待ち状態になり、
 *   ユーザーがキーボードから8を入力したイメージです。）
 *
 *
 * <実行例>
 *
 * それぞれ何個ずつ買いますか？（最大30個まで）
 *
 * シトロン      >8
 * ショコラ      >2
 * ピスターシュ  >6
 *
 * シトロン     8個
 * ショコラ     2個
 * ピスターシュ 6個
 *
 * をお買いあげですね。
 * 承りました。
 */

package lesson01.challenge04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Patisserie {
	public static void main(String[] args) throws IOException {

		System.out.println("たいへんお待たせしました。");
		System.out.println("【ポエール・ネルメ】");
		System.out.println("ただいまより開店です！！");

		int sitr = 30;
		int shoc = 30;
		int pist = 30;

		System.out.println("\n本日のおすすめ商品です。\n");
		System.out.println("シトロン     \\250 ・・・ 残り" + sitr + "個");
		System.out.println("ショコラ     \\280 ・・・ 残り" + shoc + "個");
		System.out.println("ピスターシュ \\320 ・・・ 残り" + pist + "個");

		System.out.println("それぞれ何個ずつ買いますか？");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("シトロン");
		String sitrbuystr = br.readLine();
		int sitrbuy = Integer.parseInt(sitrbuystr);

		System.out.println("ショコラ");
		String shocobuystr = br.readLine();
		int shocbuy = Integer.parseInt(shocobuystr);

		System.out.println("ピスターシュ");
		String pistbuystr = br.readLine();
		int pistbuy = Integer.parseInt(pistbuystr);

		System.out.println("シトロン　　" + sitrbuystr + "個");
		System.out.println("ショコラ　　" + shocobuystr + "個");
		System.out.println("ピスターシュ" + pistbuystr + "個");
		System.out.println("をお買い上げですね。\n承りました。");

	}

}
