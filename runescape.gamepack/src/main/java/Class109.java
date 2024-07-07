import io.runebox.ObfInfo;

@ObfInfo(name = "ee")
public class Class109 extends Class475 {
	@ObfInfo(name = "aq", desc = "Z")
	public final boolean field1377;

	public Class109(boolean var1) {
		this.field1377 = var1;
	}

	@ObfInfo(name = "aq", desc = "(Lsh;Lsh;I)I", opaque = "1822911600")
	public int method2863(Class476 var1, Class476 var2) {
		if (var1.field4969 != var2.field4969) {
			return this.field1377 ? var1.field4969 - var2.field4969 : var2.field4969 - var1.field4969;
		} else {
			return this.method8667(var1, var2);
		}
	}

	public int compare(Object var1, Object var2) {
		return this.method2863((Class476)var1, (Class476)var2);
	}

	@ObfInfo(name = "aq", desc = "(Lok;Lok;ZLqh;I)V")
	public static void method2859(Class375 var0, Class375 var1, boolean var2, Class424 var3) {
		Class187.field2006 = var0;
		Class187.field1009 = var1;
		Class99.field2009 = var2;
		Client.field918 = Class187.field2006.method7144(10);
		Class183.field1620 = var3;
	}
}
