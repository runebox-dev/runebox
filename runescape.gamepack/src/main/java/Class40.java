import io.runebox.ObfInfo;

@ObfInfo(name = "bn")
public class Class40 implements Runnable {
	@ObfInfo(name = "aq", desc = "[Lbv;")
	public volatile Class48[] field203;

	public Class40() {
		this.field203 = new Class48[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				Class48 var2 = this.field203[var1];
				if (var2 != null) {
					var2.method806();
				}
			}
		} catch (Exception var3) {
			Class552.method8390((String)null, var3);
		}

	}
}
