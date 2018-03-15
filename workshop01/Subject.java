package workshop01;//package workshop01;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * workshop01.Subject
 *
 * @author Ning Kang
 * @date 5/3/18
 */


interface ISubject{
	void registerObserver(Observer o, Event e);
	void deregisterObserver(Observer o, Event e);
	void notifyAll(Event e);
}

public class Subject implements ISubject{
	private String name;

	public String getName() {
		return name;
	}

	HashMap<Integer,ArrayList<Observer>> observerList;

	public Subject(String name){
		this.name = name;

		observerList.put(Event.event01.EVENTTYPE,new ArrayList<Observer>());
		observerList.put(Event.event02.EVENTTYPE,new ArrayList<Observer>());
	}

	@Override
	public void registerObserver(Observer o, Event event) {
		this.observerList.get(event.EVENTTYPE).add(o);
	}

	@Override
	public void deregisterObserver(Observer o, Event e) {

		this.observerList.get(e.EVENTTYPE).remove(o);
	}

	@Override
	public void notifyAll(Event e) {
		for(Observer o:this.observerList.get(e.EVENTTYPE)){
				o.notify(this, e);
		}

	}
}
