import io.runebox.ObfInfo;

@ObfInfo(name = "de")
public class Class83 {
	@ObfInfo(name = "az", desc = "[Ldx;")
	public Class102[] field1013;
	@ObfInfo(name = "ah", desc = "Leh;")
	public Class112 field1017;
	@ObfInfo(name = "ag", desc = "[Lip;")
	public Class224[] field1015;
	@ObfInfo(name = "ad", desc = "Lkq;")
	public Class277 field1014;
	@ObfInfo(name = "aw", desc = "Lpr;")
	public Class408 field1022;
	@ObfInfo(name = "as", desc = "Lpr;")
	public Class408 field1033;
	@ObfInfo(name = "at", desc = "Lpr;")
	public Class408 field1035;
	@ObfInfo(name = "aa", desc = "[[[Lpr;")
	public Class408[][][] field1032;
	@ObfInfo(name = "al", desc = "[Lso;")
	public Class483[] field1029;
	@ObfInfo(name = "au", desc = "[Ldb;")
	public Class80[] field1024;
	@ObfInfo(name = "ae", desc = "[[[B")
	public byte[][][] field1023;
	@ObfInfo(name = "ak", desc = "I", intMultiplier = -1735177445)
	public int field1016;
	@ObfInfo(name = "an", desc = "I", intMultiplier = 1628317125)
	public int field1018;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 998139683)
	public int field1019;
	@ObfInfo(name = "ay", desc = "I", intMultiplier = 1124408595)
	public int field1020;
	@ObfInfo(name = "av", desc = "I", intMultiplier = -1484949025)
	public int field1021;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 2142034745)
	public int field1026;
	@ObfInfo(name = "ax", desc = "I", intMultiplier = -959579827)
	public int field1027;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = 1019381583)
	public int field1030;
	@ObfInfo(name = "ac", desc = "[I")
	public int[] field1028;
	@ObfInfo(name = "ao", desc = "[I")
	public int[] field1031;
	@ObfInfo(name = "ab", desc = "[[I")
	public int[][] field1036;
	@ObfInfo(name = "ai", desc = "[[[I")
	public int[][][] field1025;

	public Class83(int var1, int var2, int var3, int var4) {
		this.field1015 = new Class224[4];
		this.field1024 = new Class80[2048];
		this.field1017 = new Class112(this);
		this.field1013 = new Class102[65536];
		this.field1028 = new int[65536];
		this.field1029 = new Class483[2048];
		this.field1031 = new int[2048];
		this.field1033 = new Class408();
		this.field1022 = new Class408();
		this.field1035 = new Class408();
		this.field1026 = var1;
		this.field1030 = var2;
		this.field1018 = var3;
		this.field1032 = new Class408[4][var2][var3];
		this.field1025 = new int[4][var2 + 1][var3 + 1];
		this.field1023 = new byte[4][var2][var3];
		this.field1036 = new int[var2][var3];

		for (int var5 = 0; var5 < 4; ++var5) {
			this.field1015[var5] = new Class224(var2, var3);
		}

		this.field1014 = new Class277(var1, 4, var2, var3, var4, this.field1025);
	}

	@ObfInfo(name = "aq", desc = "(B)Z", opaque = "74")
	public boolean method2315() {
		return -1 == this.field1026;
	}

	@ObfInfo(name = "ad", desc = "(I)V", opaque = "967155447")
	public void method2316() {
		this.field1027 = 0;
		this.field1020 = 0;

		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			this.field1024[var2] = null;
		}

		for (var2 = 0; var2 < 65536; ++var2) {
			this.field1013[var2] = null;
		}

		for (var2 = 0; var2 < 2048; ++var2) {
			this.field1029[var2] = null;
		}

		this.field1022.method7518();
		this.field1035.method7518();
		this.field1033 = new Class408();

		for (var2 = 0; var2 < 4; ++var2) {
			for (int var3 = 0; var3 < this.field1030; ++var3) {
				for (int var4 = 0; var4 < this.field1018; ++var4) {
					this.field1032[var2][var3][var4] = null;
				}
			}
		}

		this.field1014.method5252();

		for (var2 = 0; var2 < 4; ++var2) {
			this.field1015[var2].method4304();
		}

	}

	@ObfInfo(name = "ag", desc = "(I)V", opaque = "331336820")
	public void method2319() {
		int var2;
		for (var2 = 0; var2 < 2048; ++var2) {
			this.field1024[var2] = null;
		}

		for (var2 = 0; var2 < this.field1013.length; ++var2) {
			Class102 var3 = this.field1013[var2];
			if (var3 != null) {
				var3.field1228 = -1;
				var3.field1247 = false;
			}
		}

	}
}
