import io.runebox.ObfInfo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

@ObfInfo(name = "jc")
public class Class237 {
	@ObfInfo(name = "ap", desc = "Llx;")
	public static Class310 field2519;
	@ObfInfo(name = "av", desc = "Ljn;")
	public Class248 field2520;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -1160426561)
	public int field2514;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1507079313)
	public int field2522;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = -1369509233)
	public int field2523;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1928952533)
	public int field2525;
	@ObfInfo(name = "ah", desc = "Ljava/util/HashMap;")
	public HashMap field2526;
	@ObfInfo(name = "ab", desc = "Ljava/util/LinkedList;")
	public LinkedList field2521;
	@ObfInfo(name = "au", desc = "Ljava/util/List;")
	public List field2524;
	@ObfInfo(name = "az", desc = "Ljava/util/HashMap;")
	public final HashMap field2518;

	static {
		field2519 = new Class310(37748736, 256);
	}

	public Class237(int var1, int var2, int var3, HashMap var4) {
		this.field2525 = var1;
		this.field2514 = var2;
		this.field2521 = new LinkedList();
		this.field2524 = new LinkedList();
		this.field2526 = new HashMap();
		this.field2522 = var3 | -16777216;
		this.field2518 = var4;
	}

	@ObfInfo(name = "aq", desc = "(IIII)V", opaque = "-1182568220")
	public void method4495(int var1, int var2, int var3) {
		int var6 = this.field2525;
		int var7 = this.field2514;
		int var8 = this.field2523;
		Class310 var9 = field2519;
		long var10 = (long)(var8 << 16 | var6 << 8 | var7);
		Class553 var5 = (Class553)var9.method5997(var10);
		if (var5 != null) {
			if (this.field2523 * 64 == var3) {
				var5.method9636(var1, var2);
			} else {
				var5.method9627(var1, var2, var3, var3);
			}

		}
	}

	@ObfInfo(name = "ad", desc = "(Ljn;Ljava/util/List;S)V")
	public void method4496(Class248 var1, List var2) {
		this.field2526.clear();
		this.field2520 = var1;
		this.method4542(var2);
	}

	@ObfInfo(name = "ag", desc = "(Ljava/util/HashSet;Ljava/util/List;B)V", opaque = "0")
	public void method4533(HashSet var1, List var2) {
		this.field2526.clear();
		Iterator var4 = var1.iterator();

		while (var4.hasNext()) {
			Class257 var5 = (Class257)var4.next();
			if (var5.method4722() == this.field2525 && var5.method4701() == this.field2514) {
				this.field2521.add(var5);
			}
		}

		this.method4542(var2);
	}

	@ObfInfo(name = "ak", desc = "(IIIILjk;I)V", opaque = "1656575897")
	public void method4498(int var1, int var2, int var3, int var4, Class245 var5) {
		for (int var7 = var1; var7 < var1 + var3; ++var7) {
			label74:
			for (int var8 = var2; var8 < var2 + var4; ++var8) {
				for (int var9 = 0; var9 < var5.field2578; ++var9) {
					Class259[] var10 = var5.field2566[var9][var7][var8];
					if (var10 != null && var10.length != 0) {
						for (int var12 = 0; var12 < var10.length; ++var12) {
							Class197 var14;
							boolean var15;
							label65: {
								Class259 var13 = var10[var12];
								var14 = Class197.method61(var13.field2696);
								if (var14.field2166 != null) {
									int[] var16 = var14.field2166;

									for (int var17 = 0; var17 < var16.length; ++var17) {
										int var18 = var16[var17];
										Class197 var19 = Class197.method61(var18);
										if (var19.field2153 != -1) {
											var15 = true;
											break label65;
										}
									}
								} else if (var14.field2153 != -1) {
									var15 = true;
									break label65;
								}

								var15 = false;
							}

							if (var15) {
								this.method4499(var14, var9, var7, var8, var5);
								continue label74;
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "ap", desc = "(Lho;IIILjk;I)V", opaque = "738307025")
	public void method4499(Class197 var1, int var2, int var3, int var4, Class245 var5) {
		Class350 var7 = new Class350(var2, this.field2525 * 64 + var3, this.field2514 * 64 + var4);
		Class350 var8 = null;
		if (this.field2520 != null) {
			var8 = new Class350(this.field2520.field2570 + var2, this.field2520.field2580 * 64 + var3, this.field2520.field2572 * 64 + var4);
		} else {
			Class257 var9 = (Class257)var5;
			var8 = new Class350(var9.field2570 + var2, var9.field2580 * 64 + var3 + var9.method4954() * 8, var9.field2572 * 64 + var4 + var9.method4974() * 8);
		}

		Class163 var10;
		Object var11;
		if (var1.field2166 != null) {
			var11 = new Class242(var8, var7, var1.field2132, this);
		} else {
			var10 = Class163.method3540(var1.field2153);
			var11 = new Class252(var8, var7, var10.field1775, this.method4525(var10));
		}

		var10 = Class163.method3540(((Class268)var11).method4659());
		if (var10.field1782) {
			this.field2526.put(new Class350(0, var3, var4), var11);
		}

	}

	@ObfInfo(name = "an", desc = "(B)V", opaque = "8")
	public void method4500() {
		Iterator var2 = this.field2526.values().iterator();

		while (var2.hasNext()) {
			Class268 var3 = (Class268)var2.next();
			if (var3 instanceof Class242) {
				((Class242)var3).method4658();
			}
		}

	}

	@ObfInfo(name = "aj", desc = "(Ljava/util/List;I)V", opaque = "-1548636816")
	public void method4542(List var1) {
		Iterator var3 = var1.iterator();

		while (var3.hasNext()) {
			Class252 var4 = (Class252)var3.next();
			if (Class163.method3540(var4.field2650).field1782 && var4.field2748.field3748 >> 6 == this.field2525 && var4.field2748.field3750 >> 6 == this.field2514) {
				Class252 var5 = new Class252(var4.field2748, var4.field2748, var4.field2650, this.method4524(var4.field2650));
				this.field2524.add(var5);
			}
		}

	}

	@ObfInfo(name = "av", desc = "(I)V", opaque = "505032615")
	public void method4502() {
		if (this.field2520 != null) {
			this.field2520.method4702();
		} else {
			Iterator var2 = this.field2521.iterator();

			while (var2.hasNext()) {
				Class257 var3 = (Class257)var2.next();
				var3.method4702();
			}
		}

	}

	@ObfInfo(name = "ab", desc = "(Lok;B)Z", opaque = "1")
	public boolean method4503(Class375 var1) {
		this.field2526.clear();
		if (this.field2520 != null) {
			this.field2520.method4695(var1);
			if (this.field2520.method4711()) {
				this.method4498(0, 0, 64, 64, this.field2520);
				return true;
			} else {
				return false;
			}
		} else {
			boolean var3 = true;

			Iterator var4;
			Class257 var5;
			for (var4 = this.field2521.iterator(); var4.hasNext(); var3 &= var5.method4711()) {
				var5 = (Class257)var4.next();
				var5.method4695(var1);
			}

			if (var3) {
				var4 = this.field2521.iterator();

				while (var4.hasNext()) {
					var5 = (Class257)var4.next();
					this.method4498(var5.method4956() * 8, var5.method4957() * 8, 8, 8, var5);
				}
			}

			return var3;
		}
	}

	@ObfInfo(name = "ai", desc = "(ILkp;[Lvv;Lok;Lok;I)V", opaque = "-602376537")
	public void method4504(int var1, Class276 var2, Class568[] var3, Class375 var4, Class375 var5) {
		this.field2523 = var1;
		if (this.field2520 != null || !this.field2521.isEmpty()) {
			int var8 = this.field2525;
			int var9 = this.field2514;
			Class310 var10 = field2519;
			long var11 = (long)(var1 << 16 | var8 << 8 | var9);
			Class553 var7 = (Class553)var10.method5997(var11);
			if (var7 == null) {
				boolean var22 = true;
				var22 &= this.method4503(var4);
				int var12;
				if (this.field2520 != null) {
					var12 = this.field2520.field2581;
				} else {
					var12 = ((Class245)this.field2521.getFirst()).field2581;
				}

				var22 &= var5.method7136(var12);
				if (var22) {
					byte[] var23 = var5.method7139(var12);
					Class241 var13 = Class241.method3299(var23);
					Class553 var14 = new Class553(this.field2523 * 64, this.field2523 * 64);
					var14.method9597();
					if (this.field2520 != null) {
						this.method4507(var2, var3, var13);
					} else {
						this.method4508(var2, var3, var13);
					}

					int var15 = this.field2525;
					int var16 = this.field2514;
					int var17 = this.field2523;
					Class310 var18 = field2519;
					long var20 = (long)(var17 << 16 | var15 << 8 | var16);
					var18.method6008(var14, var20, var14.field5429.length * 4);
					this.method4502();
				}
			}
		}
	}

	@ObfInfo(name = "ae", desc = "(IIILjava/util/HashSet;I)V", opaque = "396253424")
	public void method4505(int var1, int var2, int var3, HashSet var4) {
		if (var4 == null) {
			var4 = new HashSet();
		}

		this.method4515(var1, var2, var4, var3);
		this.method4521(var1, var2, var4, var3);
	}

	@ObfInfo(name = "au", desc = "(Ljava/util/HashSet;IIB)V", opaque = "0")
	public void method4506(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field2526.values().iterator();

		while (var5.hasNext()) {
			Class268 var6 = (Class268)var5.next();
			if (var6.method5065()) {
				int var7 = var6.method4659();
				if (var1.contains(var7)) {
					Class163 var8 = Class163.method3540(var7);
					this.method4566(var8, var6.field2750, var6.field2751, var2, var3);
				}
			}
		}

		this.method4516(var1, var2, var3);
	}

	@ObfInfo(name = "ah", desc = "(Lkp;[Lvv;Ljg;I)V", opaque = "-880843732")
	public void method4507(Class276 var1, Class568[] var2, Class241 var3) {
		int var5;
		int var6;
		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method4592(var5, var6, this.field2520, var1, var3);
				this.method4511(var5, var6, this.field2520, var1);
			}
		}

		for (var5 = 0; var5 < 64; ++var5) {
			for (var6 = 0; var6 < 64; ++var6) {
				this.method4509(var5, var6, this.field2520, var1, var2);
			}
		}

	}

	@ObfInfo(name = "az", desc = "(Lkp;[Lvv;Ljg;I)V", opaque = "396253425")
	public void method4508(Class276 var1, Class568[] var2, Class241 var3) {
		Iterator var5 = this.field2521.iterator();

		Class257 var6;
		int var7;
		int var8;
		while (var5.hasNext()) {
			var6 = (Class257)var5.next();

			for (var7 = var6.method4956() * 8; var7 < var6.method4956() * 8 + 8; ++var7) {
				for (var8 = var6.method4957() * 8; var8 < var6.method4957() * 8 + 8; ++var8) {
					this.method4592(var7, var8, var6, var1, var3);
					this.method4511(var7, var8, var6, var1);
				}
			}
		}

		var5 = this.field2521.iterator();

		while (var5.hasNext()) {
			var6 = (Class257)var5.next();

			for (var7 = var6.method4956() * 8; var7 < var6.method4956() * 8 + 8; ++var7) {
				for (var8 = var6.method4957() * 8; var8 < var6.method4957() * 8 + 8; ++var8) {
					this.method4509(var7, var8, var6, var1, var2);
				}
			}
		}

	}

	@ObfInfo(name = "ax", desc = "(IILjk;Lkp;[Lvv;I)V")
	public void method4509(int var1, int var2, Class245 var3, Class276 var4, Class568[] var5) {
		this.method4599(var1, var2, var3);
		this.method4584(var1, var2, var3, var5);
	}

	@ObfInfo(name = "ac", desc = "(IILjk;Lkp;Ljg;B)V", opaque = "-1")
	public void method4592(int var1, int var2, Class245 var3, Class276 var4, Class241 var5) {
		int var7 = var3.field2571[0][var1][var2] - 1;
		int var8 = var3.field2575[0][var1][var2] - 1;
		if (var7 == -1 && var8 == -1) {
			Class569.method10138(this.field2523 * var1, (63 - var2) * this.field2523, this.field2523, this.field2523, this.field2522);
		}

		int var9 = 16711935;
		if (var8 != -1) {
			var9 = Class313.method6077(var8, this.field2522);
		}

		if (var8 > -1 && var3.field2576[0][var1][var2] == 0) {
			Class569.method10138(this.field2523 * var1, (63 - var2) * this.field2523, this.field2523, this.field2523, var9);
		} else {
			int var10 = this.method4512(var1, var2, var3, var5);
			if (var8 == -1) {
				Class569.method10138(this.field2523 * var1, (63 - var2) * this.field2523, this.field2523, this.field2523, var10);
			} else {
				var4.method5207(this.field2523 * var1, (63 - var2) * this.field2523, var10, var9, this.field2523, this.field2523, var3.field2576[0][var1][var2], var3.field2577[0][var1][var2]);
			}
		}
	}

	@ObfInfo(name = "al", desc = "(IILjk;Lkp;B)V", opaque = "0")
	public void method4511(int var1, int var2, Class245 var3, Class276 var4) {
		for (int var6 = 1; var6 < var3.field2578; ++var6) {
			int var7 = var3.field2575[var6][var1][var2] - 1;
			if (var7 > -1) {
				int var8 = Class313.method6077(var7, this.field2522);
				if (var3.field2576[var6][var1][var2] == 0) {
					Class569.method10138(this.field2523 * var1, (63 - var2) * this.field2523, this.field2523, this.field2523, var8);
				} else {
					var4.method5207(this.field2523 * var1, (63 - var2) * this.field2523, 0, var8, this.field2523, this.field2523, var3.field2576[var6][var1][var2], var3.field2577[var6][var1][var2]);
				}
			}
		}

	}

	@ObfInfo(name = "ay", desc = "(IILjk;Ljg;I)I")
	public int method4512(int var1, int var2, Class245 var3, Class241 var4) {
		return var3.field2571[0][var1][var2] == 0 ? this.field2522 : var4.method4655(var1, var2);
	}

	@ObfInfo(name = "ao", desc = "(IILjk;[Lvv;B)V", opaque = "0")
	public void method4584(int var1, int var2, Class245 var3, Class568[] var4) {
		for (int var6 = 0; var6 < var3.field2578; ++var6) {
			Class259[] var7 = var3.field2566[var6][var1][var2];
			if (var7 != null && var7.length != 0) {
				for (int var9 = 0; var9 < var7.length; ++var9) {
					Class259 var10 = var7[var9];
					if (Class368.method6325(var10.field2693) || Class368.method2637(var10.field2693)) {
						Class197 var11 = Class197.method61(var10.field2696);
						if (var11.field2130 != -1) {
							if (var11.field2130 != 46 && var11.field2130 != 52) {
								var4[var11.field2130].method10120(this.field2523 * var1, (63 - var2) * this.field2523, this.field2523 * 2, this.field2523 * 2);
							} else {
								var4[var11.field2130].method10120(this.field2523 * var1, (63 - var2) * this.field2523, this.field2523 * 2 + 1, this.field2523 * 2 + 1);
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "aa", desc = "(IILjk;I)V", opaque = "571617227")
	public void method4599(int var1, int var2, Class245 var3) {
		for (int var5 = 0; var5 < var3.field2578; ++var5) {
			Class259[] var6 = var3.field2566[var5][var1][var2];
			if (var6 != null && var6.length != 0) {
				for (int var8 = 0; var8 < var6.length; ++var8) {
					Class259 var9 = var6[var8];
					if (Class368.method6225(var9.field2693)) {
						Class197 var10 = Class197.method61(var9.field2696);
						int var11 = var10.field2144 != 0 ? -3407872 : -3355444;
						if (Class368.field4348.field4347 == var9.field2693) {
							this.method4528(var1, var2, var9.field2694, var11);
						}

						if (Class368.field4364.field4347 == var9.field2693) {
							this.method4528(var1, var2, var9.field2694, -3355444);
							this.method4528(var1, var2, var9.field2694 + 1, var11);
						}

						if (Class368.field4369.field4347 == var9.field2693) {
							if (var9.field2694 == 0) {
								Class569.method10128(this.field2523 * var1, (63 - var2) * this.field2523, 1, var11);
							}

							if (var9.field2694 == 1) {
								Class569.method10128(this.field2523 * var1 + this.field2523 - 1, (63 - var2) * this.field2523, 1, var11);
							}

							if (var9.field2694 == 2) {
								Class569.method10128(this.field2523 * var1 + this.field2523 - 1, (63 - var2) * this.field2523 + this.field2523 - 1, 1, var11);
							}

							if (var9.field2694 == 3) {
								Class569.method10128(this.field2523 * var1, (63 - var2) * this.field2523 + this.field2523 - 1, 1, var11);
							}
						}

						if (Class368.field4350.field4347 == var9.field2693) {
							int var12 = var9.field2694 % 2;
							int var13;
							if (var12 == 0) {
								for (var13 = 0; var13 < this.field2523; ++var13) {
									Class569.method10128(this.field2523 * var1 + var13, (64 - var2) * this.field2523 - 1 - var13, 1, var11);
								}
							} else {
								for (var13 = 0; var13 < this.field2523; ++var13) {
									Class569.method10128(this.field2523 * var1 + var13, (63 - var2) * this.field2523 + var13, 1, var11);
								}
							}
						}
					}
				}
			}
		}

	}

	@ObfInfo(name = "as", desc = "(IILjava/util/HashSet;IB)V", opaque = "-1")
	public void method4515(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		float var7 = var6 / 2.0F;
		Iterator var8 = this.field2526.entrySet().iterator();

		while (var8.hasNext()) {
			Entry var9 = (Entry)var8.next();
			Class350 var10 = (Class350)var9.getKey();
			int var11 = (int)((float)var10.field3748 * var6 + (float)var1 - var7);
			int var12 = (int)((float)(var2 + var4) - (float)var10.field3750 * var6 - var7);
			Class268 var13 = (Class268)var9.getValue();
			if (var13 != null && var13.method5065()) {
				var13.field2750 = var11;
				var13.field2751 = var12;
				Class163 var14 = Class163.method3540(var13.method4659());
				if (!var3.contains(var14.method3390())) {
					this.method4519(var13, var11, var12, var6);
				}
			}
		}

	}

	@ObfInfo(name = "aw", desc = "(Ljava/util/HashSet;IIB)V", opaque = "0")
	public void method4516(HashSet var1, int var2, int var3) {
		Iterator var5 = this.field2524.iterator();

		while (var5.hasNext()) {
			Class268 var6 = (Class268)var5.next();
			if (var6.method5065()) {
				Class163 var7 = Class163.method3540(var6.method4659());
				if (var7 != null && var1.contains(var7.method3390())) {
					this.method4566(var7, var6.field2750, var6.field2751, var2, var3);
				}
			}
		}

	}

	@ObfInfo(name = "at", desc = "(Lgg;IIIIB)V", opaque = "0")
	public void method4566(Class163 var1, int var2, int var3, int var4, int var5) {
		Class553 var7 = var1.method3388(false);
		if (var7 != null) {
			var7.method9628(var2 - var7.field5421 / 2, var3 - var7.field5424 / 2);
			if (var4 % var5 < var5 / 2) {
				Class569.method10131(var2, var3, 15, 16776960, 128);
				Class569.method10131(var2, var3, 7, 16777215, 256);
			}

		}
	}

	@ObfInfo(name = "af", desc = "(Lkh;IIFI)V")
	public void method4519(Class268 var1, int var2, int var3, float var4) {
		Class163 var6 = Class163.method3540(var1.method4659());
		this.method4598(var6, var2, var3);
		this.method4520(var1, var6, var2, var3, var4);
	}

	@ObfInfo(name = "am", desc = "(Lgg;IIB)V")
	public void method4598(Class163 var1, int var2, int var3) {
		Class553 var5 = var1.method3388(false);
		if (var5 != null) {
			int var6 = this.method4522(var5, var1.field1791);
			int var7 = this.method4523(var5, var1.field1792);
			var5.method9628(var2 + var6, var3 + var7);
		}

	}

	@ObfInfo(name = "ar", desc = "(Lkh;Lgg;IIFI)V", opaque = "369726837")
	public void method4520(Class268 var1, Class163 var2, int var3, int var4, float var5) {
		Class273 var7 = var1.method4660();
		if (var7 != null) {
			if (var7.field2800.method4978(var5)) {
				Class424 var8 = (Class424)this.field2518.get(var7.field2800);
				var8.method8148(var7.field2799, var3 - var7.field2798 / 2, var4, var7.field2798, var7.field2797, -16777216 | var2.field1777, 0, 1, 0, var8.field4784 / 2);
			}
		}
	}

	@ObfInfo(name = "bt", desc = "(IILjava/util/HashSet;IB)V", opaque = "-1")
	public void method4521(int var1, int var2, HashSet var3, int var4) {
		float var6 = (float)var4 / 64.0F;
		Iterator var7 = this.field2524.iterator();

		while (var7.hasNext()) {
			Class268 var8 = (Class268)var7.next();
			if (var8.method5065()) {
				int var9 = var8.field2748.field3748 % 64;
				int var10 = var8.field2748.field3750 % 64;
				var8.field2750 = (int)((float)var9 * var6 + (float)var1);
				var8.field2751 = (int)((float)(63 - var10) * var6 + (float)var2);
				if (!var3.contains(var8.method4659())) {
					this.method4519(var8, var8.field2750, var8.field2751, var6);
				}
			}
		}

	}

	@ObfInfo(name = "bj", desc = "(Lvg;Lhp;B)I")
	public int method4522(Class553 var1, Class198 var2) {
		switch(var2.field2181) {
		case 0:
			return -var1.field5421 / 2;
		case 2:
			return 0;
		default:
			return -var1.field5421;
		}
	}

	@ObfInfo(name = "be", desc = "(Lvg;Lhx;I)I")
	public int method4523(Class553 var1, Class206 var2) {
		switch(var2.field2240) {
		case 0:
			return 0;
		case 2:
			return -var1.field5424 / 2;
		default:
			return -var1.field5424;
		}
	}

	@ObfInfo(name = "bm", desc = "(IB)Lkm;")
	public Class273 method4524(int var1) {
		Class163 var3 = Class163.method3540(var1);
		return this.method4525(var3);
	}

	@ObfInfo(name = "bo", desc = "(Lgg;I)Lkm;", opaque = "-831793730")
	public Class273 method4525(Class163 var1) {
		if (var1.field1776 != null && this.field2518 != null && this.field2518.get(Class258.field2689) != null) {
			int var4 = var1.field1779;
			Class258[] var5 = new Class258[]{Class258.field2683, Class258.field2690, Class258.field2689};
			int var7 = 0;

			Class258 var3;
			while (true) {
				if (var7 >= var5.length) {
					var3 = null;
					break;
				}

				Class258 var8 = var5[var7];
				if (var8.field2685 == var4) {
					var3 = var8;
					break;
				}

				++var7;
			}

			if (var3 == null) {
				return null;
			} else {
				Class424 var6 = (Class424)this.field2518.get(var3);
				if (var6 == null) {
					return null;
				} else {
					var7 = var6.method8141(var1.field1776, 1000000);
					String[] var15 = new String[var7];
					var6.method8206(var1.field1776, (int[])null, var15);
					int var9 = var15.length * var6.field4784 / 2;
					int var10 = 0;

					for (int var12 = 0; var12 < var15.length; ++var12) {
						String var13 = var15[var12];
						int var14 = var6.method8139(var13);
						if (var14 > var10) {
							var10 = var14;
						}
					}

					return new Class273(var1.field1776, var10, var9, var3);
				}
			}
		} else {
			return null;
		}
	}

	@ObfInfo(name = "bi", desc = "(IIIIIB)Ljava/util/List;", opaque = "7")
	public List method4526(int var1, int var2, int var3, int var4, int var5) {
		LinkedList var7 = new LinkedList();
		if (var4 >= var1 && var5 >= var2) {
			if (var4 < var1 + var3 && var5 < var2 + var3) {
				Iterator var8 = this.field2526.values().iterator();

				Class268 var9;
				while (var8.hasNext()) {
					var9 = (Class268)var8.next();
					if (var9.method5065() && var9.method5050(var4, var5)) {
						var7.add(var9);
					}
				}

				var8 = this.field2524.iterator();

				while (var8.hasNext()) {
					var9 = (Class268)var8.next();
					if (var9.method5065() && var9.method5050(var4, var5)) {
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

	@ObfInfo(name = "ba", desc = "(B)Ljava/util/List;")
	public List method4527() {
		LinkedList var2 = new LinkedList();
		var2.addAll(this.field2524);
		var2.addAll(this.field2526.values());
		return var2;
	}

	@ObfInfo(name = "bg", desc = "(IIIIS)V", opaque = "-257")
	public void method4528(int var1, int var2, int var3, int var4) {
		var3 %= 4;
		if (var3 == 0) {
			Class569.method10182(this.field2523 * var1, (63 - var2) * this.field2523, this.field2523, var4);
		}

		if (var3 == 1) {
			Class569.method10128(this.field2523 * var1, (63 - var2) * this.field2523, this.field2523, var4);
		}

		if (var3 == 2) {
			Class569.method10182(this.field2523 * var1 + this.field2523 - 1, (63 - var2) * this.field2523, this.field2523, var4);
		}

		if (var3 == 3) {
			Class569.method10128(this.field2523 * var1, (63 - var2) * this.field2523 + this.field2523 - 1, this.field2523, var4);
		}

	}

	@ObfInfo(name = "ai", desc = "(I)[Lvg;", opaque = "-575082194")
	public static Class553[] method4602() {
		Class553[] var1 = new Class553[Client.field5437];

		for (int var2 = 0; var2 < Client.field5437; ++var2) {
			Class553 var3 = var1[var2] = new Class553();
			var3.field5425 = Client.field5433;
			var3.field5426 = Client.field5438;
			var3.field5423 = Client.field1454[var2];
			var3.field5420 = Client.field1561[var2];
			var3.field5421 = Client.field5435[var2];
			var3.field5424 = Client.field3491[var2];
			int var4 = var3.field5424 * var3.field5421;
			byte[] var5 = Client.field5434[var2];
			var3.field5429 = new int[var4];

			for (int var6 = 0; var6 < var4; ++var6) {
				var3.field5429[var6] = Client.field5432[var5[var6] & 255];
			}
		}

		Class554.method6571();
		return var1;
	}
}
