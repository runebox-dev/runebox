import io.runebox.ObfInfo;
import java.io.IOException;

@ObfInfo(name = "ev")
public class Class126 {
	@ObfInfo(name = "ah", desc = "Lmp;")
	public ServerPacket field1486;
	@ObfInfo(name = "au", desc = "Lmp;")
	public ServerPacket field1489;
	@ObfInfo(name = "aj", desc = "Lmp;")
	public ServerPacket field1490;
	@ObfInfo(name = "az", desc = "Lmp;")
	public ServerPacket field1491;
	@ObfInfo(name = "ad", desc = "Lpi;")
	public Class399 field1479;
	@ObfInfo(name = "aq", desc = "Lsp;")
	public Class484 field1478;
	@ObfInfo(name = "an", desc = "Lug;")
	public Class527 field1487;
	@ObfInfo(name = "ak", desc = "Lvp;")
	public Class562 field1481;
	@ObfInfo(name = "ap", desc = "Lvs;")
	public Class565 field1482;
	@ObfInfo(name = "ab", desc = "Z")
	public boolean field1488;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -2122551751)
	public int field1480;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1102504087)
	public int field1483;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -1278220435)
	public int field1484;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -870602463)
	public int field1485;

	public Class126() {
		this.field1479 = new Class399();
		this.field1480 = 0;
		this.field1481 = new Class562(5000);
		this.field1487 = new Class527(40000);
		this.field1490 = null;
		this.field1485 = 0;
		this.field1488 = true;
		this.field1484 = 0;
		this.field1483 = 0;
	}

	@ObfInfo(name = "aq", desc = "(B)V")
	public final void method3021() {
		this.field1479.method7397();
		this.field1480 = 0;
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaque = "383751664")
	public final void method3012() throws IOException {
		if (this.field1478 != null && this.field1480 > 0) {
			this.field1481.field5471 = 0;

			while (true) {
				Class314 var2 = (Class314)this.field1479.method7401();
				if (var2 == null || var2.field3271 > this.field1481.field5472.length - this.field1481.field5471) {
					this.field1478.method8648(this.field1481.field5472, 0, this.field1481.field5471);
					this.field1483 = 0;
					break;
				}

				this.field1481.method9819(var2.field3270.field5472, 0, var2.field3271);
				this.field1480 -= var2.field3271;
				var2.method9267();
				var2.field3270.method9808();
				var2.method6079();
			}
		}

	}

	@ObfInfo(name = "ag", desc = "(Lmb;B)V")
	public final void method3013(Class314 var1) {
		this.field1479.method7449(var1);
		var1.field3271 = var1.field3270.field5471;
		var1.field3270.field5471 = 0;
		this.field1480 += var1.field3271;
	}

	@ObfInfo(name = "ak", desc = "(Lsp;S)V")
	public void method3029(Class484 var1) {
		this.field1478 = var1;
	}

	@ObfInfo(name = "ap", desc = "(I)V", opaque = "-1042232383")
	public void method3015() {
		if (this.field1478 != null) {
			this.field1478.method8644();
			this.field1478 = null;
		}

	}

	@ObfInfo(name = "an", desc = "(I)V")
	public void method3016() {
		this.field1478 = null;
	}

	@ObfInfo(name = "aj", desc = "(I)Lsp;")
	public Class484 method3017() {
		return this.field1478;
	}

	@ObfInfo(name = "jm", desc = "(IIIIZI)V", opaque = "-408274122")
	public static void method3030(int var0, int var1, int var2, int var3, boolean var4) {
		if (var2 < 1) {
			var2 = 1;
		}

		if (var3 < 1) {
			var3 = 1;
		}

		int var6 = var3 - 334;
		int var7;
		if (var6 < 0) {
			var7 = Client.field802;
		} else if (var6 >= 100) {
			var7 = Client.field803;
		} else {
			var7 = (Client.field803 - Client.field802) * var6 / 100 + Client.field802;
		}

		int var8 = var3 * var7 * 512 / (var2 * 334);
		int var9;
		int var10;
		short var11;
		if (var8 < Client.field808) {
			var11 = Client.field808;
			var7 = var2 * var11 * 334 / (var3 * 512);
			if (var7 > Client.field807) {
				var7 = Client.field807;
				var9 = var3 * var7 * 512 / (var11 * 334);
				var10 = (var2 - var9) / 2;
				if (var4) {
					Class569.method10129();
					Class569.method10138(var0, var1, var10, var3, -16777216);
					Class569.method10138(var0 + var2 - var10, var1, var10, var3, -16777216);
				}

				var0 += var10;
				var2 -= var10 * 2;
			}
		} else if (var8 > Client.field809) {
			var11 = Client.field809;
			var7 = var2 * var11 * 334 / (var3 * 512);
			if (var7 < Client.field777) {
				var7 = Client.field777;
				var9 = var2 * var11 * 334 / (var7 * 512);
				var10 = (var3 - var9) / 2;
				if (var4) {
					Class569.method10129();
					Class569.method10138(var0, var1, var2, var10, -16777216);
					Class569.method10138(var0, var1 + var3 - var10, var2, var10, -16777216);
				}

				var1 += var10;
				var3 -= var10 * 2;
			}
		}

		Client.field814 = var3 * var7 / 334;
		if (Client.field812 != var2 || Client.field726 != var3) {
			Client.method4004(var2, var3);
		}

		Client.field810 = var0;
		Client.field811 = var1;
		Client.field812 = var2;
		Client.field726 = var3;
	}
}
