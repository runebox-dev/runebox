import io.runebox.ObfInfo;

@ObfInfo(name = "rp")
public final class Class458 implements Comparable {
	@ObfInfo(name = "al", desc = "Ljava/lang/Object;")
	public Object field4864;
	@ObfInfo(name = "ak", desc = "Ljava/lang/Object;")
	public Object field4866;
	@ObfInfo(name = "az", desc = "J", longMultiplier = -7230775126662755803L)
	public long field4863;
	@ObfInfo(name = "aj", desc = "J", longMultiplier = -1954274935841283343L)
	public long field4865;

	public Class458(Object var1, Object var2) {
		this.field4866 = var1;
		this.field4864 = var2;
	}

	@ObfInfo(name = "ak", desc = "(Lrp;I)I", opaque = "-1017501471")
	public int method8490(Class458 var1) {
		if (this.field4863 < var1.field4863) {
			return -1;
		} else {
			return this.field4863 > var1.field4863 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Class458) {
			return this.field4864.equals(((Class458)var1).field4864);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4864.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method8490((Class458)var1);
	}
}
