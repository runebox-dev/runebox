import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.HashMap;

@ObfInfo(name = "ri")
public class Class451 {
	@ObfInfo(name = "ax", desc = "[[B")
	public static byte[][] field4834;
	@ObfInfo(name = "ap", desc = "[[B")
	public static byte[][] field4836;
	@ObfInfo(name = "ae", desc = "[[B")
	public static byte[][] field4837;
	@ObfInfo(name = "ay", desc = "[[B")
	public static byte[][] field4839;
	@ObfInfo(owner = "hf", name = "aw", desc = "[[[B")
	public static byte[][][] field1941;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1723254545)
	public static int field4824;
	@ObfInfo(name = "at", desc = "I", intMultiplier = 786106793)
	public static int field4827;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -547776667)
	public static int field4828;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = 1165276261)
	public static int field4831;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = -526274451)
	public static int field4832;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -755903233)
	public static int field4833;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 123131129)
	public static int field4835;
	@ObfInfo(name = "ah", desc = "I", intMultiplier = 2005412773)
	public static int field4838;
	@ObfInfo(owner = "bc", name = "au", desc = "[I")
	public static int[] field144;
	@ObfInfo(name = "as", desc = "[I")
	public static int[] field4840;
	@ObfInfo(name = "ad", desc = "Ljava/util/ArrayList;")
	public static ArrayList field4841;
	@ObfInfo(name = "af", desc = "Ljava/lang/Object;")
	public static final Object field4829;

	static {
		field4829 = new Object();
		field4828 = 0;
		field4827 = 0;
		field4824 = 0;
		field4831 = 0;
		field4832 = 1000;
		field4838 = 250;
		field4833 = 100;
		field4835 = 50;
		field4836 = new byte[1000][];
		field4837 = new byte[250][];
		field4834 = new byte[100][];
		field4839 = new byte[50][];
		field4841 = new ArrayList();
		field4841.clear();
		field4841.add(100);
		field4841.add(5000);
		field4841.add(10000);
		field4841.add(30000);
		new HashMap();
	}

	@ObfInfo(owner = "db", name = "al", desc = "(IZB)[B", opaque = "0")
	public static byte[] method2233(int var0, boolean var1) {
		synchronized(field4829) {
			byte[] var8;
			if ((var0 == 100 || var0 < 100 && var1) && field4828 > 0) {
				var8 = field4836[--field4828];
				field4836[field4828] = null;
				return var8;
			}

			if ((var0 == 5000 || var0 < 5000 && var1) && field4827 > 0) {
				var8 = field4837[--field4827];
				field4837[field4827] = null;
				return var8;
			}

			if ((var0 == 10000 || var0 < 10000 && var1) && field4824 > 0) {
				var8 = field4834[--field4824];
				field4834[field4824] = null;
				return var8;
			}

			if ((var0 == 30000 || var0 < 30000 && var1) && field4831 > 0) {
				var8 = field4839[--field4831];
				field4839[field4831] = null;
				return var8;
			}

			int var4;
			if (field1941 != null) {
				for (var4 = 0; var4 < field144.length; ++var4) {
					if ((field144[var4] == var0 || var0 < field144[var4] && var1) && field4840[var4] > 0) {
						byte[] var5 = field1941[var4][--field4840[var4]];
						field1941[var4][field4840[var4]] = null;
						return var5;
					}
				}
			}

			if (var1 && field144 != null) {
				for (var4 = 0; var4 < field144.length; ++var4) {
					if (var0 <= field144[var4] && field4840[var4] < field1941[var4].length) {
						return new byte[field144[var4]];
					}
				}
			}
		}

		return new byte[var0];
	}

	@ObfInfo(owner = "ce", name = "aj", desc = "(IB)[B")
	public static byte[] method1084(int var0) {
		return method2233(var0, false);
	}

	@ObfInfo(owner = "hm", name = "az", desc = "([BB)V", opaque = "10")
	public static void method3840(byte[] var0) {
		synchronized(field4829) {
			if (var0.length == 100 && field4828 < field4832) {
				field4836[++field4828 - 1] = var0;
			} else if (5000 == var0.length && field4827 < field4838) {
				field4837[++field4827 - 1] = var0;
			} else if (10000 == var0.length && field4824 < field4833) {
				field4834[++field4824 - 1] = var0;
			} else if (var0.length == 30000 && field4831 < field4835) {
				field4839[++field4831 - 1] = var0;
			} else {
				if (field1941 != null) {
					for (int var3 = 0; var3 < field144.length; ++var3) {
						if (field144[var3] == var0.length && field4840[var3] < field1941[var3].length) {
							field1941[var3][field4840[var3]++] = var0;
							return;
						}
					}
				}

			}
		}
	}

	@ObfInfo(name = "ac", desc = "(ILdm;ZB)I", opaque = "-1")
	public static int method8420(int var0, Class91 var1, boolean var2) {
		boolean var4 = true;
		Class340 var5;
		if (var0 >= 2000) {
			var0 -= 1000;
			var5 = Client.field25.method6718(Class72.field887[--Class85.field83]);
			var4 = false;
		} else {
			var5 = var2 ? Class72.field892 : Class72.field88;
		}

		int var10;
		if (var0 == 1300) {
			var10 = Class72.field887[--Class85.field83] - 1;
			if (var10 >= 0 && var10 <= 9) {
				var5.method6528(var10, Class72.field880[--Class85.field1806]);
				return 1;
			} else {
				--Class85.field1806;
				return 1;
			}
		} else {
			int var11;
			if (var0 == 1301) {
				Class85.field83 -= 2;
				var10 = Class72.field887[Class85.field83];
				var11 = Class72.field887[Class85.field83 + 1];
				var5.field3759 = Client.field25.method6721(var10, var11);
				return 1;
			} else if (var0 == 1302) {
				var5.field3823 = Class72.field887[--Class85.field83] == 1;
				return 1;
			} else if (var0 == 1303) {
				var5.field3760 = Class72.field887[--Class85.field83];
				return 1;
			} else if (var0 == 1304) {
				var5.field3761 = Class72.field887[--Class85.field83];
				return 1;
			} else if (var0 == 1305) {
				var5.field3785 = Class72.field880[--Class85.field1806];
				return 1;
			} else if (var0 == 1306) {
				var5.field3763 = Class72.field880[--Class85.field1806];
				return 1;
			} else if (var0 == 1307) {
				var5.field3758 = null;
				return 1;
			} else if (var0 == 1308) {
				var5.field3752 = Class72.field887[--Class85.field83] == 1;
				return 1;
			} else if (var0 == 1309) {
				--Class85.field83;
				return 1;
			} else {
				byte[] var7;
				int var8;
				if (var0 != 1350) {
					byte var9;
					if (var0 == 1351) {
						Class85.field83 -= 2;
						var9 = 10;
						var7 = new byte[]{(byte)Class72.field887[Class85.field83]};
						byte[] var12 = new byte[]{(byte)Class72.field887[Class85.field83 + 1]};
						Class72.method6717(var5, var9, var7, var12);
						return 1;
					} else if (var0 == 1352) {
						Class85.field83 -= 3;
						var10 = Class72.field887[Class85.field83] - 1;
						var11 = Class72.field887[Class85.field83 + 1];
						var8 = Class72.field887[2 + Class85.field83];
						if (var10 >= 0 && var10 <= 9) {
							Class72.method3690(var5, var10, var11, var8);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1353) {
						var9 = 10;
						var11 = Class72.field887[--Class85.field83];
						var8 = Class72.field887[--Class85.field83];
						Class72.method3690(var5, var9, var11, var8);
						return 1;
					} else if (var0 == 1354) {
						--Class85.field83;
						var10 = Class72.field887[Class85.field83] - 1;
						if (var10 >= 0 && var10 <= 9) {
							Class72.method2493(var5, var10);
							return 1;
						} else {
							throw new RuntimeException();
						}
					} else if (var0 == 1355) {
						var9 = 10;
						Class72.method2493(var5, var9);
						return 1;
					} else {
						return 2;
					}
				} else {
					byte[] var6 = null;
					var7 = null;
					if (var4) {
						Class85.field83 -= 10;

						for (var8 = 0; var8 < 10 && Class72.field887[Class85.field83 + var8] >= 0; var8 += 2) {
						}

						if (var8 > 0) {
							var6 = new byte[var8 / 2];
							var7 = new byte[var8 / 2];

							for (var8 -= 2; var8 >= 0; var8 -= 2) {
								var6[var8 / 2] = (byte)Class72.field887[var8 + Class85.field83];
								var7[var8 / 2] = (byte)Class72.field887[Class85.field83 + var8 + 1];
							}
						}
					} else {
						Class85.field83 -= 2;
						var6 = new byte[]{(byte)Class72.field887[Class85.field83]};
						var7 = new byte[]{(byte)Class72.field887[Class85.field83 + 1]};
					}

					var8 = Class72.field887[--Class85.field83] - 1;
					if (var8 >= 0 && var8 <= 9) {
						Class72.method6717(var5, var8, var6, var7);
						return 1;
					} else {
						throw new RuntimeException();
					}
				}
			}
		}
	}
}
