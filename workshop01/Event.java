package workshop01;//package workshop01;

/**
 * workshop01.workshop01.Event
 *
 * @author Ning Kang
 * @date 5/3/18
 */

public class Event {
	public int EVENTTYPE;
	public String DESC;
	Event(int eventType, String desc){
		this.EVENTTYPE = eventType;
		this.DESC = desc;
	}
	public static Event event01 = new Event(1,"desc for event01");
	public static Event event02 = new Event(2,"desc for event02");

}
