import io.runebox.ObfInfo;

@ObfInfo(name = "sn")
public class Class482 extends Class483 {
	@ObfInfo(name = "ak", desc = "Lsi;")
	public Class477 field4956;
	@ObfInfo(name = "al", desc = "Lsi;")
	public Class477 field4957;

	public Class482() {
		this.field4956 = Class477.field4944;
		this.field4957 = Class477.field4944;
	}

	@ObfInfo(name = "ak", desc = "(I)V")
	public void method8839() {
		this.field4956 = Class477.field4944;
	}

	@ObfInfo(name = "aa", desc = "(I)Z", opaque = "1260412226")
	public final boolean method8850() {
		if (this.field4956 == Class477.field4944) {
			this.method8857();
		}

		return this.field4956 == Class477.field4943;
	}

	@ObfInfo(name = "at", desc = "(I)V", opaque = "-1001187460")
	public void method8857() {
		this.field4956 = Client.field274.field849.method8731(super.field4941) ? Class477.field4943 : Class477.field4942;
	}

	@ObfInfo(name = "ab", desc = "(B)V")
	public void method8842() {
		this.field4957 = Class477.field4944;
	}

	@ObfInfo(name = "ac", desc = "(I)Z", opaque = "1574236452")
	public final boolean method8841() {
		if (this.field4957 == Class477.field4944) {
			this.method8843();
		}

		return Class477.field4943 == this.field4957;
	}

	@ObfInfo(name = "ao", desc = "(B)V", opaque = "-1")
	public void method8843() {
		this.field4957 = Client.field274.field850.method8731(super.field4941) ? Class477.field4943 : Class477.field4942;
	}
}
