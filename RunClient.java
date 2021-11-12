import java.util.function.Consumer;

public class RunClient implements Consumer<Object> {
	
	@Override
	public void accept(Object o) {
		System.out.println(o);
	}

}