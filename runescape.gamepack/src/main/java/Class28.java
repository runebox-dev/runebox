public class Class28 {
	public int field141;
	public int field143;
	public int[] field140;
	public int[] field142;

	public Class28() {
		Class61 var1 = Class66.field818;
		var1.method1109(16);
		this.field143 = var1.method1104() != 0 ? var1.method1109(4) + 1 : 1;
		if (var1.method1104() != 0) {
			var1.method1109(8);
		}

		var1.method1109(2);
		if (this.field143 > 1) {
			this.field141 = var1.method1109(4);
		}

		this.field142 = new int[this.field143];
		this.field140 = new int[this.field143];

		for (int var2 = 0; var2 < this.field143; ++var2) {
			var1.method1109(8);
			this.field142[var2] = var1.method1109(8);
			this.field140[var2] = var1.method1109(8);
		}

	}
}