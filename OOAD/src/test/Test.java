package test;

import java.sql.SQLException;
import java.util.Date;

import dataAccess.Connector;

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
		
		try {
			new Connector();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
