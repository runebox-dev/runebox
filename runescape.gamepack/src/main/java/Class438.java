public class Class438 {
	public Class439 field4749;
	public int field4746;
	public int field4748;

	public Class438(Class439 var1, int var2, int var3) {
		this.field4746 = 0;
		this.field4748 = 0;
		this.field4749 = var1;
		this.field4746 = var2;
		this.field4748 = var3;
	}

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

	public boolean method8100(int var1) {
		return this.field4749.method8151() == 2 || this.field4749.method8151() == 1 && (!this.field4749.field4765 || var1 != this.field4748 - 1);
	}

	public boolean method8101() {
		return this.field4748 == this.field4746;
	}

	public int method8102() {
		return this.field4748 - this.field4746;
	}

	public boolean method8103(Class431 var1) {
		if (2 == this.field4749.field4769) {
			return true;
		} else if (this.field4749.field4769 == 0) {
			return false;
		} else {
			return this.field4749.method8121() != var1;
		}
	}

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

	public Class509 method8105() {
		if (this.method8101()) {
			return new Class509(0, 0);
		} else {
			Class431 var2 = this.field4749.method8120(this.field4748 - 1);
			return new Class509(var2.field4709 + this.method8104(), var2.field4710);
		}
	}

	public Class431 method8106(int var1) {
		return var1 >= 0 && var1 < this.method8102() ? this.field4749.method8120(this.field4746 + var1) : null;
	}
}
