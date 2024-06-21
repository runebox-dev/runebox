import io.runebox.ObfInfo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfInfo(name = "gw")
public class Class179 {
	@ObfInfo(name = "aq", desc = "Luh;")
	public static Class528 field1885;
	@ObfInfo(name = "av", desc = "Luh;")
	public static Class528 field1886;
	@ObfInfo(name = "ap", desc = "Luh;")
	public static Class528 field1890;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -1969802501)
	public static int field1889;
	@ObfInfo(owner = "ka", name = "aa", desc = "I", intMultiplier = -1888550529)
	public static int field2841;
	@ObfInfo(name = "az", desc = "Ljava/io/File;")
	public static File field1883;
	@ObfInfo(owner = "ab", name = "af", desc = "Ljava/io/File;")
	public static File field6;
	@ObfInfo(owner = "dw", name = "an", desc = "Ljava/lang/String;")
	public static String field1336;
	@ObfInfo(owner = "fi", name = "ai", desc = "Ljava/lang/String;")
	public static String field1600;
	@ObfInfo(owner = "dm", name = "au", desc = "[Ljava/lang/String;")
	public static String[] field1205;
	@ObfInfo(owner = "ga", name = "ay", desc = "[Ljava/lang/String;")
	public static String[] field1753;

	static {
		field1886 = null;
		field1885 = null;
		field1890 = null;
	}

	@ObfInfo(owner = "dl", name = "ak", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", opaque = "220178351")
	public static void method2405(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		field2841 = var4;
		field1889 = var3;

		try {
			field1600 = System.getProperty("os.name");
		} catch (Exception var14) {
			field1600 = "Unknown";
		}

		Class513.field957 = field1600.toLowerCase();
		field1336 = null;

		try {
			field1336 = System.getProperty("jagex.userhome");
		} catch (Exception var13) {
		}

		if (field1336 == null) {
			try {
				field1336 = System.getProperty("user.home");
			} catch (Exception var12) {
			}
		}

		if (field1336 != null) {
			field1336 = field1336 + "/";
		}

		try {
			if (Class513.field957.startsWith("win")) {
				if (field1336 == null) {
					field1336 = System.getenv("USERPROFILE");
				}
			} else if (field1336 == null) {
				field1336 = System.getenv("HOME");
			}

			if (field1336 != null) {
				field1336 = field1336 + "/";
			}
		} catch (Exception var11) {
		}

		if (field1336 == null) {
			field1336 = "~/";
		}

		field1753 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field1336, "/tmp/", ""};
		field1205 = new String[]{".jagex_cache_" + field1889, ".file_store_" + field1889};
		int var6 = 0;

		label131:
		while (var6 < 4) {
			field6 = method9324(var0, var2, var6);
			if (!field6.exists()) {
				field6.mkdirs();
			}

			File[] var7 = field6.listFiles();
			if (var7 == null) {
				break;
			}

			int var9 = 0;

			while (true) {
				if (var9 >= var7.length) {
					break label131;
				}

				File var10 = var7[var9];
				if (!method7869(var10, false)) {
					++var6;
					break;
				}

				++var9;
			}
		}

		Class165.method7866(field6);

		try {
			File var16 = new File(field1336, "random.dat");
			int var8;
			if (var16.exists()) {
				field1886 = new Class528(new Class525(var16, "rw", 25L), 24, 0);
			} else {
				label113:
				for (int var17 = 0; var17 < field1205.length; ++var17) {
					for (var8 = 0; var8 < field1753.length; ++var8) {
						File var19 = new File(field1753[var8] + field1205[var17] + File.separatorChar + "random.dat");
						if (var19.exists()) {
							field1886 = new Class528(new Class525(var19, "rw", 25L), 24, 0);
							break label113;
						}
					}
				}
			}

			if (field1886 == null) {
				RandomAccessFile var18 = new RandomAccessFile(var16, "rw");
				var8 = var18.read();
				var18.seek(0L);
				var18.write(var8);
				var18.seek(0L);
				var18.close();
				field1886 = new Class528(new Class525(var16, "rw", 25L), 24, 0);
			}
		} catch (IOException var15) {
		}

		field1885 = new Class528(new Class525(Class165.method4168("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		field1890 = new Class528(new Class525(Class165.method4168("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Client.field910 = new Class528[field2841];

		for (var6 = 0; var6 < field2841; ++var6) {
			Client.field910[var6] = new Class528(new Class525(Class165.method4168("main_file_cache.idx" + var6), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfInfo(owner = "tt", name = "al", desc = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;", opaque = "2")
	public static File method9324(String var0, String var1, int var2) {
		String var4 = var2 == 0 ? "" : "" + var2;
		field1883 = new File(field1336, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
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
				if (!method7869(var21, true)) {
					var5 = null;
				}
			}
		}

		if (var5 == null && var2 == 0) {
			label118:
			for (int var19 = 0; var19 < field1205.length; ++var19) {
				for (int var22 = 0; var22 < field1753.length; ++var22) {
					File var23 = new File(field1753[var22] + field1205[var19] + File.separatorChar + var0 + File.separatorChar);
					if (var23.exists() && method7869(new File(var23, "test.dat"), true)) {
						var5 = var23.toString();
						var7 = true;
						break label118;
					}
				}
			}
		}

		if (var5 == null) {
			var5 = field1336 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
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

	@ObfInfo(owner = "qj", name = "aj", desc = "(Ljava/io/File;ZS)Z", opaque = "10304")
	public static boolean method7869(File var0, boolean var1) {
		try {
			RandomAccessFile var3 = new RandomAccessFile(var0, "rw");
			int var4 = var3.read();
			var3.seek(0L);
			var3.write(var4);
			var3.seek(0L);
			var3.close();
			if (var1) {
				var0.delete();
			}

			return true;
		} catch (Exception var5) {
			return false;
		}
	}

	@ObfInfo(owner = "er", name = "az", desc = "(Ljava/lang/String;Ljava/lang/String;ZI)Lue;", opaque = "458391556")
	public static Class525 method2980(String var0, String var1, boolean var2) {
		File var4 = new File(field6, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				Class525 var11 = new Class525(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (33 == field1889) {
			var5 = "_rc";
		} else if (34 == field1889) {
			var5 = "_wip";
		}

		File var6 = new File(field1336, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		Class525 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new Class525(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}

		try {
			var7 = new Class525(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	@ObfInfo(owner = "cm", name = "af", desc = "(I)[B", opaque = "-618267210")
	public static byte[] method1804() {
		byte[] var1 = new byte[24];

		try {
			field1886.method9736(0L);
			field1886.method9710(var1);

			int var2;
			for (var2 = 0; var2 < 24 && var1[var2] == 0; ++var2) {
			}

			if (var2 >= 24) {
				throw new IOException();
			}
		} catch (Exception var4) {
			for (int var3 = 0; var3 < 24; ++var3) {
				var1[var3] = -1;
			}
		}

		return var1;
	}

	@ObfInfo(owner = "ea", name = "aa", desc = "(Lua;IB)V", opaque = "17")
	public static void method2751(Class521 var0, int var1) {
		if (field1886 != null) {
			try {
				field1886.method9736(0L);
				field1886.method9709(var0.field5221, var1, 24);
			} catch (Exception var4) {
			}
		}

	}

	@ObfInfo(owner = "gj", name = "at", desc = "(I)V", opaque = "-2030374715")
	public static void method3510() {
		try {
			field1885.method9707();

			for (int var1 = 0; var1 < field2841; ++var1) {
				Client.field910[var1].method9707();
			}

			field1890.method9707();
			field1886.method9707();
		} catch (Exception var2) {
		}

	}
}
