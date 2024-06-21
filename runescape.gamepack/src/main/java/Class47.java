import io.runebox.ObfInfo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@ObfInfo(name = "bu")
public class Class47 {
	@ObfInfo(name = "ak", desc = "Lps;")
	public static Class409 field323;

	static {
		field323 = new Class409();
	}

	@ObfInfo(owner = "ed", name = "al", desc = "(Lua;IS)V", opaque = "129")
	public static void method2812(Class521 var0, int var1) {
		Class34 var3 = new Class34();
		var3.field246 = var0.method9405();
		var3.field251 = var0.method9410();
		var3.field247 = new int[var3.field246];
		var3.field248 = new int[var3.field246];
		var3.field245 = new Field[var3.field246];
		var3.field249 = new int[var3.field246];
		var3.field250 = new Method[var3.field246];
		var3.field252 = new byte[var3.field246][][];

		for (int var4 = 0; var4 < var3.field246; ++var4) {
			try {
				int var5 = var0.method9405();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.method9415();
						var7 = var0.method9415();
						var8 = var0.method9405();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.method9415();
						}

						String var26 = var0.method9415();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.method9410();
								var11[var12] = new byte[var13];
								var0.method9417(var11[var12], 0, var13);
							}
						}

						var3.field247[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = method2488(var9[var13]);
						}

						Class var28 = method2488(var26);
						if (method2488(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = method2488(var6).getDeclaredMethods();

						for (int var16 = 0; var16 < var14.length; ++var16) {
							Method var17 = var14[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var18.length == var27.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var18[var20] != var27[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var17.getReturnType() == var28) {
										var3.field250[var4] = var17;
									}
								}
							}
						}

						var3.field252[var4] = var11;
					}
				} else {
					var6 = var0.method9415();
					var7 = var0.method9415();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.method9410();
					}

					var3.field247[var4] = var5;
					var3.field249[var4] = var8;
					if (method2488(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.field245[var4] = method2488(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.field248[var4] = -1;
			} catch (SecurityException var22) {
				var3.field248[var4] = -2;
			} catch (NullPointerException var23) {
				var3.field248[var4] = -3;
			} catch (Exception var24) {
				var3.field248[var4] = -4;
			} catch (Throwable var25) {
				var3.field248[var4] = -5;
			}
		}

		field323.method7597(var3);
	}

	@ObfInfo(owner = "dq", name = "aj", desc = "(Ljava/lang/String;I)Ljava/lang/Class;", opaque = "-122815648")
	public static Class method2488(String var0) throws ClassNotFoundException {
		if (var0.equals("B")) {
			return Byte.TYPE;
		} else if (var0.equals("I")) {
			return Integer.TYPE;
		} else if (var0.equals("S")) {
			return Short.TYPE;
		} else if (var0.equals("J")) {
			return Long.TYPE;
		} else if (var0.equals("Z")) {
			return Boolean.TYPE;
		} else if (var0.equals("F")) {
			return Float.TYPE;
		} else if (var0.equals("D")) {
			return Double.TYPE;
		} else if (var0.equals("C")) {
			return Character.TYPE;
		} else {
			return var0.equals("void") ? Void.TYPE : Class.forName(var0);
		}
	}
}
