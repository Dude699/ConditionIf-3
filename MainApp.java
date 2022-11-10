package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên");
		int n = sc.nextInt();
		if(n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 ) {
			System.out.println("Tháng có 31 ngày");
			}
		if(n == 4 || n == 6 || n == 9 || n == 11 ) {
			System.out.println("Tháng có 30 ngày");
		}
		
		if(n == 2 ) {
			System.out.println("Tháng có 28 ngày");
}}}