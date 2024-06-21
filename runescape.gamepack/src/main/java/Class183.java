import io.runebox.ObfInfo;

@ObfInfo(name = "ha")
public class Class183 {
	@ObfInfo(name = "az", desc = "[S")
	public short[] field1909;
	@ObfInfo(name = "aj", desc = "[S")
	public short[] field1911;

	public Class183(int var1) {
		Class232 var2 = Class7.method109(var1);
		if (var2.method4427()) {
			this.field1911 = new short[var2.field2476.length];
			System.arraycopy(var2.field2476, 0, this.field1911, 0, this.field1911.length);
		}

		if (var2.method4428()) {
			this.field1909 = new short[var2.field2470.length];
			System.arraycopy(var2.field2470, 0, this.field1909, 0, this.field1909.length);
		}

	}
}
