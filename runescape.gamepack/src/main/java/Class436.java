import io.runebox.ObfInfo;
import java.util.Random;

@ObfInfo(name = "qt")
public abstract class Class436 extends Class561 {
	@ObfInfo(name = "ay", desc = "I")
	public static int field4723;
	@ObfInfo(name = "ap", desc = "I")
	public static int field4731;
	@ObfInfo(name = "aq", desc = "I")
	public static int field4735;
	@ObfInfo(name = "as", desc = "I")
	public static int field4736;
	@ObfInfo(name = "ae", desc = "I")
	public static int field4737;
	@ObfInfo(name = "ax", desc = "I")
	public static int field4738;
	@ObfInfo(name = "au", desc = "I")
	public static int field4739;
	@ObfInfo(name = "aw", desc = "I")
	public static int field4742;
	@ObfInfo(name = "ad", desc = "I")
	public static int field4743;
	@ObfInfo(name = "an", desc = "[Ljava/lang/String;")
	public static String[] field4745;
	@ObfInfo(name = "ai", desc = "Ljava/util/Random;")
	public static Random field4740;
	@ObfInfo(name = "av", desc = "[B")
	public byte[] field4728;
	@ObfInfo(name = "al", desc = "[[B")
	public byte[][] field4724;
	@ObfInfo(name = "ab", desc = "I")
	public int field4730;
	@ObfInfo(name = "ac", desc = "I")
	public int field4732;
	@ObfInfo(name = "ao", desc = "I")
	public int field4734;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field4725;
	@ObfInfo(name = "az", desc = "[I")
	public int[] field4726;
	@ObfInfo(name = "af", desc = "[I")
	public int[] field4727;
	@ObfInfo(name = "at", desc = "[I")
	public int[] field4729;
	@ObfInfo(name = "aa", desc = "[I")
	public int[] field4741;

	static {
		field4735 = -1;
		field4731 = -1;
		field4737 = -1;
		field4738 = -1;
		field4723 = 0;
		field4739 = 0;
		field4736 = 256;
		field4742 = 0;
		field4743 = 0;
		field4740 = new Random();
		field4745 = new String[100];
	}

	public Class436(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, int[] var6, byte[][] var7) {
		this.field4724 = new byte[256][];
		this.field4730 = 0;
		this.field4741 = var2;
		this.field4729 = var3;
		this.field4726 = var4;
		this.field4727 = var5;
		this.method7985(var1);
		this.field4724 = var7;
		int var8 = Integer.MAX_VALUE;
		int var9 = Integer.MIN_VALUE;

		for (int var10 = 0; var10 < 256; ++var10) {
			if (this.field4729[var10] < var8 && this.field4727[var10] != 0) {
				var8 = this.field4729[var10];
			}

			if (this.field4729[var10] + this.field4727[var10] > var9) {
				var9 = this.field4729[var10] + this.field4727[var10];
			}
		}

		this.field4732 = this.field4730 - var8;
		this.field4734 = var9 - this.field4730;
	}

	public Class436(byte[] var1) {
		this.field4724 = new byte[256][];
		this.field4730 = 0;
		this.method7985(var1);
	}

	@ObfInfo(name = "ak", desc = "([BIIIII)V")
	public abstract void method7772(byte[] var1, int var2, int var3, int var4, int var5, int var6);

	@ObfInfo(name = "al", desc = "([BIIIIII)V")
	public abstract void method7775(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

	@ObfInfo(name = "at", desc = "([B)V")
	public void method7985(byte[] var1) {
		this.field4725 = new int[256];
		int var2;
		if (var1.length == 257) {
			for (var2 = 0; var2 < this.field4725.length; ++var2) {
				this.field4725[var2] = var1[var2] & 255;
			}

			this.field4730 = var1[256] & 255;
		} else {
			var2 = 0;

			for (int var3 = 0; var3 < 256; ++var3) {
				this.field4725[var3] = var1[var2++] & 255;
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

			this.field4728 = new byte[65536];

			for (var13 = 0; var13 < 256; ++var13) {
				if (var13 != 32 && var13 != 160) {
					for (var8 = 0; var8 < 256; ++var8) {
						if (var8 != 32 && var8 != 160) {
							this.field4728[(var13 << 8) + var8] = (byte)method7986(var11, var12, var4, this.field4725, var10, var13, var8);
						}
					}
				}
			}

			this.field4730 = var4[32] + var10[32];
		}

	}

	@ObfInfo(name = "ac", desc = "(C)I")
	public int method7987(char var1) {
		if (var1 == 160) {
			var1 = ' ';
		}

		return this.field4725[Class405.method2753(var1) & 255];
	}

	@ObfInfo(name = "ao", desc = "(Ljava/lang/String;)I")
	public int method8080(String var1) {
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
										int var8 = Class412.method3402(var7.substring(4));
										var4 += Client.field4733[var8].field5396;
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
						var4 += this.field4725[(char)(Class405.method2753(var6) & 255)];
						if (this.field4728 != null && var3 != -1) {
							var4 += this.field4728[(var3 << 8) + var6];
						}

						var3 = var6;
					}
				}
			}

			return var4;
		}
	}

	@ObfInfo(name = "ah", desc = "(Ljava/lang/String;[I[Ljava/lang/String;)I")
	public int method8088(String var1, int[] var2, String[] var3) {
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
							var4 += this.method7987('<');
							if (this.field4728 != null && var11 != -1) {
								var4 += this.field4728[(var11 << '\b') + 60];
							}

							var11 = '<';
						} else if (var16.equals("gt")) {
							var4 += this.method7987('>');
							if (this.field4728 != null && var11 != -1) {
								var4 += this.field4728[(var11 << '\b') + 62];
							}

							var11 = '>';
						} else if (var16.startsWith("img=")) {
							try {
								int var17 = Class412.method3402(var16.substring(4));
								var4 += Client.field4733[var17].field5396;
								var11 = 0;
							} catch (Exception var18) {
							}
						}

						var15 = 0;
					}

					if (var10 == -1) {
						if (var15 != 0) {
							var6.append(var15);
							var4 += this.method7987(var15);
							if (this.field4728 != null && var11 != -1) {
								var4 += this.field4728[(var11 << '\b') + var15];
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

	@ObfInfo(name = "av", desc = "(Ljava/lang/String;I)I")
	public int method8073(String var1, int var2) {
		int var3 = this.method8088(var1, new int[]{var2}, field4745);
		int var4 = 0;

		for (int var5 = 0; var5 < var3; ++var5) {
			int var6 = this.method8080(field4745[var5]);
			if (var6 > var4) {
				var4 = var6;
			}
		}

		return var4;
	}

	@ObfInfo(name = "aq", desc = "(Ljava/lang/String;I)I")
	public int method7991(String var1, int var2) {
		return this.method8088(var1, new int[]{var2}, field4745);
	}

	@ObfInfo(name = "ae", desc = "(IILjava/lang/String;II)Lqi;")
	public Class425 method7990(int var1, int var2, String var3, int var4, int var5) {
		if (var3 != null && var3.length() >= var2 + var1) {
			int var6 = var4 - this.method8080(var3) / 2;
			var6 += this.method8080(var3.substring(0, var1));
			int var7 = var5 - this.field4732;
			int var8 = this.method8080(var3.substring(var1, var2 + var1));
			int var9 = this.field4732 + this.field4734;
			return new Class425(var6, var7, var8, var9);
		} else {
			return new Class425(var4, var5, 0, 0);
		}
	}

	@ObfInfo(name = "ax", desc = "(Ljava/lang/String;IIII)V")
	public void method8017(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method8007(var4, var5);
			this.method8010(var1, var2, var3);
		}
	}

	@ObfInfo(name = "ay", desc = "(Ljava/lang/String;IIIII)V")
	public void method7994(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method8007(var4, var5);
			field4736 = var6;
			this.method8010(var1, var2, var3);
		}
	}

	@ObfInfo(name = "au", desc = "(Ljava/lang/String;IIII)V")
	public void method7995(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method8007(var4, var5);
			this.method8010(var1, var2 - this.method8080(var1), var3);
		}
	}

	@ObfInfo(name = "as", desc = "(Ljava/lang/String;IIII)V")
	public void method7996(String var1, int var2, int var3, int var4, int var5) {
		if (var1 != null) {
			this.method8007(var4, var5);
			this.method8010(var1, var2 - this.method8080(var1) / 2, var3);
		}
	}

	@ObfInfo(name = "aw", desc = "(Ljava/lang/String;IIIIIIIII)I")
	public int method8011(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
		return this.method7998(var1, var2, var3, var4, var5, var6, var7, 256, var8, var9, var10);
	}

	@ObfInfo(name = "ad", desc = "(Ljava/lang/String;IIIIIIIIII)I")
	public int method7998(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
		if (var1 == null) {
			return 0;
		} else {
			if (var8 == 255) {
				var8 = 256;
			}

			this.method8007(var6, var7);
			field4736 = var8;
			if (var11 == 0) {
				var11 = this.field4730;
			}

			int[] var12 = new int[]{var4};
			if (var5 < this.field4732 + this.field4734 + var11 && var5 < var11 + var11) {
				var12 = null;
			}

			int var13 = this.method8088(var1, var12, field4745);
			if (var10 == 3 && var13 == 1) {
				var10 = 1;
			}

			int var14;
			int var15;
			if (var10 == 0) {
				var14 = this.field4732 + var3;
			} else if (var10 == 1) {
				var14 = this.field4732 + var3 + (var5 - this.field4732 - this.field4734 - (var13 - 1) * var11) / 2;
			} else if (var10 == 2) {
				var14 = var5 + var3 - this.field4734 - (var13 - 1) * var11;
			} else {
				var15 = (var5 - this.field4732 - this.field4734 - (var13 - 1) * var11) / (var13 + 1);
				if (var15 < 0) {
					var15 = 0;
				}

				var14 = this.field4732 + var3 + var15;
				var11 += var15;
			}

			for (var15 = 0; var15 < var13; ++var15) {
				if (var9 == 0) {
					this.method8010(field4745[var15], var2, var14);
				} else if (var9 == 1) {
					this.method8010(field4745[var15], var2 + (var4 - this.method8080(field4745[var15])) / 2, var14);
				} else if (var9 == 2) {
					this.method8010(field4745[var15], var4 + var2 - this.method8080(field4745[var15]), var14);
				} else if (var15 == var13 - 1) {
					this.method8010(field4745[var15], var2, var14);
				} else {
					this.method8009(field4745[var15], var4);
					this.method8010(field4745[var15], var2, var14);
					field4742 = 0;
				}

				var14 += var11;
			}

			return var13;
		}
	}

	@ObfInfo(name = "ai", desc = "(Lqv;IIIII)Lto;")
	public Class509 method7999(Class438 var1, int var2, int var3, int var4, int var5, int var6) {
		if (!var1.method8101()) {
			this.method8007(var4, var5);
			var3 -= this.field4730;

			for (int var7 = 0; var7 < var1.method8102(); ++var7) {
				Class431 var8 = var1.method8106(var7);
				if (var6 != -1 && var8.field4710 > var6) {
					return new Class509(var8.field4709, var8.field4710);
				}

				char var9 = var8.field4708;
				if (var9 != '\n') {
					if (var1.method8100(var7)) {
						var9 = '*';
					}

					if (var9 != '\t') {
						if (var9 == 160) {
							var9 = ' ';
						}

						int var10 = var2 + var8.field4709;
						int var11 = var3 + var8.field4710;
						int var12 = this.field4726[var9];
						int var13 = this.field4727[var9];
						if (field4738 != -1) {
							this.method7772(this.field4724[var9], var10 + this.field4741[var9] + 1, var11 + this.field4729[var9] + 1, var12, var13, field4738);
						}

						this.method7772(this.field4724[var9], var10 + this.field4741[var9], var11 + this.field4729[var9], var12, var13, field4739);
					}
				}
			}
		}

		return var1.method8105();
	}

	@ObfInfo(name = "an", desc = "(Ljava/lang/String;IIIII[I)V")
	public void method8060(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method8007(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method8005(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];

			for (int var10 = 0; var10 < var1.length(); ++var10) {
				var9[var10] = (int)(Math.sin((double)var10 / 2.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method7997(var1, var2 - this.method8080(var1) / 2, var3, var8, (int[])null, var9);
		}
	}

	@ObfInfo(name = "am", desc = "(Ljava/lang/String;IIIII[I)V")
	public void method8042(String var1, int var2, int var3, int var4, int var5, int var6, int[] var7) {
		if (var1 != null) {
			this.method8007(var4, var5);
			int[] var8 = null;
			if (var7 != null) {
				var8 = this.method8005(var7, var1.length());
			}

			int[] var9 = new int[var1.length()];
			int[] var10 = new int[var1.length()];

			for (int var11 = 0; var11 < var1.length(); ++var11) {
				var9[var11] = (int)(Math.sin((double)var11 / 5.0D + (double)var6 / 5.0D) * 5.0D);
				var10[var11] = (int)(Math.sin((double)var11 / 3.0D + (double)var6 / 5.0D) * 5.0D);
			}

			this.method7997(var1, var2 - this.method8080(var1) / 2, var3, var8, var9, var10);
		}
	}

	@ObfInfo(name = "ar", desc = "(Ljava/lang/String;IIIIII[I)V")
	public void method8002(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int[] var8) {
		if (var1 != null) {
			this.method8007(var4, var5);
			int[] var9 = null;
			if (var8 != null) {
				var9 = this.method8005(var8, var1.length());
			}

			double var10 = 7.0D - (double)var7 / 8.0D;
			if (var10 < 0.0D) {
				var10 = 0.0D;
			}

			int[] var12 = new int[var1.length()];

			for (int var13 = 0; var13 < var1.length(); ++var13) {
				var12[var13] = (int)(Math.sin((double)var13 / 1.5D + (double)var6 / 1.0D) * var10);
			}

			this.method7997(var1, var2 - this.method8080(var1) / 2, var3, var9, (int[])null, var12);
		}
	}

	@ObfInfo(name = "ag", desc = "(Ljava/lang/String;IIII[I)V")
	public void method8003(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method8007(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method8005(var6, var1.length());
			}

			this.method7997(var1, var2 - this.method8080(var1) / 2, var3, var7, (int[])null, (int[])null);
		}
	}

	@ObfInfo(name = "bs", desc = "(Ljava/lang/String;IIII[I)V")
	public void method8004(String var1, int var2, int var3, int var4, int var5, int[] var6) {
		if (var1 != null) {
			this.method8007(var4, var5);
			int[] var7 = null;
			if (var6 != null) {
				var7 = this.method8005(var6, var1.length());
			}

			this.method7997(var1, var2, var3, var7, (int[])null, (int[])null);
		}
	}

	@ObfInfo(name = "bf", desc = "([II)[I")
	public int[] method8005(int[] var1, int var2) {
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
	public void method8006(String var1, int var2, int var3, int var4, int var5, int var6) {
		if (var1 != null) {
			this.method8007(var4, var5);
			field4740.setSeed((long)var6);
			field4736 = 192 + (field4740.nextInt() & 31);
			int[] var7 = new int[var1.length()];
			int var8 = 0;

			for (int var9 = 0; var9 < var1.length(); ++var9) {
				var7[var9] = var8;
				if ((field4740.nextInt() & 3) == 0) {
					++var8;
				}
			}

			this.method7997(var1, var2, var3, (int[])null, var7, (int[])null);
		}
	}

	@ObfInfo(name = "bi", desc = "(II)V")
	public void method8007(int var1, int var2) {
		field4735 = -1;
		field4731 = -1;
		field4737 = var2;
		field4738 = var2;
		field4723 = var1;
		field4739 = var1;
		field4736 = 256;
		field4742 = 0;
		field4743 = 0;
	}

	@ObfInfo(name = "bt", desc = "(Ljava/lang/String;)V")
	public void method8008(String var1) {
		try {
			int var2;
			String var3;
			if (var1.startsWith("col=")) {
				var3 = var1.substring(4);
				var2 = Class412.method5862(var3, 16, true);
				field4739 = var2;
			} else if (var1.equals("/col")) {
				field4739 = field4723;
			} else if (var1.startsWith("str=")) {
				var3 = var1.substring(4);
				var2 = Class412.method5862(var3, 16, true);
				field4735 = var2;
			} else if (var1.equals("str")) {
				field4735 = 8388608;
			} else if (var1.equals("/str")) {
				field4735 = -1;
			} else if (var1.startsWith("u=")) {
				var3 = var1.substring(2);
				var2 = Class412.method5862(var3, 16, true);
				field4731 = var2;
			} else if (var1.equals("u")) {
				field4731 = 0;
			} else if (var1.equals("/u")) {
				field4731 = -1;
			} else if (var1.startsWith("shad=")) {
				var3 = var1.substring(5);
				var2 = Class412.method5862(var3, 16, true);
				field4738 = var2;
			} else if (var1.equals("shad")) {
				field4738 = 0;
			} else if (var1.equals("/shad")) {
				field4738 = field4737;
			} else if (var1.equals("br")) {
				this.method8007(field4723, field4737);
			}
		} catch (Exception var4) {
		}

	}

	@ObfInfo(name = "bn", desc = "(Ljava/lang/String;I)V")
	public void method8009(String var1, int var2) {
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
			field4742 = (var2 - this.method8080(var1) << 8) / var3;
		}

	}

	@ObfInfo(name = "bw", desc = "(Ljava/lang/String;II)V")
	public void method8010(String var1, int var2, int var3) {
		var3 -= this.field4730;
		int var4 = -1;
		int var5 = -1;

		for (int var6 = 0; var6 < var1.length(); ++var6) {
			if (var1.charAt(var6) != 0) {
				char var7 = (char)(Class405.method2753(var1.charAt(var6)) & 255);
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
										var9 = Class412.method3402(var8.substring(4));
										Class557 var13 = Client.field4733[var9];
										var13.method10086(var2, this.field4730 + var3 - var13.field5399);
										var2 += var13.field5396;
										var5 = -1;
									} catch (Exception var11) {
									}
								} else {
									this.method8008(var8);
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
						if (this.field4728 != null && var5 != -1) {
							var2 += this.field4728[(var5 << 8) + var7];
						}

						int var12 = this.field4726[var7];
						var9 = this.field4727[var7];
						if (var7 != ' ') {
							if (field4736 == 256) {
								if (field4738 != -1) {
									method8014(this.field4724[var7], var2 + this.field4741[var7] + 1, var3 + this.field4729[var7] + 1, var12, var9, field4738);
								}

								this.method7772(this.field4724[var7], var2 + this.field4741[var7], var3 + this.field4729[var7], var12, var9, field4739);
							} else {
								if (field4738 != -1) {
									method8016(this.field4724[var7], var2 + this.field4741[var7] + 1, var3 + this.field4729[var7] + 1, var12, var9, field4738, field4736);
								}

								this.method7775(this.field4724[var7], var2 + this.field4741[var7], var3 + this.field4729[var7], var12, var9, field4739, field4736);
							}
						} else if (field4742 > 0) {
							field4743 += field4742;
							var2 += field4743 >> 8;
							field4743 &= 255;
						}

						int var10 = this.field4725[var7];
						if (field4735 != -1) {
							method10200(var2, var3 + (int)((double)this.field4730 * 0.7D), var10, field4735);
						}

						if (field4731 != -1) {
							method10200(var2, this.field4730 + var3 + 1, var10, field4731);
						}

						var2 += var10;
						var5 = var7;
					}
				}
			}
		}

	}

	@ObfInfo(name = "bl", desc = "(Ljava/lang/String;II[I[I[I)V")
	public void method7997(String var1, int var2, int var3, int[] var4, int[] var5, int[] var6) {
		var3 -= this.field4730;
		int var7 = -1;
		int var8 = -1;
		int var9 = 0;

		for (int var10 = 0; var10 < var1.length(); ++var10) {
			if (var1.charAt(var10) != 0) {
				char var11 = (char)(Class405.method2753(var1.charAt(var10)) & 255);
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
										var15 = Class412.method3402(var12.substring(4));
										Class557 var20 = Client.field4733[var15];
										var20.method10086(var13 + var2, this.field4730 + var3 - var20.field5399 + var14);
										var2 += var20.field5396;
										var8 = -1;
									} catch (Exception var18) {
									}
								} else {
									this.method8008(var12);
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
						if (this.field4728 != null && var8 != -1) {
							var2 += this.field4728[(var8 << 8) + var11];
						}

						int var19 = this.field4726[var11];
						var13 = this.field4727[var11];
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
							var16 = field4739;
						}

						++var9;
						if (var11 != ' ') {
							if (field4736 == 256) {
								if (field4738 != -1) {
									method8014(this.field4724[var11], var2 + this.field4741[var11] + 1 + var14, var3 + this.field4729[var11] + 1 + var15, var19, var13, field4738);
								}

								this.method7772(this.field4724[var11], var2 + this.field4741[var11] + var14, var3 + this.field4729[var11] + var15, var19, var13, var16);
							} else {
								if (field4738 != -1) {
									method8016(this.field4724[var11], var2 + this.field4741[var11] + 1 + var14, var3 + this.field4729[var11] + 1 + var15, var19, var13, field4738, field4736);
								}

								this.method7775(this.field4724[var11], var2 + this.field4741[var11] + var14, var3 + this.field4729[var11] + var15, var19, var13, var16, field4736);
							}
						} else if (field4742 > 0) {
							field4743 += field4742;
							var2 += field4743 >> 8;
							field4743 &= 255;
						}

						int var17 = this.field4725[var11];
						if (field4735 != -1) {
							method10200(var2, var3 + (int)((double)this.field4730 * 0.7D), var17, field4735);
						}

						if (field4731 != -1) {
							method10200(var2, this.field4730 + var3, var17, field4731);
						}

						var2 += var17;
						var8 = var11;
					}
				}
			}
		}

	}

	@ObfInfo(name = "ab", desc = "([[B[[B[I[I[III)I")
	public static int method7986(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
		int var7 = var2[var5];
		int var8 = var7 + var4[var5];
		int var9 = var2[var6];
		int var10 = var9 + var4[var6];
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

	@ObfInfo(name = "ap", desc = "(Ljava/lang/String;)Ljava/lang/String;")
	public static String method7992(String var0) {
		int var1 = var0.length();
		int var2 = 0;

		for (int var3 = 0; var3 < var1; ++var3) {
			char var4 = var0.charAt(var3);
			if (var4 == '<' || var4 == '>') {
				var2 += 3;
			}
		}

		StringBuilder var6 = new StringBuilder(var2 + var1);

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

	@ObfInfo(name = "be", desc = "([BIIIII)V")
	public static void method8014(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
		int var6 = var1 + Class87.field5423 * var2;
		int var7 = Class87.field5423 - var3;
		int var8 = 0;
		int var9 = 0;
		int var10;
		if (var2 < Class561.field5422) {
			var10 = Class561.field5422 - var2;
			var4 -= var10;
			var2 = Class561.field5422;
			var9 += var10 * var3;
			var6 += Class87.field5423 * var10;
		}

		if (var4 + var2 > Class561.field5419) {
			var4 -= var4 + var2 - Class561.field5419;
		}

		if (var1 < Class561.field5424) {
			var10 = Class561.field5424 - var1;
			var3 -= var10;
			var1 = Class561.field5424;
			var9 += var10;
			var6 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 + var1 > Class561.field5425) {
			var10 = var3 + var1 - Class561.field5425;
			var3 -= var10;
			var8 += var10;
			var7 += var10;
		}

		if (var3 > 0 && var4 > 0) {
			method8031(Class561.field5418, var0, var5, var9, var6, var3, var4, var7, var8);
		}
	}

	@ObfInfo(name = "bg", desc = "([I[BIIIIIII)V")
	public static void method8031(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
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

	@ObfInfo(name = "bu", desc = "([BIIIIII)V")
	public static void method8016(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
		int var7 = var1 + Class87.field5423 * var2;
		int var8 = Class87.field5423 - var3;
		int var9 = 0;
		int var10 = 0;
		int var11;
		if (var2 < Class561.field5422) {
			var11 = Class561.field5422 - var2;
			var4 -= var11;
			var2 = Class561.field5422;
			var10 += var11 * var3;
			var7 += Class87.field5423 * var11;
		}

		if (var4 + var2 > Class561.field5419) {
			var4 -= var4 + var2 - Class561.field5419;
		}

		if (var1 < Class561.field5424) {
			var11 = Class561.field5424 - var1;
			var3 -= var11;
			var1 = Class561.field5424;
			var10 += var11;
			var7 += var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 + var1 > Class561.field5425) {
			var11 = var3 + var1 - Class561.field5425;
			var3 -= var11;
			var9 += var11;
			var8 += var11;
		}

		if (var3 > 0 && var4 > 0) {
			method8062(Class561.field5418, var0, var5, var10, var7, var3, var4, var8, var9, var6);
		}
	}

	@ObfInfo(name = "bh", desc = "([I[BIIIIIIII)V")
	public static void method8062(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
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
