import io.runebox.ObfInfo;
import java.util.concurrent.ThreadFactory;

@ObfInfo(name = "ma")
class Class313 implements ThreadFactory {
	// $FF: synthetic field
	@ObfInfo(name = "this$0", desc = "Lmw;")
	public final Class335 this$0;

	public Class313(Class335 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "newThread", desc = "(Ljava/lang/Runnable;)Ljava/lang/Thread;")
	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
