import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

@ObfInfo(name = "bd")
public class Class30 {
	@ObfInfo(name = "ad", desc = "Lbl;")
	public Class38 field143;
	@ObfInfo(name = "aq", desc = "Lcl;")
	public Class64 field142;
	@ObfInfo(name = "ag", desc = "Ljava/util/concurrent/locks/ReentrantLock;")
	public ReentrantLock field145;

	public Class30(Class64 var1, Class38 var2) {
		this.field142 = var1;
		this.field143 = var2;
		this.field145 = new ReentrantLock();
	}

	@ObfInfo(name = "aw", desc = "(I)V", opaque = "-439684617")
	public static void method433() {
		if (!Client.field1474.method2492()) {
			ArrayList var1 = new ArrayList();
			var1.add(new Class351(Client.field2221, "scape main", "", 255, false));
			Class323.method9265(var1, 0, 0, 0, 100, false);
		} else {
			Class323.method3075(0, 0);
		}

	}

	@ObfInfo(name = "lx", desc = "(ILjava/lang/String;I)V", opaque = "-673284309")
	public static void method436(int var0, String var1) {
		int var3 = Client.field170.field1002.field1017.field1402;
		int[] var4 = Client.field170.field1002.field1017.field1407;
		boolean var5 = false;
		Class561 var6 = new Class561(var1, Client.field1066);

		for (int var7 = 0; var7 < var3; ++var7) {
			Class80 var8 = Client.field170.field1002.field1024[var4[var7]];
			if (var8 != null && Client.field170 != var8 && var8.field991 != null && var8.field991.equals(var6)) {
				Class314 var9;
				if (var0 == 1) {
					var9 = Class168.method3523(ClientPacket.field3420, Client.field678.field1482);
					var9.field3270.method10025(0);
					var9.field3270.method10036(var4[var7]);
					Client.field678.method3013(var9);
				} else if (var0 == 4) {
					var9 = Class168.method3523(ClientPacket.field3447, Client.field678.field1482);
					var9.field3270.method10025(0);
					var9.field3270.method9810(var4[var7]);
					Client.field678.method3013(var9);
				} else if (var0 == 6) {
					var9 = Class168.method3523(ClientPacket.field3394, Client.field678.field1482);
					var9.field3270.method9866(var4[var7]);
					var9.field3270.method9856(0);
					Client.field678.method3013(var9);
				} else if (var0 == 7) {
					var9 = Class168.method3523(ClientPacket.field3403, Client.field678.field1482);
					var9.field3270.method9866(var4[var7]);
					var9.field3270.method9856(0);
					Client.field678.method3013(var9);
				}

				var5 = true;
				break;
			}
		}

		if (!var5) {
			Class115.method3716(4, "", Class367.field4198 + var1);
		}

	}
}
