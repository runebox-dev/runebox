import io.runebox.ObfInfo;

@ObfInfo(name = "lb")
public class Class288 implements Class393 {
	@ObfInfo(name = "al", desc = "Llb;")
	public static final Class288 field3143;
	@ObfInfo(name = "ak", desc = "Llb;")
	public static final Class288 field3144;
	@ObfInfo(name = "az", desc = "Llb;")
	public static final Class288 field3145;
	@ObfInfo(name = "aj", desc = "Llb;")
	public static final Class288 field3147;
	@ObfInfo(name = "aa", desc = "B")
	public final byte field3148;
	@ObfInfo(name = "af", desc = "I", intMultiplier = 323961761)
	public final int field3142;

	static {
		field3144 = new Class288(3, (byte)0);
		field3143 = new Class288(0, (byte)1);
		field3147 = new Class288(1, (byte)2);
		field3145 = new Class288(2, (byte)3);
	}

	public Class288(int var1, byte var2) {
		this.field3142 = var1;
		this.field3148 = var2;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method175() {
		return this.field3148;
	}

	@ObfInfo(name = "af", desc = "(Ljava/lang/CharSequence;IZB)I", opaque = "4")
	public static int method5862(CharSequence var0, int var1, boolean var2) {
		if (var1 >= 2 && var1 <= 36) {
			boolean var4 = false;
			boolean var5 = false;
			int var6 = 0;
			int var7 = var0.length();

			for (int var8 = 0; var8 < var7; ++var8) {
				char var9 = var0.charAt(var8);
				if (var8 == 0) {
					if (var9 == '-') {
						var4 = true;
						continue;
					}

					if (var9 == '+' && var2) {
						continue;
					}
				}

				int var11;
				if (var9 >= '0' && var9 <= '9') {
					var11 = var9 - '0';
				} else if (var9 >= 'A' && var9 <= 'Z') {
					var11 = var9 - '7';
				} else {
					if (var9 < 'a' || var9 > 'z') {
						throw new NumberFormatException();
					}

					var11 = var9 - 'W';
				}

				if (var11 >= var1) {
					throw new NumberFormatException();
				}

				if (var4) {
					var11 = -var11;
				}

				int var10 = var6 * var1 + var11;
				if (var10 / var1 != var6) {
					throw new NumberFormatException();
				}

				var6 = var10;
				var5 = true;
			}

			if (!var5) {
				throw new NumberFormatException();
			} else {
				return var6;
			}
		} else {
			throw new IllegalArgumentException("" + var1);
		}
	}
}
