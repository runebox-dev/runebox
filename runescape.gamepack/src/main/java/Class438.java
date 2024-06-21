import io.runebox.ObfInfo;

@ObfInfo(name = "qv")
public class Class438 {
	@ObfInfo(name = "ak", desc = "Lqw;")
	public Class439 field4749;
	@ObfInfo(name = "al", desc = "I", intMultiplier = -435297999)
	public int field4746;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = -7168045)
	public int field4748;

	public Class438(Class439 var1, int var2, int var3) {
		this.field4746 = 0;
		this.field4748 = 0;
		this.field4749 = var1;
		this.field4746 = var2;
		this.field4748 = var3;
	}

	@ObfInfo(name = "ak", desc = "(I)Ljava/lang/String;", opaque = "1871585202")
	public String method8113() {
		if (this.method8101()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method8102());

			for (int var3 = this.field4746; var3 < this.field4748; ++var3) {
				Class431 var4 = this.field4749.method8120(var3);
				var2.append(var4.field4708);
			}

			return var2.toString();
		}
	}

	@ObfInfo(name = "al", desc = "(IB)Z", opaque = "-1")
	public boolean method8100(int var1) {
		return this.field4749.method8151() == 2 || this.field4749.method8151() == 1 && (!this.field4749.field4765 || var1 != this.field4748 - 1);
	}

	@ObfInfo(name = "aj", desc = "(I)Z", opaque = "1467235736")
	public boolean method8101() {
		return this.field4748 == this.field4746;
	}

	@ObfInfo(name = "az", desc = "(I)I")
	public int method8102() {
		return this.field4748 - this.field4746;
	}

	@ObfInfo(name = "af", desc = "(Lqo;I)Z", opaque = "833622859")
	public boolean method8103(Class431 var1) {
		if (2 == this.field4749.field4769) {
			return true;
		} else if (this.field4749.field4769 == 0) {
			return false;
		} else {
			return this.field4749.method8121() != var1;
		}
	}

	@ObfInfo(name = "aa", desc = "(B)I", opaque = "1")
	public int method8104() {
		if (this.method8101()) {
			return 0;
		} else {
			Class431 var2 = this.field4749.method8120(this.field4748 - 1);
			if (var2.field4708 == '\n') {
				return 0;
			} else if (this.method8103(var2)) {
				return this.field4749.field4756.field4725[42];
			} else {
				int var3 = this.field4749.field4756.field4725[var2.field4708];
				if (var3 == 0) {
					return var2.field4708 == '\t' ? 3 * this.field4749.field4756.field4725[32] : this.field4749.field4756.field4725[32];
				} else {
					return var3;
				}
			}
		}
	}

	@ObfInfo(name = "at", desc = "(I)Lto;", opaque = "1059061886")
	public Class509 method8105() {
		if (this.method8101()) {
			return new Class509(0, 0);
		} else {
			Class431 var2 = this.field4749.method8120(this.field4748 - 1);
			return new Class509(var2.field4709 + this.method8104(), var2.field4710);
		}
	}

	@ObfInfo(name = "ab", desc = "(II)Lqo;", opaque = "-916203890")
	public Class431 method8106(int var1) {
		return var1 >= 0 && var1 < this.method8102() ? this.field4749.method8120(this.field4746 + var1) : null;
	}
}
