import io.runebox.ObfInfo;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

@ObfInfo(name = "sc")
public abstract class Class471 {
	@ObfInfo(name = "ae", desc = "[Lsk;")
	public Class479[] field4953;
	@ObfInfo(name = "ai", desc = "I", intMultiplier = -855604593)
	public int field4950;
	@ObfInfo(name = "az", desc = "Ljava/util/Comparator;")
	public Comparator field4952;
	@ObfInfo(name = "au", desc = "Ljava/util/HashMap;")
	public HashMap field4951;
	@ObfInfo(name = "ah", desc = "Ljava/util/HashMap;")
	public HashMap field4954;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = -1875806315)
	public final int field4955;

	public Class471(int var1) {
		this.field4950 = 0;
		this.field4952 = null;
		this.field4955 = var1;
		this.field4953 = this.method8343(var1);
		this.field4951 = new HashMap(var1 / 8);
		this.field4954 = new HashMap(var1 / 8);
	}

	@ObfInfo(name = "aq", desc = "(B)Lsk;")
	public abstract Class479 method8342();

	@ObfInfo(name = "ad", desc = "(II)[Lsk;")
	public abstract Class479[] method8343(int var1);

	@ObfInfo(name = "bu", desc = "(I)V")
	public void method8552() {
		this.field4950 = 0;
		Arrays.fill(this.field4953, (Object)null);
		this.field4951.clear();
		this.field4954.clear();
	}

	@ObfInfo(name = "by", desc = "(S)I")
	public int method8582() {
		return this.field4950;
	}

	@ObfInfo(name = "bw", desc = "(I)Z", opaque = "-743118512")
	public boolean method8554() {
		return this.field4955 == this.field4950;
	}

	@ObfInfo(name = "bl", desc = "(Lvo;B)Z", opaque = "1")
	public boolean method8555(Class561 var1) {
		if (!var1.method9801()) {
			return false;
		} else {
			return this.field4951.containsKey(var1) ? true : this.field4954.containsKey(var1);
		}
	}

	@ObfInfo(name = "bc", desc = "(Lvo;B)Lsk;", opaque = "63")
	public Class479 method8556(Class561 var1) {
		Class479 var3 = this.method8578(var1);
		return var3 != null ? var3 : this.method8594(var1);
	}

	@ObfInfo(name = "bv", desc = "(Lvo;B)Lsk;", opaque = "0")
	public Class479 method8578(Class561 var1) {
		return !var1.method9801() ? null : (Class479)this.field4951.get(var1);
	}

	@ObfInfo(name = "bb", desc = "(Lvo;I)Lsk;", opaque = "-1415859582")
	public Class479 method8594(Class561 var1) {
		return !var1.method9801() ? null : (Class479)this.field4954.get(var1);
	}

	@ObfInfo(name = "bn", desc = "(Lvo;I)Z", opaque = "-1636801077")
	public final boolean method8614(Class561 var1) {
		Class479 var3 = this.method8578(var1);
		if (var3 == null) {
			return false;
		} else {
			this.method8560(var3);
			return true;
		}
	}

	@ObfInfo(name = "bh", desc = "(Lsk;S)V", opaque = "3179")
	public final void method8560(Class479 var1) {
		int var3 = this.method8566(var1);
		if (var3 != -1) {
			this.method8577(var3);
			this.method8567(var1);
		}
	}

	@ObfInfo(name = "bq", desc = "(Lvo;I)Lsk;")
	public Class479 method8593(Class561 var1) {
		return this.method8562(var1, (Class561)null);
	}

	@ObfInfo(name = "bd", desc = "(Lvo;Lvo;I)Lsk;")
	public Class479 method8562(Class561 var1, Class561 var2) {
		if (this.method8578(var1) != null) {
			throw new IllegalStateException();
		} else {
			Class479 var4 = this.method8342();
			var4.method8696(var1, var2);
			this.method8615(var4);
			this.method8569(var4);
			return var4;
		}
	}

	@ObfInfo(name = "bz", desc = "(II)Lsk;", opaque = "-509952393")
	public final Class479 method8563(int var1) {
		if (var1 >= 0 && var1 < this.field4950) {
			return this.field4953[var1];
		} else {
			throw new ArrayIndexOutOfBoundsException(var1);
		}
	}

	@ObfInfo(name = "bk", desc = "(B)V", opaque = "-1")
	public final void method8564() {
		if (this.field4952 == null) {
			Arrays.sort(this.field4953, 0, this.field4950);
		} else {
			Arrays.sort(this.field4953, 0, this.field4950, this.field4952);
		}

	}

	@ObfInfo(name = "br", desc = "(Lsk;Lvo;Lvo;I)V")
	public final void method8565(Class479 var1, Class561 var2, Class561 var3) {
		this.method8567(var1);
		var1.method8696(var2, var3);
		this.method8569(var1);
	}

	@ObfInfo(name = "bf", desc = "(Lsk;I)I", opaque = "172274532")
	public final int method8566(Class479 var1) {
		for (int var3 = 0; var3 < this.field4950; ++var3) {
			if (this.field4953[var3] == var1) {
				return var3;
			}
		}

		return -1;
	}

	@ObfInfo(name = "cf", desc = "(Lsk;I)V", opaque = "-770712100")
	public final void method8567(Class479 var1) {
		if (this.field4951.remove(var1.field4983) == null) {
			throw new IllegalStateException();
		} else {
			if (var1.field4982 != null) {
				this.field4954.remove(var1.field4982);
			}

		}
	}

	@ObfInfo(name = "cv", desc = "(Lsk;I)V")
	public final void method8615(Class479 var1) {
		this.field4953[++this.field4950 - 1] = var1;
	}

	@ObfInfo(name = "cl", desc = "(Lsk;I)V", opaque = "-529505783")
	public final void method8569(Class479 var1) {
		this.field4951.put(var1.field4983, var1);
		if (var1.field4982 != null) {
			Class479 var3 = (Class479)this.field4954.put(var1.field4982, var1);
			if (var3 != null && var1 != var3) {
				var3.field4982 = null;
			}
		}

	}

	@ObfInfo(name = "cm", desc = "(II)V", opaque = "563878383")
	public final void method8577(int var1) {
		--this.field4950;
		if (var1 < this.field4950) {
			System.arraycopy(this.field4953, var1 + 1, this.field4953, var1, this.field4950 - var1);
		}

	}

	@ObfInfo(name = "cg", desc = "(I)V")
	public final void method8573() {
		this.field4952 = null;
	}

	@ObfInfo(name = "cu", desc = "(Ljava/util/Comparator;B)V", opaque = "3")
	public final void method8604(Comparator var1) {
		if (this.field4952 == null) {
			this.field4952 = var1;
		} else if (this.field4952 instanceof Class475) {
			((Class475)this.field4952).method8666(var1);
		}

	}
}
