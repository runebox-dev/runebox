import io.runebox.ObfInfo;

@ObfInfo(name = "bg")
public class Class33 {
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1667996831)
	public int field165;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 677815153)
	public int field166;

	public Class33(int var1, int var2) {
		this.field166 = var1;
		this.field165 = var2;
	}

	@ObfInfo(name = "aq", desc = "(Lbm;I)Z", opaque = "-268771015")
	public boolean method445(Class39 var1) {
		if (var1 == null) {
			return false;
		} else {
			switch(this.field166) {
			case 1:
				return var1.method562(this.field165);
			case 2:
				return var1.method564(this.field165);
			case 3:
				return var1.method556((char)this.field165);
			case 4:
				return var1.method557(this.field165 == 1);
			default:
				return false;
			}
		}
	}

	@ObfInfo(name = "aq", desc = "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Lpe;I)I", opaque = "-1386147656")
	public static int method449(CharSequence var0, CharSequence var1, Class395 var2) {
		int var4 = var0.length();
		int var5 = var1.length();
		int var6 = 0;
		int var7 = 0;
		char var8 = 0;
		char var9 = 0;

		while (var6 - var8 < var4 || var7 - var9 < var5) {
			if (var6 - var8 >= var4) {
				return -1;
			}

			if (var7 - var9 >= var5) {
				return 1;
			}

			char var10;
			if (var8 != 0) {
				var10 = var8;
				boolean var15 = false;
			} else {
				var10 = var0.charAt(var6++);
			}

			char var11;
			if (var9 != 0) {
				var11 = var9;
				boolean var16 = false;
			} else {
				var11 = var1.charAt(var7++);
			}

			var8 = Class418.method2631(var10);
			var9 = Class418.method2631(var11);
			var10 = Class418.method3336(var10, var2);
			var11 = Class418.method3336(var11, var2);
			if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
				var10 = Character.toLowerCase(var10);
				var11 = Character.toLowerCase(var11);
				if (var11 != var10) {
					return Class418.method7616(var10, var2) - Class418.method7616(var11, var2);
				}
			}
		}

		int var17 = Math.min(var4, var5);

		char var13;
		int var18;
		for (var18 = 0; var18 < var17; ++var18) {
			if (Class395.field4607 == var2) {
				var6 = var4 - 1 - var18;
				var7 = var5 - 1 - var18;
			} else {
				var7 = var18;
				var6 = var18;
			}

			char var12 = var0.charAt(var6);
			var13 = var1.charAt(var7);
			if (var13 != var12 && Character.toUpperCase(var12) != Character.toUpperCase(var13)) {
				var12 = Character.toLowerCase(var12);
				var13 = Character.toLowerCase(var13);
				if (var13 != var12) {
					return Class418.method7616(var12, var2) - Class418.method7616(var13, var2);
				}
			}
		}

		var18 = var4 - var5;
		if (var18 != 0) {
			return var18;
		} else {
			for (int var19 = 0; var19 < var17; ++var19) {
				var13 = var0.charAt(var19);
				char var14 = var1.charAt(var19);
				if (var14 != var13) {
					return Class418.method7616(var13, var2) - Class418.method7616(var14, var2);
				}
			}

			return 0;
		}
	}
}
