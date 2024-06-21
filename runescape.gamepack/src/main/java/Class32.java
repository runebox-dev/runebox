import io.runebox.ObfInfo;
import java.util.Arrays;

public class Class32 {
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field217;
	@ObfInfo(name = "at", desc = "[I")
	public int[] field219;

	public Class32() {
		this.field219 = new int[112];
		this.field217 = new int[192];
		Arrays.fill(this.field219, 3);
		Arrays.fill(this.field217, 3);
	}

	@ObfInfo(name = "ak", desc = "(III)V", opaque = "-1866561187")
	public void method641(int var1, int var2) {
		if (this.method649(var1) && this.method651(var2)) {
			this.field219[var1] = var2;
		}

	}

	@ObfInfo(name = "al", desc = "(CIB)V", opaque = "-109")
	public void method642(char var1, int var2) {
		if (this.method650(var1) && this.method651(var2)) {
			this.field217[var1] = var2;
		}

	}

	@ObfInfo(name = "aj", desc = "(II)I", opaque = "-680959433")
	public int method660(int var1) {
		return this.method649(var1) ? this.field219[var1] : 0;
	}

	@ObfInfo(name = "az", desc = "(CI)I", opaque = "1642811595")
	public int method646(char var1) {
		return this.method650(var1) ? this.field217[var1] : 0;
	}

	@ObfInfo(name = "af", desc = "(IB)Z", opaque = "2")
	public boolean method645(int var1) {
		return this.method649(var1) && (this.field219[var1] == 1 || 3 == this.field219[var1]);
	}

	@ObfInfo(name = "aa", desc = "(CI)Z", opaque = "-1858667748")
	public boolean method643(char var1) {
		return this.method650(var1) && (1 == this.field217[var1] || this.field217[var1] == 3);
	}

	@ObfInfo(name = "at", desc = "(II)Z", opaque = "-83376264")
	public boolean method647(int var1) {
		return this.method649(var1) && (2 == this.field219[var1] || this.field219[var1] == 3);
	}

	@ObfInfo(name = "ab", desc = "(CB)Z", opaque = "76")
	public boolean method648(char var1) {
		return this.method650(var1) && (2 == this.field217[var1] || this.field217[var1] == 3);
	}

	@ObfInfo(name = "ac", desc = "(II)Z", opaque = "-1616829006")
	public boolean method649(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	@ObfInfo(name = "ao", desc = "(CI)Z", opaque = "1331922154")
	public boolean method650(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	@ObfInfo(name = "ah", desc = "(II)Z", opaque = "-479627827")
	public boolean method651(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	@ObfInfo(name = "kf", desc = "(IIIIII)V", opaque = "-907414626")
	public static void method675(int var0, int var1, int var2, int var3, int var4) {
		Class259 var6 = Client.field3857.field1283;
		long var7 = var6.method4951(var0, var1, var2);
		int var9;
		int var10;
		int var11;
		int var12;
		int var15;
		int var16;
		if (var7 != 0L) {
			var9 = var6.method5003(var0, var1, var2, var7);
			var10 = var9 >> 6 & 3;
			var11 = var9 & 31;
			var12 = var3;
			boolean var13 = var7 != 0L && !Class274.method2085(var7);
			if (var13) {
				var12 = var4;
			}

			int[] var14 = Client.field1359.field5357;
			var15 = var1 * 4 + 24624 + 2048 * (103 - var2);
			var16 = Class274.method2942(var7);
			Class222 var17 = Class222.method4161(var16);
			if (var17.field2266 != -1) {
				Class557 var18 = Client.field23[var17.field2266];
				if (var18 != null) {
					int var19 = (var17.field2252 * 4 - var18.field5392) / 2;
					int var20 = (var17.field2253 * 4 - var18.field5395) / 2;
					var18.method10086(var19 + 48 + var1 * 4, var20 + 48 + (104 - var2 - var17.field2253) * 4);
				}
			} else {
				if (var11 == 0 || var11 == 2) {
					if (var10 == 0) {
						var14[var15] = var12;
						var14[var15 + 512] = var12;
						var14[var15 + 1024] = var12;
						var14[var15 + 1536] = var12;
					} else if (var10 == 1) {
						var14[var15] = var12;
						var14[var15 + 1] = var12;
						var14[var15 + 2] = var12;
						var14[var15 + 3] = var12;
					} else if (var10 == 2) {
						var14[var15 + 3] = var12;
						var14[512 + var15 + 3] = var12;
						var14[1024 + var15 + 3] = var12;
						var14[var15 + 3 + 1536] = var12;
					} else if (var10 == 3) {
						var14[var15 + 1536] = var12;
						var14[1 + var15 + 1536] = var12;
						var14[2 + var15 + 1536] = var12;
						var14[3 + var15 + 1536] = var12;
					}
				}

				if (var11 == 3) {
					if (var10 == 0) {
						var14[var15] = var12;
					} else if (var10 == 1) {
						var14[var15 + 3] = var12;
					} else if (var10 == 2) {
						var14[var15 + 3 + 1536] = var12;
					} else if (var10 == 3) {
						var14[var15 + 1536] = var12;
					}
				}

				if (var11 == 2) {
					if (var10 == 3) {
						var14[var15] = var12;
						var14[var15 + 512] = var12;
						var14[var15 + 1024] = var12;
						var14[var15 + 1536] = var12;
					} else if (var10 == 0) {
						var14[var15] = var12;
						var14[var15 + 1] = var12;
						var14[var15 + 2] = var12;
						var14[var15 + 3] = var12;
					} else if (var10 == 1) {
						var14[var15 + 3] = var12;
						var14[512 + var15 + 3] = var12;
						var14[1024 + var15 + 3] = var12;
						var14[1536 + var15 + 3] = var12;
					} else if (var10 == 2) {
						var14[var15 + 1536] = var12;
						var14[var15 + 1536 + 1] = var12;
						var14[var15 + 1536 + 2] = var12;
						var14[3 + var15 + 1536] = var12;
					}
				}
			}
		}

		var7 = var6.method4953(var0, var1, var2);
		if (var7 != 0L) {
			var9 = var6.method5003(var0, var1, var2, var7);
			var10 = var9 >> 6 & 3;
			var11 = var9 & 31;
			var12 = Class274.method2942(var7);
			Class222 var23 = Class222.method4161(var12);
			if (-1 != var23.field2266) {
				Class557 var25 = Client.field23[var23.field2266];
				if (var25 != null) {
					var15 = (var23.field2252 * 4 - var25.field5392) / 2;
					var16 = (var23.field2253 * 4 - var25.field5395) / 2;
					var25.method10086(var15 + var1 * 4 + 48, 48 + 4 * (104 - var2 - var23.field2253) + var16);
				}
			} else if (var11 == 9) {
				int var26 = 15658734;
				boolean var27 = 0L != var7 && !Class274.method2085(var7);
				if (var27) {
					var26 = 15597568;
				}

				int[] var28 = Client.field1359.field5357;
				int var29 = 2048 * (103 - var2) + var1 * 4 + 24624;
				if (var10 != 0 && var10 != 2) {
					var28[var29] = var26;
					var28[var29 + 512 + 1] = var26;
					var28[2 + var29 + 1024] = var26;
					var28[var29 + 1536 + 3] = var26;
				} else {
					var28[var29 + 1536] = var26;
					var28[1 + var29 + 1024] = var26;
					var28[var29 + 512 + 2] = var26;
					var28[var29 + 3] = var26;
				}
			}
		}

		var7 = var6.method4954(var0, var1, var2);
		if (var7 != 0L) {
			var9 = Class274.method2942(var7);
			Class222 var21 = Class222.method4161(var9);
			if (-1 != var21.field2266) {
				Class557 var22 = Client.field23[var21.field2266];
				if (var22 != null) {
					var12 = (var21.field2252 * 4 - var22.field5392) / 2;
					int var24 = (var21.field2253 * 4 - var22.field5395) / 2;
					var22.method10086(var12 + 48 + var1 * 4, 48 + (104 - var2 - var21.field2253) * 4 + var24);
				}
			}
		}

	}
}
