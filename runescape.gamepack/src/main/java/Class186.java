import io.runebox.ObfInfo;

@ObfInfo(name = "hd")
public class Class186 extends Class516 {
	@ObfInfo(name = "ad", desc = "Lmo;")
	public static Class327 field2001;
	@ObfInfo(owner = "qy", name = "aq", desc = "Lok;")
	public static Class375 field4783;
	@ObfInfo(name = "an", desc = "Z")
	public boolean field2000;
	@ObfInfo(name = "ag", desc = "C")
	public char field1996;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -718097847)
	public int field1999;
	@ObfInfo(name = "ap", desc = "Ljava/lang/String;")
	public String field1997;

	static {
		field2001 = new Class327(64);
	}

	public Class186() {
		this.field2000 = true;
	}

	@ObfInfo(name = "ag", desc = "(I)V")
	public void method3724() {
	}

	@ObfInfo(name = "ak", desc = "(Lvp;I)V", opaque = "-1837218856")
	public void method3725(Class562 var1) {
		while (true) {
			int var3 = var1.method9902();
			if (var3 == 0) {
				return;
			}

			this.method3723(var1, var3);
		}
	}

	@ObfInfo(name = "ap", desc = "(Lvp;IB)V", opaque = "1")
	public void method3723(Class562 var1, int var2) {
		if (var2 == 1) {
			this.field1996 = Class411.method7268(var1.method9955());
		} else if (var2 == 2) {
			this.field1999 = var1.method9832();
		} else if (var2 == 4) {
			this.field2000 = false;
		} else if (var2 == 5) {
			this.field1997 = var1.method9837();
		}

	}

	@ObfInfo(name = "an", desc = "(B)Z", opaque = "68")
	public boolean method3731() {
		return this.field1996 == 's';
	}

	@ObfInfo(owner = "bv", name = "aq", desc = "(Lok;B)V")
	public static void method865(Class375 var0) {
		field4783 = var0;
	}

	@ObfInfo(owner = "cq", name = "ad", desc = "(II)Lhd;", opaque = "164036444")
	public static Class186 method1971(int var0) {
		Class186 var2 = (Class186)field2001.method6327((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field4783.method7132(11, var0);
			var2 = new Class186();
			if (var3 != null) {
				var2.method3725(new Class562(var3));
			}

			var2.method3724();
			field2001.method6330(var2, (long)var0);
			return var2;
		}
	}
}
