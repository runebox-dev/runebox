import java.io.File;
import java.io.IOException;

public abstract class Class514 extends Class499 {
	public static File field1883;

	public Class514(int var1, int var2) {
		super(var1, var2);
	}

	public abstract int method9228();

	public abstract int method9229();

	public abstract int method9230();

	public static File method9324(String var0, String var1, int var2) {
		String var4 = var2 == 0 ? "" : "" + var2;
		field1883 = new File(Class90.field1336, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		Class521 var9;
		File var21;
		if (field1883.exists()) {
			try {
				Class525 var8 = new Class525(field1883, "rw", 10000L);

				int var10;
				for (var9 = new Class521((int)var8.method9674()); var9.field5219 < var9.field5221.length; var9.field5219 += var10) {
					var10 = var8.method9682(var9.field5221, var9.field5219, var9.field5221.length - var9.field5219);
					if (var10 == -1) {
						throw new IOException();
					}
				}

				var9.field5219 = 0;
				var10 = var9.method9405();
				if (var10 < 1 || var10 > 3) {
					throw new IOException("" + var10);
				}

				int var11 = 0;
				if (var10 > 1) {
					var11 = var9.method9405();
				}

				if (var10 <= 2) {
					var5 = var9.method9577();
					if (var11 == 1) {
						var6 = var9.method9577();
					}
				} else {
					var5 = var9.method9602();
					if (var11 == 1) {
						var6 = var9.method9602();
					}
				}

				var8.method9672();
			} catch (IOException var18) {
				var18.printStackTrace();
			}

			if (var5 != null) {
				var21 = new File(var5);
				if (!var21.exists()) {
					var5 = null;
				}
			}

			if (var5 != null) {
				var21 = new File(var5, "test.dat");
				if (!Class426.method7869(var21, true)) {
					var5 = null;
				}
			}
		}

		if (var5 == null && var2 == 0) {
			label118:
			for (int var19 = 0; var19 < Class90.field1205.length; ++var19) {
				for (int var22 = 0; var22 < Class90.field1753.length; ++var22) {
					File var23 = new File(Class90.field1753[var22] + Class90.field1205[var19] + File.separatorChar + var0 + File.separatorChar);
					if (var23.exists() && Class426.method7869(new File(var23, "test.dat"), true)) {
						var5 = var23.toString();
						var7 = true;
						break label118;
					}
				}
			}
		}

		if (var5 == null) {
			var5 = Class90.field1336 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var7 = true;
		}

		File var20;
		if (var6 != null) {
			var20 = new File(var6);
			var21 = new File(var5);

			try {
				File[] var24 = var20.listFiles();

				for (int var12 = 0; var12 < var24.length; ++var12) {
					File var13 = var24[var12];
					File var14 = new File(var21, var13.getName());
					boolean var15 = var13.renameTo(var14);
					if (!var15) {
						throw new IOException();
					}
				}
			} catch (Exception var17) {
				var17.printStackTrace();
			}

			var7 = true;
		}

		if (var7) {
			var20 = new File(var5);
			var9 = null;

			try {
				Class525 var25 = new Class525(field1883, "rw", 10000L);
				Class521 var26 = new Class521(500);
				var26.method9388(3);
				var26.method9388(var9 != null ? 1 : 0);
				var26.method9397(var20.getPath());
				if (var9 != null) {
					var26.method9397("");
				}

				var25.method9668(var26.field5221, 0, var26.field5219);
				var25.method9672();
			} catch (IOException var16) {
				var16.printStackTrace();
			}
		}

		return new File(var5);
	}
}
