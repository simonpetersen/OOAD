package test;

import java.math.BigInteger;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getTime());
		Date d2 = new Date(d1.getTime()+(60*60*1000));
		System.out.println(d2);
		Date d3 = new Date(d2.getTime());
		System.out.println(d3);
		System.out.println(d3.getTime());
		BigInteger bInt = new BigInteger("0");
	}

}
