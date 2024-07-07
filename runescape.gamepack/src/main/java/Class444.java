import io.runebox.ObfInfo;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfInfo(name = "rb")
public final class Class444 {
	@ObfInfo(name = "ag", desc = "Lqq;")
	public final Class433 field4809;
	@ObfInfo(name = "ak", desc = "Lqq;")
	public final Class433 field4810;
	@ObfInfo(name = "an", desc = "Lrd;")
	public final Class446 field4812;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 2114201521)
	public final int field4813;
	@ObfInfo(name = "aq", desc = "Ljava/util/Comparator;")
	public final Comparator field4811;
	@ObfInfo(name = "ad", desc = "Ljava/util/Map;")
	public final Map field4808;
	@ObfInfo(name = "ap", desc = "J", longMultiplier = -5794576060614590681L)
	public final long field4807;

	public Class444(int var1, Class446 var2) {
		this(-1L, var1, var2);
	}

	public Class444(long var1, int var3, Class446 var4) {
		this.field4811 = new Class448(this);
		this.field4807 = var1;
		this.field4813 = var3;
		this.field4812 = var4;
		if (-1 == this.field4813) {
			this.field4808 = new HashMap(64);
			this.field4809 = new Class433(64, this.field4811);
			this.field4810 = null;
		} else {
			if (this.field4812 == null) {
				throw new IllegalArgumentException("");
			}

			this.field4808 = new HashMap(this.field4813);
			this.field4809 = new Class433(this.field4813, this.field4811);
			this.field4810 = new Class433(this.field4813);
		}

	}

	@ObfInfo(name = "aq", desc = "(I)Z", opaque = "-1543734160")
	public boolean method8272() {
		return -1 != this.field4813;
	}

	@ObfInfo(name = "ad", desc = "(Ljava/lang/Object;B)Ljava/lang/Object;", opaque = "6")
	public Object method8261(Object var1) {
		synchronized(this) {
			if (this.field4807 != -1L) {
				this.method8276();
			}

			Class447 var4 = (Class447)this.field4808.get(var1);
			if (var4 == null) {
				return null;
			} else {
				this.method8263(var4, false);
				return var4.field4839;
			}
		}
	}

	@ObfInfo(name = "ag", desc = "(Ljava/lang/Object;Ljava/lang/Object;B)Ljava/lang/Object;", opaque = "1")
	public Object method8262(Object var1, Object var2) {
		synchronized(this) {
			if (-1L != this.field4807) {
				this.method8276();
			}

			Class447 var5 = (Class447)this.field4808.get(var1);
			if (var5 != null) {
				Object var9 = var5.field4839;
				var5.field4839 = var2;
				this.method8263(var5, false);
				return var9;
			} else {
				Class447 var6;
				if (this.method8272() && this.field4808.size() == this.field4813) {
					var6 = (Class447)this.field4810.remove();
					this.field4808.remove(var6.field4837);
					this.field4809.remove(var6);
				}

				var6 = new Class447(var2, var1);
				this.field4808.put(var1, var6);
				this.method8263(var6, true);
				return null;
			}
		}
	}

	@ObfInfo(name = "ak", desc = "(Lre;ZI)V", opaque = "-724193621")
	public void method8263(Class447 var1, boolean var2) {
		if (!var2) {
			this.field4809.remove(var1);
			if (this.method8272() && !this.field4810.remove(var1)) {
				throw new IllegalStateException("");
			}
		}

		var1.field4836 = System.currentTimeMillis();
		if (this.method8272()) {
			switch(this.field4812.field4833) {
			case 0:
				var1.field4838 = var1.field4836;
				break;
			case 1:
				++var1.field4838;
			}

			this.field4810.add(var1);
		}

		this.field4809.add(var1);
	}

	@ObfInfo(name = "ap", desc = "(B)V", opaque = "8")
	public void method8276() {
		if (-1L == this.field4807) {
			throw new IllegalStateException("");
		} else {
			long var2 = System.currentTimeMillis() - this.field4807;

			while (!this.field4809.isEmpty()) {
				Class447 var4 = (Class447)this.field4809.peek();
				if (var4.field4836 >= var2) {
					return;
				}

				this.field4808.remove(var4.field4837);
				this.field4809.remove(var4);
				if (this.method8272()) {
					this.field4810.remove(var4);
				}
			}

		}
	}

	@ObfInfo(name = "an", desc = "(B)V", opaque = "8")
	public void method8264() {
		synchronized(this) {
			this.field4808.clear();
			this.field4809.clear();
			if (this.method8272()) {
				this.field4810.clear();
			}

		}
	}
}
