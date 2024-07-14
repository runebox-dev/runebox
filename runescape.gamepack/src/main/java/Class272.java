import io.runebox.ObfInfo;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@ObfInfo(name = "kl")
public class Class272 extends Class247 {
	@ObfInfo(name = "az", desc = "Ljava/util/HashSet;")
	public HashSet field2794;
	@ObfInfo(name = "ax", desc = "Ljava/util/HashSet;")
	public HashSet field2795;
	@ObfInfo(name = "ac", desc = "Ljava/util/List;")
	public List field2796;

	@ObfInfo(name = "cx", desc = "(Lvp;Lvp;IZI)V", opaque = "1781400173")
	public void method5104(Class562 var1, Class562 var2, int var3, boolean var4) {
		this.method4779(var1, var3);
		int var6 = var2.method9997();
		this.field2794 = new HashSet(var6);

		int var7;
		for (var7 = 0; var7 < var6; ++var7) {
			Class248 var8 = new Class248();

			try {
				var8.method4832(var2);
			} catch (IllegalStateException var12) {
				continue;
			}

			this.field2794.add(var8);
		}

		var7 = var2.method9997();
		this.field2795 = new HashSet(var7);

		for (int var13 = 0; var13 < var7; ++var13) {
			Class257 var9 = new Class257();

			try {
				var9.method4950(var2);
			} catch (IllegalStateException var11) {
				continue;
			}

			this.field2795.add(var9);
		}

		this.method5103(var2, var4);
	}

	@ObfInfo(name = "ca", desc = "(Lvp;ZI)V", opaque = "-1430395361")
	public void method5103(Class562 var1, boolean var2) {
		this.field2796 = new LinkedList();
		int var4 = var1.method9997();

		for (int var5 = 0; var5 < var4; ++var5) {
			int var6 = var1.method9871();
			Class350 var7 = new Class350(var1.method9832());
			boolean var8 = var1.method9902() == 1;
			if (var2 || !var8) {
				this.field2796.add(new Class252((Class350)null, var7, var6, (Class273)null));
			}
		}

	}

	@ObfInfo(name = "ac", desc = "(Lbs;I)V", opaque = "2025681438")
	public static void method5111(Class45 var0) {
		Class218 var2 = Client.field754;

		while (var2.method4189()) {
			if (var2.field2384 == 13) {
				Class53.field339 = false;
				Class53.field343.method9636(Class53.field341, 0);
				Class53.field2205.method9636(Class53.field341 + 382, 0);
				Class99.field4534.method10122(Class53.field341 + 382 - Class99.field4534.field5495 / 2, 18);
				return;
			}

			if (var2.field2384 == 96) {
				if (Class53.field371 > 0 && Class53.field179 != null) {
					--Class53.field371;
				}
			} else if (var2.field2384 == 97 && Class53.field371 < Class53.field372 && Class53.field3773 != null) {
				++Class53.field371;
			}
		}

		if (Class42.field227 == 1 || !Client.field911 && Class42.field227 == 4) {
			int var4 = Class53.field341 + 280;
			if (Class42.field230 >= var4 && Class42.field230 <= var4 + 14 && Class42.field222 >= 4 && Class42.field222 <= 18) {
				Class90.method2423(0, 0);
				return;
			}

			if (Class42.field230 >= var4 + 15 && Class42.field230 <= var4 + 80 && Class42.field222 >= 4 && Class42.field222 <= 18) {
				Class90.method2423(0, 1);
				return;
			}

			int var5 = Class53.field341 + 390;
			if (Class42.field230 >= var5 && Class42.field230 <= var5 + 14 && Class42.field222 >= 4 && Class42.field222 <= 18) {
				Class90.method2423(1, 0);
				return;
			}

			if (Class42.field230 >= var5 + 15 && Class42.field230 <= var5 + 80 && Class42.field222 >= 4 && Class42.field222 <= 18) {
				Class90.method2423(1, 1);
				return;
			}

			int var6 = Class53.field341 + 500;
			if (Class42.field230 >= var6 && Class42.field230 <= var6 + 14 && Class42.field222 >= 4 && Class42.field222 <= 18) {
				Class90.method2423(2, 0);
				return;
			}

			if (Class42.field230 >= var6 + 15 && Class42.field230 <= var6 + 80 && Class42.field222 >= 4 && Class42.field222 <= 18) {
				Class90.method2423(2, 1);
				return;
			}

			int var7 = Class53.field341 + 610;
			if (Class42.field230 >= var7 && Class42.field230 <= var7 + 14 && Class42.field222 >= 4 && Class42.field222 <= 18) {
				Class90.method2423(3, 0);
				return;
			}

			if (Class42.field230 >= var7 + 15 && Class42.field230 <= var7 + 80 && Class42.field222 >= 4 && Class42.field222 <= 18) {
				Class90.method2423(3, 1);
				return;
			}

			if (Class42.field230 >= Class53.field341 + 708 && Class42.field222 >= 4 && Class42.field230 <= Class53.field341 + 708 + 50 && Class42.field222 <= 20) {
				Class53.field339 = false;
				Class53.field343.method9636(Class53.field341, 0);
				Class53.field2205.method9636(Class53.field341 + 382, 0);
				Class99.field4534.method10122(Class53.field341 + 382 - Class99.field4534.field5495 / 2, 18);
				return;
			}

			if (Class53.field369 != -1) {
				Class75 var8 = Class90.field3782[Class53.field369];
				boolean var9 = Class524.method3838(Client.field796, Class545.field5342);
				boolean var10 = var8.method2188();
				Client.field77 = var10;
				var8.field903 = var10 ? "beta" : var8.field903;
				Class99.method2639(var8);
				Class53.field339 = false;
				Class53.field343.method9636(Class53.field341, 0);
				Class53.field2205.method9636(Class53.field341 + 382, 0);
				Class99.field4534.method10122(Class53.field341 + 382 - Class99.field4534.field5495 / 2, 18);
				if (var9 != var10) {
					Client.method887();
				}

				return;
			}

			if (Class53.field371 > 0 && Class53.field179 != null && Class42.field230 >= 0 && Class42.field230 <= Class53.field179.field5495 && Class42.field222 >= Client.field15 / 2 - 50 && Class42.field222 <= Client.field15 / 2 + 50) {
				--Class53.field371;
			}

			if (Class53.field371 < Class53.field372 && Class53.field3773 != null && Class42.field230 >= Client.field954 - Class53.field3773.field5495 - 5 && Class42.field230 <= Client.field954 && Class42.field222 >= Client.field15 / 2 - 50 && Class42.field222 <= Client.field15 / 2 + 50) {
				++Class53.field371;
			}
		}

	}
}
