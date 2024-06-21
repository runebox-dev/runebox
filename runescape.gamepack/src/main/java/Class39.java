import io.runebox.ObfInfo;

public class Class39 implements Runnable {
	@ObfInfo(name = "ak", desc = "[Lbd;")
	public volatile Class30[] field276;

	public Class39() {
		this.field276 = new Class30[2];
	}

	public void run() {
		try {
			for (int var1 = 0; var1 < 2; ++var1) {
				Class30 var2 = this.field276[var1];
				if (var2 != null) {
					var2.method449();
				}
			}
		} catch (Exception var3) {
			Class548.method8904((String)null, var3);
		}

	}

	@ObfInfo(name = "ak", desc = "(I)V")
	public static void method789() {
		Class220.field2220.method5995();
	}
}
