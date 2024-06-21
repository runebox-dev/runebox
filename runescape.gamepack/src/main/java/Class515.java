import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "tu")
public final class Class515 implements Iterable {
	@ObfInfo(name = "aj", desc = "Ltl;")
	public Class506 field5196;
	@ObfInfo(name = "az", desc = "Ltl;")
	public Class506 field5197;
	@ObfInfo(name = "al", desc = "[Ltl;")
	public Class506[] field5198;
	@ObfInfo(name = "af", desc = "I")
	public int field5194;
	@ObfInfo(name = "ak", desc = "I")
	public int field5195;

	public Class515(int var1) {
		this.field5194 = 0;
		this.field5195 = var1;
		this.field5198 = new Class506[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			Class506 var3 = this.field5198[var2] = new Class506();
			var3.field5169 = var3;
			var3.field5171 = var3;
		}

	}

	@ObfInfo(name = "ak", desc = "(J)Ltl;")
	public Class506 method9326(long var1) {
		Class506 var3 = this.field5198[(int)(var1 & (long)(this.field5195 - 1))];

		for (this.field5196 = var3.field5169; this.field5196 != var3; this.field5196 = this.field5196.field5169) {
			if (this.field5196.field5170 == var1) {
				Class506 var4 = this.field5196;
				this.field5196 = this.field5196.field5169;
				return var4;
			}
		}

		this.field5196 = null;
		return null;
	}

	@ObfInfo(name = "al", desc = "(Ltl;J)V")
	public void method9333(Class506 var1, long var2) {
		if (var1.field5171 != null) {
			var1.method9277();
		}

		Class506 var4 = this.field5198[(int)(var2 & (long)(this.field5195 - 1))];
		var1.field5171 = var4.field5171;
		var1.field5169 = var4;
		var1.field5171.field5169 = var1;
		var1.field5169.field5171 = var1;
		var1.field5170 = var2;
	}

	@ObfInfo(name = "aj", desc = "()V")
	public void method9328() {
		for (int var1 = 0; var1 < this.field5195; ++var1) {
			Class506 var2 = this.field5198[var1];

			while (true) {
				Class506 var3 = var2.field5169;
				if (var3 == var2) {
					break;
				}

				var3.method9277();
			}
		}

		this.field5196 = null;
		this.field5197 = null;
	}

	@ObfInfo(name = "az", desc = "()Ltl;")
	public Class506 method9329() {
		this.field5194 = 0;
		return this.method9327();
	}

	@ObfInfo(name = "af", desc = "()Ltl;")
	public Class506 method9327() {
		Class506 var1;
		if (this.field5194 > 0 && this.field5197 != this.field5198[this.field5194 - 1]) {
			var1 = this.field5197;
			this.field5197 = var1.field5169;
			return var1;
		} else {
			do {
				if (this.field5194 >= this.field5195) {
					return null;
				}

				var1 = this.field5198[this.field5194++].field5169;
			} while(var1 == this.field5198[this.field5194 - 1]);

			this.field5197 = var1.field5169;
			return var1;
		}
	}

	@ObfInfo(name = "iterator", desc = "()Ljava/util/Iterator;")
	public Iterator iterator() {
		return new Class495(this);
	}
}
