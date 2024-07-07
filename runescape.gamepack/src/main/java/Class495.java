import io.runebox.ObfInfo;
import java.util.Iterator;

@ObfInfo(name = "ta")
public class Class495 implements Iterator {
	@ObfInfo(name = "az", desc = "Ltl;")
	public Class506 field5016;
	@ObfInfo(name = "al", desc = "Ltl;")
	public Class506 field5019;
	@ObfInfo(name = "ak", desc = "Ltu;")
	public Class515 field5017;
	@ObfInfo(name = "aj", desc = "I")
	public int field5018;

	public Class495(Class515 var1) {
		this.field5016 = null;
		this.field5017 = var1;
		this.method8969();
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method8969() {
		this.field5019 = this.field5017.field5198[0].field5169;
		this.field5018 = 1;
		this.field5016 = null;
	}

	@ObfInfo(name = "al", desc = "()Ltl;")
	public Class506 method8982() {
		this.method8969();
		return (Class506)this.next();
	}

	public Object next() {
		Class506 var1;
		if (this.field5019 != this.field5017.field5198[this.field5018 - 1]) {
			var1 = this.field5019;
			this.field5019 = var1.field5169;
			this.field5016 = var1;
			return var1;
		} else {
			do {
				if (this.field5018 >= this.field5017.field5195) {
					return null;
				}

				var1 = this.field5017.field5198[this.field5018++].field5169;
			} while(var1 == this.field5017.field5198[this.field5018 - 1]);

			this.field5019 = var1.field5169;
			this.field5016 = var1;
			return var1;
		}
	}

	public boolean hasNext() {
		if (this.field5019 != this.field5017.field5198[this.field5018 - 1]) {
			return true;
		} else {
			while (this.field5018 < this.field5017.field5195) {
				if (this.field5017.field5198[this.field5018++].field5169 != this.field5017.field5198[this.field5018 - 1]) {
					this.field5019 = this.field5017.field5198[this.field5018 - 1].field5169;
					return true;
				}

				this.field5019 = this.field5017.field5198[this.field5018 - 1];
			}

			return false;
		}
	}

	public void remove() {
		if (this.field5016 == null) {
			throw new IllegalStateException();
		} else {
			this.field5016.method9277();
			this.field5016 = null;
		}
	}
}
