package lesson08.challenge10;

public class SuperRobot {
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

	int getWater() {
		return water;
	}

	String makeEggDishes(int flourNum, int sugarNum, int eggNum, int butterNum) {
		int flour = flourNum - 1;
		int sugar = sugarNum - 2;
		int egg = eggNum - 2;
		int butter = butterNum - 1;

		String menu = null;
		if ((flour >= 0) && (sugar >= 0) && (egg >= -1) && (butter >= 0)) {
			menu = "サンドイッチ";
		} else if ((egg >= 0) && (butter >= -1)) {
			menu = "ハムチーズ";
		} else if (egg >= -1) {
			menu = "目玉焼き";
		} else {
			menu = null;
		}
		return menu;

	}
}
