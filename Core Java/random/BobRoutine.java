class Routine{
	public boolean isAlarmSet(boolean alarmSet){
		return alarmSet;
	}
	public boolean isSnooze(boolean snoozed){
		return snoozed;
	}
	public String setSnooze(String snoozeSetAt){
		return snoozeSetAt;
	}
	public String callCoffeeMaker(String message){
		return message;
	}
	public String callToaster(String message){
		return message;
	}
	public String callNokiaNavigator(String message){
		return message;
	}
	public String callSamDog(String instruction){
		return instruction;
	}

}
public class BobRoutine extends Routine{
	static public void main(String... x){
		BobRoutine bob = new BobRoutine();
		boolean alarmSet =  bob.isAlarmSet(true);
		if(alarmSet == true){
			boolean setSnooze = bob.isSnooze(true);
			int count = 0;
			while(setSnooze){				
				if(count < 2){
					System.out.println(bob.callCoffeeMaker("Hey, the geek's sleeping again, delay the coffee by 12 minutes."));
					System.out.println(bob.callToaster("Hold tost, Bob is sleeping again."));
					System.out.println(bob.callNokiaNavigator("Call Bob's 9 o'clock and tell him we're running a little late."));
					System.out.println(bob.callSamDog("Get the paper, but don't except a walk."));
				}
				if(count > 2){
					System.out.println(bob.callSamDog("Jump and bark"));
					break;
				}
				count++;				
			}
		}
	}
}