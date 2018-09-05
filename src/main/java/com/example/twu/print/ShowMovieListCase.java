package com.example.twu.print;

import com.example.twu.actions.ShowMovieListAction;

import java.util.Scanner;

public class ShowMovieListCase implements Base {

    @Override
    public void print(int input, Scanner scanner) {
        System.out.println(new ShowMovieListAction().getMovieInfoList());
    }
}
