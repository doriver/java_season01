package inheritance;

public class IPhone extends IPodTouch{
	private String phoneNumber;
	
	public IPhone(String phoneNumber) {
		super();
		super.setModel("iPhone");
		this.phoneNumber = phoneNumber;
	}
	
	public void call(String number) {
		System.out.println(number + "로 통화중");
	}
	
	public void sendMessage(String number, String message) {
		System.out.println(number + "로" + message + "전송");
	}
	
	public String infoString() {
		return super.infoString() + "\n전화번호 : " + this.phoneNumber;
	}
}
