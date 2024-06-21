import io.runebox.ObfInfo;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Hashtable;

public class Class165 {
	@ObfInfo(name = "ak", desc = "Z")
	public static boolean field1822;
	@ObfInfo(owner = "mg", name = "al", desc = "Ljava/io/File;")
	public static File field3389;
	@ObfInfo(name = "aj", desc = "Ljava/util/Hashtable;")
	public static Hashtable field1819;

	static {
		field1822 = false;
		field1819 = new Hashtable(16);
	}

	@ObfInfo(owner = "qi", name = "ak", desc = "(Ljava/io/File;I)V", opaque = "1162380090")
	public static void method7866(File var0) {
		field3389 = var0;
		if (!field3389.exists()) {
			throw new RuntimeException("");
		} else {
			field1822 = true;
		}
	}

	@ObfInfo(owner = "im", name = "al", desc = "(Ljava/lang/String;I)Ljava/io/File;", opaque = "-2102894791")
	public static File method4168(String var0) {
		if (!field1822) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)field1819.get(var0);
			if (var2 != null) {
				return var2;
			} else {
				File var3 = new File(field3389, var0);
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
						field1819.put(var0, var3);
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

	@ObfInfo(owner = "cg", name = "aj", desc = "(B)V")
	public static void method1097() {
		field1819.clear();
	}
}
