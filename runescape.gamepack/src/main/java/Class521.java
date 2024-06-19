import java.math.BigInteger;

public class Class521 extends Class506 {
	public static int[] field5220;
	public static long[] field5215;
	public byte[] field5221;
	public int field5219;

	static {
		field5220 = new int[256];

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

			field5220[var1] = var0;
		}

		field5215 = new long[256];

		for (var2 = 0; var2 < 256; ++var2) {
			long var4 = (long)var2;

			for (int var3 = 0; var3 < 8; ++var3) {
				if (1L == (var4 & 1L)) {
					var4 = var4 >>> 1 ^ -3932672073523589310L;
				} else {
					var4 >>>= 1;
				}
			}

			field5215[var2] = var4;
		}

	}

	public Class521(int var1) {
		this.field5221 = Class57.method1084(var1);
		this.field5219 = 0;
	}

	public Class521(int var1, boolean var2) {
		this.field5221 = Class80.method2233(var1, var2);
	}

	public Class521(byte[] var1) {
		this.field5221 = var1;
		this.field5219 = 0;
	}

	public void method9449() {
		if (this.field5221 != null) {
			Class451.method3840(this.field5221);
		}

		this.field5221 = null;
	}

	public void method9388(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)var1;
	}

	public void method9389(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
		this.field5221[++this.field5219 - 1] = (byte)var1;
	}

	public void method9390(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 16);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
		this.field5221[++this.field5219 - 1] = (byte)var1;
	}

	public void method9590(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 24);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 16);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
		this.field5221[++this.field5219 - 1] = (byte)var1;
	}

	public void method9392(long var1) {
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 40));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 32));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 24));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 16));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 8));
		this.field5221[++this.field5219 - 1] = (byte)((int)var1);
	}

	public void method9393(long var1) {
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 56));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 48));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 40));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 32));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 24));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 16));
		this.field5221[++this.field5219 - 1] = (byte)((int)(var1 >> 8));
		this.field5221[++this.field5219 - 1] = (byte)((int)var1);
	}

	public void method9394(boolean var1) {
		this.method9388(var1 ? 1 : 0);
	}

	public void method9473(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field5219 += Class426.method7872(var1, 0, var1.length(), this.field5221, this.field5219);
			this.field5221[++this.field5219 - 1] = 0;
		}
	}

	public void method9396(String var1) {
		int var3 = var1.indexOf(0);
		if (var3 >= 0) {
			throw new IllegalArgumentException("");
		} else {
			this.field5221[++this.field5219 - 1] = 0;
			this.field5219 += Class426.method7872(var1, 0, var1.length(), this.field5221, this.field5219);
			this.field5221[++this.field5219 - 1] = 0;
		}
	}

	public void method9397(CharSequence var1) {
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

		this.field5221[++this.field5219 - 1] = 0;
		this.method9404(var5);
		this.field5219 += Class522.method3085(this.field5221, this.field5219, var1);
	}

	public void method9548(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			this.field5221[++this.field5219 - 1] = var1[var5];
		}

	}

	public void method9452(Class521 var1) {
		this.method9548(var1.field5221, 0, var1.field5219);
	}

	public void method9400(int var1) {
		if (var1 < 0) {
			throw new IllegalArgumentException();
		} else {
			this.field5221[this.field5219 - var1 - 4] = (byte)(var1 >> 24);
			this.field5221[this.field5219 - var1 - 3] = (byte)(var1 >> 16);
			this.field5221[this.field5219 - var1 - 2] = (byte)(var1 >> 8);
			this.field5221[this.field5219 - var1 - 1] = (byte)var1;
		}
	}

	public void method9401(int var1) {
		if (var1 >= 0 && var1 <= 65535) {
			this.field5221[this.field5219 - var1 - 2] = (byte)(var1 >> 8);
			this.field5221[this.field5219 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method9386(int var1) {
		if (var1 >= 0 && var1 <= 255) {
			this.field5221[this.field5219 - var1 - 1] = (byte)var1;
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method9403(int var1) {
		if (var1 >= 0 && var1 < 128) {
			this.method9388(var1);
		} else if (var1 >= 0 && var1 < 32768) {
			this.method9389(var1 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public void method9404(int var1) {
		if (0 != (var1 & -128)) {
			if (0 != (var1 & -16384)) {
				if (0 != (var1 & -2097152)) {
					if ((var1 & -268435456) != 0) {
						this.method9388(var1 >>> 28 | 128);
					}

					this.method9388(var1 >>> 21 | 128);
				}

				this.method9388(var1 >>> 14 | 128);
			}

			this.method9388(var1 >>> 7 | 128);
		}

		this.method9388(var1 & 127);
	}

	public int method9405() {
		return this.field5221[++this.field5219 - 1] & 255;
	}

	public byte method9406() {
		return this.field5221[++this.field5219 - 1];
	}

	public int method9407() {
		this.field5219 += 2;
		return ((this.field5221[this.field5219 - 2] & 255) << 8) + (this.field5221[this.field5219 - 1] & 255);
	}

	public int method9535() {
		this.field5219 += 2;
		int var2 = (this.field5221[this.field5219 - 1] & 255) + ((this.field5221[this.field5219 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method9399() {
		this.field5219 += 3;
		return ((this.field5221[this.field5219 - 3] & 255) << 16) + ((this.field5221[this.field5219 - 2] & 255) << 8) + (this.field5221[this.field5219 - 1] & 255);
	}

	public int method9410() {
		this.field5219 += 4;
		return (this.field5221[this.field5219 - 1] & 255) + ((this.field5221[this.field5219 - 3] & 255) << 16) + ((this.field5221[this.field5219 - 4] & 255) << 24) + ((this.field5221[this.field5219 - 2] & 255) << 8);
	}

	public long method9411() {
		long var2 = (long)this.method9410() & 4294967295L;
		long var4 = (long)this.method9410() & 4294967295L;
		return (var2 << 32) + var4;
	}

	public float method9412() {
		return Float.intBitsToFloat(this.method9410());
	}

	public boolean method9413() {
		return (this.method9405() & 1) == 1;
	}

	public String method9414() {
		if (this.field5221[this.field5219] == 0) {
			++this.field5219;
			return null;
		} else {
			return this.method9415();
		}
	}

	public String method9415() {
		int var2 = this.field5219;

		while (this.field5221[++this.field5219 - 1] != 0) {
		}

		int var3 = this.field5219 - var2 - 1;
		return var3 == 0 ? "" : Class405.method7119(this.field5221, var2, var3);
	}

	public String method9577() {
		byte var2 = this.field5221[++this.field5219 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.field5219;

			while (this.field5221[++this.field5219 - 1] != 0) {
			}

			int var4 = this.field5219 - var3 - 1;
			return var4 == 0 ? "" : Class405.method7119(this.field5221, var3, var4);
		}
	}

	public String method9602() {
		byte var2 = this.field5221[++this.field5219 - 1];
		if (var2 != 0) {
			throw new IllegalStateException("");
		} else {
			int var3 = this.method9424();
			if (var3 + this.field5219 > this.field5221.length) {
				throw new IllegalStateException("");
			} else {
				byte[] var5 = this.field5221;
				int var6 = this.field5219;
				char[] var7 = new char[var3];
				int var8 = 0;
				int var9 = var6;

				int var12;
				for (int var10 = var6 + var3; var9 < var10; var7[var8++] = (char)var12) {
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
						if (var9 < var10 && 128 == (var5[var9] & 192)) {
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
						if (var9 + 2 < var10 && (var5[var9] & 192) == 128 && 128 == (var5[var9 + 1] & 192) && 128 == (var5[var9 + 2] & 192)) {
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
				this.field5219 += var3;
				return var4;
			}
		}
	}

	public void method9417(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			var1[var5] = this.field5221[++this.field5219 - 1];
		}

	}

	public int method9457() {
		int var2 = this.field5221[this.field5219] & 255;
		return var2 < 128 ? this.method9405() - 64 : this.method9407() - 49152;
	}

	public int method9419() {
		int var2 = this.field5221[this.field5219] & 255;
		return var2 < 128 ? this.method9405() : this.method9407() - 32768;
	}

	public int method9420() {
		int var2 = this.field5221[this.field5219] & 255;
		return var2 < 128 ? this.method9405() - 1 : this.method9407() - 32769;
	}

	public int method9421() {
		int var2 = 0;

		int var3;
		for (var3 = this.method9419(); var3 == 32767; var3 = this.method9419()) {
			var2 += 32767;
		}

		var2 += var3;
		return var2;
	}

	public int method9422() {
		return this.field5221[this.field5219] < 0 ? this.method9410() & Integer.MAX_VALUE : this.method9407();
	}

	public int method9423() {
		if (this.field5221[this.field5219] < 0) {
			return this.method9410() & Integer.MAX_VALUE;
		} else {
			int var2 = this.method9407();
			return var2 == 32767 ? -1 : var2;
		}
	}

	public int method9424() {
		byte var2 = this.field5221[++this.field5219 - 1];

		int var3;
		for (var3 = 0; var2 < 0; var2 = this.field5221[++this.field5219 - 1]) {
			var3 = (var3 | var2 & 127) << 7;
		}

		return var3 | var2;
	}

	public int method9425() {
		int var3 = 0;
		int var4 = 0;

		int var2;
		do {
			var2 = this.method9405();
			var3 |= (var2 & 127) << var4;
			var4 += 7;
		} while(var2 > 127);

		return var3;
	}

	public void method9581(int[] var1) {
		int var3 = this.field5219 / 8;
		this.field5219 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method9410();
			int var6 = this.method9410();
			int var7 = 0;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var6 += var5 + (var5 << 4 ^ var5 >>> 5) ^ var1[var7 >>> 11 & 3] + var7) {
				var5 += (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var7 & 3] + var7;
				var7 += var8;
			}

			this.field5219 -= 8;
			this.method9590(var5);
			this.method9590(var6);
		}

	}

	public void method9427(int[] var1) {
		int var3 = this.field5219 / 8;
		this.field5219 = 0;

		for (int var4 = 0; var4 < var3; ++var4) {
			int var5 = this.method9410();
			int var6 = this.method9410();
			int var7 = -957401312;
			int var8 = -1640531527;

			for (int var9 = 32; var9-- > 0; var5 -= (var6 << 4 ^ var6 >>> 5) + var6 ^ var1[var7 & 3] + var7) {
				var6 -= (var5 << 4 ^ var5 >>> 5) + var5 ^ var1[var7 >>> 11 & 3] + var7;
				var7 -= var8;
			}

			this.field5219 -= 8;
			this.method9590(var5);
			this.method9590(var6);
		}

	}

	public void method9531(int[] var1, int var2, int var3) {
		int var5 = this.field5219;
		this.field5219 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method9410();
			int var9 = this.method9410();
			int var10 = 0;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var9 += var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3]) {
				var8 += var9 + (var9 << 4 ^ var9 >>> 5) ^ var10 + var1[var10 & 3];
				var10 += var11;
			}

			this.field5219 -= 8;
			this.method9590(var8);
			this.method9590(var9);
		}

		this.field5219 = var5;
	}

	public void method9429(int[] var1, int var2, int var3) {
		int var5 = this.field5219;
		this.field5219 = var2;
		int var6 = (var3 - var2) / 8;

		for (int var7 = 0; var7 < var6; ++var7) {
			int var8 = this.method9410();
			int var9 = this.method9410();
			int var10 = -957401312;
			int var11 = -1640531527;

			for (int var12 = 32; var12-- > 0; var8 -= (var9 << 4 ^ var9 >>> 5) + var9 ^ var1[var10 & 3] + var10) {
				var9 -= var8 + (var8 << 4 ^ var8 >>> 5) ^ var10 + var1[var10 >>> 11 & 3];
				var10 -= var11;
			}

			this.field5219 -= 8;
			this.method9590(var8);
			this.method9590(var9);
		}

		this.field5219 = var5;
	}

	public void method9430(BigInteger var1, BigInteger var2) {
		int var4 = this.field5219;
		this.field5219 = 0;
		byte[] var5 = new byte[var4];
		this.method9417(var5, 0, var4);
		BigInteger var6 = new BigInteger(var5);
		BigInteger var7 = var6.modPow(var1, var2);
		byte[] var8 = var7.toByteArray();
		this.field5219 = 0;
		this.method9389(var8.length);
		this.method9548(var8, 0, var8.length);
	}

	public int method9431(int var1) {
		byte[] var4 = this.field5221;
		int var5 = this.field5219;
		int var6 = -1;

		for (int var7 = var1; var7 < var5; ++var7) {
			var6 = var6 >>> 8 ^ field5220[(var6 ^ var4[var7]) & 255];
		}

		var6 = ~var6;
		this.method9590(var6);
		return var6;
	}

	public boolean method9545() {
		this.field5219 -= 4;
		byte[] var3 = this.field5221;
		int var4 = this.field5219;
		int var5 = -1;

		int var6;
		for (var6 = 0; var6 < var4; ++var6) {
			var5 = var5 >>> 8 ^ field5220[(var5 ^ var3[var6]) & 255];
		}

		var5 = ~var5;
		var6 = this.method9410();
		return var6 == var5;
	}

	public void method9433(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(var1 + 128);
	}

	public void method9496(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(0 - var1);
	}

	public void method9435(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(128 - var1);
	}

	public int method9522() {
		return this.field5221[++this.field5219 - 1] - 128 & 255;
	}

	public int method9437() {
		return 0 - this.field5221[++this.field5219 - 1] & 255;
	}

	public int method9438() {
		return 128 - this.field5221[++this.field5219 - 1] & 255;
	}

	public byte method9439() {
		return (byte)(this.field5221[++this.field5219 - 1] - 128);
	}

	public byte method9440() {
		return (byte)(0 - this.field5221[++this.field5219 - 1]);
	}

	public byte method9574() {
		return (byte)(128 - this.field5221[++this.field5219 - 1]);
	}

	public void method9442(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)var1;
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
	}

	public void method9443(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
		this.field5221[++this.field5219 - 1] = (byte)(var1 + 128);
	}

	public void method9476(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(var1 + 128);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
	}

	public int method9445() {
		this.field5219 += 2;
		return ((this.field5221[this.field5219 - 1] & 255) << 8) + (this.field5221[this.field5219 - 2] & 255);
	}

	public int method9446() {
		this.field5219 += 2;
		return (this.field5221[this.field5219 - 1] - 128 & 255) + ((this.field5221[this.field5219 - 2] & 255) << 8);
	}

	public int method9505() {
		this.field5219 += 2;
		return (this.field5221[this.field5219 - 2] - 128 & 255) + ((this.field5221[this.field5219 - 1] & 255) << 8);
	}

	public int method9448() {
		this.field5219 += 2;
		int var2 = (this.field5221[this.field5219 - 1] - 128 & 255) + ((this.field5221[this.field5219 - 2] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public int method9461() {
		this.field5219 += 2;
		int var2 = (this.field5221[this.field5219 - 2] - 128 & 255) + ((this.field5221[this.field5219 - 1] & 255) << 8);
		if (var2 > 32767) {
			var2 -= 65536;
		}

		return var2;
	}

	public void method9450(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)var1;
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 16);
	}

	public int method9569() {
		this.field5219 += 3;
		return (this.field5221[this.field5219 - 3] & 255) + ((this.field5221[this.field5219 - 1] & 255) << 16) + ((this.field5221[this.field5219 - 2] & 255) << 8);
	}

	public int method9585() {
		this.field5219 += 3;
		return (this.field5221[this.field5219 - 2] & 255) + ((this.field5221[this.field5219 - 3] & 255) << 16) + ((this.field5221[this.field5219 - 1] & 255) << 8);
	}

	public int method9611() {
		this.field5219 += 3;
		return ((this.field5221[this.field5219 - 3] & 255) << 8) + ((this.field5221[this.field5219 - 2] & 255) << 16) + (this.field5221[this.field5219 - 1] & 255);
	}

	public int method9454() {
		this.field5219 += 3;
		int var2 = ((this.field5221[this.field5219 - 1] & 255) << 16) + ((this.field5221[this.field5219 - 2] & 255) << 8) + (this.field5221[this.field5219 - 3] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public int method9455() {
		this.field5219 += 3;
		int var2 = ((this.field5221[this.field5219 - 3] & 255) << 16) + ((this.field5221[this.field5219 - 1] & 255) << 8) + (this.field5221[this.field5219 - 2] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public int method9398() {
		this.field5219 += 3;
		int var2 = ((this.field5221[this.field5219 - 3] & 255) << 8) + ((this.field5221[this.field5219 - 2] & 255) << 16) + (this.field5221[this.field5219 - 1] & 255);
		if (var2 > 8388607) {
			var2 -= 16777216;
		}

		return var2;
	}

	public void method9556(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)var1;
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 16);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 24);
	}

	public void method9458(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
		this.field5221[++this.field5219 - 1] = (byte)var1;
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 24);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 16);
	}

	public void method9459(int var1) {
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 16);
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 24);
		this.field5221[++this.field5219 - 1] = (byte)var1;
		this.field5221[++this.field5219 - 1] = (byte)(var1 >> 8);
	}

	public int method9460() {
		this.field5219 += 4;
		return ((this.field5221[this.field5219 - 2] & 255) << 16) + ((this.field5221[this.field5219 - 1] & 255) << 24) + ((this.field5221[this.field5219 - 3] & 255) << 8) + (this.field5221[this.field5219 - 4] & 255);
	}

	public int method9555() {
		this.field5219 += 4;
		return (this.field5221[this.field5219 - 3] & 255) + ((this.field5221[this.field5219 - 4] & 255) << 8) + ((this.field5221[this.field5219 - 1] & 255) << 16) + ((this.field5221[this.field5219 - 2] & 255) << 24);
	}

	public int method9462() {
		this.field5219 += 4;
		return (this.field5221[this.field5219 - 2] & 255) + ((this.field5221[this.field5219 - 1] & 255) << 8) + ((this.field5221[this.field5219 - 3] & 255) << 24) + ((this.field5221[this.field5219 - 4] & 255) << 16);
	}

	public void method9402(byte[] var1, int var2, int var3) {
		for (int var5 = var2; var5 < var3 + var2; ++var5) {
			var1[var5] = (byte)(this.field5221[++this.field5219 - 1] - 128);
		}

	}

	public static int method7983(String var0) {
		return var0.length() + 1;
	}

	public static int method6668(String var0) {
		return var0.length() + 2;
	}
}