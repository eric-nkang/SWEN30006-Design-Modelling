package workshop01;

/**
 * workshop01.ObserverPattern
 *
 * @author Ning Kang
 * @date 5/3/18
 */

public class ObserverPattern {
	public static void main(String[] args){
		Subject s = new Subject("s01");
		Observer o1 = new Observer("o1");
		Observer o2 = new Observer("02");

		System.out.println("Register observer 1 for event 1 & 2 ");
		s.registerObserver(o1, Event.event01);
		s.registerObserver(o1, Event.event02);

		System.out.println("Register observer 2 onlky for event 2 ");
		s.registerObserver(o2, Event.event02);

		System.out.println("notify event 1");
		s.notifyAll(Event.event01);

		System.out.println("notify event 2");
		s.notifyAll(Event.event02);


	}
}
