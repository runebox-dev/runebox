import io.runebox.ObfInfo;
import java.util.Collection;
import java.util.Iterator;

@ObfInfo(name = "pi")
public class Class399 implements Iterable, Collection {
	@ObfInfo(name = "ad", desc = "Ltz;")
	public Class520 field4619;
	@ObfInfo(name = "aq", desc = "Ltz;")
	public Class520 field4620;

	public Class399() {
		this.field4620 = new Class520();
		this.field4620.field5235 = this.field4620;
		this.field4620.field5233 = this.field4620;
	}

	@ObfInfo(name = "aq", desc = "()V")
	public void method7397() {
		while (this.field4620.field5235 != this.field4620) {
			this.field4620.field5235.method9267();
		}

	}

	@ObfInfo(name = "ad", desc = "(Ltz;)V")
	public void method7449(Class520 var1) {
		if (var1.field5233 != null) {
			var1.method9267();
		}

		var1.field5233 = this.field4620.field5233;
		var1.field5235 = this.field4620;
		var1.field5233.field5235 = var1;
		var1.field5235.field5233 = var1;
	}

	@ObfInfo(name = "ag", desc = "(Ltz;)V")
	public void method7399(Class520 var1) {
		if (var1.field5233 != null) {
			var1.method9267();
		}

		var1.field5233 = this.field4620;
		var1.field5235 = this.field4620.field5235;
		var1.field5233.field5235 = var1;
		var1.field5235.field5233 = var1;
	}

	@ObfInfo(name = "ap", desc = "()Ltz;")
	public Class520 method7401() {
		return this.method7416((Class520)null);
	}

	@ObfInfo(name = "an", desc = "(Ltz;)Ltz;")
	public Class520 method7416(Class520 var1) {
		Class520 var2;
		if (var1 == null) {
			var2 = this.field4620.field5235;
		} else {
			var2 = var1;
		}

		if (this.field4620 == var2) {
			this.field4619 = null;
			return null;
		} else {
			this.field4619 = var2.field5235;
			return var2;
		}
	}

	@ObfInfo(name = "aj", desc = "()Ltz;")
	public Class520 method7403() {
		Class520 var1 = this.field4619;
		if (this.field4620 == var1) {
			this.field4619 = null;
			return null;
		} else {
			this.field4619 = var1.field5235;
			return var1;
		}
	}

	@ObfInfo(name = "av", desc = "()I")
	public int method7443() {
		int var1 = 0;

		for (Class520 var2 = this.field4620.field5235; this.field4620 != var2; var2 = var2.field5235) {
			++var1;
		}

		return var1;
	}

	@ObfInfo(name = "ab", desc = "()Z")
	public boolean method7398() {
		return this.field4620.field5235 == this.field4620;
	}

	@ObfInfo(name = "ai", desc = "()[Ltz;")
	public Class520[] method7402() {
		Class520[] var1 = new Class520[this.method7443()];
		int var2 = 0;

		for (Class520 var3 = this.field4620.field5235; this.field4620 != var3; var3 = var3.field5235) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public Iterator iterator() {
		return new Class397(this);
	}

	public int size() {
		return this.method7443();
	}

	public boolean isEmpty() {
		return this.method7398();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method7402();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Class520 var3 = this.field4620.field5235; this.field4620 != var3; var3 = var3.field5235) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfInfo(name = "ae", desc = "(Ltz;)Z")
	public boolean method7430(Class520 var1) {
		this.method7449(var1);
		return true;
	}

	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	public void clear() {
		this.method7397();
	}

	public boolean add(Object var1) {
		return this.method7430((Class520)var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	@ObfInfo(name = "ak", desc = "(Ltz;Ltz;)V")
	public static void method7428(Class520 var0, Class520 var1) {
		if (var0.field5233 != null) {
			var0.method9267();
		}

		var0.field5233 = var1;
		var0.field5235 = var1.field5235;
		var0.field5233.field5235 = var0;
		var0.field5235.field5233 = var0;
	}
}
