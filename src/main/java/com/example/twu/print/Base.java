package com.example.twu.print;

import java.util.Scanner;

public interface Base {
    void print(int input, Scanner scanner);

    default void illegal(){

    }
}
