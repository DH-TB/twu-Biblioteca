package com.example.twu;

import com.example.twu.entities.Data;
import com.example.twu.entities.Menu;

import java.util.Scanner;

public class twuAppApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int menuNumber;
		Menu menu = new Menu();
		System.out.println(menu.getWelcomeInfo());
		getMenu();
		while ((menuNumber = scanner.nextInt()) != 4) {
			switch (menuNumber) {
				case 1:
					System.out.println(Data.getBookInfoList());
					getMenu();
					break;
				case 2:
					getMenu();
					break;
			}
		}
	}

	public static void getMenu(){
		Menu menu = new Menu();
		System.out.println(menu.getMenu());
	}
}
