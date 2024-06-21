import io.runebox.ObfInfo;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

@ObfInfo(name = "dl")
public class Class90 {
	@ObfInfo(desc = "I", intMultiplier = -1969802501)
	public static int field1889;
	@ObfInfo(desc = "I", intMultiplier = -1888550529)
	public static int field2841;
	@ObfInfo(desc = "Ljava/io/File;")
	public static File field6;
	@ObfInfo(desc = "Ljava/lang/String;")
	public static String field1336;
	@ObfInfo(desc = "Ljava/lang/String;")
	public static String field1600;
	@ObfInfo(desc = "Ljava/lang/String;")
	public static String field957;
	@ObfInfo(desc = "[Ljava/lang/String;")
	public static String[] field1205;
	@ObfInfo(desc = "[Ljava/lang/String;")
	public static String[] field1753;

	@ObfInfo(name = "ak", desc = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", opaque = "220178351")
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

		field957 = field1600.toLowerCase();
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
			if (field957.startsWith("win")) {
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
			field6 = Class514.method9324(var0, var2, var6);
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
				if (!Class426.method7869(var10, false)) {
					++var6;
					break;
				}

				++var9;
			}
		}

		Class425.method7866(field6);

		try {
			File var16 = new File(field1336, "random.dat");
			int var8;
			if (var16.exists()) {
				Class179.field1886 = new Class528(new Class525(var16, "rw", 25L), 24, 0);
			} else {
				label113:
				for (int var17 = 0; var17 < field1205.length; ++var17) {
					for (var8 = 0; var8 < field1753.length; ++var8) {
						File var19 = new File(field1753[var8] + field1205[var17] + File.separatorChar + "random.dat");
						if (var19.exists()) {
							Class179.field1886 = new Class528(new Class525(var19, "rw", 25L), 24, 0);
							break label113;
						}
					}
				}
			}

			if (Class179.field1886 == null) {
				RandomAccessFile var18 = new RandomAccessFile(var16, "rw");
				var8 = var18.read();
				var18.seek(0L);
				var18.write(var8);
				var18.seek(0L);
				var18.close();
				Class179.field1886 = new Class528(new Class525(var16, "rw", 25L), 24, 0);
			}
		} catch (IOException var15) {
		}

		Class179.field1885 = new Class528(new Class525(Class221.method4168("main_file_cache.dat2"), "rw", 1048576000L), 5200, 0);
		Class179.field1890 = new Class528(new Class525(Class221.method4168("main_file_cache.idx255"), "rw", 1048576L), 6000, 0);
		Client.field910 = new Class528[field2841];

		for (var6 = 0; var6 < field2841; ++var6) {
			Client.field910[var6] = new Class528(new Class525(Class221.method4168("main_file_cache.idx" + var6), "rw", 1048576L), 6000, 0);
		}

	}
}
