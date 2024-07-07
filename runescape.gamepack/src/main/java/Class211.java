import io.runebox.ObfInfo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfInfo(name = "ic")
public class Class211 {
	@ObfInfo(name = "au", desc = "Luf;")
	public static Class526 field2285;
	@ObfInfo(name = "ah", desc = "Luf;")
	public static Class526 field2286;
	@ObfInfo(name = "az", desc = "Luf;")
	public static Class526 field2287;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -191524709)
	public static int field2288;
	@ObfInfo(owner = "al", name = "an", desc = "I", intMultiplier = 37968869)
	public static int field63;
	@ObfInfo(name = "ak", desc = "Ljava/io/File;")
	public static File field2282;
	@ObfInfo(owner = "iu", name = "ap", desc = "Ljava/io/File;")
	public static File field2467;
	@ObfInfo(name = "aw", desc = "Ljava/lang/String;")
	public static String field2280;
	@ObfInfo(owner = "cz", name = "at", desc = "Ljava/lang/String;")
	public static String field950;
	@ObfInfo(owner = "dp", name = "ay", desc = "[Ljava/lang/String;")
	public static String[] field1154;
	@ObfInfo(owner = "fs", name = "al", desc = "[Ljava/lang/String;")
	public static String[] field1683;

	static {
		field2285 = null;
		field2286 = null;
		field2287 = null;
	}

	@ObfInfo(owner = "iw", name = "aq", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIB)V", opaque = "3")
	public static void method4429(String var0, String var1, String var2, int var3, int var4) throws IOException {
		if (var1 != null && !var1.isEmpty()) {
			var0 = var0 + "-" + var1;
		}

		field63 = var4;
		field2288 = var3;

		try {
			field2280 = System.getProperty("os.name");
		} catch (Exception var14) {
			field2280 = "Unknown";
		}

		Class495.field1084 = field2280.toLowerCase();
		field950 = null;

		try {
			field950 = System.getProperty("jagex.userhome");
		} catch (Exception var13) {
		}

		if (field950 == null) {
			try {
				field950 = System.getProperty("user.home");
			} catch (Exception var12) {
			}
		}

		if (field950 != null) {
			field950 = field950 + "/";
		}

		try {
			if (Class495.field1084.startsWith("win")) {
				if (field950 == null) {
					field950 = System.getenv("USERPROFILE");
				}
			} else if (field950 == null) {
				field950 = System.getenv("HOME");
			}

			if (field950 != null) {
				field950 = field950 + "/";
			}
		} catch (Exception var11) {
		}

		if (field950 == null) {
			field950 = "~/";
		}

		field1683 = new String[]{"c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/", "c:/", field950, "/tmp/", ""};
		field1154 = new String[]{".jagex_cache_" + field2288, ".file_store_" + field2288};
		int var6 = 0;

		label131:
		while (var6 < 4) {
			field2467 = method572(var0, var2, var6);
			if (!field2467.exists()) {
				field2467.mkdirs();
			}

			File[] var7 = field2467.listFiles();
			if (var7 == null) {
				break;
			}

			int var9 = 0;

			while (true) {
				if (var9 >= var7.length) {
					break label131;
				}

				File var10 = var7[var9];
				if (!method3373(var10, false)) {
					++var6;
					break;
				}

				++var9;
			}
		}

		Class216.method2875(field2467);

		try {
			File var16 = new File(field950, "random.dat");
			int var8;
			if (var16.exists()) {
				field2285 = new Class526(new Class539(var16, "rw", 25L), 24, 0);
			} else {
				label113:
				for (int var17 = 0; var17 < field1154.length; ++var17) {
					for (var8 = 0; var8 < field1683.length; ++var8) {
						File var19 = new File(field1683[var8] + field1154[var17] + File.separatorChar + "random.dat");
						if (var19.exists()) {
							field2285 = new Class526(new Class539(var19, "rw", 25L), 24, 0);
							break label113;
						}
					}
				}
			}

			if (field2285 == null) {
				RandomAccessFile var18 = new RandomAccessFile(var16, "rw");
				var8 = var18.read();
				var18.seek(0L);
				var18.write(var8);
				var18.seek(0L);
				var18.close();
				field2285 = new Class526(new Class539(var16, "rw", 25L), 24, 0);
			}
		} catch (IOException var15) {
		}

		field2286 = new Class526(new Class539(Class216.method4467("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		field2287 = new Class526(new Class539(Class216.method4467("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Client.field1750 = new Class526[field63];

		for (var6 = 0; var6 < field63; ++var6) {
			Client.field1750[var6] = new Class526(new Class539(Class216.method4467("main_file_cache.idx" + var6), "rw", 1048576L), 6000, 0);
		}

	}

	@ObfInfo(owner = "bn", name = "ad", desc = "(Ljava/lang/String;Ljava/lang/String;IB)Ljava/io/File;", opaque = "1")
	public static File method572(String var0, String var1, int var2) {
		String var4 = var2 == 0 ? "" : "" + var2;
		field2282 = new File(field950, "jagex_cl_" + var0 + "_" + var1 + var4 + ".dat");
		String var5 = null;
		String var6 = null;
		boolean var7 = false;
		File var20;
		if (field2282.exists()) {
			try {
				Class539 var8 = new Class539(field2282, "rw", 10000L);

				Class562 var9;
				int var10;
				for (var9 = new Class562((int)var8.method9483()); var9.field5471 < var9.field5472.length; var9.field5471 += var10) {
					var10 = var8.method9499(var9.field5472, var9.field5471, var9.field5472.length - var9.field5471);
					if (var10 == -1) {
						throw new IOException();
					}
				}

				var9.field5471 = 0;
				var10 = var9.method9902();
				if (var10 < 1 || var10 > 3) {
					throw new IOException("" + var10);
				}

				int var11 = 0;
				if (var10 > 1) {
					var11 = var9.method9902();
				}

				if (var10 <= 2) {
					var5 = var9.method9980();
					if (var11 == 1) {
						var6 = var9.method9980();
					}
				} else {
					var5 = var9.method9839();
					if (var11 == 1) {
						var6 = var9.method9839();
					}
				}

				var8.method9481();
			} catch (IOException var17) {
				var17.printStackTrace();
			}

			if (var5 != null) {
				var20 = new File(var5);
				if (!var20.exists()) {
					var5 = null;
				}
			}

			if (var5 != null) {
				var20 = new File(var5, "test.dat");
				if (!method3373(var20, true)) {
					var5 = null;
				}
			}
		}

		if (var5 == null && var2 == 0) {
			label103:
			for (int var18 = 0; var18 < field1154.length; ++var18) {
				for (int var21 = 0; var21 < field1683.length; ++var21) {
					File var22 = new File(field1683[var21] + field1154[var18] + File.separatorChar + var0 + File.separatorChar);
					if (var22.exists() && method3373(new File(var22, "test.dat"), true)) {
						var5 = var22.toString();
						var7 = true;
						break label103;
					}
				}
			}
		}

		if (var5 == null) {
			var5 = field950 + File.separatorChar + "jagexcache" + var4 + File.separatorChar + var0 + File.separatorChar + var1 + File.separatorChar;
			var7 = true;
		}

		if (var6 != null) {
			File var19 = new File(var6);
			var20 = new File(var5);

			try {
				File[] var23 = var19.listFiles();

				for (int var12 = 0; var12 < var23.length; ++var12) {
					File var13 = var23[var12];
					File var14 = new File(var20, var13.getName());
					boolean var15 = var13.renameTo(var14);
					if (!var15) {
						throw new IOException();
					}
				}
			} catch (Exception var16) {
				var16.printStackTrace();
			}

			var7 = true;
		}

		if (var7) {
			method4422(new File(var5), (File)null);
		}

		return new File(var5);
	}

	@ObfInfo(owner = "it", name = "ag", desc = "(Ljava/io/File;Ljava/io/File;I)V", opaque = "11316396")
	public static void method4422(File var0, File var1) {
		try {
			Class539 var3 = new Class539(field2282, "rw", 10000L);
			Class562 var4 = new Class562(500);
			var4.method9809(3);
			var4.method9809(var1 != null ? 1 : 0);
			var4.method9818(var0.getPath());
			if (var1 != null) {
				var4.method9818("");
			}

			var3.method9486(var4.field5472, 0, var4.field5471);
			var3.method9481();
		} catch (IOException var5) {
			var5.printStackTrace();
		}

	}

	@ObfInfo(owner = "ge", name = "ak", desc = "(Ljava/io/File;ZI)Z", opaque = "-1409257065")
	public static boolean method3373(File var0, boolean var1) {
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

	@ObfInfo(owner = "ed", name = "ap", desc = "(Ljava/lang/String;Ljava/lang/String;ZI)Lus;", opaque = "1511539322")
	public static Class539 method2856(String var0, String var1, boolean var2) {
		File var4 = new File(field2467, "preferences" + var0 + ".dat");
		if (var4.exists()) {
			try {
				Class539 var11 = new Class539(var4, "rw", 10000L);
				return var11;
			} catch (IOException var10) {
			}
		}

		String var5 = "";
		if (field2288 == 33) {
			var5 = "_rc";
		} else if (field2288 == 34) {
			var5 = "_wip";
		}

		File var6 = new File(field950, "jagex_" + var1 + "_preferences" + var0 + var5 + ".dat");
		Class539 var7;
		if (!var2 && var6.exists()) {
			try {
				var7 = new Class539(var6, "rw", 10000L);
				return var7;
			} catch (IOException var9) {
			}
		}

		try {
			var7 = new Class539(var4, "rw", 10000L);
			return var7;
		} catch (IOException var8) {
			throw new RuntimeException();
		}
	}

	@ObfInfo(owner = "ii", name = "an", desc = "(Lvp;II)V", opaque = "1208496715")
	public static void method4175(Class562 var0, int var1) {
		if (field2285 != null) {
			try {
				field2285.method9313(0L);
				field2285.method9336(var0.field5472, var1, 24);
			} catch (Exception var4) {
			}
		}

	}

	@ObfInfo(owner = "di", name = "aj", desc = "(I)V", opaque = "10021972")
	public static void method2369() {
		try {
			field2286.method9312();

			for (int var1 = 0; var1 < field63; ++var1) {
				Client.field1750[var1].method9312();
			}

			field2287.method9312();
			field2285.method9312();
		} catch (Exception var2) {
		}

	}
}
