package workshop01;//package workshop01;

/**
 * workshop01.Observer
 *
 * @author Ning Kang
 * @date 5/3/18
 */

interface IObserver{
	void notify(Subject s, Event e);
}
public class Observer implements IObserver{
	private String name;

	Observer(String name){
		this.name = name;
	}

	@Override
	public void notify(Subject s, Event e) {
		System.out.println(
				String.format("%s get notified for event %s by %s",
						this.name,
						e.DESC,
						s.getName())
				);

	}
}
