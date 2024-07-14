import io.runebox.ObfInfo;

@ObfInfo(name = "gn")
public class Class170 extends Class149 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1757786379)
	public int field1856;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1586739759)
	public int field1857;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class170(Class144 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1857 = var1.method9832();
		this.field1856 = var1.method9832();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3469(this.field1857, this.field1856);
	}

	@ObfInfo(name = "ag", desc = "(III)I", opaque = "-1609232635")
	public static int method3541(int var0, int var1) {
		Class89 var3 = (Class89)Class89.field1120.method9439((long)var0);
		if (var3 == null) {
			return 0;
		} else if (var1 == -1) {
			return 0;
		} else {
			int var4 = 0;

			for (int var5 = 0; var5 < var3.field1118.length; ++var5) {
				if (var3.field1119[var5] == var1) {
					var4 += var3.field1118[var5];
				}
			}

			return var4;
		}
	}
}
