import io.runebox.ObfInfo;

@ObfInfo(name = "gp")
public class Class172 extends Class149 {
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 370831747)
	public int field1864;
	// $FF: synthetic field
	public final Class144 this$0;

	public Class172(Class144 var1) {
		this.this$0 = var1;
		this.field1864 = -1;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;B)V")
	public void method3079(Class562 var1) {
		this.field1864 = var1.method9997();
	}

	@ObfInfo(name = "ad", desc = "(Lgk;B)V")
	public void method3080(Class167 var1) {
		var1.method3474(this.field1864);
	}

	@ObfInfo(name = "ad", desc = "(II)I")
	public static int method3550(int var0) {
		return var0 + -512;
	}
}
