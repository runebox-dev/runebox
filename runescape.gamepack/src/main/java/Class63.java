import io.runebox.ObfInfo;

@ObfInfo(name = "ck")
public class Class63 extends Class516 {
	@ObfInfo(name = "an", desc = "Lsv;")
	public Class490 field486;
	@ObfInfo(name = "aj", desc = "Lsv;")
	public Class490 field487;
	@ObfInfo(name = "ap", desc = "Lvo;")
	public Class561 field485;
	@ObfInfo(name = "aq", desc = "I", intMultiplier = 1848380449)
	public int field481;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 412456333)
	public int field482;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 2145369723)
	public int field483;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field484;
	@ObfInfo(name = "av", desc = "Ljava/lang/String;")
	public String field488;
	@ObfInfo(name = "ab", desc = "Ljava/lang/String;")
	public String field489;

	public Class63(int var1, String var2, String var3, String var4) {
		this.field486 = Class490.field5014;
		this.field487 = Class490.field5014;
		this.method1293(var1, var2, var3, var4);
	}

	@ObfInfo(name = "aq", desc = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V")
	public void method1293(int var1, String var2, String var3, String var4) {
		int var6 = ++Class115.field1430 - 1;
		this.field481 = var6;
		this.field482 = Client.field541;
		this.field483 = var1;
		this.field484 = var2;
		this.method1283();
		this.field488 = var3;
		this.field489 = var4;
		this.method1298();
		this.method1280();
	}

	@ObfInfo(name = "ad", desc = "(I)V")
	public void method1298() {
		this.field486 = Class490.field5014;
	}

	@ObfInfo(name = "ag", desc = "(B)Z", opaque = "-1")
	public final boolean method1284() {
		if (Class490.field5014 == this.field486) {
			this.method1279();
		}

		return Class490.field5015 == this.field486;
	}

	@ObfInfo(name = "ak", desc = "(B)V")
	public void method1279() {
		this.field486 = Client.field1585.field465.method8555(this.field485) ? Class490.field5015 : Class490.field5016;
	}

	@ObfInfo(name = "ap", desc = "(B)V")
	public void method1280() {
		this.field487 = Class490.field5014;
	}

	@ObfInfo(name = "an", desc = "(B)Z", opaque = "8")
	public final boolean method1281() {
		if (Class490.field5014 == this.field487) {
			this.method1282();
		}

		return Class490.field5015 == this.field487;
	}

	@ObfInfo(name = "aj", desc = "(I)V", opaque = "335602789")
	public void method1282() {
		this.field487 = Client.field1585.field463.method8555(this.field485) ? Class490.field5015 : Class490.field5016;
	}

	@ObfInfo(name = "av", desc = "(I)V")
	public final void method1283() {
		if (this.field484 != null) {
			this.field485 = new Class561(Client.method9264(this.field484), Client.field1066);
		} else {
			this.field485 = null;
		}

	}
}
