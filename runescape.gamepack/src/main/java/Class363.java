import io.runebox.ObfInfo;
import java.net.MalformedURLException;
import java.net.URL;

public class Class363 {
	@ObfInfo(name = "ak", desc = "Lea;")
	public Class105 field3976;
	@ObfInfo(name = "al", desc = "Lvc;")
	public Class549 field3977;

	public Class363(String var1, Class106 var2) {
		try {
			this.field3976 = var2.method2759(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3976 = null;
		}

	}

	public Class363(Class105 var1) {
		this.field3976 = var1;
	}

	@ObfInfo(name = "ak", desc = "(B)Lvc;", opaque = "5")
	public Class549 method7117() {
		if (this.field3977 == null && this.field3976 != null && this.field3976.method2742()) {
			if (this.field3976.method2743() != null) {
				this.field3977 = Class46.method8418(this.field3976.method2743());
			}

			this.field3976 = null;
		}

		return this.field3977;
	}

	@ObfInfo(name = "aa", desc = "([BIII)Ljava/lang/String;", opaque = "215407839")
	public static String method7119(byte[] var0, int var1, int var2) {
		char[] var4 = new char[var2];
		int var5 = 0;

		for (int var6 = 0; var6 < var2; ++var6) {
			int var7 = var0[var6 + var1] & 255;
			if (var7 != 0) {
				if (var7 >= 128 && var7 < 160) {
					char var8 = Class405.field4630[var7 - 128];
					if (var8 == 0) {
						var8 = '?';
					}

					var7 = var8;
				}

				var4[var5++] = (char)var7;
			}
		}

		return new String(var4, 0, var5);
	}
}
