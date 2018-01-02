package java175;

import java.util.Scanner;



public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner  sc = new    Scanner(System.in);
          System.out.println("请输入一个数：");
          int a=sc.nextInt();
          int [] arr;
          arr= new int [a];
          for (int i = 0; i < arr.length; i++) {
			System.out.println(i+1);
          }
	}
}
