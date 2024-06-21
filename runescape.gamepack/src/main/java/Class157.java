import io.runebox.ObfInfo;

public class Class157 extends Class149 {
	@ObfInfo(name = "al", desc = "I", intMultiplier = -73970559)
	public int field1754;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 774154011)
	public int field1755;
	// $FF: synthetic field
	public final Class151 this$0;

	public Class157(Class151 var1) {
		this.this$0 = var1;
	}

	@ObfInfo(name = "ak", desc = "(Lua;I)V")
	public void method3066(Class521 var1) {
		this.field1755 = var1.method9410();
		this.field1754 = var1.method9410();
	}

	@ObfInfo(name = "al", desc = "(Lgc;B)V")
	public void method3067(Class159 var1) {
		var1.method3389(this.field1755, this.field1754);
	}

	@ObfInfo(name = "ak", desc = "(J)Ljava/lang/String;")
	public static String method3324(long var0) {
		if (var0 > 0L && var0 < 6582952005840035281L) {
			if (var0 % 37L == 0L) {
				return null;
			} else {
				int var2 = 0;

				for (long var3 = var0; var3 != 0L; var3 /= 37L) {
					++var2;
				}

				StringBuilder var5;
				char var8;
				for (var5 = new StringBuilder(var2); 0L != var0; var5.append(var8)) {
					long var6 = var0;
					var0 /= 37L;
					var8 = Class422.field4681[(int)(var6 - var0 * 37L)];
					if (var8 == '_') {
						int var9 = var5.length() - 1;
						var5.setCharAt(var9, Character.toUpperCase(var5.charAt(var9)));
						var8 = 160;
					}
				}

				var5.reverse();
				var5.setCharAt(0, Character.toUpperCase(var5.charAt(0)));
				return var5.toString();
			}
		} else {
			return null;
		}
	}
}
