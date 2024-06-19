public class Class39 implements Runnable {
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

	public static void method3061() {
		Class198.field2027.method5995();
	}

	public static void method789() {
		Class220.field2220.method5995();
	}

	public static void method785() {
		Class332.field3456.clear();
	}
}
