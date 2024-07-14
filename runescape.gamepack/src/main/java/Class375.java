import io.runebox.ObfInfo;

@ObfInfo(name = "ok")
public abstract class Class375 {
	@ObfInfo(name = "bi", desc = "Lvl;")
	public static Class558 field4457;
	@ObfInfo(name = "bp", desc = "I", intMultiplier = 1129530753)
	public static int field4461;
	@ObfInfo(name = "at", desc = "Lvm;")
	public Class559 field4448;
	@ObfInfo(name = "be", desc = "[Lvm;")
	public Class559[] field4455;
	@ObfInfo(name = "bg", desc = "Z")
	public boolean field4447;
	@ObfInfo(name = "bs", desc = "Z")
	public boolean field4460;
	@ObfInfo(name = "ba", desc = "I", intMultiplier = 318408017)
	public int field4449;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = 1762784667)
	public int field4458;
	@ObfInfo(name = "as", desc = "[I")
	public int[] field4446;
	@ObfInfo(name = "am", desc = "[I")
	public int[] field4450;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field4453;
	@ObfInfo(name = "aw", desc = "[I")
	public int[] field4454;
	@ObfInfo(name = "ar", desc = "[I")
	public int[] field4459;
	@ObfInfo(name = "bj", desc = "[[I")
	public int[][] field4445;
	@ObfInfo(name = "bt", desc = "[[I")
	public int[][] field4452;
	@ObfInfo(name = "bm", desc = "[Ljava/lang/Object;")
	public Object[] field4451;
	@ObfInfo(name = "bo", desc = "[[Ljava/lang/Object;")
	public Object[][] field4456;

	static {
		field4457 = new Class558();
		field4461 = 0;
	}

	public Class375(boolean var1, boolean var2) {
		this.field4447 = var1;
		this.field4460 = var2;
	}

	@ObfInfo(name = "bd", desc = "([BI)V", opaque = "375763709")
	public void method7130(byte[] var1) {
		int var4 = var1.length;
		int var3 = Class260.method5011(var1, 0, var4);
		this.field4449 = var3;
		Class562 var5 = new Class562(Class220.method4249(var1));
		int var6 = var5.method9902();
		if (var6 >= 5 && var6 <= 7) {
			if (var6 >= 6) {
				var5.method9832();
			}

			int var7 = var5.method9902();
			if (var6 >= 7) {
				this.field4458 = var5.method9845();
			} else {
				this.field4458 = var5.method9997();
			}

			int var8 = 0;
			int var9 = -1;
			this.field4446 = new int[this.field4458];
			int var10;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field4458; ++var10) {
					this.field4446[var10] = var8 += var5.method9845();
					if (this.field4446[var10] > var9) {
						var9 = this.field4446[var10];
					}
				}
			} else {
				for (var10 = 0; var10 < this.field4458; ++var10) {
					this.field4446[var10] = var8 += var5.method9997();
					if (this.field4446[var10] > var9) {
						var9 = this.field4446[var10];
					}
				}
			}

			this.field4453 = new int[var9 + 1];
			this.field4450 = new int[var9 + 1];
			this.field4459 = new int[var9 + 1];
			this.field4452 = new int[var9 + 1][];
			this.field4451 = new Object[var9 + 1];
			this.field4456 = new Object[var9 + 1][];
			if (var7 != 0) {
				this.field4454 = new int[var9 + 1];

				for (var10 = 0; var10 < this.field4458; ++var10) {
					this.field4454[this.field4446[var10]] = var5.method9832();
				}

				this.field4448 = new Class559(this.field4454);
			}

			for (var10 = 0; var10 < this.field4458; ++var10) {
				this.field4453[this.field4446[var10]] = var5.method9832();
			}

			for (var10 = 0; var10 < this.field4458; ++var10) {
				this.field4450[this.field4446[var10]] = var5.method9832();
			}

			for (var10 = 0; var10 < this.field4458; ++var10) {
				this.field4459[this.field4446[var10]] = var5.method9997();
			}

			int var11;
			int var12;
			int var13;
			int var14;
			int var15;
			if (var6 >= 7) {
				for (var10 = 0; var10 < this.field4458; ++var10) {
					var11 = this.field4446[var10];
					var12 = this.field4459[var11];
					var8 = 0;
					var13 = -1;
					this.field4452[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field4452[var11][var14] = var8 += var5.method9845();
						if (var15 > var13) {
							var13 = var15;
						}
					}

					this.field4456[var11] = new Object[var13 + 1];
				}
			} else {
				for (var10 = 0; var10 < this.field4458; ++var10) {
					var11 = this.field4446[var10];
					var12 = this.field4459[var11];
					var8 = 0;
					var13 = -1;
					this.field4452[var11] = new int[var12];

					for (var14 = 0; var14 < var12; ++var14) {
						var15 = this.field4452[var11][var14] = var8 += var5.method9997();
						if (var15 > var13) {
							var13 = var15;
						}
					}

					this.field4456[var11] = new Object[var13 + 1];
				}
			}

			if (var7 != 0) {
				this.field4445 = new int[var9 + 1][];
				this.field4455 = new Class559[var9 + 1];

				for (var10 = 0; var10 < this.field4458; ++var10) {
					var11 = this.field4446[var10];
					var12 = this.field4459[var11];
					this.field4445[var11] = new int[this.field4456[var11].length];

					for (var13 = 0; var13 < var12; ++var13) {
						this.field4445[var11][this.field4452[var11][var13]] = var5.method9832();
					}

					this.field4455[var11] = new Class559(this.field4445[var11]);
				}
			}

		} else {
			throw new RuntimeException("");
		}
	}

	@ObfInfo(name = "ag", desc = "(IB)V")
	public void method7131(int var1) {
	}

	@ObfInfo(name = "bz", desc = "(III)[B")
	public byte[] method7132(int var1, int var2) {
		return this.method7170(var1, var2, (int[])null);
	}

	@ObfInfo(name = "bk", desc = "(II[II)[B", opaque = "297029910")
	public byte[] method7170(int var1, int var2, int[] var3) {
		if (var1 >= 0 && var1 < this.field4456.length && this.field4456[var1] != null && var2 >= 0 && var2 < this.field4456[var1].length) {
			if (this.field4456[var1][var2] == null) {
				boolean var5 = this.method7149(var1, var3);
				if (!var5) {
					this.method7142(var1);
					var5 = this.method7149(var1, var3);
					if (!var5) {
						return null;
					}
				}
			}

			byte[] var6 = Class354.method5832(this.field4456[var1][var2], false);
			if (this.field4460) {
				this.field4456[var1][var2] = null;
			}

			return var6;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "br", desc = "(III)Z", opaque = "-849849873")
	public boolean method7134(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field4456.length && this.field4456[var1] != null && var2 >= 0 && var2 < this.field4456[var1].length) {
			if (this.field4456[var1][var2] != null) {
				return true;
			} else if (this.field4451[var1] != null) {
				return true;
			} else {
				this.method7142(var1);
				return this.field4451[var1] != null;
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "bf", desc = "(II)Z", opaque = "-1123318939")
	public boolean method7135(int var1) {
		if (this.field4456.length == 1) {
			return this.method7134(0, var1);
		} else if (this.field4456[var1].length == 1) {
			return this.method7134(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "cf", desc = "(II)Z", opaque = "1633941387")
	public boolean method7136(int var1) {
		if (this.field4451[var1] != null) {
			return true;
		} else {
			this.method7142(var1);
			return this.field4451[var1] != null;
		}
	}

	@ObfInfo(name = "cv", desc = "(I)Z", opaque = "2036272014")
	public boolean method7154() {
		boolean var2 = true;

		for (int var3 = 0; var3 < this.field4446.length; ++var3) {
			int var4 = this.field4446[var3];
			if (this.field4451[var4] == null) {
				this.method7142(var4);
				if (this.field4451[var4] == null) {
					var2 = false;
				}
			}
		}

		return var2;
	}

	@ObfInfo(name = "ai", desc = "(II)I", opaque = "1114547636")
	public int method7138(int var1) {
		return this.field4451[var1] != null ? 100 : 0;
	}

	@ObfInfo(name = "cl", desc = "(IB)[B", opaque = "2")
	public byte[] method7139(int var1) {
		if (this.field4456.length == 1) {
			return this.method7132(0, var1);
		} else if (this.field4456[var1].length == 1) {
			return this.method7132(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "cm", desc = "(III)[B", opaque = "-704664860")
	public byte[] method7140(int var1, int var2) {
		if (var1 >= 0 && var1 < this.field4456.length && this.field4456[var1] != null && var2 >= 0 && var2 < this.field4456[var1].length) {
			if (this.field4456[var1][var2] == null) {
				boolean var4 = this.method7149(var1, (int[])null);
				if (!var4) {
					this.method7142(var1);
					var4 = this.method7149(var1, (int[])null);
					if (!var4) {
						return null;
					}
				}
			}

			byte[] var5 = Class354.method5832(this.field4456[var1][var2], false);
			return var5;
		} else {
			return null;
		}
	}

	@ObfInfo(name = "cg", desc = "(II)[B", opaque = "-1979542161")
	public byte[] method7157(int var1) {
		if (this.field4456.length == 1) {
			return this.method7140(0, var1);
		} else if (this.field4456[var1].length == 1) {
			return this.method7140(var1, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@ObfInfo(name = "ak", desc = "(II)V")
	public void method7142(int var1) {
	}

	@ObfInfo(name = "cu", desc = "(IB)[I", opaque = "77")
	public int[] method7143(int var1) {
		return var1 >= 0 && var1 < this.field4452.length ? this.field4452[var1] : null;
	}

	@ObfInfo(name = "cn", desc = "(II)I", opaque = "-148299162")
	public int method7144(int var1) {
		return this.field4456 != null && var1 < this.field4456.length && this.field4456[var1] != null ? this.field4456[var1].length : 0;
	}

	@ObfInfo(name = "ce", desc = "(I)I")
	public int method7156() {
		return this.field4456.length;
	}

	@ObfInfo(name = "co", desc = "(B)V", opaque = "0")
	public void method7146() {
		for (int var2 = 0; var2 < this.field4451.length; ++var2) {
			this.field4451[var2] = null;
		}

	}

	@ObfInfo(name = "ch", desc = "(II)V", opaque = "-1883460544")
	public void method7147(int var1) {
		for (int var3 = 0; var3 < this.field4456[var1].length; ++var3) {
			this.field4456[var1][var3] = null;
		}

	}

	@ObfInfo(name = "ct", desc = "(B)V", opaque = "0")
	public void method7194() {
		for (int var2 = 0; var2 < this.field4456.length; ++var2) {
			if (this.field4456[var2] != null) {
				for (int var3 = 0; var3 < this.field4456[var2].length; ++var3) {
					this.field4456[var2][var3] = null;
				}
			}
		}

	}

	@ObfInfo(name = "cd", desc = "(I[IB)Z", opaque = "30")
	public boolean method7149(int var1, int[] var2) {
		if (this.field4451[var1] == null) {
			return false;
		} else {
			int var4 = this.field4459[var1];
			int[] var5 = this.field4452[var1];
			Object[] var6 = this.field4456[var1];
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
				byte[] var19;
				if (var2 == null || var2[0] == 0 && var2[1] == 0 && var2[2] == 0 && var2[3] == 0) {
					var19 = Class354.method5832(this.field4451[var1], false);
				} else {
					var19 = Class354.method5832(this.field4451[var1], true);
					Class562 var9 = new Class562(var19);
					var9.method9852(var2, 5, var9.field5472.length);
				}

				byte[] var20 = Class220.method4249(var19);
				if (this.field4447) {
					this.field4451[var1] = null;
				}

				if (var4 > 1) {
					int var10 = var20.length;
					--var10;
					int var11 = var20[var10] & 255;
					var10 -= var4 * var11 * 4;
					Class562 var12 = new Class562(var20);
					int[] var13 = new int[var4];
					var12.field5471 = var10;

					int var15;
					int var16;
					for (int var14 = 0; var14 < var11; ++var14) {
						var15 = 0;

						for (var16 = 0; var16 < var4; ++var16) {
							var15 += var12.method9832();
							var13[var16] += var15;
						}
					}

					byte[][] var21 = new byte[var4][];

					for (var15 = 0; var15 < var4; ++var15) {
						var21[var15] = new byte[var13[var15]];
						var13[var15] = 0;
					}

					var12.field5471 = var10;
					var15 = 0;

					for (var16 = 0; var16 < var11; ++var16) {
						int var17 = 0;

						for (int var18 = 0; var18 < var4; ++var18) {
							var17 += var12.method9832();
							System.arraycopy(var20, var15, var21[var18], var13[var18], var17);
							var13[var18] += var17;
							var15 += var17;
						}
					}

					for (var16 = 0; var16 < var4; ++var16) {
						if (!this.field4460) {
							var6[var5[var16]] = Class354.method6322(var21[var16], false);
						} else {
							var6[var5[var16]] = var21[var16];
						}
					}
				} else if (!this.field4460) {
					var6[var5[0]] = Class354.method6322(var20, false);
				} else {
					var6[var5[0]] = var20;
				}

				return true;
			}
		}
	}

	@ObfInfo(name = "ck", desc = "(Ljava/lang/String;B)I")
	public int method7150(String var1) {
		var1 = var1.toLowerCase();
		return this.field4448.method9771(Class413.method513(var1));
	}

	@ObfInfo(name = "cq", desc = "(ILjava/lang/String;B)I")
	public int method7209(int var1, String var2) {
		var2 = var2.toLowerCase();
		return this.field4455[var1].method9771(Class413.method513(var2));
	}

	@ObfInfo(name = "cs", desc = "(Ljava/lang/String;Ljava/lang/String;I)Z", opaque = "90195349")
	public boolean method7137(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4448.method9771(Class413.method513(var1));
		if (var4 < 0) {
			return false;
		} else {
			int var5 = this.field4455[var4].method9771(Class413.method513(var2));
			return var5 >= 0;
		}
	}

	@ObfInfo(name = "cp", desc = "(Ljava/lang/String;Ljava/lang/String;I)[B")
	public byte[] method7153(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4448.method9771(Class413.method513(var1));
		int var5 = this.field4455[var4].method9771(Class413.method513(var2));
		return this.method7132(var4, var5);
	}

	@ObfInfo(name = "cy", desc = "(Ljava/lang/String;Ljava/lang/String;B)Z")
	public boolean method7171(String var1, String var2) {
		var1 = var1.toLowerCase();
		var2 = var2.toLowerCase();
		int var4 = this.field4448.method9771(Class413.method513(var1));
		int var5 = this.field4455[var4].method9771(Class413.method513(var2));
		return this.method7134(var4, var5);
	}

	@ObfInfo(name = "cw", desc = "(Ljava/lang/String;B)Z")
	public boolean method7155(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4448.method9771(Class413.method513(var1));
		return this.method7136(var3);
	}

	@ObfInfo(name = "ci", desc = "(Ljava/lang/String;B)V")
	public void method7179(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4448.method9771(Class413.method513(var1));
		if (var3 >= 0) {
			this.method7131(var3);
		}
	}

	@ObfInfo(name = "cc", desc = "(Ljava/lang/String;I)I")
	public int method7213(String var1) {
		var1 = var1.toLowerCase();
		int var3 = this.field4448.method9771(Class413.method513(var1));
		return this.method7138(var3);
	}
}
