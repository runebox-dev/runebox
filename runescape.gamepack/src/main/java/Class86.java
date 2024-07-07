import io.runebox.ObfInfo;

@ObfInfo(name = "dh")
public class Class86 extends Class520 {
	@ObfInfo(name = "ad", desc = "I", intMultiplier = -1494090523)
	public int field1082;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1704684721)
	public int field1083;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -71484607)
	public int field1085;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = -2015000729)
	public int field1088;

	public Class86(int var1, int var2, int var3, int var4) {
		this.field1088 = var1;
		this.field1082 = var2;
		this.field1085 = var3;
		this.field1083 = var4;
	}

	@ObfInfo(name = "aq", desc = "(IIIIB)V")
	public void method2365(int var1, int var2, int var3, int var4) {
		this.field1088 = var1;
		this.field1082 = var2;
		this.field1085 = var3;
		this.field1083 = var4;
	}

	@ObfInfo(name = "ad", desc = "(Ljava/lang/CharSequence;I)Z", opaque = "1697170324")
	public static boolean method2366(CharSequence var0) {
		boolean var3 = false;
		boolean var4 = false;
		int var5 = 0;
		int var6 = var0.length();
		int var7 = 0;

		boolean var2;
		while (true) {
			if (var7 >= var6) {
				var2 = var4;
				break;
			}

			label76: {
				char var8 = var0.charAt(var7);
				if (var7 == 0) {
					if (var8 == '-') {
						var3 = true;
						break label76;
					}

					if (var8 == '+') {
						break label76;
					}
				}

				int var10;
				if (var8 >= '0' && var8 <= '9') {
					var10 = var8 - '0';
				} else if (var8 >= 'A' && var8 <= 'Z') {
					var10 = var8 - '7';
				} else {
					if (var8 < 'a' || var8 > 'z') {
						var2 = false;
						break;
					}

					var10 = var8 - 'W';
				}

				if (var10 >= 10) {
					var2 = false;
					break;
				}

				if (var3) {
					var10 = -var10;
				}

				int var9 = var10 + var5 * 10;
				if (var9 / 10 != var5) {
					var2 = false;
					break;
				}

				var5 = var9;
				var4 = true;
			}

			++var7;
		}

		return var2;
	}
}
