import io.runebox.ObfInfo;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

@ObfInfo(name = "ih")
public class Class216 {
	@ObfInfo(name = "aq", desc = "Z")
	public static boolean field2343;
	@ObfInfo(name = "ad", desc = "Ljava/io/File;")
	public static File field2342;
	@ObfInfo(name = "ag", desc = "Ljava/util/Hashtable;")
	public static Hashtable field2341;

	static {
		field2343 = false;
		field2341 = new Hashtable(16);
	}

	@ObfInfo(owner = "eg", name = "aq", desc = "(Ljava/io/File;I)V", opaque = "1479610029")
	public static void method2875(File var0) {
		field2342 = var0;
		if (!field2342.exists()) {
			throw new RuntimeException("");
		} else {
			field2343 = true;
		}
	}

	@ObfInfo(owner = "ja", name = "ad", desc = "(Ljava/lang/String;B)Ljava/io/File;", opaque = "19")
	public static File method4467(String var0) {
		if (!field2343) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)field2341.get(var0);
			if (var2 != null) {
				return var2;
			} else {
				File var3 = new File(field2342, var0);
				RandomAccessFile var4 = null;

				try {
					File var5 = new File(var3.getParent());
					if (!var5.exists()) {
						throw new RuntimeException("");
					} else {
						var4 = new RandomAccessFile(var3, "rw");
						int var6 = var4.read();
						var4.seek(0L);
						var4.write(var6);
						var4.seek(0L);
						var4.close();
						field2341.put(var0, var3);
						return var3;
					}
				} catch (Exception var8) {
					try {
						if (var4 != null) {
							var4.close();
							var4 = null;
						}
					} catch (Exception var7) {
					}

					throw new RuntimeException();
				}
			}
		}
	}

	@ObfInfo(owner = "gw", name = "ag", desc = "(B)V")
	public static void method3599() {
		field2341.clear();
	}
}
