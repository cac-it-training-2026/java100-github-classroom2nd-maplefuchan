/**
 * 第1章 マカロン屋さんのお仕事
 *
 * 問題5 合計金額を求める
 *
 * 入力されたマカロンの個数から合計購入数、合計金額を求めます。
 * 合計購入数、合計金額を求める処理を追記した後で
 * [問題4]の表示を実行例を参考にして改変してください。
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
 * 合計個数    16個
 * 合計金額  4480円
 *
 * をお買いあげですね。
 * 承りました。
 *
 */

package lesson01.challenge05;

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
		String shocbuystr = br.readLine();
		int shocbuy = Integer.parseInt(shocbuystr);

		System.out.println("ピスターシュ");
		String pistbuystr = br.readLine();
		int pistbuy = Integer.parseInt(pistbuystr);

		System.out.println("シトロン　　" + sitrbuystr + "個");
		System.out.println("ショコラ　　" + shocbuystr + "個");
		System.out.println("ピスターシュ" + pistbuystr + "個");

		System.out.println("合計個数" + (sitrbuy + shocbuy + pistbuy) + "個");
		System.out.println("合計金額" + (sitrbuy * 250 + shocbuy * 280 + pistbuy * 320) + "円");
		System.out.println("をお買い上げですね。\n承りました。");
	}
}
