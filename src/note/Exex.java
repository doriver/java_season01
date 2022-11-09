package note;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InetAddress inetAddress = null;
		
		try {
			inetAddress = InetAddress.getByName("192.168.50.177");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		/*
		 * InetAddress.getByName()
				Host의 IP Address로 InetAddress를 생성하여 반환해줍니다.
				IP Address를 잘 못 넣을 경우 UnknownHostException 발생합니다
		 */
		
		/*
		 * Java에서 InetAddress.isReachable() 함수를 사용해서 접근하려는 Host IP Address로 Ping을 보낼 수 있습니다.
			InetAddress는 Internet Protocol Address를 표현한 객체입니다.
			isReachable() 함수의 인자로 Timeout 값을 넣을 수 있고 Timeout 시간 이내에 Host가 응답하면 결과값이 true가 return되고 Host가 응답을 안하면 결과값이 false로 return 됩니다.
			(단, Host에서 방화벽이나 Ping 요청에 대한 응답을 막았다면 요청이 차단될 수 있습니다)
		 */
		
		
		try {
			if (inetAddress.isReachable(2000)) { // timeout 2초
				System.out.println("reachable"); // 응답한 경우
			} else {
				System.out.println("unreachable"); // 응답 안된경우
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		 * InetAddress.isReachable()
				Timeout 값을 음수로 넣을 경우 IllegalArgumentException 발생합니다.
				Network Error가 발생할 경우 IOException이 발생합니다.
		 */
		
	}
/*
 * Ping은 인터넷 IP로 접근하려는 Host에 Ping을 보내고 응답을 확인하여 Host에 접근 가능한지 확인하기 위한 도구입니다.
	Java의 InetAddress.isReachable() 함수는 엄밀히 얘기해서 ping utility와는 다른 방식으로 동작합니다. 

 */
}
