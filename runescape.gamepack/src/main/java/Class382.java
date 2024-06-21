import io.runebox.ObfInfo;

public abstract class Class382 {
	@ObfInfo(name = "bn", desc = "Lvu;")
	public static Class566 field4485;
	@ObfInfo(name = "bg", desc = "I", intMultiplier = -595094959)
	public static int field4489;
	@ObfInfo(name = "an", desc = "Lvw;")
	public Class568 field4473;
	@ObfInfo(name = "bo", desc = "[Lvw;")
	public Class568[] field4482;
	@ObfInfo(name = "bl", desc = "Z")
	public boolean field4477;
	@ObfInfo(name = "be", desc = "Z")
	public boolean field4481;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 1716278413)
	public int field4474;
	@ObfInfo(name = "bw", desc = "I", intMultiplier = -383538745)
	public int field4486;
	@ObfInfo(name = "ar", desc = "[I")
	public int[] field4478;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field4479;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field4480;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field4487;
	@ObfInfo(name = "ad", desc = "[I")
	public int[] field4488;
	@ObfInfo(name = "bf", desc = "[[I")
	public int[][] field4475;
	@ObfInfo(name = "bs", desc = "[[I")
	public int[][] field4476;
	@ObfInfo(name = "bi", desc = "[Ljava/lang/Object;")
	public Object[] field4483;
	@ObfInfo(name = "bt", desc = "[[Ljava/lang/Object;")
	public Object[][] field4484;

	static {
		field4485 = new Class566();
		field4489 = 0;
	}

	public Class382(boolean var1, boolean var2) {
		this.field4477 = var1;
		this.field4481 = var2;
	}

	@ObfInfo(name = "bc", desc = "([BI)V", opaque = "-500449151")
	public void method7240(byte[] var1) {
		this.field4486 = Class521.method2298(var1, var1.length);
		Class521 var3 = new Class521(method3623(var1));
		int var4 = var3.method9405();
		if (var4 >= 5 && var4 <= 7) {
			if (var4 >= 6) {
				var3.method9410();
			}

			int var5 = var3.method9405();
			if (var4 >= 7) {
				this.field4474 = var3.method9422();
			} else {
				this.field4474 = var3.method9407();
			}

			int var6 = 0;
			int var7 = -1;
			this.field4488 = new int[this.field4474];
			int var8;
			if (var4 >= 7) {
				for (var8 = 0; var8 < this.field4474; ++var8) {
					this.field4488[var8] = var6 += var3.method9422();
					if (this.field4488[var8] > var7) {
						var7 = this.field4488[var8];
					}
				}
			} else {
				for (var8 = 0; var8 < this.field4474; ++var8) {
					this.field4488[var8] = var6 += var3.method9407();
					if (this.field4488[var8] > var7) {
						var7 = this.field4488[var8];
					}
				}
			}

			this.field4487 = new int[var7 + 1];
			this.field4478 = new int[var7 + 1];
			this.field4479 = new int[var7 + 1];
			this.field4476 = new int[var7 + 1][];
			this.field4483 = new Object[var7 + 1];
			this.field4484 = new Object[var7 + 1][];
			if (var5 != 0) {
				this.field4480 = new int[var7 + 1];

				for (var8 = 0; var8 < this.field4474; ++var8) {
					this.field4480[this.field4488[var8]] = var3.method9410();
				}

				this.field4473 = new Class568(this.field4480);
			}

			for (var8 = 0; var8 < this.field4474; ++var8) {
				this.field4487[this.field4488[var8]] = var3.method9410();
			}

			for (var8 = 0; var8 < this.field4474; ++var8) {
				this.field4478[this.field4488[var8]] = var3.method9410();
			}

			for (var8 = 0; var8 < this.field4474; ++var8) {
				this.field4479[this.field4488[var8]] = var3.method9407();
			}

			int var9;
			int var10;
			int var11;
			int var12;
			int var13;
			if (var4 >= 7) {
				for (var8 = 0; var8 < this.field4474; ++var8) {
					var9 = this.field4488[var8];
					var10 = this.field4479[var9];
					var6 = 0;
					var11 = -1;
					this.field4476[var9] = new int[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var13 = this.field4476[var9][var12] = var6 += var3.method9422();
						if (var13 > var11) {
							var11 = var13;
						}
					}

					this.field4484[var9] = new Object[var11 + 1];
				}
			} else {
				for (var8 = 0; var8 < this.field4474; ++var8) {
					var9 = this.field4488[var8];
					var10 = this.field4479[var9];
					var6 = 0;
					var11 = -1;
					this.field4476[var9] = new int[var10];

					for (var12 = 0; var12 < var10; ++var12) {
						var13 = this.field4476[var9][var12] = var6 += var3.method9407();
						if (var13 > var11) {
							var11 = var13;
						}
					}

					this.field4484[var9] = new Object[var11 + 1];
				}
			}

			if (var5 != 0) {
				this.field4475 = new int[var7 + 1][];
				this.field4482 = new Class568[var7 + 1];

				for (var8 = 0; var8 < this.field4474; ++var8) {
					var9 = this.field4488[var8];
					var10 = this.field4479[var9];
					this.field4475[var9] = new int[this.field4484[var9].length];

					for (var11 = 0; var11 < var10; ++var11) {
						this.field4475[var9][this.field4476[var9][var11]] = var3.method9410();
					}

					this.field4482[var9] = new Class568(this.field4475[var9]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(name = "aj", desc = "(IB)V")
	public void method7215(int var1) {
	}

	@ObfInfo(name = "bz", desc = "(III)[B")
	public byte[] method7216(int var1, int var2) {
		return this.method7298(var1, var2, (int[])null);
	}

	@ObfInfo(name = "ba", desc = "(II[II)[B", opaque = "342476184")
	public byte[] method7298(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.field4484.length && this.field4484[var1] != null && var2 >= 0 && var2 < this.field4484[var1].length) {
			if (this.field4484[var1][var2] == null) {
				boolean var5 = this.method7296(var1, var3);
				if (!var5) {
					this.method7227(var1);
					var5 = this.method7296(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = Class346.method6692(this.field4484[var1][var2], false);
			if (this.field4481) {
				this.field4484[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "bb", desc = "(III)Z", opaque = "-1994214319")
	public boolean method7232(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field4484.length && null != this.field4484[var1] && var2 >= 0 && var2 < this.field4484[var1].length) {
			if (this.field4484[var1][var2] != null) {
				return true;
			} else if (null != this.field4483[var1]) {
				return true;
			} else {
				this.method7227(var1);
				return null != this.field4483[var1];
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "by", desc = "(IB)Z", opaque = "15")
	public boolean method7219(int var1) {
		if (this.field4484.length == 1) {
			return this.method7232(0, var1);
		} else if (1 == this.field4484[var1].length) {
			return this.method7232(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "cw", desc = "(IB)Z", opaque = "0")
	public boolean method7220(int var1) {
		if (this.field4483[var1] != null) {
			return true;
		} else {
			this.method7227(var1);
			return this.field4483[var1] != null;
		}
	}

	@ObfInfo(name = "ck", desc = "(I)Z", opaque = "994597738")
	public boolean method7255() {
		boolean var2 = true;

		for (int var3 = 0; var3 < this.field4488.length; ++var3) {
			int var4 = this.field4488[var3];
			if (null == this.field4483[var4]) {
				this.method7227(var4);
				if (null == this.field4483[var4]) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	@ObfInfo(name = "ao", desc = "(IB)I", opaque = "1")
	public int method7222(int var1) {
		return null != this.field4483[var1] ? 100 : 0;
	}

	@ObfInfo(name = "cn", desc = "(IB)[B", opaque = "0")
	public byte[] method7221(int var1) {
		if (1 == this.field4484.length) {
			return this.method7216(0, var1);
		} else if (this.field4484[var1].length == 1) {
			return this.method7216(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "ch", desc = "(IIB)[B", opaque = "1")
	public byte[] method7224(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field4484.length && this.field4484[var1] != null && var2 >= 0 && var2 < this.field4484[var1].length) {
			if (this.field4484[var1][var2] == null) {
				boolean var4 = this.method7296(var1, (int[])null);
				if (!var4) {
					this.method7227(var1);
					var4 = this.method7296(var1, (int[])null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = Class346.method6692(this.field4484[var1][var2], false);
			return var5;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "cp", desc = "(II)[B", opaque = "-167741726")
	public byte[] method7225(int var1) {
		if (1 == this.field4484.length) {
			return this.method7224(0, var1);
		} else if (1 == this.field4484[var1].length) {
			return this.method7224(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "az", desc = "(II)V")
	public void method7227(int var1) {
	}

	@ObfInfo(name = "cd", desc = "(II)[I")
	public int[] method7226(int var1) {
		return var1 >= 0 && var1 < this.field4476.length ? this.field4476[var1] : null;
	}

	@ObfInfo(name = "cs", desc = "(II)I", opaque = "-409600127")
	public int method7237(int var1) {
		return this.field4484 != null && var1 < this.field4484.length && null != this.field4484[var1] ? this.field4484[var1].length : 0;
	}

	@ObfInfo(name = "cm", desc = "(I)I")
	public int method7228() {
		return this.field4484.length;
	}

	@ObfInfo(name = "ci", desc = "(I)V", opaque = "-39243931")
	public void method7229() {
		for (int var2 = 0; var2 < this.field4483.length; ++var2) {
			this.field4483[var2] = null;
		}

	}

	@ObfInfo(name = "cc", desc = "(II)V", opaque = "-777953866")
	public void method7230(int var1) {
		for (int var3 = 0; var3 < this.field4484[var1].length; ++var3) {
			this.field4484[var1][var3] = null;
		}

	}

	@ObfInfo(name = "cb", desc = "(I)V", opaque = "2011703751")
	public void method7231() {
		for (int var2 = 0; var2 < this.field4484.length; ++var2) {
			if (null != this.field4484[var2]) {
				for (int var3 = 0; var3 < this.field4484[var2].length; ++var3) {
					this.field4484[var2][var3] = null;
				}
			}
		}

	}

	@ObfInfo(name = "cr", desc = "(I[II)Z", opaque = "13041198")
	public boolean method7296(int var1, int[] var2) {
		if (null == this.field4483[var1]) {
			return false;
		} else {
			int var4 = this.field4479[var1];
			int[] var5 = this.field4476[var1];
			Object[] var6 = this.field4484[var1];
			boolean var7 = true;

			for (int var8 = 0; var8 < var4; ++var8) {
				if (var6[var5[var8]] == null) {
					var7 = false;
					break;
				}
			}

			if (var7) {
				return true;
			} else {
				byte[] var22;
				if (var2 == null || 0 == var2[0] && 0 == var2[1] && 0 == var2[2] && var2[3] == 0) {
					var22 = Class346.method6692(this.field4483[var1], false);
				} else {
					var22 = Class346.method6692(this.field4483[var1], true);
					Class521 var9 = new Class521(var22);
					var9.method9429(var2, 5, var9.field5221.length);
				}

				byte[] var23 = method3623(var22);
				if (this.field4477) {
					this.field4483[var1] = null;
				}

				int var11;
				if (var4 > 1) {
					int var10 = var23.length;
					--var10;
					var11 = var23[var10] & 255;
					var10 -= 4 * var11 * var4;
					Class521 var12 = new Class521(var23);
					int[] var13 = new int[var4];
					var12.field5219 = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var4; ++var16) {
							var15 += var12.method9410();
							var13[var16] += var15;
						}
					}

					byte[][] var26 = new byte[var4][];

					for (var15 = 0; var15 < var4; ++var15) {
						var26[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.field5219 = var10;
					var15 = 0;

					int var18;
					for (var16 = 0; var16 < var11; ++var16) {
						int var17 = 0;

						for (var18 = 0; var18 < var4; ++var18) {
							var17 += var12.method9410();
							System.arraycopy(var23, var15, var26[var18], var13[var18], var17);
							var13[var18] += var17;
							var15 += var17;
						}
					}

					for (var16 = 0; var16 < var4; ++var16) {
						if (!this.field4481) {
							var18 = var5[var16];
							byte[] var20 = var26[var16];
							Object var19;
							if (var20 == null) {
								var19 = null;
							} else if (var20.length > 136) {
								Class341 var21 = new Class341();
								var21.method6652(var20);
								var19 = var21;
							} else {
								var19 = var20;
							}

							var6[var18] = var19;
						} else {
							var6[var5[var16]] = var26[var16];
						}
					}
				} else if (!this.field4481) {
					var11 = var5[0];
					Object var24;
					if (var23 == null) {
						var24 = null;
					} else if (var23.length > 136) {
						Class341 var25 = new Class341();
						var25.method6652(var23);
						var24 = var25;
					} else {
						var24 = var23;
					}

					var6[var11] = var24;
				} else {
					var6[var5[0]] = var23;
				}

				return true;
			}
		}
	}

	@ObfInfo(name = "co", desc = "(Ljava/lang/String;B)I")
	public int method7233(String var1) {
		var1 = var1.toLowerCase();
		return this.field4473.method10283(Class412.method6666(var1));
	}

	@ObfInfo(name = "cf", desc = "(ILjava/lang/String;I)I")
	public int method7299(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.field4482[var1].method10283(Class412.method6666(var2));
	}

	@ObfInfo(name = "ce", desc = "(Ljava/lang/String;Ljava/lang/String;I)Z", opaque = "1189634521")
	public boolean method7235(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4473.method10283(Class412.method6666(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = this.field4482[var4].method10283(Class412.method6666(var2));
			return var5 >= 0;
		}
	}

	@ObfInfo(name = "cz", desc = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method7271(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4473.method10283(Class412.method6666(var1));
		int var5 = this.field4482[var4].method10283(Class412.method6666(var2));
		return this.method7216(var4, var5);
	}

	@ObfInfo(name = "ca", desc = "(Ljava/lang/String;Ljava/lang/String;I)Z")
	public boolean method7253(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4473.method10283(Class412.method6666(var1));
		int var5 = this.field4482[var4].method10283(Class412.method6666(var2));
		return this.method7232(var4, var5);
	}

	@ObfInfo(name = "cl", desc = "(Ljava/lang/String;I)Z")
	public boolean method7238(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4473.method10283(Class412.method6666(var1));
		return this.method7220(var3);
	}

	@ObfInfo(name = "cq", desc = "(Ljava/lang/String;I)V", opaque = "-789909862")
	public void method7250(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4473.method10283(Class412.method6666(var1));
		if (var3 >= 0) {
			this.method7215(var3);
		}
	}

	@ObfInfo(name = "cy", desc = "(Ljava/lang/String;I)I")
	public int method7239(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4473.method10283(Class412.method6666(var1));
		return this.method7222(var3);
	}

	@ObfInfo(owner = "gw", name = "ct", desc = "([BI)[B", opaque = "1231289276")
	public static byte[] method3623(byte[] var0) {
		Class521 var2 = new Class521(var0);
		int var3 = var2.method9405();
		int var4 = var2.method9410();
		if (var4 >= 0 && (field4489 == 0 || var4 <= field4489)) {
			if (var3 == 0) {
				byte[] var7 = new byte[var4];
				var2.method9417(var7, 0, var4);
				return var7;
			} else {
				int var5 = var2.method9410();
				if (var5 < 0 || field4489 != 0 && var5 > field4489) {
					throw new RuntimeException();
				} else {
					byte[] var6 = new byte[var5];
					if (var3 == 1) {
						Class560.method10112(var6, var5, var0, var4, 9);
					} else {
						field4485.method10256(var2, var6);
					}

					return var6;
				}
			}
		} else {
			throw new RuntimeException();
		}
	}
}
