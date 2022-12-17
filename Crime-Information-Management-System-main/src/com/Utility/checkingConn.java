package com.Utility;

import java.sql.Connection;

public class checkingConn {

	
	public static void main(String[] args) {
		
		
		Connection conn=DBUtil.provideConnection();
		
		System.out.println(conn);
		
		
	}
}
