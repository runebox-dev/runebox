public class Class398 {
	public static int method5569(CharSequence var0, CharSequence var1, Class402 var2) {
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

			var8 = Class83.method2297(var10);
			var9 = Class83.method2297(var11);
			var10 = Class82.method2247(var10, var2);
			var11 = Class82.method2247(var11, var2);
			if (var11 != var10 && Character.toUpperCase(var10) != Character.toUpperCase(var11)) {
				var10 = Character.toLowerCase(var10);
				var11 = Character.toLowerCase(var11);
				if (var11 != var10) {
					return method6299(var10, var2) - method6299(var11, var2);
				}
			}
		}

		int var17 = Math.min(var4, var5);

		char var13;
		int var18;
		for (var18 = 0; var18 < var17; ++var18) {
			if (Class402.field4610 == var2) {
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
					return method6299(var12, var2) - method6299(var13, var2);
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
					return method6299(var13, var2) - method6299(var14, var2);
				}
			}

			return 0;
		}
	}

	public static int method6299(char var0, Class402 var1) {
		int var3 = var0 << 4;
		if (Character.isUpperCase(var0) || Character.isTitleCase(var0)) {
			var0 = Character.toLowerCase(var0);
			var3 = (var0 << 4) + 1;
		}

		if (var0 == 241 && Class402.field4609 == var1) {
			var3 = 1762;
		}

		return var3;
	}
}