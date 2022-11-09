package note;

import java.net.InetAddress;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			/*
			 * 1. InetAddress.getByName(ip 주소); : 서버 아이피 주소를 지정합니다
			 * 2. isReachable : 타임아웃 체크로 해당 서버에서 응답이 있을 경우 true 반환, 응답이 없을 경우 false 반환합니다  
			 */
			InetAddress pingCheck = InetAddress.getByName("192.168.0.13");
			
			boolean isAlive = pingCheck.isReachable(1000);
			System.out.println("서버응답 : " + isAlive);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
