/**
 * 第5章 ロボット工場のお仕事
 *
 * 問題8  材料によって作るメニューを変える
 *
 * 引数として渡された食材の分量を計算して
 * 的確な料理を返すメソッドを追加します。
 *
 * コメントの位置に適切なコードを記述し、
 * 実行例と同じメッセージを表示してください。
 *
 * <実行例>
 *  Rさん：
 *  もうちょっと高度な調理機能が欲しいですね。
 *
 *  G博士：
 *  では材料の分量に応じて作るメニューを変える機能を入れてみようかの。
 *
 *  Rさん：
 *  そんなことが出来るんですか！
 *
 *  G博士：
 *  出来るとも。小麦粉170g、砂糖50g、卵1個、バター80gがそろえばクッキーを作る。
 *
 *  G博士：
 *  クッキーが出来ない場合で、卵2個、バター5gがそろえばオムレツを作る。
 *
 *  G博士：
 *  卵のみの場合はゆで卵を作る。
 *
 *  G博士：
 *  それ以外の場合は何も作らないようにするんじゃ。
 *
 *  Rさん：
 *  それは凄そうですね。完成をお待ちしています。
 *
 *  G博士：
 *  ......出来たぞ！早速動かしてみよう。
 *
 *  小麦粉の量を入力してください（グラム）＞○
 *
 *  砂糖の量を入力してください（グラム）＞○
 *
 *  卵の個数を入力してください＞○
 *
 *  バターの量を入力してください（グラム）＞○
 *
 *  <料理を作成する条件を満たす場合の実行例>
 *  【※調理できる料理】が出来ました。
 *
 *  <料理を作成する条件を満たさない場合の実行例>
 *  何も作れません。
 *
 */

package lesson05.challenge08;

//ここに問題7で作成したクラスに次の条件を足したクラスを作成してください。
//メソッド名：makeEggDishes(引数int flourNum, int sugarNum, int eggNum, int butterNum、
//戻り値String、作成できるメニューを戻り値として返す。また、作成できるメニューが無い場合はnull値を返す)
class Robot {
	int energy;
	int water;
	String name;

	void pumpWater() {
		System.out.println("水を" + water + "リットル出します。\n");
	}

	void setWater(int water) {
		this.water = water;
	}

	void randomWater() {
		water = (int) (Math.random() * 10) % 9 + 1;
	}

	void makeOmelet(int butterNum, int eggNum) {
		int om1 = butterNum / 5;
		int om2 = eggNum / 2;

		if (om1 > om2) {
			System.out.println(om2 + "人分のオムレツ\n");
		} else {
			System.out.println(om1 + "人分のオムレツ\n");
		}
	}

	int getWater() {
		return water;
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		int flour = flourNum - 170;
		int sugar = sugarNum - 50;
		int egg = eggNum - 2;
		int butter = butterNum - 80;

		String menu = null;
		if ((flour >= 0) && (sugar >= 0) && (egg >= -1) && (butter >= 0)) {
			menu = "クッキー";
		} else if ((egg >= 0) && (butter >= -75)) {
			menu = "オムレツ";
		} else if (egg >= -1) {
			menu = "ゆで卵";
		} else {
			menu = null;
		}
		return menu;

	}
}
