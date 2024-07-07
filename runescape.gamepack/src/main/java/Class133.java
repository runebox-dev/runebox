import io.runebox.ObfInfo;
import java.util.concurrent.ThreadFactory;

@ObfInfo(name = "fc")
final class Class133 implements ThreadFactory {
	public Class133() {
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
