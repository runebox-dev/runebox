import io.runebox.ObfInfo;

@ObfInfo(name = "qw")
public class Class439 {
	@ObfInfo(name = "aq", desc = "Lql;")
	public Class428 field4770;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 637367841)
	public int field4766;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = -808876763)
	public int field4769;

	public Class439(Class428 var1, int var2, int var3) {
		this.field4766 = 0;
		this.field4769 = 0;
		this.field4770 = var1;
		this.field4766 = var2;
		this.field4769 = var3;
	}

	@ObfInfo(name = "aq", desc = "(I)Ljava/lang/String;", opaque = "-420267914")
	public String method8087() {
		if (this.method8089()) {
			return "";
		} else {
			StringBuilder var2 = new StringBuilder(this.method8090());

			for (int var3 = this.field4766; var3 < this.field4769; ++var3) {
				Class422 var4 = this.field4770.method7871(var3);
				var2.append(var4.field4693);
			}

			return var2.toString();
		}
	}

	@ObfInfo(name = "ad", desc = "(II)Z", opaque = "-1686655956")
	public boolean method8099(int var1) {
		return this.field4770.method7901() == 2 || this.field4770.method7901() == 1 && (!this.field4770.field4731 || this.field4769 - 1 != var1);
	}

	@ObfInfo(name = "ag", desc = "(I)Z", opaque = "129521341")
	public boolean method8089() {
		return this.field4769 == this.field4766;
	}

	@ObfInfo(name = "ak", desc = "(S)I")
	public int method8090() {
		return this.field4769 - this.field4766;
	}

	@ObfInfo(name = "ap", desc = "(Lqf;S)Z", opaque = "131")
	public boolean method8091(Class422 var1) {
		if (this.field4770.field4723 == 2) {
			return true;
		} else if (this.field4770.field4723 == 0) {
			return false;
		} else {
			return this.field4770.method7951() != var1;
		}
	}

	@ObfInfo(name = "an", desc = "(I)I", opaque = "-992528631")
	public int method8092() {
		if (this.method8089()) {
			return 0;
		} else {
			Class422 var2 = this.field4770.method7871(this.field4769 - 1);
			if (var2.field4693 == '\n') {
				return 0;
			} else if (this.method8091(var2)) {
				return this.field4770.field4719.field4786[42];
			} else {
				int var3 = this.field4770.field4719.field4786[var2.field4693];
				if (var3 == 0) {
					return var2.field4693 == '\t' ? this.field4770.field4719.field4786[32] * 3 : this.field4770.field4719.field4786[32];
				} else {
					return var3;
				}
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(I)Ltu;", opaque = "-281560173")
	public Class515 method8093() {
		if (this.method8089()) {
			return new Class515(0, 0);
		} else {
			Class422 var2 = this.field4770.method7871(this.field4769 - 1);
			return new Class515(var2.field4696 + this.method8092(), var2.field4694);
		}
	}

	@ObfInfo(name = "av", desc = "(II)Lqf;", opaque = "1462344718")
	public Class422 method8098(int var1) {
		return var1 >= 0 && var1 < this.method8090() ? this.field4770.method7871(this.field4766 + var1) : null;
	}
}
