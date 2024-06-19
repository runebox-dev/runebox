import java.util.concurrent.ThreadFactory;

class Class313 implements ThreadFactory {
	// $FF: synthetic field
	public final Class335 this$0;

	public Class313(Class335 var1) {
		this.this$0 = var1;
	}

	public Thread newThread(Runnable var1) {
		return new Thread(var1, "OSRS WAV Load");
	}
}
