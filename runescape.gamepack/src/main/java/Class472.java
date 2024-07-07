import io.runebox.ObfInfo;

@ObfInfo(name = "sd")
public class Class472 extends Class476 {
	@ObfInfo(name = "ad", desc = "Lsv;")
	public Class490 field4957;
	@ObfInfo(name = "aq", desc = "Lsv;")
	public Class490 field4960;

	public Class472() {
		this.field4960 = Class490.field5014;
		this.field4957 = Class490.field5014;
	}

	@ObfInfo(name = "aq", desc = "(B)V")
	public void method8621() {
		this.field4960 = Class490.field5014;
	}

	@ObfInfo(name = "ak", desc = "(B)Z", opaque = "1")
	public final boolean method8619() {
		if (Class490.field5014 == this.field4960) {
			this.method8620();
		}

		return Class490.field5015 == this.field4960;
	}

	@ObfInfo(name = "ap", desc = "(B)V", opaque = "0")
	public void method8620() {
		this.field4960 = Client.field1585.field465.method8555(super.field4983) ? Class490.field5015 : Class490.field5016;
	}

	@ObfInfo(name = "an", desc = "(I)V")
	public void method8637() {
		this.field4957 = Class490.field5014;
	}

	@ObfInfo(name = "ai", desc = "(S)Z", opaque = "248")
	public final boolean method8622() {
		if (Class490.field5014 == this.field4957) {
			this.method8639();
		}

		return Class490.field5015 == this.field4957;
	}

	@ObfInfo(name = "ae", desc = "(I)V", opaque = "197382137")
	public void method8639() {
		this.field4957 = Client.field1585.field463.method8555(super.field4983) ? Class490.field5015 : Class490.field5016;
	}
}
