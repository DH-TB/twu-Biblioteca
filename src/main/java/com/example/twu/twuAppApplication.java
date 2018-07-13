package com.example.twu;

import com.example.twu.entities.Menu;

import java.util.Scanner;

public class twuAppApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int menuNumber;
		Menu menu = new Menu();

		System.out.println(menu.getWelcomeInfo());

		while ((menuNumber = scanner.nextInt()) != 3) {
			switch (menuNumber) {
				case 1:
					break;
				case 2:
					break;
			}
		}
	}
}
