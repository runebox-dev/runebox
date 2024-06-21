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

	@ObfInfo(name = "iterator", desc = "()Ljava/util/Iterator;")
	public Iterator iterator() {
		return new Class413(this);
	}

	@ObfInfo(name = "size", desc = "()I")
	public int size() {
		return this.method7644();
	}

	@ObfInfo(name = "isEmpty", desc = "()Z")
	public boolean isEmpty() {
		return this.method7625();
	}

	@ObfInfo(name = "contains", desc = "(Ljava/lang/Object;)Z")
	public boolean contains(Object var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "toArray", desc = "()[Ljava/lang/Object;")
	public Object[] toArray() {
		return this.method7605();
	}

	@ObfInfo(name = "toArray", desc = "([Ljava/lang/Object;)[Ljava/lang/Object;")
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

	@ObfInfo(name = "remove", desc = "(Ljava/lang/Object;)Z")
	public boolean remove(Object var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "containsAll", desc = "(Ljava/util/Collection;)Z")
	public boolean containsAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "addAll", desc = "(Ljava/util/Collection;)Z")
	public boolean addAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "removeAll", desc = "(Ljava/util/Collection;)Z")
	public boolean removeAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "retainAll", desc = "(Ljava/util/Collection;)Z")
	public boolean retainAll(Collection var1) {
		throw new RuntimeException();
	}

	@ObfInfo(name = "clear", desc = "()V")
	public void clear() {
		this.method7596();
	}

	@ObfInfo(name = "add", desc = "(Ljava/lang/Object;)Z")
	public boolean add(Object var1) {
		return this.method7664((Class506)var1);
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		return super.equals(var1);
	}

	@ObfInfo(name = "hashCode", desc = "()I")
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
