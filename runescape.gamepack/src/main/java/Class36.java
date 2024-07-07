import io.runebox.ObfInfo;
import java.util.Arrays;

@ObfInfo(name = "bj")
public class Class36 {
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field184;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field190;

	public Class36() {
		this.field184 = new int[112];
		this.field190 = new int[192];
		Arrays.fill(this.field184, 3);
		Arrays.fill(this.field190, 3);
	}

	@ObfInfo(name = "aq", desc = "(III)V", opaque = "-57596643")
	public void method485(int var1, int var2) {
		if (this.method493(var1) && this.method495(var2)) {
			this.field184[var1] = var2;
		}

	}

	@ObfInfo(name = "ad", desc = "(CII)V", opaque = "272043811")
	public void method486(char var1, int var2) {
		if (this.method494(var1) && this.method495(var2)) {
			this.field190[var1] = var2;
		}

	}

	@ObfInfo(name = "ag", desc = "(II)I", opaque = "805610764")
	public int method497(int var1) {
		return this.method493(var1) ? this.field184[var1] : 0;
	}

	@ObfInfo(name = "ak", desc = "(CI)I")
	public int method488(char var1) {
		return this.method494(var1) ? this.field190[var1] : 0;
	}

	@ObfInfo(name = "ap", desc = "(IB)Z", opaque = "13")
	public boolean method489(int var1) {
		return this.method493(var1) && (this.field184[var1] == 1 || this.field184[var1] == 3);
	}

	@ObfInfo(name = "an", desc = "(CI)Z", opaque = "65534")
	public boolean method490(char var1) {
		return this.method494(var1) && (1 == this.field190[var1] || this.field190[var1] == 3);
	}

	@ObfInfo(name = "aj", desc = "(II)Z")
	public boolean method491(int var1) {
		return this.method493(var1) && (this.field184[var1] == 2 || this.field184[var1] == 3);
	}

	@ObfInfo(name = "av", desc = "(CI)Z", opaque = "-437534663")
	public boolean method492(char var1) {
		return this.method494(var1) && (this.field190[var1] == 2 || this.field190[var1] == 3);
	}

	@ObfInfo(name = "ab", desc = "(II)Z", opaque = "-1985885170")
	public boolean method493(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfInfo(name = "ai", desc = "(CB)Z", opaque = "0")
	public boolean method494(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfInfo(name = "ae", desc = "(II)Z", opaque = "2074913606")
	public boolean method495(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfInfo(name = "lj", desc = "(Lde;ZLug;I)V", opaque = "2145892279")
	public static void method523(Class83 var0, boolean var1, Class527 var2) {
		while (true) {
			byte var4 = 16;
			int var5 = 1 << var4;
			if (var2.method9342(Client.field678.field1485) >= var4 + 12) {
				int var6 = var2.method9347(var4);
				if (var6 != var5 - 1) {
					boolean var7 = false;
					if (var0.field1013[var6] == null) {
						var0.field1013[var6] = new Class102();
						var7 = true;
					}

					Class102 var8 = var0.field1013[var6];
					var0.field1028[++var0.field1027 - 1] = var6;
					var8.field1278 = Client.field541;
					boolean var12 = var2.method9347(1) == 1;
					if (var12) {
						var2.method9347(32);
					}

					int var10;
					if (var1) {
						var10 = var2.method9347(8);
						if (var10 > 127) {
							var10 -= 256;
						}
					} else {
						var10 = var2.method9347(5);
						if (var10 > 15) {
							var10 -= 32;
						}
					}

					int var11;
					if (var1) {
						var11 = var2.method9347(8);
						if (var11 > 127) {
							var11 -= 256;
						}
					} else {
						var11 = var2.method9347(5);
						if (var11 > 15) {
							var11 -= 32;
						}
					}

					int var13 = var2.method9347(1);
					if (var13 == 1) {
						Client.field591[++Client.field590 - 1] = var6;
					}

					int var14 = Client.field729[var2.method9347(3)];
					if (var7) {
						var8.field1295 = var8.field1230 = var14;
					}

					int var9 = var2.method9347(1);
					var8.field1309 = Class184.method2222(var2.method9347(14));
					Client.method8727(var8);
					if (0 == var8.field1297) {
						var8.field1230 = 0;
					}

					if (Client.field534 >= 222) {
						var8.method2706(var10 + Client.field146, Client.field4 + var11, var9 == 1);
						continue;
					}

					var8.method2706(Client.field170.field1242[0] + var10, Client.field170.field1284[0] + var11, var9 == 1);
					continue;
				}
			}

			var2.method9348();
			return;
		}
	}
}
