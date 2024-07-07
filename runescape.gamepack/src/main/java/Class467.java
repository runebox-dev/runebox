import io.runebox.ObfInfo;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(name = "ry")
public final class Class467 {
	@ObfInfo(name = "aj", desc = "Lqc;")
	public final Class419 field4908;
	@ObfInfo(name = "az", desc = "Lqc;")
	public final Class419 field4909;
	@ObfInfo(name = "aa", desc = "Lrq;")
	public final Class459 field4906;
	@ObfInfo(name = "at", desc = "I", intMultiplier = -1362734891)
	public final int field4912;
	@ObfInfo(name = "ak", desc = "Ljava/util/Comparator;")
	public final Comparator field4911;
	@ObfInfo(name = "al", desc = "Ljava/util/Map;")
	public final Map field4907;
	@ObfInfo(name = "af", desc = "J", longMultiplier = -1528853799806805115L)
	public final long field4910;

	public Class467(int var1, Class459 var2) {
		this(-1L, var1, var2);
	}

	public Class467(long var1, int var3, Class459 var4) {
		this.field4911 = new Class455(this);
		this.field4910 = var1;
		this.field4912 = var3;
		this.field4906 = var4;
		if (this.field4912 == -1) {
			this.field4907 = new HashMap(64);
			this.field4908 = new Class419(64, this.field4911);
			this.field4909 = null;
		} else {
			if (this.field4906 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4907 = new HashMap(this.field4912);
			this.field4908 = new Class419(this.field4912, this.field4911);
			this.field4909 = new Class419(this.field4912);
		}

	}

	@ObfInfo(name = "ak", desc = "(I)Z", opaque = "335854974")
	public boolean method8582() {
		return -1 != this.field4912;
	}

	@ObfInfo(name = "al", desc = "(Ljava/lang/Object;I)Ljava/lang/Object;", opaque = "2107973378")
	public Object method8583(Object var1) {
		synchronized(this) {
			if (this.field4910 != -1L) {
				this.method8586();
			}

			Class458 var4 = (Class458)this.field4907.get(var1);
			if (var4 == null) {
				return null;
			} else {
				this.method8596(var4, false);
				return var4.field4866;
			}
		}
	}

	@ObfInfo(name = "aj", desc = "(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;", opaque = "1765908522")
	public Object method8588(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4910) {
				this.method8586();
			}

			Class458 var5 = (Class458)this.field4907.get(var1);
			if (var5 != null) {
				Object var9 = var5.field4866;
				var5.field4866 = var2;
				this.method8596(var5, false);
				return var9;
			} else {
				Class458 var6;
				if (this.method8582() && this.field4907.size() == this.field4912) {
					var6 = (Class458)this.field4909.remove();
					this.field4907.remove(var6.field4864);
					this.field4908.remove(var6);
				}

				var6 = new Class458(var2, var1);
				this.field4907.put(var1, var6);
				this.method8596(var6, true);
				return null;
			}
		}
	}

	@ObfInfo(name = "az", desc = "(Lrp;ZI)V", opaque = "-636042309")
	public void method8596(Class458 var1, boolean var2) {
		if (!var2) {
			this.field4908.remove(var1);
			if (this.method8582() && !this.field4909.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4865 = System.currentTimeMillis();
		if (this.method8582()) {
			switch(this.field4906.field4868) {
			case 0:
				++var1.field4863;
				break;
			case 1:
				var1.field4863 = var1.field4865;
			}

			this.field4909.add(var1);
		}

		this.field4908.add(var1);
	}

	@ObfInfo(name = "af", desc = "(I)V", opaque = "89876578")
	public void method8586() {
		if (-1L == this.field4910) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field4910;

			while (!this.field4908.isEmpty()) {
				Class458 var4 = (Class458)this.field4908.peek();
				if (var4.field4865 >= var2) {
					return;
				}

				this.field4907.remove(var4.field4864);
				this.field4908.remove(var4);
				if (this.method8582()) {
					this.field4909.remove(var4);
				}
			}

		}
	}

	@ObfInfo(name = "aa", desc = "(B)V", opaque = "-1")
	public void method8591() {
		synchronized(this) {
			this.field4907.clear();
			this.field4908.clear();
			if (this.method8582()) {
				this.field4909.clear();
			}

		}
	}
}
