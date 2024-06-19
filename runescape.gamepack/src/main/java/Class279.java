import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Class279 {
	public static Class290 field3086;
	public Class282 field3079;
	public int field3077;
	public int field3078;
	public int field3084;
	public int field3089;
	public HashMap field3073;
	public LinkedList field3080;
	public List field3082;
	public final HashMap field3085;

	static {
		field3086 = new Class290(37748736, 256);
	}

	public Class279(int var1, int var2, int var3, HashMap var4) {
		this.field3077 = var1;
		this.field3078 = var2;
		this.field3080 = new LinkedList();
		this.field3082 = new LinkedList();
		this.field3073 = new HashMap();
		this.field3089 = var3 | -16777216;
		this.field3085 = var4;
	}

	public void method5572(int var1, int var2, int var3) {
		Class549 var5 = Class63.method1135(this.field3077, this.field3078, this.field3084);
		if (var5 != null) {
			if (this.field3084 * 64 == var3) {
				var5.method9929(var1, var2);
			} else {
				var5.method9918(var1, var2, var3, var3);
			}

		}
	}

	public void method5573(Class282 var1, List var2) {
		this.field3073.clear();
		this.field3079 = var1;
		this.method5668(var2);
	}

	public void method5574(HashSet var1, List var2) {
		this.field3073.clear();
		Iterator var4 = var1.iterator();

		while (var4.hasNext()) {
			Class281 var5 = (Class281)var4.next();
			if (var5.method6035() == this.field3077 && var5.method6039() == this.field3078) {
				this.field3080.add(var5);
			}
		}

		this.method5668(var2);
	}

	public void method5680(int var1, int var2, int var3, int var4, Class303 var5) {
		for (int var7 = var1; var7 < var3 + var1; ++var7) {
			label74:
			for (int var8 = var2; var8 < var4 + var2; ++var8) {
				for (int var9 = 0; var9 < var5.field3215; ++var9) {
					Class291[] var10 = var5.field3222[var9][var7][var8];
					if (var10 != null && var10.length != 0) {
						for (int var12 = 0; var12 < var10.length; ++var12) {
							Class222 var14;
							boolean var15;
							label65: {
								Class291 var13 = var10[var12];
								var14 = Class222.method4161(var13.field3163);
								if (var14.field2278 != null) {
									int[] var16 = var14.field2278;

									for (int var17 = 0; var17 < var16.length; ++var17) {
										int var18 = var16[var17];
										Class222 var19 = Class222.method4161(var18);
										if (-1 != var19.field2272) {
											var15 = true;
											break label65;
										}
									}
								} else if (-1 != var14.field2272) {
									var15 = true;
									break label65;
								}

								var15 = false;
							}

							if (var15) {
								this.method5605(var14, var9, var7, var8, var5);
								continue label74;
							}
						}
					}
				}
			}
		}

	}

	public void method5605(Class222 var1, int var2, int var3, int var4, Class303 var5) {
		Class348 var7 = new Class348(var2, var3 + this.field3077 * 64, this.field3078 * 64 + var4);
		Class348 var8 = null;
		if (this.field3079 != null) {
			var8 = new Class348(this.field3079.field3214 + var2, this.field3079.field3212 * 64 + var3, this.field3079.field3211 * 64 + var4);
		} else {
			Class281 var9 = (Class281)var5;
			var8 = new Class348(var9.field3214 + var2, var3 + var9.field3212 * 64 + var9.method5699() * 8, var4 + var9.field3211 * 64 + var9.method5710() * 8);
		}

		Class200 var10;
		Object var11;
		if (var1.field2278 != null) {
			var11 = new Class283(var8, var7, var1.field2244, this);
		} else {
			var10 = Class200.method3917(var1.field2272);
			var11 = new Class289(var8, var7, var10.field2045, this.method5602(var10));
		}

		var10 = Class200.method3917(((Class305)var11).method5728());
		if (var10.field2052) {
			this.field3073.put(new Class348(0, var3, var4), var11);
		}

	}

	public void method5618() {
		Iterator var2 = this.field3073.values().iterator();

		while (var2.hasNext()) {
			Class305 var3 = (Class305)var2.next();
			if (var3 instanceof Class283) {
				((Class283)var3).method5738();
			}
		}

	}

	public void method5668(List var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Class289 var4 = (Class289)var3.next();
			if (Class200.method3917(var4.field3155).field2052 && this.field3077 == var4.field3235.field3869 >> 6 && this.field3078 == var4.field3235.field3868 >> 6) {
				Class289 var5 = new Class289(var4.field3235, var4.field3235, var4.field3155, this.method5601(var4.field3155));
				this.field3082.add(var5);
			}
		}

	}

	public void method5579() {
		if (this.field3079 != null) {
			this.field3079.method6055();
		} else {
			Iterator var2 = this.field3080.iterator();

			while (var2.hasNext()) {
				Class281 var3 = (Class281)var2.next();
				var3.method6055();
			}
		}

	}

	public boolean method5580(Class382 var1) {
		this.field3073.clear();
		if (this.field3079 != null) {
			this.field3079.method6037(var1);
			if (this.field3079.method6036()) {
				this.method5680(0, 0, 64, 64, this.field3079);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var3 = true;

			Iterator var4;
			Class281 var5;
			for (var4 = this.field3080.iterator(); var4.hasNext(); var3 &= var5.method6036()) {
				var5 = (Class281)var4.next();
				var5.method6037(var1);
			}

			if (var3) {
				var4 = this.field3080.iterator();

				while (var4.hasNext()) {
					var5 = (Class281)var4.next();
					this.method5680(var5.method5700() * 8, var5.method5701() * 8, 8, 8, var5);
				}
			}

			return var3;
		}
	}

	public void method5672(int var1, Class304 var2, Class557[] var3, Class382 var4, Class382 var5) {
		this.field3084 = var1;
		if (this.field3079 != null || !this.field3080.isEmpty()) {
			if (Class63.method1135(this.field3077, this.field3078, var1) == null) {
				boolean var7 = true;
				var7 &= this.method5580(var4);
				int var9;
				if (this.field3079 != null) {
					var9 = this.field3079.field3217;
				} else {
					var9 = ((Class303)this.field3080.getFirst()).field3217;
				}

				var7 &= var5.method7220(var9);
				if (var7) {
					byte[] var8 = var5.method7221(var9);
					Class307 var10;
					if (var8 == null) {
						var10 = new Class307();
					} else {
						var10 = new Class307(Class46.method8418(var8).field5357);
					}

					Class549 var12 = new Class549(this.field3084 * 64, this.field3084 * 64);
					var12.method9922();
					if (this.field3079 != null) {
						this.method5575(var2, var3, var10);
					} else {
						this.method5585(var2, var3, var10);
					}

					method3503(var12, this.field3077, this.field3078, this.field3084);
					this.method5579();
				}
			}
		}
	}

	public void method5622(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.method5592(var1, var2, var4, var3);
		this.method5598(var1, var2, var4, var3);
	}

	public void method5583(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field3073.values().iterator();

		while (var5.hasNext()) {
			Class305 var6 = (Class305)var5.next();
			if (var6.method6119()) {
				int var7 = var6.method5728();
				if (var1.contains(var7)) {
					Class200 var8 = Class200.method3917(var7);
					this.method5594(var8, var6.field3229, var6.field3231, var2, var3);
				}
			}
		}

		this.method5646(var1, var2, var3);
	}

	public void method5575(Class304 var1, Class557[] var2, Class307 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method5587(var5, var6, this.field3079, var1, var3);
				this.method5588(var5, var6, this.field3079, var1);
			}
		}

		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method5628(var5, var6, this.field3079, var1, var2);
			}
		}

	}

	public void method5585(Class304 var1, Class557[] var2, Class307 var3) {
		Iterator var5 = this.field3080.iterator();

		Class281 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (Class281)var5.next();

			for (var7 = var6.method5700() * 8; var7 < var6.method5700() * 8 + 8; ++var7) {
				for (var8 = var6.method5701() * 8; var8 < var6.method5701() * 8 + 8; ++var8) {
					this.method5587(var7, var8, var6, var1, var3);
					this.method5588(var7, var8, var6, var1);
				}
			}
		}

		var5 = this.field3080.iterator();

		while (var5.hasNext()) {
			var6 = (Class281)var5.next();

			for (var7 = var6.method5700() * 8; var7 < var6.method5700() * 8 + 8; ++var7) {
				for (var8 = var6.method5701() * 8; var8 < var6.method5701() * 8 + 8; ++var8) {
					this.method5628(var7, var8, var6, var1, var2);
				}
			}
		}

	}

	public void method5628(int var1, int var2, Class303 var3, Class304 var4, Class557[] var5) {
		this.method5591(var1, var2, var3);
		this.method5584(var1, var2, var3, var5);
	}

	public void method5587(int var1, int var2, Class303 var3, Class304 var4, Class307 var5) {
		int var7 = var3.field3218[0][var1][var2] - 1;
		int var8 = var3.field3219[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			Class561.method10152(var1 * this.field3084, (63 - var2) * this.field3084, this.field3084, this.field3084, this.field3089);
		}

		int var9 = 16711935;
		if (var8 != -1) {
			var9 = Class292.method4758(var8, this.field3089);
		}

		if (var8 > -1 && var3.field3210[0][var1][var2] == 0) {
			Class561.method10152(this.field3084 * var1, this.field3084 * (63 - var2), this.field3084, this.field3084, var9);
		} else {
			int var10 = this.method5589(var1, var2, var3, var5);
			if (var8 == -1) {
				Class561.method10152(this.field3084 * var1, this.field3084 * (63 - var2), this.field3084, this.field3084, var10);
			} else {
				var4.method6099(var1 * this.field3084, (63 - var2) * this.field3084, var10, var9, this.field3084, this.field3084, var3.field3210[0][var1][var2], var3.field3221[0][var1][var2]);
			}
		}
	}

	public void method5588(int var1, int var2, Class303 var3, Class304 var4) {
		for (int var6 = 1; var6 < var3.field3215; ++var6) {
			int var7 = var3.field3219[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var8 = Class292.method4758(var7, this.field3089);
				if (var3.field3210[var6][var1][var2] == 0) {
					Class561.method10152(var1 * this.field3084, (63 - var2) * this.field3084, this.field3084, this.field3084, var8);
				} else {
					var4.method6099(this.field3084 * var1, this.field3084 * (63 - var2), 0, var8, this.field3084, this.field3084, var3.field3210[var6][var1][var2], var3.field3221[var6][var1][var2]);
				}
			}
		}

	}

	public int method5589(int var1, int var2, Class303 var3, Class307 var4) {
		return var3.field3218[0][var1][var2] == 0 ? this.field3089 : var4.method6156(var1, var2);
	}

	public void method5584(int var1, int var2, Class303 var3, Class557[] var4) {
		for (int var6 = 0; var6 < var3.field3215; ++var6) {
			Class291[] var7 = var3.field3222[var6][var1][var2];
			if (var7 != null && 0 != var7.length) {
				for (int var9 = 0; var9 < var7.length; ++var9) {
					Class291 var10 = var7[var9];
					if (!Class274.method5518(var10.field3162)) {
						int var12 = var10.field3162;
						boolean var11 = Class373.field4067.field4068 == var12;
						if (!var11) {
							continue;
						}
					}

					Class222 var13 = Class222.method4161(var10.field3163);
					if (-1 != var13.field2266) {
						if (46 != var13.field2266 && 52 != var13.field2266) {
							var4[var13.field2266].method10088(var1 * this.field3084, this.field3084 * (63 - var2), this.field3084 * 2, this.field3084 * 2);
						} else {
							var4[var13.field2266].method10088(this.field3084 * var1, this.field3084 * (63 - var2), this.field3084 * 2 + 1, 1 + this.field3084 * 2);
						}
					}
				}
			}
		}

	}

	public void method5591(int var1, int var2, Class303 var3) {
		for (int var5 = 0; var5 < var3.field3215; ++var5) {
			Class291[] var6 = var3.field3222[var5][var1][var2];
			if (var6 != null && 0 != var6.length) {
				for (int var8 = 0; var8 < var6.length; ++var8) {
					Class291 var9 = var6[var8];
					if (Class373.method4909(var9.field3162)) {
						Class222 var10 = Class222.method4161(var9.field3163);
						int var11 = var10.field2254 != 0 ? -3407872 : -3355444;
						if (var9.field3162 == Class373.field4062.field4068) {
							this.method5677(var1, var2, var9.field3161, var11);
						}

						if (Class373.field4047.field4068 == var9.field3162) {
							this.method5677(var1, var2, var9.field3161, -3355444);
							this.method5677(var1, var2, 1 + var9.field3161, var11);
						}

						if (Class373.field4060.field4068 == var9.field3162) {
							if (0 == var9.field3161) {
								Class561.method10200(this.field3084 * var1, this.field3084 * (63 - var2), 1, var11);
							}

							if (var9.field3161 == 1) {
								Class561.method10200(this.field3084 + var1 * this.field3084 - 1, (63 - var2) * this.field3084, 1, var11);
							}

							if (var9.field3161 == 2) {
								Class561.method10200(var1 * this.field3084 + this.field3084 - 1, this.field3084 * (63 - var2) + this.field3084 - 1, 1, var11);
							}

							if (var9.field3161 == 3) {
								Class561.method10200(this.field3084 * var1, (63 - var2) * this.field3084 + this.field3084 - 1, 1, var11);
							}
						}

						if (var9.field3162 == Class373.field4049.field4068) {
							int var12 = var9.field3161 % 2;
							int var13;
							if (var12 == 0) {
								for (var13 = 0; var13 < this.field3084; ++var13) {
									Class561.method10200(var13 + this.field3084 * var1, this.field3084 * (64 - var2) - 1 - var13, 1, var11);
								}
							} else {
								for (var13 = 0; var13 < this.field3084; ++var13) {
									Class561.method10200(var13 + this.field3084 * var1, (63 - var2) * this.field3084 + var13, 1, var11);
								}
							}
						}
					}
				}
			}
		}

	}

	public void method5592(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field3073.entrySet().iterator();

		while (var8.hasNext()) {
			Entry var9 = (Entry)var8.next();
			Class348 var10 = (Class348)var9.getKey();
			int var11 = (int)((float)var1 + var6 * (float)var10.field3869 - var7);
			int var12 = (int)((float)(var4 + var2) - (float)var10.field3868 * var6 - var7);
			Class305 var13 = (Class305)var9.getValue();
			if (var13 != null && var13.method6119()) {
				var13.field3229 = var11;
				var13.field3231 = var12;
				Class200 var14 = Class200.method3917(var13.method5728());
				if (!var3.contains(var14.method3895())) {
					this.method5595(var13, var11, var12, var6);
				}
			}
		}

	}

	public void method5646(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field3082.iterator();

		while (var5.hasNext()) {
			Class305 var6 = (Class305)var5.next();
			if (var6.method6119()) {
				Class200 var7 = Class200.method3917(var6.method5728());
				if (var7 != null && var1.contains(var7.method3895())) {
					this.method5594(var7, var6.field3229, var6.field3231, var2, var3);
				}
			}
		}

	}

	public void method5594(Class200 var1, int var2, int var3, int var4, int var5) {
		Class549 var7 = var1.method3893(false);
		if (var7 != null) {
			var7.method10023(var2 - var7.field5353 / 2, var3 - var7.field5354 / 2);
			if (var4 % var5 < var5 / 2) {
				Class561.method10150(var2, var3, 15, 16776960, 128);
				Class561.method10150(var2, var3, 7, 16777215, 256);
			}

		}
	}

	public void method5595(Class305 var1, int var2, int var3, float var4) {
		Class200 var6 = Class200.method3917(var1.method5728());
		this.method5596(var6, var2, var3);
		this.method5671(var1, var6, var2, var3, var4);
	}

	public void method5596(Class200 var1, int var2, int var3) {
		Class549 var5 = var1.method3893(false);
		if (var5 != null) {
			int var6 = this.method5599(var5, var1.field2049);
			int var7 = this.method5600(var5, var1.field2059);
			var5.method10023(var6 + var2, var7 + var3);
		}

	}

	public void method5671(Class305 var1, Class200 var2, int var3, int var4, float var5) {
		Class294 var7 = var1.method5744();
		if (var7 != null) {
			if (var7.field3175.method5560(var5)) {
				Class418 var8 = (Class418)this.field3085.get(var7.field3175);
				var8.method8011(var7.field3173, var3 - var7.field3172 / 2, var4, var7.field3172, var7.field3174, -16777216 | var2.field2053, 0, 1, 0, var8.field4730 / 2);
			}
		}
	}

	public void method5598(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		Iterator var7 = this.field3082.iterator();

		while (var7.hasNext()) {
			Class305 var8 = (Class305)var7.next();
			if (var8.method6119()) {
				int var9 = var8.field3235.field3869 % 64;
				int var10 = var8.field3235.field3868 % 64;
				var8.field3229 = (int)((float)var1 + (float)var9 * var6);
				var8.field3231 = (int)(var6 * (float)(63 - var10) + (float)var2);
				if (!var3.contains(var8.method5728())) {
					this.method5595(var8, var8.field3229, var8.field3231, var6);
				}
			}
		}

	}

	public int method5599(Class549 var1, Class185 var2) {
		switch(var2.field1923) {
		case 0:
			return -var1.field5353 / 2;
		case 2:
			return 0;
		default:
			return -var1.field5353;
		}
	}

	public int method5600(Class549 var1, Class213 var2) {
		switch(var2.field2159) {
		case 0:
			return -var1.field5354 / 2;
		case 2:
			return 0;
		default:
			return -var1.field5354;
		}
	}

	public Class294 method5601(int var1) {
		Class200 var3 = Class200.method3917(var1);
		return this.method5602(var3);
	}

	public Class294 method5602(Class200 var1) {
		if (var1.field2048 != null && this.field3085 != null && this.field3085.get(Class278.field3063) != null) {
			int var4 = var1.field2050;
			Class278[] var5 = Class278.method5565();
			int var6 = 0;

			Class278 var3;
			while (true) {
				if (var6 >= var5.length) {
					var3 = null;
					break;
				}

				Class278 var7 = var5[var6];
				if (var7.field3067 == var4) {
					var3 = var7;
					break;
				}

				++var6;
			}

			if (var3 == null) {
				return null;
			} else {
				Class418 var15 = (Class418)this.field3085.get(var3);
				if (var15 == null) {
					return null;
				} else {
					int var16 = var15.method7991(var1.field2048, 1000000);
					String[] var8 = new String[var16];
					var15.method8088(var1.field2048, (int[])null, var8);
					int var9 = var15.field4730 * var8.length / 2;
					int var10 = 0;

					for (int var12 = 0; var12 < var8.length; ++var12) {
						String var13 = var8[var12];
						int var14 = var15.method8080(var13);
						if (var14 > var10) {
							var10 = var14;
						}
					}

					return new Class294(var1.field2048, var10, var9, var3);
				}
			}
		} else {
			return null;
		}
	}

	public List method5603(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var3 + var1 && var5 < var3 + var2) {
				Iterator var8 = this.field3073.values().iterator();

				Class305 var9;
				while (var8.hasNext()) {
					var9 = (Class305)var8.next();
					if (var9.method6119() && var9.method6144(var4, var5)) {
						var7.add(var9);
					}
				}

				var8 = this.field3082.iterator();

				while (var8.hasNext()) {
					var9 = (Class305)var8.next();
					if (var9.method6119() && var9.method6144(var4, var5)) {
						var7.add(var9);
					}
				}

				return var7;
			} else {
				return var7;
			}
		} else {
			return var7;
		}
	}

	public List method5604() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field3082);
		var2.addAll(this.field3073.values());
		return var2;
	}

	public void method5677(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Class561.method10185(var1 * this.field3084, this.field3084 * (63 - var2), this.field3084, var4);
		}

		if (var3 == 1) {
			Class561.method10200(this.field3084 * var1, this.field3084 * (63 - var2), this.field3084, var4);
		}

		if (var3 == 2) {
			Class561.method10185(this.field3084 + var1 * this.field3084 - 1, this.field3084 * (63 - var2), this.field3084, var4);
		}

		if (var3 == 3) {
			Class561.method10200(var1 * this.field3084, (63 - var2) * this.field3084 + this.field3084 - 1, this.field3084, var4);
		}

	}

	public static void method3503(Class549 var0, int var1, int var2, int var3) {
		Class290 var5 = field3086;
		long var7 = (long)(var3 << 16 | var1 << 8 | var2);
		var5.method5891(var0, var7, 4 * var0.field5357.length);
	}
}
