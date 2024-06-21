import io.runebox.ObfInfo;

@ObfInfo(name = "vv")
public class Class567 implements Comparable {
	@ObfInfo(name = "al", desc = "Ljava/lang/String;")
	public String field5477;
	@ObfInfo(name = "ak", desc = "Ljava/lang/String;")
	public String field5478;

	public Class567(String var1) {
		this.field5478 = var1;
		this.field5477 = Class191.method3754(var1, Class544.field5324);
	}

	public Class567(String var1, Class544 var2) {
		this.field5478 = var1;
		this.field5477 = Class191.method3754(var1, var2);
	}

	@ObfInfo(name = "ak", desc = "(I)Ljava/lang/String;")
	public String method10260() {
		return this.field5478;
	}

	@ObfInfo(name = "al", desc = "(B)Ljava/lang/String;")
	public String method10261() {
		return this.field5477;
	}

	@ObfInfo(name = "aa", desc = "(I)Z", opaque = "-1116740903")
	public boolean method10262() {
		return this.field5477 != null;
	}

	@ObfInfo(name = "equals", desc = "(Ljava/lang/Object;)Z")
	public boolean equals(Object var1) {
		if (var1 instanceof Class567) {
			Class567 var2 = (Class567)var1;
			if (this.field5477 == null) {
				return var2.field5477 == null;
			} else if (var2.field5477 == null) {
				return false;
			} else {
				return this.hashCode() != var2.hashCode() ? false : this.field5477.equals(var2.field5477);
			}
		} else {
			return false;
		}
	}

	@ObfInfo(name = "hashCode", desc = "()I")
	public int hashCode() {
		return this.field5477 == null ? 0 : this.field5477.hashCode();
	}

	@ObfInfo(name = "toString", desc = "()Ljava/lang/String;")
	public String toString() {
		return this.method10260();
	}

	@ObfInfo(name = "at", desc = "(Lvv;I)I")
	public int method10275(Class567 var1) {
		if (this.field5477 == null) {
			return var1.field5477 == null ? 0 : 1;
		} else {
			return var1.field5477 == null ? -1 : this.field5477.compareTo(var1.field5477);
		}
	}

	@ObfInfo(name = "compareTo", desc = "(Ljava/lang/Object;)I")
	public int compareTo(Object var1) {
		return this.method10275((Class567)var1);
	}
}
