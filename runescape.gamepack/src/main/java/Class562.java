import io.runebox.ObfInfo;
import java.math.BigInteger;

@ObfInfo(name = "vp")
public class Class562 extends Class520 {
	@ObfInfo(name = "ai", desc = "[I")
	public static int[] field5469;
	@ObfInfo(name = "au", desc = "[J")
	public static long[] field5475;
	@ObfInfo(name = "av", desc = "[B")
	public byte[] field5472;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -57914867)
	public int field5471;

	static {
		field5469 = new int[256];

		int var2;
		for (int var1 = 0; var1 < 256; ++var1) {
			int var0 = var1;

			for (var2 = 0; var2 < 8; ++var2) {
				if ((var0 & 1) == 1) {
					var0 = var0 >>> 1 ^ -306674912;
				} else {
					var0 >>>= 1;
				}
			}

			field5469[var1] = var0;
		}

		field5475 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if ((var4 & 1L) == 1L) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			field5475[var2] = var4;
		}

	}

	public Class562(int var1) {
		byte[] var2 = Class445.method5601(var1, false);
		this.field5472 = var2;
		this.field5471 = 0;
	}

	public Class562(int var1, boolean var2) {
		this.field5472 = Class445.method5601(var1, var2);
	}

	public Class562(byte[] var1) {
		this.field5472 = var1;
		this.field5471 = 0;
	}

	@ObfInfo(name = "bc", desc = "(I)V", opaque = "1994564143")
	public void method9808() {
		if (this.field5472 != null) {
			Class445.method2280(this.field5472);
		}

		this.field5472 = null;
	}

	@ObfInfo(name = "bv", desc = "(II)V")
	public void method9809(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)var1;
	}

	@ObfInfo(name = "bb", desc = "(II)V")
	public void method9810(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
		this.field5472[++this.field5471 - 1] = (byte)var1;
	}

	@ObfInfo(name = "bn", desc = "(II)V")
	public void method9811(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 16);
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
		this.field5472[++this.field5471 - 1] = (byte)var1;
	}

	@ObfInfo(name = "bh", desc = "(II)V")
	public void method9812(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 24);
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 16);
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
		this.field5472[++this.field5471 - 1] = (byte)var1;
	}

	@ObfInfo(name = "bq", desc = "(J)V")
	public void method9813(long var1) {
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 40));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 32));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 24));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 16));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 8));
		this.field5472[++this.field5471 - 1] = (byte)((int)var1);
	}

	@ObfInfo(name = "bd", desc = "(J)V")
	public void method10034(long var1) {
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 56));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 48));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 40));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 32));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 24));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 16));
		this.field5472[++this.field5471 - 1] = (byte)((int)(var1 >> 8));
		this.field5472[++this.field5471 - 1] = (byte)((int)var1);
	}

	@ObfInfo(name = "bz", desc = "(ZI)V", opaque = "-83272098")
	public void method9827(boolean var1) {
		this.method9809(var1 ? 1 : 0);
	}

	@ObfInfo(name = "br", desc = "(Ljava/lang/String;I)V", opaque = "-408274122")
	public void method9816(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field5471 += Class411.method4750(var1, 0, var1.length(), this.field5472, this.field5471);
			this.field5472[++this.field5471 - 1] = 0;
		}
	}

	@ObfInfo(name = "bf", desc = "(Ljava/lang/String;B)V", opaque = "13")
	public void method10003(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field5472[++this.field5471 - 1] = 0;
			this.field5471 += Class411.method4750(var1, 0, var1.length(), this.field5472, this.field5471);
			this.field5472[++this.field5471 - 1] = 0;
		}
	}

	@ObfInfo(name = "cf", desc = "(Ljava/lang/CharSequence;I)V", opaque = "-711879097")
	public void method9818(CharSequence var1) {
		int var4 = var1.length();
		int var5 = 0;

		for (int var6 = 0; var6 < var4; ++var6) {
			char var7 = var1.charAt(var6);
			if (var7 <= 127) {
				++var5;
			} else if (var7 <= 2047) {
				var5 += 2;
			} else {
				var5 += 3;
			}
		}

		this.field5472[++this.field5471 - 1] = 0;
		this.method9825(var5);
		this.field5471 += Class537.method8463(this.field5472, this.field5471, var1);
	}

	@ObfInfo(name = "cv", desc = "([BIII)V", opaque = "-1615638403")
	public void method9819(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			this.field5472[++this.field5471 - 1] = var1[var5];
		}

	}

	@ObfInfo(name = "cl", desc = "(Lvp;S)V")
	public void method10056(Class562 var1) {
		this.method9819(var1.field5472, 0, var1.field5471);
	}

	@ObfInfo(name = "cm", desc = "(IB)V")
	public void method9974(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field5472[this.field5471 - var1 - 4] = (byte)(var1 >> 24);
			this.field5472[this.field5471 - var1 - 3] = (byte)(var1 >> 16);
			this.field5472[this.field5471 - var1 - 2] = (byte)(var1 >> 8);
			this.field5472[this.field5471 - var1 - 1] = (byte)var1;
		}
	}

	@ObfInfo(name = "cg", desc = "(II)V")
	public void method10019(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field5472[this.field5471 - var1 - 2] = (byte)(var1 >> 8);
			this.field5472[this.field5471 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "cu", desc = "(IB)V", opaque = "31")
	public void method9874(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field5472[this.field5471 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "cn", desc = "(II)V", opaque = "-473354271")
	public void method9824(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.method9809(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.method9810(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@ObfInfo(name = "ce", desc = "(II)V", opaque = "-584464556")
	public void method9825(int var1) {
		if ((var1 & -128) != 0) {
			if ((var1 & -16384) != 0) {
				if ((var1 & -2097152) != 0) {
					if ((var1 & -268435456) != 0) {
						this.method9809(var1 >>> 28 | 128);
					}

					this.method9809(var1 >>> 21 | 128);
				}

				this.method9809(var1 >>> 14 | 128);
			}

			this.method9809(var1 >>> 7 | 128);
		}

		this.method9809(var1 & 127);
	}

	@ObfInfo(name = "co", desc = "(I)I")
	public int method9902() {
		return this.field5472[++this.field5471 - 1] & 255;
	}

	@ObfInfo(name = "ch", desc = "(I)B")
	public byte method9955() {
		return this.field5472[++this.field5471 - 1];
	}

	@ObfInfo(name = "ct", desc = "(I)I")
	public int method9997() {
		this.field5471 += 2;
		return ((this.field5472[this.field5471 - 2] & 255) << 8) + (this.field5472[this.field5471 - 1] & 255);
	}

	@ObfInfo(name = "cd", desc = "(I)I", opaque = "-1158917113")
	public int method9829() {
		this.field5471 += 2;
		int var2 = ((this.field5472[this.field5471 - 2] & 255) << 8) + (this.field5472[this.field5471 - 1] & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfInfo(name = "ck", desc = "(I)I")
	public int method9830() {
		this.field5471 += 3;
		return (this.field5472[this.field5471 - 1] & 255) + ((this.field5472[this.field5471 - 3] & 255) << 16) + ((this.field5472[this.field5471 - 2] & 255) << 8);
	}

	@ObfInfo(name = "cq", desc = "(I)I", opaque = "821641961")
	public int method9831() {
		this.field5471 += 3;
		int var2 = (this.field5472[this.field5471 - 1] & 255) + ((this.field5472[this.field5471 - 2] & 255) << 8) + ((this.field5472[this.field5471 - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfInfo(name = "cs", desc = "(I)I")
	public int method9832() {
		this.field5471 += 4;
		return (this.field5472[this.field5471 - 1] & 255) + ((this.field5472[this.field5471 - 2] & 255) << 8) + ((this.field5472[this.field5471 - 4] & 255) << 24) + ((this.field5472[this.field5471 - 3] & 255) << 16);
	}

	@ObfInfo(name = "cp", desc = "(I)J")
	public long method9833() {
		long var2 = (long)this.method9832() & 4294967295L;
		long var4 = (long)this.method9832() & 4294967295L;
		return (var2 << 32) + var4;
	}

	@ObfInfo(name = "cy", desc = "(I)F")
	public float method9834() {
		return Float.intBitsToFloat(this.method9832());
	}

	@ObfInfo(name = "cw", desc = "(B)Z", opaque = "-2")
	public boolean method9835() {
		return (this.method9902() & 1) == 1;
	}

	@ObfInfo(name = "ci", desc = "(I)Ljava/lang/String;", opaque = "2053261317")
	public String method9836() {
		if (this.field5472[this.field5471] == 0) {
			++this.field5471;
			return null;
		} else {
			return this.method9837();
		}
	}

	@ObfInfo(name = "cc", desc = "(I)Ljava/lang/String;", opaque = "737666808")
	public String method9837() {
		int var2 = this.field5471;

		while (this.field5472[++this.field5471 - 1] != 0) {
		}

		int var3 = this.field5471 - var2 - 1;
		return var3 == 0 ? "" : Class411.method5589(this.field5472, var2, var3);
	}

	@ObfInfo(name = "cr", desc = "(B)Ljava/lang/String;", opaque = "7")
	public String method9980() {
		byte var2 = this.field5472[++this.field5471 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.field5471;

			while (this.field5472[++this.field5471 - 1] != 0) {
			}

			int var4 = this.field5471 - var3 - 1;
			return var4 == 0 ? "" : Class411.method5589(this.field5472, var3, var4);
		}
	}

	@ObfInfo(name = "cb", desc = "(I)Ljava/lang/String;", opaque = "-1180015666")
	public String method9839() {
		byte var2 = this.field5472[++this.field5471 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method9948();
			if (this.field5471 + var3 > this.field5472.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var5 = this.field5472;
				int var6 = this.field5471;
				char[] var7 = new char[var3];
				int var8 = 0;
				int var9 = var6;

				int var12;
				for (int var10 = var3 + var6; var9 < var10; var7[var8++] = (char)var12) {
					int var11 = var5[var9++] & 255;
					if (var11 < 128) {
						if (var11 == 0) {
							var12 = 65533;
						} else {
							var12 = var11;
						}
					} else if (var11 < 192) {
						var12 = 65533;
					} else if (var11 < 224) {
						if (var9 < var10 && (var5[var9] & 192) == 128) {
							var12 = (var11 & 31) << 6 | var5[var9++] & 63;
							if (var12 < 128) {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else if (var11 < 240) {
						if (var9 + 1 < var10 && (var5[var9] & 192) == 128 && (var5[var9 + 1] & 192) == 128) {
							var12 = (var11 & 15) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
							if (var12 < 2048) {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else if (var11 < 248) {
						if (var9 + 2 < var10 && (var5[var9] & 192) == 128 && (var5[var9 + 1] & 192) == 128 && (var5[var9 + 2] & 192) == 128) {
							var12 = (var11 & 7) << 18 | (var5[var9++] & 63) << 12 | (var5[var9++] & 63) << 6 | var5[var9++] & 63;
							if (var12 >= 65536 && var12 <= 1114111) {
								var12 = 65533;
							} else {
								var12 = 65533;
							}
						} else {
							var12 = 65533;
						}
					} else {
						var12 = 65533;
					}
				}

				String var4 = new String(var7, 0, var8);
				this.field5471 += var3;
				return var4;
			}
		}
	}

	@ObfInfo(name = "cz", desc = "([BIIB)V", opaque = "6")
	public void method9840(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			var1[var5] = this.field5472[++this.field5471 - 1];
		}

	}

	@ObfInfo(name = "cj", desc = "(B)I", opaque = "0")
	public int method9841() {
		int var2 = this.field5472[this.field5471] & 255;
		return var2 < 128 ? this.method9902() - 64 : this.method9997() - 49152;
	}

	@ObfInfo(name = "cx", desc = "(I)I", opaque = "1730023236")
	public int method9842() {
		int var2 = this.field5472[this.field5471] & 255;
		return var2 < 128 ? this.method9902() : this.method9997() - 32768;
	}

	@ObfInfo(name = "ca", desc = "(S)I", opaque = "-31836")
	public int method9843() {
		int var2 = this.field5472[this.field5471] & 255;
		return var2 < 128 ? this.method9902() - 1 : this.method9997() - 32769;
	}

	@ObfInfo(name = "df", desc = "(I)I", opaque = "1714567300")
	public int method9844() {
		int var2 = 0;

		int var3;
		for (var3 = this.method9842(); var3 == 32767; var3 = this.method9842()) {
			var2 += 32767;
		}

		var2 += var3;
		return var2;
	}

	@ObfInfo(name = "dd", desc = "(I)I", opaque = "-140737486")
	public int method9845() {
		return this.field5472[this.field5471] < 0 ? this.method9832() & Integer.MAX_VALUE : this.method9997();
	}

	@ObfInfo(name = "dg", desc = "(I)I", opaque = "134878488")
	public int method9871() {
		if (this.field5472[this.field5471] < 0) {
			return this.method9832() & Integer.MAX_VALUE;
		} else {
			int var2 = this.method9997();
			return var2 == 32767 ? -1 : var2;
		}
	}

	@ObfInfo(name = "dr", desc = "(B)I", opaque = "30")
	public int method9948() {
		byte var2 = this.field5472[++this.field5471 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.field5472[++this.field5471 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	@ObfInfo(name = "dn", desc = "(I)I", opaque = "527139757")
	public int method9848() {
		int var3 = 0;
		int var4 = 0;

		int var2;
		do {
			var2 = this.method9902();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while(var2 > 127);

		return var3;
	}

	@ObfInfo(name = "ds", desc = "([IB)V", opaque = "0")
	public void method9849(int[] var1) {
		int var3 = this.field5471 / 8;
		this.field5471 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method9832();
			int var6 = this.method9832();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 += (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7) {
				var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var7 & 3] + var7;
				var7 += var8;
			}

			this.field5471 -= 8;
			this.method9812(var5);
			this.method9812(var6);
		}

	}

	@ObfInfo(name = "do", desc = "([II)V", opaque = "-2147483645")
	public void method9850(int[] var1) {
		int var3 = this.field5471 / 8;
		this.field5471 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method9832();
			int var6 = this.method9832();
			int var7 = -957401312;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var7 & 3] + var7) {
				var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
				var7 -= var8;
			}

			this.field5471 -= 8;
			this.method9812(var5);
			this.method9812(var6);
		}

	}

	@ObfInfo(name = "dm", desc = "([IIII)V", opaque = "288087182")
	public void method9851(int[] var1, int var2, int var3) {
		int var5 = this.field5471;
		this.field5471 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method9832();
			int var9 = this.method9832();
			int var10 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 += (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10) {
				var8 += (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10;
				var10 += var11;
			}

			this.field5471 -= 8;
			this.method9812(var8);
			this.method9812(var9);
		}

		this.field5471 = var5;
	}

	@ObfInfo(name = "dk", desc = "([IIIB)V", opaque = "9")
	public void method9852(int[] var1, int var2, int var3) {
		int var5 = this.field5471;
		this.field5471 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method9832();
			int var9 = this.method9832();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10) {
				var9 -= (var8 << 4 ^ var8 >>> 5) + var8 ^ var1[var10 >>> 11 & 3] + var10;
				var10 -= var11;
			}

			this.field5471 -= 8;
			this.method9812(var8);
			this.method9812(var9);
		}

		this.field5471 = var5;
	}

	@ObfInfo(name = "dp", desc = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method9853(BigInteger var1, BigInteger var2) {
		int var4 = this.field5471;
		this.field5471 = 0;
		byte[] var5 = new byte[var4];
		this.method9840(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.field5471 = 0;
		this.method9810(var8.length);
		this.method9819(var8, 0, var8.length);
	}

	@ObfInfo(name = "dv", desc = "(IB)I")
	public int method10030(int var1) {
		int var3 = Class260.method5011(this.field5472, var1, this.field5471);
		this.method9812(var3);
		return var3;
	}

	@ObfInfo(name = "du", desc = "(I)Z")
	public boolean method10046() {
		this.field5471 -= 4;
		int var2 = Class260.method5011(this.field5472, 0, this.field5471);
		int var3 = this.method9832();
		return var2 == var3;
	}

	@ObfInfo(name = "di", desc = "(II)V")
	public void method9856(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(var1 + 128);
	}

	@ObfInfo(name = "dt", desc = "(IB)V")
	public void method9857(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(0 - var1);
	}

	@ObfInfo(name = "da", desc = "(II)V")
	public void method10025(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(128 - var1);
	}

	@ObfInfo(name = "db", desc = "(I)I")
	public int method9859() {
		return this.field5472[++this.field5471 - 1] - 128 & 255;
	}

	@ObfInfo(name = "dz", desc = "(I)I")
	public int method9860() {
		return 0 - this.field5472[++this.field5471 - 1] & 255;
	}

	@ObfInfo(name = "dc", desc = "(I)I")
	public int method9861() {
		return 128 - this.field5472[++this.field5471 - 1] & 255;
	}

	@ObfInfo(name = "dy", desc = "(B)B")
	public byte method10018() {
		return (byte)(this.field5472[++this.field5471 - 1] - 128);
	}

	@ObfInfo(name = "dw", desc = "(I)B")
	public byte method9863() {
		return (byte)(0 - this.field5472[++this.field5471 - 1]);
	}

	@ObfInfo(name = "dh", desc = "(B)B")
	public byte method9864() {
		return (byte)(128 - this.field5472[++this.field5471 - 1]);
	}

	@ObfInfo(name = "dj", desc = "(II)V")
	public void method10010(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)var1;
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(name = "dq", desc = "(IB)V")
	public void method9866(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
		this.field5472[++this.field5471 - 1] = (byte)(var1 + 128);
	}

	@ObfInfo(name = "de", desc = "(II)V")
	public void method10036(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(var1 + 128);
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(name = "dl", desc = "(I)I")
	public int method9868() {
		this.field5471 += 2;
		return ((this.field5472[this.field5471 - 1] & 255) << 8) + (this.field5472[this.field5471 - 2] & 255);
	}

	@ObfInfo(name = "dx", desc = "(I)I")
	public int method9869() {
		this.field5471 += 2;
		return ((this.field5472[this.field5471 - 2] & 255) << 8) + (this.field5472[this.field5471 - 1] - 128 & 255);
	}

	@ObfInfo(name = "eg", desc = "(B)I")
	public int method9981() {
		this.field5471 += 2;
		return ((this.field5472[this.field5471 - 1] & 255) << 8) + (this.field5472[this.field5471 - 2] - 128 & 255);
	}

	@ObfInfo(name = "es", desc = "(I)I", opaque = "894362040")
	public int method9969() {
		this.field5471 += 2;
		int var2 = ((this.field5472[this.field5471 - 2] & 255) << 8) + (this.field5472[this.field5471 - 1] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfInfo(name = "ei", desc = "(B)I", opaque = "6")
	public int method9872() {
		this.field5471 += 2;
		int var2 = ((this.field5472[this.field5471 - 1] & 255) << 8) + (this.field5472[this.field5471 - 2] - 128 & 255);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	@ObfInfo(name = "eo", desc = "(S)I")
	public int method10054() {
		this.field5471 += 3;
		return (this.field5472[this.field5471 - 3] & 255) + ((this.field5472[this.field5471 - 1] & 255) << 16) + ((this.field5472[this.field5471 - 2] & 255) << 8);
	}

	@ObfInfo(name = "ex", desc = "(I)I")
	public int method9977() {
		this.field5471 += 3;
		return (this.field5472[this.field5471 - 2] & 255) + ((this.field5472[this.field5471 - 1] & 255) << 8) + ((this.field5472[this.field5471 - 3] & 255) << 16);
	}

	@ObfInfo(name = "ej", desc = "(B)I")
	public int method10029() {
		this.field5471 += 3;
		return (this.field5472[this.field5471 - 1] & 255) + ((this.field5472[this.field5471 - 2] & 255) << 16) + ((this.field5472[this.field5471 - 3] & 255) << 8);
	}

	@ObfInfo(name = "eh", desc = "(B)I")
	public int method9876() {
		this.field5471 += 3;
		int var2 = (this.field5472[this.field5471 - 3] & 255) + ((this.field5472[this.field5471 - 1] & 255) << 16) + ((this.field5472[this.field5471 - 2] & 255) << 8);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfInfo(name = "ew", desc = "(I)I", opaque = "-294776622")
	public int method9862() {
		this.field5471 += 3;
		int var2 = (this.field5472[this.field5471 - 2] & 255) + ((this.field5472[this.field5471 - 1] & 255) << 8) + ((this.field5472[this.field5471 - 3] & 255) << 16);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	@ObfInfo(name = "eb", desc = "(IS)V")
	public void method9878(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)var1;
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 16);
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 24);
	}

	@ObfInfo(name = "ek", desc = "(II)V")
	public void method9807(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
		this.field5472[++this.field5471 - 1] = (byte)var1;
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 24);
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 16);
	}

	@ObfInfo(name = "ev", desc = "(IB)V")
	public void method9880(int var1) {
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 16);
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 24);
		this.field5472[++this.field5471 - 1] = (byte)var1;
		this.field5472[++this.field5471 - 1] = (byte)(var1 >> 8);
	}

	@ObfInfo(name = "eu", desc = "(B)I")
	public int method9855() {
		this.field5471 += 4;
		return (this.field5472[this.field5471 - 4] & 255) + ((this.field5472[this.field5471 - 3] & 255) << 8) + ((this.field5472[this.field5471 - 1] & 255) << 24) + ((this.field5472[this.field5471 - 2] & 255) << 16);
	}

	@ObfInfo(name = "ea", desc = "(I)I")
	public int method9882() {
		this.field5471 += 4;
		return (this.field5472[this.field5471 - 3] & 255) + ((this.field5472[this.field5471 - 4] & 255) << 8) + ((this.field5472[this.field5471 - 1] & 255) << 16) + ((this.field5472[this.field5471 - 2] & 255) << 24);
	}

	@ObfInfo(name = "en", desc = "(I)I")
	public int method9883() {
		this.field5471 += 4;
		return (this.field5472[this.field5471 - 2] & 255) + ((this.field5472[this.field5471 - 1] & 255) << 8) + ((this.field5472[this.field5471 - 4] & 255) << 16) + ((this.field5472[this.field5471 - 3] & 255) << 24);
	}

	@ObfInfo(name = "ez", desc = "([BIII)V", opaque = "-1351488164")
	public void method9884(byte[] var1, int var2, int var3) {
		for (int var5 = var2 + var3 - 1; var5 >= var2; --var5) {
			var1[var5] = this.field5472[++this.field5471 - 1];
		}

	}

	@ObfInfo(name = "eq", desc = "([BIII)V")
	public void method9828(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var2 + var3; ++var5) {
			var1[var5] = (byte)(this.field5472[++this.field5471 - 1] - 128);
		}

	}

	@ObfInfo(owner = "dw", name = "bk", desc = "(Ljava/lang/String;I)I")
	public static int method2698(String var0) {
		return var0.length() + 1;
	}
}
