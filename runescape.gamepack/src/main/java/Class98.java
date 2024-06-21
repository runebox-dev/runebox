import io.runebox.ObfInfo;

@ObfInfo(name = "dt")
public class Class98 {
	@ObfInfo(name = "ap", desc = "[Ldv;")
	public Class100[] field1295;
	@ObfInfo(name = "aq", desc = "Led;")
	public Class108 field1288;
	@ObfInfo(name = "aj", desc = "[Lir;")
	public Class226[] field1284;
	@ObfInfo(name = "al", desc = "Ljy;")
	public Class259 field1283;
	@ObfInfo(name = "ad", desc = "Lpk;")
	public Class401 field1294;
	@ObfInfo(name = "ai", desc = "Lpk;")
	public Class401 field1303;
	@ObfInfo(name = "an", desc = "Lpk;")
	public Class401 field1304;
	@ObfInfo(name = "aw", desc = "[[[Lpk;")
	public Class401[][][] field1301;
	@ObfInfo(name = "ay", desc = "[Lst;")
	public Class488[] field1299;
	@ObfInfo(name = "av", desc = "[Lde;")
	public Class83[] field1293;
	@ObfInfo(name = "ah", desc = "[[[B")
	public byte[][][] field1292;
	@ObfInfo(name = "aa", desc = "I", intMultiplier = -1595806771)
	public int field1282;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -854149623)
	public int field1285;
	@ObfInfo(name = "au", desc = "I", intMultiplier = -1011567785)
	public int field1286;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1413982259)
	public int field1287;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1010690991)
	public int field1289;
	@ObfInfo(name = "ae", desc = "I", intMultiplier = 1962706385)
	public int field1296;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -1392129955)
	public int field1298;
	@ObfInfo(name = "az", desc = "I", intMultiplier = 1305902891)
	public int field1300;
	@ObfInfo(name = "ax", desc = "[I")
	public int[] field1297;
	@ObfInfo(name = "as", desc = "[I")
	public int[] field1302;
	@ObfInfo(name = "ac", desc = "[[I")
	public int[][] field1290;
	@ObfInfo(name = "ao", desc = "[[[I")
	public int[][][] field1291;

	public Class98(int var1, int var2, int var3, int var4) {
		this.field1284 = new Class226[4];
		this.field1293 = new Class83[2048];
		this.field1288 = new Class108(this);
		this.field1295 = new Class100[65536];
		this.field1297 = new int[65536];
		this.field1299 = new Class488[2048];
		this.field1302 = new int[2048];
		this.field1294 = new Class401();
		this.field1303 = new Class401();
		this.field1304 = new Class401();
		this.field1287 = var1;
		this.field1298 = var2;
		this.field1282 = var3;
		this.field1301 = new Class401[4][var2][var3];
		this.field1291 = new int[4][var2 + 1][var3 + 1];
		this.field1292 = new byte[4][var2][var3];
		this.field1290 = new int[var2][var3];

		for (int var5 = 0; var5 < 4; ++var5) {
			this.field1284[var5] = new Class226(var2, var3);
		}

		this.field1283 = new Class259(var1, 4, var2, var3, var4, this.field1291);
	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "-729798848")
	public boolean method2500() {
		return -1 == this.field1287;
	}

	@ObfInfo(name = "al", desc = "(I)V", opaque = "841220988")
	public void method2501() {
		this.field1296 = 0;
		this.field1286 = 0;

		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			this.field1293[var2] = null;
		}

		for (var2 = 0; var2 < 65536; ++var2) {
			this.field1295[var2] = null;
		}

		for (var2 = 0; var2 < 2048; ++var2) {
			this.field1299[var2] = null;
		}

		this.field1303.method7476();
		this.field1304.method7476();
		this.field1294 = new Class401();

		for (var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < this.field1298; ++var3) {
				for (int var4 = 0; var4 < this.field1282; ++var4) {
					this.field1301[var2][var3][var4] = null;
				}
			}
		}

		this.field1283.method4925();

		for (var2 = 0; var2 < 4; ++var2) {
			this.field1284[var2].method4302();
		}

	}

	@ObfInfo(name = "aj", desc = "(B)V", opaque = "93")
	public void method2506() {
		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			this.field1293[var2] = null;
		}

		for (var2 = 0; var2 < this.field1295.length; ++var2) {
			Class100 var3 = this.field1295[var2];
			if (var3 != null) {
				var3.field1070 = -1;
				var3.field1091 = false;
			}
		}

	}
}
