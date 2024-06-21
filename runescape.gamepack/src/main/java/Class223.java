import io.runebox.ObfInfo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Class223 {
	@ObfInfo(owner = "lg", name = "wa", desc = "Ljava/util/Iterator;")
	public static Iterator field3170;
	@ObfInfo(owner = "lh", name = "wn", desc = "Ljava/util/List;")
	public static List field3176;
	@ObfInfo(name = "af", desc = "Z")
	public boolean field2294;
	@ObfInfo(name = "al", desc = "[I")
	public int[] field2291;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -7088662262851721805L)
	public long field2292;
	@ObfInfo(name = "az", desc = "[S")
	public short[] field2293;
	@ObfInfo(name = "aj", desc = "[S")
	public short[] field2295;

	public Class223(long var1, int[] var3, short[] var4, short[] var5, boolean var6) {
		this.field2294 = false;
		this.field2292 = var1;
		this.field2291 = var3;
		this.field2295 = var4;
		this.field2293 = var5;
		this.field2294 = var6;
	}

	@ObfInfo(name = "by", desc = "(ILdm;ZB)I", opaque = "2")
	public static int method4223(int var0, Class91 var1, boolean var2) {
		int var4;
		Object var5;
		int var6;
		Class533 var7;
		int var8;
		if (var0 != 7500 && var0 != 7508) {
			if (var0 != 7501) {
				int var21;
				int var23;
				if (var0 == 7502) {
					Class85.field83 -= 3;
					var4 = Class72.field887[Class85.field83];
					var21 = Class72.field887[1 + Class85.field83];
					var6 = Class72.field887[2 + Class85.field83];
					var23 = Class546.method6654(var21);
					var8 = Class546.method3178(var21);
					int var25 = Class546.method3130(var21);
					Class543 var26 = Class543.method7879(var4);
					Class540 var27 = Class540.method3721(var23);
					int[] var28 = var27.field5315[var8];
					int var13 = 0;
					int var14 = var28.length;
					if (var25 >= 0) {
						if (var25 >= var14) {
							throw new RuntimeException("Tuple index out-of-bounds. Requested: " + var25 + ", Max: " + var14);
						}

						var13 = var25;
						var14 = var25 + 1;
					}

					Object[] var15 = var26.method9876(var8);
					if (var15 == null && var27.field5313 != null) {
						var15 = var27.field5313[var8];
					}

					int var16;
					int var17;
					if (var15 == null) {
						for (var16 = var13; var16 < var14; ++var16) {
							var17 = var28[var16];
							Class545 var29 = Class283.method5727(var17);
							if (Class545.field5337 == var29) {
								Class72.field880[++Class85.field1806 - 1] = "";
							} else {
								Class72.field887[++Class85.field83 - 1] = Class539.method73(var17);
							}
						}

						return 1;
					} else {
						var16 = var15.length / var28.length;
						if (var6 >= 0 && var6 < var16) {
							for (var17 = var13; var17 < var14; ++var17) {
								int var18 = var6 * var28.length + var17;
								Class545 var19 = Class283.method5727(var28[var17]);
								if (Class545.field5337 == var19) {
									Class72.field880[++Class85.field1806 - 1] = (String)var15[var18];
								} else {
									Class72.field887[++Class85.field83 - 1] = (Integer)var15[var18];
								}
							}

							return 1;
						} else {
							throw new RuntimeException();
						}
					}
				} else if (var0 == 7503) {
					Class85.field83 -= 2;
					var4 = Class72.field887[Class85.field83];
					var21 = Class72.field887[Class85.field83 + 1];
					var6 = 0;
					var23 = Class546.method6654(var21);
					var8 = Class546.method3178(var21);
					Class543 var24 = Class543.method7879(var4);
					Class540 var10 = Class540.method3721(var23);
					int[] var11 = var10.field5315[var8];
					Object[] var12 = var24.method9876(var8);
					if (var12 == null && var10.field5313 != null) {
						var12 = var10.field5313[var8];
					}

					if (var12 != null) {
						var6 = var12.length / var11.length;
					}

					Class72.field887[++Class85.field83 - 1] = var6;
					return 1;
				} else if (var0 != 7504 && var0 != 7510) {
					if (var0 == 7505) {
						var4 = Class72.field887[--Class85.field83];
						Class543 var22 = Class543.method7879(var4);
						Class72.field887[++Class85.field83 - 1] = var22.field5321;
						return 1;
					} else if (var0 == 7506) {
						var4 = Class72.field887[--Class85.field83];
						var21 = -1;
						if (field3176 != null && var4 >= 0 && var4 < field3176.size()) {
							var21 = (Integer)field3176.get(var4);
						}

						Class72.field887[++Class85.field83 - 1] = var21;
						return 1;
					} else if (var0 != 7507 && var0 != 7509) {
						return 2;
					} else {
						var4 = Class72.field887[--Class85.field83];
						var5 = Class72.method5884(var4);
						var6 = Class72.field887[--Class85.field83];
						var7 = Client.method719(var6);
						if (var7 == null) {
							throw new RuntimeException();
						} else if (Class546.method6654(var6) != Client.field780) {
							throw new RuntimeException();
						} else if (field3176 == null && field3176.isEmpty()) {
							throw new RuntimeException();
						} else {
							var8 = Class546.method3130(var6);
							List var9 = var7.method9817(var5, var8);
							field3176 = new LinkedList(field3176);
							if (var9 != null) {
								field3176.retainAll(var9);
							} else {
								field3176.clear();
							}

							field3170 = field3176.iterator();
							if (var0 == 7507) {
								Class72.field887[++Class85.field83 - 1] = field3176.size();
							}

							return 1;
						}
					}
				} else {
					--Class85.field83;
					var4 = Class72.field887[Class85.field83];
					Class533 var20 = Client.method3870(var4);
					if (var20 == null) {
						throw new RuntimeException();
					} else {
						field3176 = var20.method9817(0, 0);
						var6 = 0;
						if (field3176 != null) {
							Client.field780 = var4;
							field3170 = field3176.iterator();
							var6 = field3176.size();
						}

						if (var0 == 7504) {
							Class72.field887[++Class85.field83 - 1] = var6;
						}

						return 1;
					}
				}
			} else {
				if (field3170 != null && field3170.hasNext()) {
					Class72.field887[++Class85.field83 - 1] = (Integer)field3170.next();
				} else {
					Class72.field887[++Class85.field83 - 1] = -1;
				}

				return 1;
			}
		} else {
			var4 = Class72.field887[--Class85.field83];
			var5 = Class72.method5884(var4);
			var6 = Class72.field887[--Class85.field83];
			var7 = Client.method719(var6);
			if (var7 == null) {
				throw new RuntimeException();
			} else {
				var8 = Class546.method3130(var6);
				field3176 = var7.method9817(var5, var8);
				if (field3176 != null) {
					Client.field780 = Class546.method6654(var6);
					field3170 = field3176.iterator();
					if (var0 == 7500) {
						Class72.field887[++Class85.field83 - 1] = field3176.size();
					}
				} else {
					Client.field780 = -1;
					field3170 = null;
					if (var0 == 7500) {
						Class72.field887[++Class85.field83 - 1] = 0;
					}
				}

				return 1;
			}
		}
	}
}
