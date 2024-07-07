import io.runebox.ObfInfo;
import java.util.Collection;
import java.util.Iterator;

@ObfInfo(name = "ps")
public class Class409 implements Iterable, Collection {
	@ObfInfo(name = "ak", desc = "Ltl;")
	public Class506 field4644;
	@ObfInfo(name = "al", desc = "Ltl;")
	public Class506 field4645;

	public Class409() {
		this.field4644 = new Class506();
		this.field4644.field5169 = this.field4644;
		this.field4644.field5171 = this.field4644;
	}

	@ObfInfo(name = "ak", desc = "()V")
	public void method7596() {
		while (this.field4644.field5169 != this.field4644) {
			this.field4644.field5169.method9277();
		}

	}

	@ObfInfo(name = "al", desc = "(Ltl;)V")
	public void method7597(Class506 var1) {
		if (var1.field5171 != null) {
			var1.method9277();
		}

		var1.field5171 = this.field4644.field5171;
		var1.field5169 = this.field4644;
		var1.field5171.field5169 = var1;
		var1.field5169.field5171 = var1;
	}

	@ObfInfo(name = "aj", desc = "(Ltl;)V")
	public void method7609(Class506 var1) {
		if (var1.field5171 != null) {
			var1.method9277();
		}

		var1.field5171 = this.field4644;
		var1.field5169 = this.field4644.field5169;
		var1.field5171.field5169 = var1;
		var1.field5169.field5171 = var1;
	}

	@ObfInfo(name = "af", desc = "()Ltl;")
	public Class506 method7600() {
		return this.method7612((Class506)null);
	}

	@ObfInfo(name = "aa", desc = "(Ltl;)Ltl;")
	public Class506 method7612(Class506 var1) {
		Class506 var2;
		if (var1 == null) {
			var2 = this.field4644.field5169;
		} else {
			var2 = var1;
		}

		if (this.field4644 == var2) {
			this.field4645 = null;
			return null;
		} else {
			this.field4645 = var2.field5169;
			return var2;
		}
	}

	@ObfInfo(name = "at", desc = "()Ltl;")
	public Class506 method7637() {
		Class506 var1 = this.field4645;
		if (this.field4644 == var1) {
			this.field4645 = null;
			return null;
		} else {
			this.field4645 = var1.field5169;
			return var1;
		}
	}

	@ObfInfo(name = "ab", desc = "()I")
	public int method7644() {
		int var1 = 0;

		for (Class506 var2 = this.field4644.field5169; this.field4644 != var2; var2 = var2.field5169) {
			++var1;
		}

		return var1;
	}

	@ObfInfo(name = "ac", desc = "()Z")
	public boolean method7625() {
		return this.field4644.field5169 == this.field4644;
	}

	@ObfInfo(name = "ao", desc = "()[Ltl;")
	public Class506[] method7605() {
		Class506[] var1 = new Class506[this.method7644()];
		int var2 = 0;

		for (Class506 var3 = this.field4644.field5169; this.field4644 != var3; var3 = var3.field5169) {
			var1[var2++] = var3;
		}

		return var1;
	}

	public Iterator iterator() {
		return new Class413(this);
	}

	public int size() {
		return this.method7644();
	}

	public boolean isEmpty() {
		return this.method7625();
	}

	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method7605();
	}

	public Object[] toArray(Object[] var1) {
		int var2 = 0;

		for (Class506 var3 = this.field4644.field5169; this.field4644 != var3; var3 = var3.field5169) {
			var1[var2++] = var3;
		}

		return var1;
	}

	@ObfInfo(name = "ah", desc = "(Ltl;)Z")
	public boolean method7664(Class506 var1) {
		this.method7597(var1);
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
		this.method7596();
	}

	public boolean add(Object var1) {
		return this.method7664((Class506)var1);
	}

	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	public int hashCode() {
		return super.hashCode();
	}

	@ObfInfo(name = "az", desc = "(Ltl;Ltl;)V")
	public static void method7599(Class506 var0, Class506 var1) {
		if (var0.field5171 != null) {
			var0.method9277();
		}

		var0.field5171 = var1;
		var0.field5169 = var1.field5169;
		var0.field5171.field5169 = var0;
		var0.field5169.field5171 = var0;
	}
}
