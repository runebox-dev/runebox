public class Class564 {
	public int[] field5436;
	public short[] field5435;

	public Class564(Class225 var1) {
		this.field5436 = new int[8];
		this.field5435 = new short[8];
		int var2 = 0;
		if (var1.method4262()) {
			var2 = var1.method4242().length;
			System.arraycopy(var1.method4242(), 0, this.field5436, 0, var2);
			System.arraycopy(var1.method4257(), 0, this.field5435, 0, var2);
		}

		for (int var3 = var2; var3 < 8; ++var3) {
			this.field5436[var3] = -1;
			this.field5435[var3] = -1;
		}

	}

	public int[] method10250() {
		return this.field5436;
	}

	public short[] method10247() {
		return this.field5435;
	}

	public void method10248(int var1, int var2, short var3) {
		this.field5436[var1] = var2;
		this.field5435[var1] = var3;
	}

	public void method10249(int[] var1, short[] var2) {
		this.field5436 = var1;
		this.field5435 = var2;
	}
}
