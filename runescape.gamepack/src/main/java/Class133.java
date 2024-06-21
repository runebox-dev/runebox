import io.runebox.ObfInfo;
import java.util.concurrent.ThreadFactory;

@ObfInfo(name = "fc")
final class Class133 implements ThreadFactory {
	public Class133() {
	}

	@ObfInfo(name = "newThread", desc = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS Maya Anim Load");
	}
}
