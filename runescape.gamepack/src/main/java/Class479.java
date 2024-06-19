import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public abstract class Class479 {
	public Class475[] field4950;
	public int field4949;
	public Comparator field4954;
	public HashMap field4952;
	public HashMap field4953;
	public final int field4951;

	public Class479(int var1) {
		this.field4949 = 0;
		this.field4954 = null;
		this.field4951 = var1;
		this.field4950 = this.method8457(var1);
		this.field4952 = new HashMap(var1 / 8);
		this.field4953 = new HashMap(var1 / 8);
	}

	public abstract Class475 method8483();

	public abstract Class475[] method8457(int var1);

	public void method8730() {
		this.field4949 = 0;
		Arrays.fill(this.field4950, (Object)null);
		this.field4952.clear();
		this.field4953.clear();
	}

	public int method8761() {
		return this.field4949;
	}

	public boolean method8799() {
		return this.field4951 == this.field4949;
	}

	public boolean method8731(Class567 var1) {
		if (!var1.method10262()) {
			return false;
		} else {
			return this.field4952.containsKey(var1) ? true : this.field4953.containsKey(var1);
		}
	}

	public Class475 method8734(Class567 var1) {
		Class475 var3 = this.method8735(var1);
		return var3 != null ? var3 : this.method8777(var1);
	}

	public Class475 method8735(Class567 var1) {
		return !var1.method10262() ? null : (Class475)this.field4952.get(var1);
	}

	public Class475 method8777(Class567 var1) {
		return !var1.method10262() ? null : (Class475)this.field4953.get(var1);
	}

	public final boolean method8737(Class567 var1) {
		Class475 var3 = this.method8735(var1);
		if (var3 == null) {
			return false;
		} else {
			this.method8801(var3);
			return true;
		}
	}

	public final void method8801(Class475 var1) {
		int var3 = this.method8744(var1);
		if (var3 != -1) {
			this.method8733(var3);
			this.method8813(var1);
		}
	}

	public Class475 method8811(Class567 var1) {
		return this.method8762(var1, (Class567)null);
	}

	public Class475 method8762(Class567 var1, Class567 var2) {
		if (this.method8735(var1) != null) {
			throw new IllegalStateException();
		} else {
			Class475 var4 = this.method8483();
			var4.method8692(var1, var2);
			this.method8746(var4);
			this.method8736(var4);
			return var4;
		}
	}

	public final Class475 method8781(int var1) {
		if (var1 >= 0 && var1 < this.field4949) {
			return this.field4950[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	public final void method8742() {
		if (this.field4954 == null) {
			Arrays.sort(this.field4950, 0, this.field4949);
		} else {
			Arrays.sort(this.field4950, 0, this.field4949, this.field4954);
		}

	}

	public final void method8743(Class475 var1, Class567 var2, Class567 var3) {
		this.method8813(var1);
		var1.method8692(var2, var3);
		this.method8736(var1);
	}

	public final int method8744(Class475 var1) {
		for (int var3 = 0; var3 < this.field4949; ++var3) {
			if (var1 == this.field4950[var3]) {
				return var3;
			}
		}

		return -1;
	}

	public final void method8813(Class475 var1) {
		if (this.field4952.remove(var1.field4941) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.field4940 != null) {
				this.field4953.remove(var1.field4940);
			}

		}
	}

	public final void method8746(Class475 var1) {
		this.field4950[++this.field4949 - 1] = var1;
	}

	public final void method8736(Class475 var1) {
		this.field4952.put(var1.field4941, var1);
		if (var1.field4940 != null) {
			Class475 var3 = (Class475)this.field4953.put(var1.field4940, var1);
			if (var3 != null && var3 != var1) {
				var3.field4940 = null;
			}
		}

	}

	public final void method8733(int var1) {
		--this.field4949;
		if (var1 < this.field4949) {
			System.arraycopy(this.field4950, var1 + 1, this.field4950, var1, this.field4949 - var1);
		}

	}

	public final void method8751() {
		this.field4954 = null;
	}

	public final void method8752(Comparator var1) {
		if (this.field4954 == null) {
			this.field4954 = var1;
		} else if (this.field4954 instanceof Class471) {
			((Class471)this.field4954).method8639(var1);
		}

	}
}
