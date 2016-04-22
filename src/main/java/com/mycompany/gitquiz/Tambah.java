/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.gitquiz;

import java.util.Scanner;

/**
 *
 * @author SB604-20
 */
public class Tambah {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scn = new Scanner(System.in);
        System.out.print("masukkan nilai a : ");
        a = scn.nextInt();
        System.out.print("masukkan nilai b : ");
        b = scn.nextInt();
        int c = a + b;
        System.out.println("Hasil pertambahan : "+c);
    }
}
