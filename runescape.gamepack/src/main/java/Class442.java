import io.runebox.ObfInfo;
import java.util.Random;

@ObfInfo(name = "qz")
public abstract class Class442 extends Class569 {
	@ObfInfo(name = "as", desc = "I")
	public static int field4794;
	@ObfInfo(name = "ah", desc = "I")
	public static int field4796;
	@ObfInfo(name = "ax", desc = "I")
	public static int field4798;
	@ObfInfo(name = "al", desc = "I")
	public static int field4800;
	@ObfInfo(name = "ay", desc = "I")
	public static int field4801;
	@ObfInfo(name = "ac", desc = "I")
	public static int field4802;
	@ObfInfo(name = "aa", desc = "I")
	public static int field4803;
	@ObfInfo(name = "az", desc = "I")
	public static int field4804;
	@ObfInfo(name = "ao", desc = "I")
	public static int field4805;
	@ObfInfo(name = "at", desc = "[Ljava/lang/String;")
	public static String[] field4806;
	@ObfInfo(name = "aw", desc = "Ljava/util/Random;")
	public static Random field4799;
	@ObfInfo(name = "au", desc = "[B")
	public byte[] field4795;
	@ObfInfo(name = "ad", desc = "[[B")
	public byte[][] field4785;
	@ObfInfo(name = "av", desc = "I")
	public int field4784;
	@ObfInfo(name = "ab", desc = "I")
	public int field4792;
	@ObfInfo(name = "ai", desc = "I")
	public int field4793;
	@ObfInfo(name = "ag", desc = "[I")
	public int[] field4786;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field4787;
	@ObfInfo(name = "ap", desc = "[I")
	public int[] field4788;
	@ObfInfo(name = "an", desc = "[I")
	public int[] field4789;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field4790;

	static {
		field4796 = -1;
		field4804 = -1;
		field4798 = -1;
		field4802 = -1;
		field4800 = 0;
		field4801 = 0;
		field4805 = 256;
		field4803 = 0;
		field4794 = 0;
		field4799 = new Random();
		field4806 = new String[100];
	}

	public Class442(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field4785 = new byte[256][];
		this.field4784 = 0;
		this.field4789 = var2;
		this.field4790 = var3;
		this.field4787 = var4;
		this.field4788 = var5;
		this.method8167(var1);
		this.field4785 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field4790[var10] < var8 && this.field4788[var10] != 0) {
				var8 = this.field4790[var10];
			}

			if (this.field4790[var10] + this.field4788[var10] > var9) {
				var9 = this.field4790[var10] + this.field4788[var10];
			}
		}

		this.field4792 = this.field4784 - var8;
		this.field4793 = var9 - this.field4784;
	}

	public Class442(byte[] var1) {
		this.field4785 = new byte[256][];
		this.field4784 = 0;
		this.method8167(var1);
	}

	@ObfInfo(name = "ad", desc = "([BIIIIII)V")
	public abstract void method7811(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfInfo(name = "aq", desc = "([BIIIII)V")
	public abstract void method7813(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfInfo(name = "ab", desc = "([B)V")
	public void method8167(byte[] var1) {
		this.field4786 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field4786.length; ++var2) {
				this.field4786[var2] = var1[var2] & 255;
			}

			this.field4784 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3) {
				this.field4786[var3] = var1[var2++] & 255;
			}

			int[] var10 = new int[256];
			int[] var4 = new int[256];

			int var5;
			for (var5 = 0; var5 < 256; ++var5) {
				var10[var5] = var1[var2++] & 255;
			}

			for (var5 = 0; var5 < 256; ++var5) {
				var4[var5] = var1[var2++] & 255;
			}

			byte[][] var11 = new byte[256][];

			int var8;
			for (int var6 = 0; var6 < 256; ++var6) {
				var11[var6] = new byte[var10[var6]];
				byte var7 = 0;

				for (var8 = 0; var8 < var11[var6].length; ++var8) {
					var7 += var1[var2++];
					var11[var6][var8] = var7;
				}
			}

			byte[][] var12 = new byte[256][];

			int var13;
			for (var13 = 0; var13 < 256; ++var13) {
				var12[var13] = new byte[var10[var13]];
				byte var14 = 0;

				for (int var9 = 0; var9 < var12[var13].length; ++var9) {
					var14 += var1[var2++];
					var12[var13][var9] = var14;
				}
			}

			this.field4795 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field4795[(var13 << 8) + var8] = (byte)method8137(var11, var12, var4, this.field4786, var10, var13, var8);
						}
					}
				}
			}

			this.field4784 = var10[32] + var4[32];
		}

	}

	@ObfInfo(name = "ae", desc = "(C)I")
	public int method8232(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.field4786[Class269.method5083(var1) & 255];
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;)I")
	public int method8139(String var1) {
		if (var1 == null) {
			return 0;
		} else {
			int var2 = -1;
			int var3 = -1;
			int var4 = 0;

			for (int var5 = 0; var5 < var1.length(); ++var5) {
				char var6 = var1.charAt(var5);
				if (var6 == '<') {
					var2 = var5;
				} else {
					if (var6 == '>' && var2 != -1) {
						String var7 = var1.substring(var2 + 1, var5);
						var2 = -1;
						if (var7.equals("lt")) {
							var6 = '<';
						} else {
							if (!var7.equals("gt")) {
								if (var7.startsWith("img=")) {
									try {
										int var8 = Class413.method7482(var7.substring(4));
										var4 += Client.field4791[var8].field5499;
										var3 = -1;
									} catch (Exception var9) {
									}
								}
								continue;
							}

							var6 = '>';
						}
					}

					if (var6 == 160) {
						var6 = ' ';
					}

					if (var2 == -1) {
						var4 += this.field4786[(char)(Class269.method5083(var6) & 255)];
						if (this.field4795 != null && var3 != -1) {
							var4 += this.field4795[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	@ObfInfo(name = "ah", desc = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public int method8206(String var1, int[] var2, String[] var3) {
		if (var1 == null) {
			return 0;
		} else {
			int var4 = 0;
			int var5 = 0;
			StringBuilder var6 = new StringBuilder(100);
			int var7 = -1;
			int var8 = 0;
			byte var9 = 0;
			int var10 = -1;
			char var11 = 0;
			int var12 = 0;
			int var13 = var1.length();

			for (int var14 = 0; var14 < var13; ++var14) {
				char var15 = var1.charAt(var14);
				if (var15 == '<') {
					var10 = var14;
				} else {
					if (var15 == '>' && var10 != -1) {
						String var16 = var1.substring(var10 + 1, var14);
						var10 = -1;
						var6.append('<');
						var6.append(var16);
						var6.append('>');
						if (var16.equals("br")) {
							var3[var12] = var6.toString().substring(var5, var6.length());
							++var12;
							var5 = var6.length();
							var4 = 0;
							var7 = -1;
							var11 = 0;
						} else if (var16.equals("lt")) {
							var4 += this.method8232('<');
							if (this.field4795 != null && var11 != -1) {
								var4 += this.field4795[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method8232('>');
							if (this.field4795 != null && var11 != -1) {
								var4 += this.field4795[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = Class413.method7482(var16.substring(4));
								var4 += Client.field4791[var17].field5499;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method8232(var15);
							if (this.field4795 != null && var11 != -1) {
								var4 += this.field4795[(var11 << '\b') + var15];
							}

							var11 = var15;
						}

						if (var15 == ' ') {
							var7 = var6.length();
							var8 = var4;
							var9 = 1;
						}

						if (var2 != null && var4 > var2[var12 < var2.length ? var12 : var2.length - 1] && var7 >= 0) {
							var3[var12] = var6.toString().substring(var5, var7 - var9);
							++var12;
							var5 = var7;
							var7 = -1;
							var4 -= var8;
							var11 = 0;
						}

						if (var15 == '-') {
							var7 = var6.length();
							var8 = var4;
							var9 = 0;
						}
					}
				}
			}

			String var19 = var6.toString();
			if (var19.length() > var5) {
				var3[var12++] = var19.substring(var5, var19.length());
			}

			return var12;
		}
	}

	@ObfInfo(name = "az", desc = "(Ljava/lang/String;I)I")
	public int method8140(String var1, int var2) {
		int var3 = this.method8206(var1, new int[]{var2}, field4806);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method8139(field4806[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfInfo(name = "ax", desc = "(Ljava/lang/String;I)I")
	public int method8141(String var1, int var2) {
		return this.method8206(var1, new int[]{var2}, field4806);
	}

	@ObfInfo(name = "al", desc = "(IILjava/lang/String;II)Lqa;")
	public Class417 method8143(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var1 + var2) {
			int var6 = var4 - this.method8139(var3) / 2;
			var6 += this.method8139(var3.substring(0, var1));
			int var7 = var5 - this.field4792;
			int var8 = this.method8139(var3.substring(var1, var1 + var2));
			int var9 = this.field4793 + this.field4792;
			return new Class417(var6, var7, var8, var9);
		} else {
			return new Class417(var4, var5, 0, 0);
		}
	}

	@ObfInfo(name = "ay", desc = "(Ljava/lang/String;IIII)V")
	public void method8248(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method8159(var4, var5);
			this.method8161(var1, var2, var3);
		}
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;IIIII)V")
	public void method8145(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method8159(var4, var5);
			field4805 = var6;
			this.method8161(var1, var2, var3);
		}
	}

	@ObfInfo(name = "aa", desc = "(Ljava/lang/String;IIII)V")
	public void method8199(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method8159(var4, var5);
			this.method8161(var1, var2 - this.method8139(var1), var3);
		}
	}

	@ObfInfo(name = "as", desc = "(Ljava/lang/String;IIII)V")
	public void method8147(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method8159(var4, var5);
			this.method8161(var1, var2 - this.method8139(var1) / 2, var3);
		}
	}

	@ObfInfo(name = "aw", desc = "(Ljava/lang/String;IIIIIIIII)I")
	public int method8148(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.method8149(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
	}

	@ObfInfo(name = "at", desc = "(Ljava/lang/String;IIIIIIIIII)I")
	public int method8149(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			this.method8159(var6, var7);
			field4805 = var8;
			if (var11 == 0) {
				var11 = this.field4784;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.field4793 + this.field4792 + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = this.method8206(var1, var12, field4806);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) {
				var14 = this.field4792 + var3;
			} else if (var10 == 1) {
				var14 = (var5 - this.field4792 - this.field4793 - (var13 - 1) * var11) / 2 + this.field4792 + var3;
			} else if (var10 == 2) {
				var14 = var3 + var5 - this.field4793 - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.field4792 - this.field4793 - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = this.field4792 + var3 + var15;
				var11 += var15;
			}

			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.method8161(field4806[var15], var2, var14);
				} else if (var9 == 1) {
					this.method8161(field4806[var15], var2 + (var4 - this.method8139(field4806[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.method8161(field4806[var15], var2 + var4 - this.method8139(field4806[var15]), var14);
				} else if (var13 - 1 == var15) {
					this.method8161(field4806[var15], var2, var14);
				} else {
					this.method8160(field4806[var15], var4);
					this.method8161(field4806[var15], var2, var14);
					field4803 = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	@ObfInfo(name = "af", desc = "(Lqw;IIIII)Ltu;")
	public Class515 method8150(Class439 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method8089()) {
			this.method8159(var4, var5);
			var3 -= this.field4784;

			for (int var7 = 0; var7 < var1.method8090(); ++var7) {
				Class422 var8 = var1.method8098(var7);
				if (var6 != -1 && var8.field4694 > var6) {
					return new Class515(var8.field4696, var8.field4694);
				}

				char var9 = var8.field4693;
				if (var9 != '\n') {
					if (var1.method8099(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var8.field4696 + var2;
						int var11 = var8.field4694 + var3;
						int var12 = this.field4787[var9];
						int var13 = this.field4788[var9];
						if (field4802 != -1) {
							this.method7813(this.field4785[var9], this.field4789[var9] + var10 + 1, this.field4790[var9] + var11 + 1, var12, var13, field4802);
						}

						this.method7813(this.field4785[var9], this.field4789[var9] + var10, this.field4790[var9] + var11, var12, var13, field4801);
					}
				}
			}
		}

		return var1.method8093();
	}

	@ObfInfo(name = "am", desc = "(Ljava/lang/String;IIIII[I)V")
	public void method8151(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method8159(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method8246(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); ++var10) {
				var9[var10] = (int)(Math.sin((double)var6 / 5.0D + (double)var10 / 2.0D) * 5.0D);
			}

			this.method8166(var1, var2 - this.method8139(var1) / 2, var3, var8, (int[])null, var9);
		}
	}

	@ObfInfo(name = "ar", desc = "(Ljava/lang/String;IIIII[I)V")
	public void method8152(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method8159(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method8246(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var9[var11] = (int)(Math.sin((double)var6 / 5.0D + (double)var11 / 5.0D) * 5.0D);
				var10[var11] = (int)(Math.sin((double)var6 / 5.0D + (double)var11 / 3.0D) * 5.0D);
			}

			this.method8166(var1, var2 - this.method8139(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfInfo(name = "bt", desc = "(Ljava/lang/String;IIIIII[I)V")
	public void method8153(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			this.method8159(var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.method8246(var8, var1.length());
			}

			double var10 = 7.0D - (double)var7 / 8.0D;
			if (var10 < 0.0D) {
				var10 = 0.0D;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); ++var13) {
				var12[var13] = (int)(Math.sin((double)var6 / 1.0D + (double)var13 / 1.5D) * var10);
			}

			this.method8166(var1, var2 - this.method8139(var1) / 2, var3, var9, (int[])null, var12);
		}
	}

	@ObfInfo(name = "bj", desc = "(Ljava/lang/String;IIII[I)V")
	public void method8138(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method8159(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method8246(var6, var1.length());
			}

			this.method8166(var1, var2 - this.method8139(var1) / 2, var3, var7, (int[])null, (int[])null);
		}
	}

	@ObfInfo(name = "be", desc = "(Ljava/lang/String;IIII[I)V")
	public void method8155(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method8159(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method8246(var6, var1.length());
			}

			this.method8166(var1, var2, var3, var7, (int[])null, (int[])null);
		}
	}

	@ObfInfo(name = "bm", desc = "([II)[I")
	public int[] method8246(int[] var1, int var2) {
		if (var2 == 0) {
			return null;
		} else {
			int[] var3 = new int[var2];
			float var4 = (float)var1.length / (float)var2;

			for (int var5 = 0; var5 < var2; ++var5) {
				var3[var5] = var1[(int)((float)var5 * var4)];
			}

			return var3;
		}
	}

	@ObfInfo(name = "bo", desc = "(Ljava/lang/String;IIIII)V")
	public void method8157(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method8159(var4, var5);
			field4799.setSeed((long)var6);
			field4805 = 192 + (field4799.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field4799.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method8166(var1, var2, var3, (int[])null, var7, (int[])null);
		}
	}

	@ObfInfo(name = "bi", desc = "(II)V")
	public void method8159(int var1, int var2) {
		field4796 = -1;
		field4804 = -1;
		field4798 = var2;
		field4802 = var2;
		field4800 = var1;
		field4801 = var1;
		field4805 = 256;
		field4803 = 0;
		field4794 = 0;
	}

	@ObfInfo(name = "ba", desc = "(Ljava/lang/String;)V")
	public void method8146(String var1) {
		try {
			int var2;
			String var3;
			if (var1.startsWith("col=")) {
				var3 = var1.substring(4);
				var2 = Class413.method7818(var3, 16, true);
				field4801 = var2;
			} else if (var1.equals("/col")) {
				field4801 = field4800;
			} else if (var1.startsWith("str=")) {
				var3 = var1.substring(4);
				var2 = Class413.method7818(var3, 16, true);
				field4796 = var2;
			} else if (var1.equals("str")) {
				field4796 = 8388608;
			} else if (var1.equals("/str")) {
				field4796 = -1;
			} else if (var1.startsWith("u=")) {
				var3 = var1.substring(2);
				var2 = Class413.method7818(var3, 16, true);
				field4804 = var2;
			} else if (var1.equals("u")) {
				field4804 = 0;
			} else if (var1.equals("/u")) {
				field4804 = -1;
			} else if (var1.startsWith("shad=")) {
				var3 = var1.substring(5);
				var2 = Class413.method7818(var3, 16, true);
				field4802 = var2;
			} else if (var1.equals("shad")) {
				field4802 = 0;
			} else if (var1.equals("/shad")) {
				field4802 = field4798;
			} else if (var1.equals("br")) {
				this.method8159(field4800, field4798);
			}
		} catch (Exception var4) {
		}

	}

	@ObfInfo(name = "bg", desc = "(Ljava/lang/String;I)V")
	public void method8160(String var1, int var2) {
		int var3 = 0;
		boolean var4 = false;

		for (int var5 = 0; var5 < var1.length(); ++var5) {
			char var6 = var1.charAt(var5);
			if (var6 == '<') {
				var4 = true;
			} else if (var6 == '>') {
				var4 = false;
			} else if (!var4 && var6 == ' ') {
				++var3;
			}
		}

		if (var3 > 0) {
			field4803 = (var2 - this.method8139(var1) << 8) / var3;
		}

	}

	@ObfInfo(name = "bs", desc = "(Ljava/lang/String;II)V")
	public void method8161(String var1, int var2, int var3) {
		var3 -= this.field4784;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(Class269.method5083(var1.charAt(var6)) & 255);
				if (var7 == '<') {
					var4 = var6;
				} else {
					int var9;
					if (var7 == '>' && var4 != -1) {
						String var8 = var1.substring(var4 + 1, var6);
						var4 = -1;
						if (var8.equals("lt")) {
							var7 = '<';
						} else {
							if (!var8.equals("gt")) {
								if (var8.startsWith("img=")) {
									try {
										var9 = Class413.method7482(var8.substring(4));
										Class568 var13 = Client.field4791[var9];
										var13.method10122(var2, this.field4784 + var3 - var13.field5498);
										var2 += var13.field5499;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.method8146(var8);
								}
								continue;
							}

							var7 = '>';
						}
					}

					if (var7 == 160) {
						var7 = ' ';
					}

					if (var4 == -1) {
						if (this.field4795 != null && var5 != -1) {
							var2 += this.field4795[(var5 << 8) + var7];
						}

						int var12 = this.field4787[var7];
						var9 = this.field4788[var7];
						if (var7 != ' ') {
							if (field4805 == 256) {
								if (field4802 != -1) {
									method8165(this.field4785[var7], this.field4789[var7] + var2 + 1, this.field4790[var7] + var3 + 1, var12, var9, field4802);
								}

								this.method7813(this.field4785[var7], this.field4789[var7] + var2, this.field4790[var7] + var3, var12, var9, field4801);
							} else {
								if (field4802 != -1) {
									method8216(this.field4785[var7], this.field4789[var7] + var2 + 1, this.field4790[var7] + var3 + 1, var12, var9, field4802, field4805);
								}

								this.method7811(this.field4785[var7], this.field4789[var7] + var2, this.field4790[var7] + var3, var12, var9, field4801, field4805);
							}
						} else if (field4803 > 0) {
							field4794 += field4803;
							var2 += field4794 >> 8;
							field4794 &= 255;
						}

						int var10 = this.field4786[var7];
						if (field4796 != -1) {
							method10128(var2, (int)((double)this.field4784 * 0.7D) + var3, var10, field4796);
						}

						if (field4804 != -1) {
							method10128(var2, this.field4784 + var3 + 1, var10, field4804);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}

	}

	@ObfInfo(name = "bp", desc = "(Ljava/lang/String;II[I[I[I)V")
	public void method8166(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.field4784;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); ++var10) {
			if (var1.charAt(var10) != 0) {
				char var11 = (char)(Class269.method5083(var1.charAt(var10)) & 255);
				if (var11 == '<') {
					var7 = var10;
				} else {
					int var13;
					int var14;
					int var15;
					if (var11 == '>' && var7 != -1) {
						String var12 = var1.substring(var7 + 1, var10);
						var7 = -1;
						if (var12.equals("lt")) {
							var11 = '<';
						} else {
							if (!var12.equals("gt")) {
								if (var12.startsWith("img=")) {
									try {
										if (var5 != null) {
											var13 = var5[var9];
										} else {
											var13 = 0;
										}

										if (var6 != null) {
											var14 = var6[var9];
										} else {
											var14 = 0;
										}

										++var9;
										var15 = Class413.method7482(var12.substring(4));
										Class568 var20 = Client.field4791[var15];
										var20.method10122(var2 + var13, this.field4784 + var3 - var20.field5498 + var14);
										var2 += var20.field5499;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									this.method8146(var12);
								}
								continue;
							}

							var11 = '>';
						}
					}

					if (var11 == 160) {
						var11 = ' ';
					}

					if (var7 == -1) {
						if (this.field4795 != null && var8 != -1) {
							var2 += this.field4795[(var8 << 8) + var11];
						}

						int var19 = this.field4787[var11];
						var13 = this.field4788[var11];
						if (var5 != null) {
							var14 = var5[var9];
						} else {
							var14 = 0;
						}

						if (var6 != null) {
							var15 = var6[var9];
						} else {
							var15 = 0;
						}

						int var16;
						if (var4 != null) {
							var16 = var4[var9];
						} else {
							var16 = field4801;
						}

						++var9;
						if (var11 != ' ') {
							if (field4805 == 256) {
								if (field4802 != -1) {
									method8165(this.field4785[var11], this.field4789[var11] + var2 + 1 + var14, this.field4790[var11] + var3 + 1 + var15, var19, var13, field4802);
								}

								this.method7813(this.field4785[var11], this.field4789[var11] + var2 + var14, this.field4790[var11] + var3 + var15, var19, var13, var16);
							} else {
								if (field4802 != -1) {
									method8216(this.field4785[var11], this.field4789[var11] + var2 + 1 + var14, this.field4790[var11] + var3 + 1 + var15, var19, var13, field4802, field4805);
								}

								this.method7811(this.field4785[var11], this.field4789[var11] + var2 + var14, this.field4790[var11] + var3 + var15, var19, var13, var16, field4805);
							}
						} else if (field4803 > 0) {
							field4794 += field4803;
							var2 += field4794 >> 8;
							field4794 &= 255;
						}

						int var17 = this.field4786[var11];
						if (field4796 != -1) {
							method10128(var2, (int)((double)this.field4784 * 0.7D) + var3, var17, field4796);
						}

						if (field4804 != -1) {
							method10128(var2, this.field4784 + var3, var17, field4804);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}

	}

	@ObfInfo(name = "ai", desc = "([[B[[B[I[I[III)I")
	public static int method8137(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var4[var5] + var7;
		int var9 = var2[var6];
		int var10 = var4[var6] + var9;
		int var11 = var7;
		if (var9 > var7) {
			var11 = var9;
		}

		int var12 = var8;
		if (var10 < var8) {
			var12 = var10;
		}

		int var13 = var3[var5];
		if (var3[var6] < var13) {
			var13 = var3[var6];
		}

		byte[] var14 = var1[var5];
		byte[] var15 = var0[var6];
		int var16 = var11 - var7;
		int var17 = var11 - var9;

		for (int var18 = var11; var18 < var12; ++var18) {
			int var19 = var14[var16++] + var15[var17++];
			if (var19 < var13) {
				var13 = var19;
			}
		}

		return -var13;
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method8142(String var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var1 + var2);

		for (int var7 = 0; var7 < var1; ++var7) {
			char var5 = var0.charAt(var7);
			if (var5 == '<') {
				var6.append("<lt>");
			} else if (var5 == '>') {
				var6.append("<gt>");
			} else {
				var6.append(var5);
			}
		}

		return var6.toString();
	}

	@ObfInfo(name = "bx", desc = "([BIIIII)V")
	public static void method8165(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = Class88.field5502 * var2 + var1;
		int var7 = Class88.field5502 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < Class569.field5505) {
			var10 = Class569.field5505 - var2;
			var4 -= var10;
			var2 = Class569.field5505;
			var9 += var3 * var10;
			var6 += Class88.field5502 * var10;
		}

		if (var2 + var4 > Class569.field5507) {
			var4 -= var2 + var4 - Class569.field5507;
		}

		if (var1 < Class569.field5508) {
			var10 = Class569.field5508 - var1;
			var3 -= var10;
			var1 = Class569.field5508;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (var1 + var3 > Class569.field5509) {
			var10 = var1 + var3 - Class569.field5509;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method8236(Class569.field5504, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	@ObfInfo(name = "bu", desc = "([I[BIIIIIII)V")
	public static void method8236(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	@ObfInfo(name = "by", desc = "([BIIIIII)V")
	public static void method8216(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = Class88.field5502 * var2 + var1;
		int var8 = Class88.field5502 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < Class569.field5505) {
			var11 = Class569.field5505 - var2;
			var4 -= var11;
			var2 = Class569.field5505;
			var10 += var3 * var11;
			var7 += Class88.field5502 * var11;
		}

		if (var2 + var4 > Class569.field5507) {
			var4 -= var2 + var4 - Class569.field5507;
		}

		if (var1 < Class569.field5508) {
			var11 = Class569.field5508 - var1;
			var3 -= var11;
			var1 = Class569.field5508;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var1 + var3 > Class569.field5509) {
			var11 = var1 + var3 - Class569.field5509;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			method8202(Class569.field5504, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfInfo(name = "bw", desc = "([I[BIIIIIIII)V")
	public static void method8202(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & 65280) * var9 & 16711680) >> 8;
		var9 = 256 - var9;

		for (int var10 = -var6; var10 < 0; ++var10) {
			for (int var11 = -var5; var11 < 0; ++var11) {
				if (var1[var3++] != 0) {
					int var12 = var0[var4];
					var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & 65280) * var9 & 16711680) >> 8) + var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}
}
