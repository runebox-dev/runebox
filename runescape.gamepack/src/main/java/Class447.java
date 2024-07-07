import io.runebox.ObfInfo;

@ObfInfo(name = "re")
public final class Class447 implements Comparable {
	@ObfInfo(name = "ad", desc = "Ljava/lang/Object;")
	public Object field4837;
	@ObfInfo(name = "aq", desc = "Ljava/lang/Object;")
	public Object field4839;
	@ObfInfo(name = "ag", desc = "J", longMultiplier = -7190560191872217359L)
	public long field4836;
	@ObfInfo(name = "ak", desc = "J", longMultiplier = -7831916633328325349L)
	public long field4838;

	public Class447(Object var1, Object var2) {
		this.field4839 = var1;
		this.field4837 = var2;
	}

	@ObfInfo(name = "aq", desc = "(Lre;I)I", opaque = "-1478240565")
	public int method8292(Class447 var1) {
		if (this.field4838 < var1.field4838) {
			return -1;
		} else {
			return this.field4838 > var1.field4838 ? 1 : 0;
		}
	}

	public boolean equals(Object var1) {
		if (var1 instanceof Class447) {
			return this.field4837.equals(((Class447)var1).field4837);
		} else {
			throw new IllegalArgumentException();
		}
	}

	public int hashCode() {
		return this.field4837.hashCode();
	}

	public int compareTo(Object var1) {
		return this.method8292((Class447)var1);
	}
}
