import io.runebox.ObfInfo;
import java.util.Iterator;
import java.util.LinkedList;

@ObfInfo(name = "jm")
public class Class247 {
	@ObfInfo(name = "aj", desc = "Lnl;")
	public Class350 field2605;
	@ObfInfo(name = "au", desc = "Z")
	public boolean field2610;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = 1572976237)
	public int field2599;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1624647145)
	public int field2602;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1871336757)
	public int field2603;
	@ObfInfo(name = "an", desc = "I", intMultiplier = -426935707)
	public int field2604;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -903805205)
	public int field2607;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1361976443)
	public int field2608;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 380817895)
	public int field2609;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -361968561)
	public int field2611;
	@ObfInfo(name = "ad", desc = "Ljava/lang/String;")
	public String field2600;
	@ObfInfo(name = "ag", desc = "Ljava/lang/String;")
	public String field2601;
	@ObfInfo(name = "ah", desc = "Ljava/util/LinkedList;")
	public LinkedList field2612;

	public Class247() {
		this.field2602 = -1;
		this.field2599 = -1;
		this.field2611 = -16777216;
		this.field2604 = -1;
		this.field2605 = null;
		this.field2607 = Integer.MAX_VALUE;
		this.field2603 = 0;
		this.field2608 = Integer.MAX_VALUE;
		this.field2609 = 0;
		this.field2610 = false;
	}

	@ObfInfo(name = "aq", desc = "(Lvp;IS)V", opaque = "192")
	public void method4779(Class562 var1, int var2) {
		this.field2602 = var2;
		this.field2600 = var1.method9837();
		this.field2601 = var1.method9837();
		this.field2605 = new Class350(var1.method9832());
		this.field2599 = var1.method9832();
		this.field2611 = var1.method9832();
		var1.method9902();
		this.field2610 = var1.method9902() == 1;
		this.field2604 = var1.method9902();
		int var4 = var1.method9902();
		this.field2612 = new LinkedList();

		for (int var5 = 0; var5 < var4; ++var5) {
			this.field2612.add(this.method4753(var1));
		}

		this.method4802();
	}

	@ObfInfo(name = "ad", desc = "(Lvp;I)Lkd;")
	public Class264 method4753(Class562 var1) {
		int var3 = var1.method9902();
		Class254[] var4 = new Class254[]{Class254.field2660, Class254.field2659, Class254.field2658, Class254.field2657};
		Class254 var5 = (Class254)Class406.method4071(var4, var3);
		Object var6 = null;
		switch(var5.field2661) {
		case 0:
			var6 = new Class235();
			break;
		case 1:
			var6 = new Class283();
			break;
		case 2:
			var6 = new Class249();
			break;
		case 3:
			var6 = new Class246();
			break;
		default:
			throw new IllegalStateException("");
		}

		((Class264)var6).method4463(var1);
		return (Class264)var6;
	}

	@ObfInfo(name = "ag", desc = "(IIIB)Z", opaque = "13")
	public boolean method4759(int var1, int var2, int var3) {
		Iterator var5 = this.field2612.iterator();

		Class264 var6;
		do {
			if (!var5.hasNext()) {
				return false;
			}

			var6 = (Class264)var5.next();
		} while(!var6.method4459(var1, var2, var3));

		return true;
	}

	@ObfInfo(name = "ak", desc = "(III)Z", opaque = "320105260")
	public boolean method4755(int var1, int var2) {
		int var4 = var1 / 64;
		int var5 = var2 / 64;
		if (var4 >= this.field2607 && var4 <= this.field2603) {
			if (var5 >= this.field2608 && var5 <= this.field2609) {
				Iterator var6 = this.field2612.iterator();

				Class264 var7;
				do {
					if (!var6.hasNext()) {
						return false;
					}

					var7 = (Class264)var6.next();
				} while(!var7.method4480(var1, var2));

				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "ap", desc = "(IIII)[I", opaque = "-949782622")
	public int[] method4756(int var1, int var2, int var3) {
		Iterator var5 = this.field2612.iterator();

		Class264 var6;
		do {
			if (!var5.hasNext()) {
				return null;
			}

			var6 = (Class264)var5.next();
		} while(!var6.method4459(var1, var2, var3));

		return var6.method4461(var1, var2, var3);
	}

	@ObfInfo(name = "an", desc = "(III)Lnl;", opaque = "-28747925")
	public Class350 method4757(int var1, int var2) {
		Iterator var4 = this.field2612.iterator();

		Class264 var5;
		do {
			if (!var4.hasNext()) {
				return null;
			}

			var5 = (Class264)var4.next();
		} while(!var5.method4480(var1, var2));

		return var5.method4462(var1, var2);
	}

	@ObfInfo(name = "aj", desc = "(I)V", opaque = "-2129286387")
	public void method4802() {
		Iterator var2 = this.field2612.iterator();

		while (var2.hasNext()) {
			Class264 var3 = (Class264)var2.next();
			var3.method4458(this);
		}

	}

	@ObfInfo(name = "av", desc = "(I)I")
	public int method4772() {
		return this.field2602;
	}

	@ObfInfo(name = "ab", desc = "(I)Z")
	public boolean method4760() {
		return this.field2610;
	}

	@ObfInfo(name = "ai", desc = "(B)Ljava/lang/String;")
	public String method4761() {
		return this.field2600;
	}

	@ObfInfo(name = "ae", desc = "(B)Ljava/lang/String;")
	public String method4762() {
		return this.field2601;
	}

	@ObfInfo(name = "au", desc = "(I)I")
	public int method4809() {
		return this.field2599;
	}

	@ObfInfo(name = "ah", desc = "(I)I")
	public int method4823() {
		return this.field2611;
	}

	@ObfInfo(name = "az", desc = "(B)I")
	public int method4765() {
		return this.field2604;
	}

	@ObfInfo(name = "ax", desc = "(I)I")
	public int method4771() {
		return this.field2607;
	}

	@ObfInfo(name = "ac", desc = "(I)I")
	public int method4767() {
		return this.field2603;
	}

	@ObfInfo(name = "al", desc = "(I)I")
	public int method4768() {
		return this.field2608;
	}

	@ObfInfo(name = "ay", desc = "(S)I")
	public int method4788() {
		return this.field2609;
	}

	@ObfInfo(name = "ao", desc = "(I)I")
	public int method4770() {
		return this.field2605.field3748;
	}

	@ObfInfo(name = "aa", desc = "(I)I")
	public int method4793() {
		return this.field2605.field3749;
	}

	@ObfInfo(name = "as", desc = "(B)I")
	public int method4758() {
		return this.field2605.field3750;
	}

	@ObfInfo(name = "aw", desc = "(B)Lnl;")
	public Class350 method4773() {
		return new Class350(this.field2605);
	}

	@ObfInfo(name = "mj", desc = "(Ljava/lang/String;Ljava/lang/String;IIIIIZII)V", opaque = "565334860")
	public static void method4829(String var0, String var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
		if (!Client.field672) {
			int var11 = var2;
			if (var2 >= 2000) {
				var11 = var2 - 2000;
			}

			boolean var12 = var11 == 16 || var11 == 17 || var11 >= 18 && var11 <= 22;
			boolean var13 = var12 || Class94.method4443(var11);
			if (!var13) {
				boolean var14 = var11 == 1002 || var11 == 1003 || var11 == 1004;
				var13 = var14;
			}

			boolean var10 = var13 || var8 == -1 || Client.field170.field1002.field1026 == var8;
			if (var10) {
				if (Client.field602 < 500) {
					Client.field680[Client.field602] = var0;
					Client.field681[Client.field602] = var1;
					Client.field783[Client.field602] = var2;
					Client.field677[Client.field602] = var3;
					Client.field674[Client.field602] = var4;
					Client.field832[Client.field602] = var5;
					Client.field789[Client.field602] = var6;
					Client.field679[Client.field602] = var8;
					Client.field554[Client.field602] = var7;
					++Client.field602;
				}

			}
		}
	}
}
