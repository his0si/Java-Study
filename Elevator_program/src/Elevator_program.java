import org.Elevator.Elevator;
import org.Elevator.Lighting;
import org.Elevator.Security;

public class Elevator_program {

	public static void main(String[] args) {
		
		String id = "JAVA APT 507";
		// Elevator call
		//org.opentutorials.iot.Elevator 쓰는 것 대신 import
		Elevator myElevator = new Elevator(id);
		myElevator.callForUp(1); //1층으로 엘리베이터 보내기
		
		// Security off
		Security mySecurity = new Security(id);
		mySecurity.off(); //괄호 붙어있는 명령은 '메소드'
		
		// Light on
		Lighting hallLamp = new Lighting(id+" / hallLamp");
		hallLamp.on();
		Lighting floorLamp = new Lighting(id+" / floorLamp");
		floorLamp.on();
		
	}

}
