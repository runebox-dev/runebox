import io.runebox.ObfInfo;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@ObfInfo(name = "bx")
public class Class50 {
	@ObfInfo(name = "aq", desc = "Lpi;")
	public static Class399 field318;

	static {
		field318 = new Class399();
	}

	@ObfInfo(owner = "ae", name = "aq", desc = "(Lug;I)V", opaque = "-1277755578")
	public static void method59(Class527 var0) {
		Class47 var2 = (Class47)field318.method7401();
		if (var2 != null) {
			int var3 = var0.field5471;
			var0.method9812(var2.field283);

			for (int var4 = 0; var4 < var2.field281; ++var4) {
				if (var2.field285[var4] != 0) {
					var0.method9809(var2.field285[var4]);
				} else {
					try {
						int var5 = var2.field282[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.field284[var4];
							var7 = var6.getInt((Object)null);
							var0.method9809(0);
							var0.method9812(var7);
						} else if (var5 == 1) {
							var6 = var2.field284[var4];
							var6.setInt((Object)null, var2.field289[var4]);
							var0.method9809(0);
						} else if (var5 == 2) {
							var6 = var2.field284[var4];
							var7 = var6.getModifiers();
							var0.method9809(0);
							var0.method9812(var7);
						}

						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.field286[var4];
								var7 = var23.getModifiers();
								var0.method9809(0);
								var0.method9812(var7);
							}
						} else {
							var23 = var2.field286[var4];
							byte[][] var24 = var2.field287[var4];
							Object[] var8 = new Object[var24.length];

							for (int var9 = 0; var9 < var24.length; ++var9) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}

							Object var25 = var23.invoke((Object)null, var8);
							if (var25 == null) {
								var0.method9809(0);
							} else if (var25 instanceof Number) {
								var0.method9809(1);
								var0.method10034(((Number)var25).longValue());
							} else if (var25 instanceof String) {
								var0.method9809(2);
								var0.method9816((String)var25);
							} else {
								var0.method9809(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.method9809(-10);
					} catch (InvalidClassException var12) {
						var0.method9809(-11);
					} catch (StreamCorruptedException var13) {
						var0.method9809(-12);
					} catch (OptionalDataException var14) {
						var0.method9809(-13);
					} catch (IllegalAccessException var15) {
						var0.method9809(-14);
					} catch (IllegalArgumentException var16) {
						var0.method9809(-15);
					} catch (InvocationTargetException var17) {
						var0.method9809(-16);
					} catch (SecurityException var18) {
						var0.method9809(-17);
					} catch (IOException var19) {
						var0.method9809(-18);
					} catch (NullPointerException var20) {
						var0.method9809(-19);
					} catch (Exception var21) {
						var0.method9809(-20);
					} catch (Throwable var22) {
						var0.method9809(-21);
					}
				}
			}

			var0.method10030(var3);
			var2.method9267();
		}
	}

	@ObfInfo(owner = "gr", name = "ad", desc = "(Lvp;II)V", opaque = "-1738452922")
	public static void method3572(Class562 var0, int var1) {
		Class47 var3 = new Class47();
		var3.field281 = var0.method9902();
		var3.field283 = var0.method9832();
		var3.field282 = new int[var3.field281];
		var3.field285 = new int[var3.field281];
		var3.field284 = new Field[var3.field281];
		var3.field289 = new int[var3.field281];
		var3.field286 = new Method[var3.field281];
		var3.field287 = new byte[var3.field281][][];

		for (int var4 = 0; var4 < var3.field281; ++var4) {
			try {
				int var5 = var0.method9902();
				String var6;
				String var7;
				int var8;
				if (var5 != 0 && var5 != 1 && var5 != 2) {
					if (var5 == 3 || var5 == 4) {
						var6 = var0.method9837();
						var7 = var0.method9837();
						var8 = var0.method9902();
						String[] var9 = new String[var8];

						for (int var10 = 0; var10 < var8; ++var10) {
							var9[var10] = var0.method9837();
						}

						String var26 = var0.method9837();
						byte[][] var11 = new byte[var8][];
						int var13;
						if (var5 == 3) {
							for (int var12 = 0; var12 < var8; ++var12) {
								var13 = var0.method9832();
								var11[var12] = new byte[var13];
								var0.method9840(var11[var12], 0, var13);
							}
						}

						var3.field282[var4] = var5;
						Class[] var27 = new Class[var8];

						for (var13 = 0; var13 < var8; ++var13) {
							var27[var13] = method3044(var9[var13]);
						}

						Class var28 = method3044(var26);
						if (method3044(var6).getClassLoader() == null) {
							throw new SecurityException();
						}

						Method[] var14 = method3044(var6).getDeclaredMethods();

						for (int var16 = 0; var16 < var14.length; ++var16) {
							Method var17 = var14[var16];
							if (var17.getName().equals(var7)) {
								Class[] var18 = var17.getParameterTypes();
								if (var27.length == var18.length) {
									boolean var19 = true;

									for (int var20 = 0; var20 < var27.length; ++var20) {
										if (var27[var20] != var18[var20]) {
											var19 = false;
											break;
										}
									}

									if (var19 && var17.getReturnType() == var28) {
										var3.field286[var4] = var17;
									}
								}
							}
						}

						var3.field287[var4] = var11;
					}
				} else {
					var6 = var0.method9837();
					var7 = var0.method9837();
					var8 = 0;
					if (var5 == 1) {
						var8 = var0.method9832();
					}

					var3.field282[var4] = var5;
					var3.field289[var4] = var8;
					if (method3044(var6).getClassLoader() == null) {
						throw new SecurityException();
					}

					var3.field284[var4] = method3044(var6).getDeclaredField(var7);
				}
			} catch (ClassNotFoundException var21) {
				var3.field285[var4] = -1;
			} catch (SecurityException var22) {
				var3.field285[var4] = -2;
			} catch (NullPointerException var23) {
				var3.field285[var4] = -3;
			} catch (Exception var24) {
				var3.field285[var4] = -4;
			} catch (Throwable var25) {
				var3.field285[var4] = -5;
			}
		}

		field318.method7449(var3);
	}

	@ObfInfo(owner = "ey", name = "ag", desc = "(Ljava/lang/String;I)Ljava/lang/Class;", opaque = "1988418218")
	public static Class method3044(String var0) throws ClassNotFoundException {
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
