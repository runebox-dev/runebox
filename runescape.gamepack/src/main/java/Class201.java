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

public class Class201 extends Class507 {
	@ObfInfo(name = "ak", desc = "Llm;")
	public static Class299 field2068;

	static {
		field2068 = new Class299(64);
	}

	@ObfInfo(owner = "id", name = "ak", desc = "(I)V")
	public static void method4057() {
		field2068.method5995();
	}

	@ObfInfo(name = "ak", desc = "(Luk;I)V", opaque = "-2047148320")
	public static void method3922(Class531 var0) {
		Class34 var2 = (Class34)Class47.field323.method7600();
		if (var2 != null) {
			int var3 = var0.field5219;
			var0.method9590(var2.field251);

			for (int var4 = 0; var4 < var2.field246; ++var4) {
				if (var2.field248[var4] != 0) {
					var0.method9388(var2.field248[var4]);
				} else {
					try {
						int var5 = var2.field247[var4];
						Field var6;
						int var7;
						if (var5 == 0) {
							var6 = var2.field245[var4];
							var7 = var6.getInt((Object)null);
							var0.method9388(0);
							var0.method9590(var7);
						} else if (var5 == 1) {
							var6 = var2.field245[var4];
							var6.setInt((Object)null, var2.field249[var4]);
							var0.method9388(0);
						} else if (var5 == 2) {
							var6 = var2.field245[var4];
							var7 = var6.getModifiers();
							var0.method9388(0);
							var0.method9590(var7);
						}

						Method var23;
						if (var5 != 3) {
							if (var5 == 4) {
								var23 = var2.field250[var4];
								var7 = var23.getModifiers();
								var0.method9388(0);
								var0.method9590(var7);
							}
						} else {
							var23 = var2.field250[var4];
							byte[][] var24 = var2.field252[var4];
							Object[] var8 = new Object[var24.length];

							for (int var9 = 0; var9 < var24.length; ++var9) {
								ObjectInputStream var10 = new ObjectInputStream(new ByteArrayInputStream(var24[var9]));
								var8[var9] = var10.readObject();
							}

							Object var25 = var23.invoke((Object)null, var8);
							if (var25 == null) {
								var0.method9388(0);
							} else if (var25 instanceof Number) {
								var0.method9388(1);
								var0.method9393(((Number)var25).longValue());
							} else if (var25 instanceof String) {
								var0.method9388(2);
								var0.method9473((String)var25);
							} else {
								var0.method9388(4);
							}
						}
					} catch (ClassNotFoundException var11) {
						var0.method9388(-10);
					} catch (InvalidClassException var12) {
						var0.method9388(-11);
					} catch (StreamCorruptedException var13) {
						var0.method9388(-12);
					} catch (OptionalDataException var14) {
						var0.method9388(-13);
					} catch (IllegalAccessException var15) {
						var0.method9388(-14);
					} catch (IllegalArgumentException var16) {
						var0.method9388(-15);
					} catch (InvocationTargetException var17) {
						var0.method9388(-16);
					} catch (SecurityException var18) {
						var0.method9388(-17);
					} catch (IOException var19) {
						var0.method9388(-18);
					} catch (NullPointerException var20) {
						var0.method9388(-19);
					} catch (Exception var21) {
						var0.method9388(-20);
					} catch (Throwable var22) {
						var0.method9388(-21);
					}
				}
			}

			var0.method9431(var3);
			var2.method9277();
		}
	}

	@ObfInfo(name = "al", desc = "(I)V", opaque = "364949411")
	public static void method3919() {
		for (Class77 var1 = (Class77)Class77.field976.method7482(); var1 != null; var1 = (Class77)Class77.field976.method7490()) {
			if (var1.field965 != null) {
				var1.method2177();
			}
		}

	}
}
