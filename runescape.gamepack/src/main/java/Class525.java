import io.runebox.ObfInfo;

@ObfInfo(name = "ue")
public class Class525 implements Class393 {
	@ObfInfo(name = "ad", desc = "Lue;")
	public static final Class525 field5244;
	@ObfInfo(name = "ag", desc = "Lue;")
	public static final Class525 field5246;
	@ObfInfo(name = "aq", desc = "Lue;")
	public static final Class525 field5250;
	@ObfInfo(name = "aj", desc = "Luc;")
	public final Class523 field5249;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 2037116603)
	public final int field5247;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 224872429)
	public final int field5248;
	@ObfInfo(name = "an", desc = "Ljava/lang/Class;")
	public final Class field5251;

	static {
		field5250 = new Class525(0, 0, Integer.class, new Class542());
		field5244 = new Class525(2, 1, Long.class, new Class532());
		field5246 = new Class525(1, 2, String.class, new Class544());
	}

	public Class525(int var1, int var2, Class var3, Class523 var4) {
		this.field5247 = var1;
		this.field5248 = var2;
		this.field5251 = var3;
		this.field5249 = var4;
	}

	@ObfInfo(name = "aq", desc = "(I)I")
	public int method129() {
		return this.field5248;
	}

	@ObfInfo(name = "ap", desc = "(Lvp;B)Ljava/lang/Object;")
	public Object method9298(Class562 var1) {
		return this.field5249.method9289(var1);
	}

	@ObfInfo(name = "ag", desc = "(I)[Lue;")
	public static Class525[] method9304() {
		return new Class525[]{field5246, field5250, field5244};
	}

	@ObfInfo(name = "ap", desc = "(II)V", opaque = "925637845")
	public static void method9309(int var0) {
		Class89 var2 = (Class89)Class89.field1120.method9439((long)var0);
		if (var2 != null) {
			for (int var3 = 0; var3 < var2.field1119.length; ++var3) {
				var2.field1119[var3] = -1;
				var2.field1118[var3] = 0;
			}

		}
	}

	@ObfInfo(name = "ak", desc = "(Ljava/lang/Object;Lvp;B)V", opaque = "13")
	public static void method9296(Object var0, Class562 var1) {
		Class var4 = var0.getClass();
		Class525[] var6 = method9304();
		int var7 = 0;

		Class525 var5;
		while (true) {
			if (var7 >= var6.length) {
				var5 = null;
				break;
			}

			Class525 var8 = var6[var7];
			if (var8.field5251 == var4) {
				var5 = var8;
				break;
			}

			++var7;
		}

		if (var5 == null) {
			throw new IllegalArgumentException();
		} else {
			Class523 var3 = var5.field5249;
			var3.method9290(var0, var1);
		}
	}
}
