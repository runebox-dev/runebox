import io.runebox.ObfInfo;

@ObfInfo(name = "kv")
public class Class282 {
	@ObfInfo(name = "ad", desc = "[I")
	public static int[] field2967;
	@ObfInfo(name = "ag", desc = "[I")
	public static int[] field2968;
	@ObfInfo(name = "ak", desc = "[I")
	public static int[] field2969;
	@ObfInfo(name = "aq", desc = "[I")
	public static int[] field2976;
	@ObfInfo(name = "ap", desc = "Lko;")
	public Class275 field2970;
	@ObfInfo(name = "ae", desc = "Z")
	public boolean field2975;
	@ObfInfo(name = "an", desc = "I")
	public int field2973;
	@ObfInfo(name = "ab", desc = "[I")
	public int[] field2966;
	@ObfInfo(name = "av", desc = "[I")
	public int[] field2971;
	@ObfInfo(name = "aj", desc = "[I")
	public int[] field2972;
	@ObfInfo(name = "ai", desc = "[I")
	public int[] field2974;

	static {
		field2976 = new int[500];
		field2967 = new int[500];
		field2968 = new int[500];
		field2969 = new int[500];
	}

	public Class282(byte[] var1, Class275 var2) {
		this.field2970 = null;
		this.field2973 = -1;
		this.field2975 = false;
		this.field2970 = var2;
		Class562 var3 = new Class562(var1);
		Class562 var4 = new Class562(var1);
		var3.field5471 = 2;
		int var5 = var3.method9902();
		int var6 = -1;
		int var7 = 0;
		var4.field5471 = var3.field5471 + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.method9902();
			if (var9 > 0) {
				if (this.field2970.field2810[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field2970.field2810[var10] == 0) {
							field2976[var7] = var10;
							field2967[var7] = 0;
							field2968[var7] = 0;
							field2969[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2976[var7] = var8;
				short var11 = 0;
				if (this.field2970.field2810[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2967[var7] = var4.method9841();
				} else {
					field2967[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2968[var7] = var4.method9841();
				} else {
					field2968[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2969[var7] = var4.method9841();
				} else {
					field2969[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.field2970.field2810[var8] == 5) {
					this.field2975 = true;
				}
			}
		}

		if (var1.length != var4.field5471) {
			throw new RuntimeException();
		} else {
			this.field2973 = var7;
			this.field2972 = new int[var7];
			this.field2971 = new int[var7];
			this.field2966 = new int[var7];
			this.field2974 = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.field2972[var8] = field2976[var8];
				this.field2971[var8] = field2967[var8];
				this.field2966[var8] = field2968[var8];
				this.field2974[var8] = field2969[var8];
			}

		}
	}
}
