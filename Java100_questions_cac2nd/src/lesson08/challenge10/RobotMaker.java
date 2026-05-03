package lesson08.challenge10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RobotMaker {

	public static void main(String[] args) throws IOException {

		System.out.println("Rさん：");
		System.out.println("もうちょっと高度な調理機能が欲しいですね。\n");
		System.out.println("G博士：");
		System.out.println("では材料の分量に応じて作るメニューを変える機能を入れてみようかの。\n");
		System.out.println("Rさん：");
		System.out.println("そんなことが出来るんですか！\n");
		System.out.println("G博士：");
		System.out.println("出来るとも。パン１枚、ハム２枚、卵２個、スライスチーズ１枚がそろえばクッキーを作る。\n");
		System.out.println("G博士：");
		System.out.println("クッキーが出来ない場合で、卵2個、スライスチーズ１枚がそろえばチーズオムレツを作る。\n");
		System.out.println("G博士：");
		System.out.println("卵のみの場合は目玉焼きを作る。\n");
		System.out.println("G博士：");
		System.out.println("それ以外の場合は何も作らないようにするんじゃ。\n");
		System.out.println("Rさん：");
		System.out.println("それは凄そうですね。完成をお待ちしています。\n");
		System.out.println("G博士：");
		System.out.println("......出来たぞ！早速動かしてみよう。\n");

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("パンの量を入力してください（枚）＞");
		String flourNumStr = br.readLine();
		int flourNum = Integer.parseInt(flourNumStr);

		System.out.print("\nハムの量を入力してください（枚）＞");
		String sugarNumStr = br.readLine();
		int sugarNum = Integer.parseInt(sugarNumStr);

		System.out.print("\n卵の個数を入力してください＞");
		String eggNumStr = br.readLine();
		int eggNum = Integer.parseInt(eggNumStr);

		System.out.print("\nスライスチーズの量を入力してください（枚）＞");
		String butterNumStr = br.readLine();
		int butterNum = Integer.parseInt(butterNumStr);

		SuperRobot robot = new SuperRobot();
		String menu = robot.makeEggDishes(flourNum, sugarNum, eggNum, butterNum);

		if (menu != null) {
			System.out.println("\n" + menu + "が出来ました。");
		} else {
			System.out.println("\n何も作れません");
		}
	}

}
