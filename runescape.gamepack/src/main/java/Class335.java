import io.runebox.ObfInfo;
import java.util.concurrent.ThreadFactory;

@ObfInfo(name = "mw")
class Class335 implements ThreadFactory {
	// $FF: synthetic field
	public final Class315 this$0;

	public Class335(Class315 var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
