import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;

public class Class221 {
	public static final Class221 field2225;
	public static final Class221 field2226;
	public static final Class221 field2227;
	public static final Class221 field2228;
	public static final Class221 field2229;
	public static final Class221 field2231;
	public static final Class221 field2236;
	public static final Class221[] field2235;
	public final int field2230;
	public final int field2232;
	public final int field2234;

	static {
		field2226 = new Class221(0, 8, 8);
		field2231 = new Class221(5, 16, 16);
		field2227 = new Class221(4, 32, 32);
		field2228 = new Class221(3, 48, 48);
		field2229 = new Class221(6, 64, 64);
		field2225 = new Class221(1, 96, 96);
		field2236 = new Class221(2, 128, 128);
		Class221[] var0 = new Class221[]{field2226, field2225, field2236, field2228, field2227, field2231, field2229};
		field2235 = var0;
		Arrays.sort(field2235, new Class251());
	}

	public Class221(int var1, int var2, int var3) {
		this.field2232 = var1;
		this.field2230 = var2;
		this.field2234 = var3;
	}

	public int method4166() {
		return this.field2230 * this.field2234;
	}

	public static File method4168(String var0) {
		if (!Class165.field1822) {
			throw new RuntimeException("");
		} else {
			File var2 = (File)Class165.field1819.get(var0);
			if (var2 != null) {
				return var2;
			} else {
				File var3 = new File(Class425.field3389, var0);
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
						Class165.field1819.put(var0, var3);
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

	public static boolean method4169() {
		return Client.field626 >= 2;
	}
}
