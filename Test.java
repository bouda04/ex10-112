package ex10_112;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("how many bags? ");
		int bags = in.nextInt();
		in.nextLine();
		int cntBig=0, cntSmall=0, cntBalanced=0;
		for (int i=0;i<bags;i++) {
			System.out.println("enter candies as string...");
			String candies = in.nextLine();
			Bag bag = new Bag(candies);
			if (bag.isBig()) cntBig++;
			else cntSmall++;
			if (bag.isBalanced()) cntBalanced++;
		}
		System.out.println("bigs:" + cntBig);
		System.out.println("smalls:" + cntSmall);
		System.out.println("balanced:" + cntBalanced);

	}

}
