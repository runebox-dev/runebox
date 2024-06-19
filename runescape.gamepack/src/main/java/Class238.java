public class Class238 {
	public static int[] field2571;
	public static int[] field2572;
	public static int[] field2575;
	public static int[] field2576;
	public Class248 field2573;
	public boolean field2579;
	public int field2574;
	public int[] field2569;
	public int[] field2570;
	public int[] field2577;
	public int[] field2578;

	static {
		field2576 = new int[500];
		field2572 = new int[500];
		field2571 = new int[500];
		field2575 = new int[500];
	}

	public Class238(byte[] var1, Class248 var2) {
		this.field2573 = null;
		this.field2574 = -1;
		this.field2579 = false;
		this.field2573 = var2;
		Class521 var3 = new Class521(var1);
		Class521 var4 = new Class521(var1);
		var3.field5219 = 2;
		int var5 = var3.method9405();
		int var6 = -1;
		int var7 = 0;
		var4.field5219 = var3.field5219 + var5;

		int var8;
		for (var8 = 0; var8 < var5; ++var8) {
			int var9 = var3.method9405();
			if (var9 > 0) {
				if (this.field2573.field2661[var8] != 0) {
					for (int var10 = var8 - 1; var10 > var6; --var10) {
						if (this.field2573.field2661[var10] == 0) {
							field2576[var7] = var10;
							field2572[var7] = 0;
							field2571[var7] = 0;
							field2575[var7] = 0;
							++var7;
							break;
						}
					}
				}

				field2576[var7] = var8;
				short var11 = 0;
				if (this.field2573.field2661[var8] == 3) {
					var11 = 128;
				}

				if ((var9 & 1) != 0) {
					field2572[var7] = var4.method9457();
				} else {
					field2572[var7] = var11;
				}

				if ((var9 & 2) != 0) {
					field2571[var7] = var4.method9457();
				} else {
					field2571[var7] = var11;
				}

				if ((var9 & 4) != 0) {
					field2575[var7] = var4.method9457();
				} else {
					field2575[var7] = var11;
				}

				var6 = var8;
				++var7;
				if (this.field2573.field2661[var8] == 5) {
					this.field2579 = true;
				}
			}
		}

		if (var4.field5219 != var1.length) {
			throw new RuntimeException();
		} else {
			this.field2574 = var7;
			this.field2569 = new int[var7];
			this.field2570 = new int[var7];
			this.field2577 = new int[var7];
			this.field2578 = new int[var7];

			for (var8 = 0; var8 < var7; ++var8) {
				this.field2569[var8] = field2576[var8];
				this.field2570[var8] = field2572[var8];
				this.field2577[var8] = field2571[var8];
				this.field2578[var8] = field2575[var8];
			}

		}
	}
}
