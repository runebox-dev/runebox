import io.runebox.ObfInfo;

@ObfInfo(name = "mb")
public class Class314 extends Class520 {
	@ObfInfo(name = "ap", desc = "[Lmb;")
	public static Class314[] field3274;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1616725987)
	public static int field3268;
	@ObfInfo(name = "aq", desc = "Lmi;")
	public Class321 field3272;
	@ObfInfo(name = "ag", desc = "Lug;")
	public Class527 field3270;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1846608577)
	public int field3269;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -95056223)
	public int field3271;

	static {
		field3274 = new Class314[300];
		field3268 = 0;
	}

	@ObfInfo(name = "ak", desc = "(I)V", opaque = "-1743228145")
	public void method6079() {
		if (field3268 < field3274.length) {
			field3274[++field3268 - 1] = this;
		}
	}

	@ObfInfo(owner = "ma", name = "aq", desc = "(B)Lmb;", opaque = "1")
	public static Class314 method6078() {
		return 0 == field3268 ? new Class314() : field3274[--field3268];
	}

	@ObfInfo(owner = "js", name = "ag", desc = "(B)Lmb;")
	public static Class314 method4937() {
		Class314 var1 = method6078();
		var1.field3272 = null;
		var1.field3269 = 0;
		var1.field3270 = new Class527(5000);
		return var1;
	}
}
