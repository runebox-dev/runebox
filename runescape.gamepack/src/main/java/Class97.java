import io.runebox.ObfInfo;
import java.security.SecureRandom;
import java.util.concurrent.Callable;

@ObfInfo(name = "ds")
public class Class97 implements Callable {
	public Object call() {
		SecureRandom var2 = new SecureRandom();
		var2.nextInt();
		return var2;
	}
}
