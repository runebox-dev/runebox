import io.runebox.ObfInfo;

public class Class153 extends Class181 {
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 982220485)
	public int field1708;
	// $FF: synthetic field
	public final Class180 this$0;

	public Class153(Class180 var1) {
		this.this$0 = var1;
		this.field1708 = -1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3087(Class521 var1) {
		this.field1708 = var1.method9407();
		var1.method9405();
		if (var1.method9405() != 255) {
			--var1.field5219;
			var1.method9411();
		}

	}

	@ObfInfo(name = "al", desc = "(Lgo;I)V")
	public void method3089(Class171 var1) {
		var1.method3549(this.field1708);
	}

	@ObfInfo(name = "az", desc = "(BI)C", opaque = "906010203")
	public static char method3288(byte var0) {
		int var2 = var0 & 255;
		if (var2 == 0) {
			throw new IllegalArgumentException("" + Integer.toString(var2, 16));
		} else {
			if (var2 >= 128 && var2 < 160) {
				char var3 = Class405.field4630[var2 - 128];
				if (var3 == 0) {
					var3 = '?';
				}

				var2 = var3;
			}

			return (char)var2;
		}
	}
}
