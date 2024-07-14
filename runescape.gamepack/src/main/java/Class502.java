import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "th")
public final class Class502 implements Iterable {
	@ObfInfo(name = "ak", desc = "Ltz;")
	public Class520 field5073;
	@ObfInfo(name = "ag", desc = "Ltz;")
	public Class520 field5075;
	@ObfInfo(name = "ad", desc = "[Ltz;")
	public Class520[] field5074;
	@ObfInfo(name = "aq", desc = "I")
	public int field5076;
	@ObfInfo(name = "ap", desc = "I")
	public int field5077;

	public Class502(int var1) {
		this.field5077 = 0;
		this.field5076 = var1;
		this.field5074 = new Class520[var1];

		for (int var2 = 0; var2 < var1; ++var2) {
			Class520 var3 = this.field5074[var2] = new Class520();
			var3.field5235 = var3;
			var3.field5233 = var3;
		}

	}

	@ObfInfo(name = "aq", desc = "(J)Ltz;")
	public Class520 method8901(long var1) {
		Class520 var3 = this.field5074[(int)(var1 & (long)(this.field5076 - 1))];

		for (this.field5075 = var3.field5235; this.field5075 != var3; this.field5075 = this.field5075.field5235) {
			if (this.field5075.field5234 == var1) {
				Class520 var4 = this.field5075;
				this.field5075 = this.field5075.field5235;
				return var4;
			}
		}

		this.field5075 = null;
		return null;
	}

	@ObfInfo(name = "ad", desc = "(Ltz;J)V")
	public void method8902(Class520 var1, long var2) {
		if (var1.field5233 != null) {
			var1.method9267();
		}

		Class520 var4 = this.field5074[(int)(var2 & (long)(this.field5076 - 1))];
		var1.field5233 = var4.field5233;
		var1.field5235 = var4;
		var1.field5233.field5235 = var1;
		var1.field5235.field5233 = var1;
		var1.field5234 = var2;
	}

	@ObfInfo(name = "ag", desc = "()V")
	public void method8903() {
		for (int var1 = 0; var1 < this.field5076; ++var1) {
			Class520 var2 = this.field5074[var1];

			while (true) {
				Class520 var3 = var2.field5235;
				if (var2 == var3) {
					break;
				}

				var3.method9267();
			}
		}

		this.field5075 = null;
		this.field5073 = null;
	}

	@ObfInfo(name = "ak", desc = "()Ltz;")
	public Class520 method8900() {
		this.field5077 = 0;
		return this.method8905();
	}

	@ObfInfo(name = "ap", desc = "()Ltz;")
	public Class520 method8905() {
		Class520 var1;
		if (this.field5077 > 0 && this.field5074[this.field5077 - 1] != this.field5073) {
			var1 = this.field5073;
			this.field5073 = var1.field5235;
			return var1;
		} else {
			do {
				if (this.field5077 >= this.field5076) {
					return null;
				}

				var1 = this.field5074[this.field5077++].field5235;
			} while(this.field5074[this.field5077 - 1] == var1);

			this.field5073 = var1.field5235;
			return var1;
		}
	}

	public Iterator iterator() {
		return new Class509(this);
	}
}
