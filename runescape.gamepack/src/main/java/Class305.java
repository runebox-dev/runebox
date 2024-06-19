public abstract class Class305 {
	public int field3229;
	public int field3231;
	public final Class348 field3230;
	public final Class348 field3235;

	public Class305(Class348 var1, Class348 var2) {
		this.field3230 = var1;
		this.field3235 = var2;
	}

	public abstract Class294 method5744();

	public abstract int method5728();

	public abstract int method5731();

	public abstract int method5732();

	public boolean method6144(int var1, int var2) {
		if (this.method6127(var1, var2)) {
			return true;
		} else {
			return this.method6125(var1, var2);
		}
	}

	public boolean method6119() {
		return this.method5728() >= 0;
	}

	public boolean method6127(int var1, int var2) {
		if (!this.method6119()) {
			return false;
		} else {
			Class200 var4 = Class200.method3917(this.method5728());
			int var5 = this.method5732();
			int var6 = this.method5731();
			switch(var4.field2049.field1923) {
			case 0:
				if (var1 < this.field3229 - var5 / 2 || var1 > this.field3229 + var5 / 2) {
					return false;
				}
				break;
			case 1:
				if (var1 < this.field3229 || var1 >= var5 + this.field3229) {
					return false;
				}
				break;
			case 2:
				if (var1 <= this.field3229 - var5 || var1 > this.field3229) {
					return false;
				}
			}

			switch(var4.field2059.field2159) {
			case 0:
				if (var2 < this.field3231 - var6 / 2 || var2 > var6 / 2 + this.field3231) {
					return false;
				}
				break;
			case 1:
				if (var2 >= this.field3231 && var2 < var6 + this.field3231) {
					break;
				}

				return false;
			case 2:
				if (var2 <= this.field3231 - var6 || var2 > this.field3231) {
					return false;
				}
			}

			return true;
		}
	}

	public boolean method6125(int var1, int var2) {
		Class294 var4 = this.method5744();
		if (var4 == null) {
			return false;
		} else if (var1 >= this.field3229 - var4.field3172 / 2 && var1 <= var4.field3172 / 2 + this.field3229) {
			return var2 >= this.field3231 && var2 <= this.field3231 + var4.field3174;
		} else {
			return false;
		}
	}
}
