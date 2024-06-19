public class Class98 {
	public Class100[] field1295;
	public Class108 field1288;
	public Class226[] field1284;
	public Class259 field1283;
	public Class401 field1294;
	public Class401 field1303;
	public Class401 field1304;
	public Class401[][][] field1301;
	public Class488[] field1299;
	public Class83[] field1293;
	public byte[][][] field1292;
	public int field1282;
	public int field1285;
	public int field1286;
	public int field1287;
	public int field1289;
	public int field1296;
	public int field1298;
	public int field1300;
	public int[] field1297;
	public int[] field1302;
	public int[][] field1290;
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

	public boolean method2500() {
		return -1 == this.field1287;
	}

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

	public static void method2508() {
		Class128.field1533.clear();
		Class128.field1529.method9328();
		Class128.field1528.method7388();
		Class128.field1531 = 0;
	}

	public static boolean method2499(char var0) {
		for (int var2 = 0; var2 < Class76.field946.length(); ++var2) {
			if (Class76.field946.charAt(var2) == var0) {
				return true;
			}
		}

		return false;
	}
}
