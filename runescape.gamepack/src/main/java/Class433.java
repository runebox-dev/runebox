import io.runebox.ObfInfo;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfInfo(name = "qq")
public class Class433 extends AbstractQueue {
	@ObfInfo(name = "aq", desc = "[Lqn;")
	public Class430[] field4749;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 1209740451)
	public int field4751;
	@ObfInfo(name = "ap", desc = "I", intMultiplier = -628628359)
	public int field4753;
	@ObfInfo(name = "ad", desc = "Ljava/util/Map;")
	public Map field4750;
	@ObfInfo(name = "ak", desc = "Ljava/util/Comparator;")
	public final Comparator field4752;

	public Class433(int var1) {
		this(var1, (Comparator)null);
	}

	public Class433(int var1, Comparator var2) {
		this.field4753 = 0;
		this.field4749 = new Class430[var1];
		this.field4750 = new HashMap();
		this.field4752 = var2;
	}

	@ObfInfo(name = "aq", desc = "(I)V")
	public void method8041() {
		int var2 = (this.field4749.length << 1) + 1;
		this.field4749 = (Class430[])((Class430[])Arrays.copyOf(this.field4749, var2));
	}

	public int size() {
		return this.field4751;
	}

	public boolean offer(Object var1) {
		if (this.field4750.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4753;
			int var2 = this.field4751;
			if (var2 >= this.field4749.length) {
				this.method8041();
			}

			++this.field4751;
			if (var2 == 0) {
				this.field4749[0] = new Class430(var1, 0);
				this.field4750.put(var1, this.field4749[0]);
			} else {
				this.field4749[var2] = new Class430(var1, var2);
				this.field4750.put(var1, this.field4749[var2]);
				this.method8044(var2);
			}

			return true;
		}
	}

	public Object peek() {
		return this.field4751 == 0 ? null : this.field4749[0].field4741;
	}

	public Object poll() {
		if (this.field4751 == 0) {
			return null;
		} else {
			++this.field4753;
			Object var1 = this.field4749[0].field4741;
			this.field4750.remove(var1);
			--this.field4751;
			if (this.field4751 == 0) {
				this.field4749[this.field4751] = null;
			} else {
				this.field4749[0] = this.field4749[this.field4751];
				this.field4749[0].field4738 = 0;
				this.field4749[this.field4751] = null;
				this.method8045(0);
			}

			return var1;
		}
	}

	public boolean remove(Object var1) {
		Class430 var2 = (Class430)this.field4750.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4753;
			--this.field4751;
			if (this.field4751 == var2.field4738) {
				this.field4749[this.field4751] = null;
				return true;
			} else {
				Class430 var3 = this.field4749[this.field4751];
				this.field4749[this.field4751] = null;
				this.field4749[var2.field4738] = var3;
				this.field4749[var2.field4738].field4738 = var2.field4738;
				this.method8045(var2.field4738);
				if (this.field4749[var2.field4738] == var3) {
					this.method8044(var2.field4738);
				}

				return true;
			}
		}
	}

	@ObfInfo(name = "ad", desc = "(IB)V", opaque = "1")
	public void method8044(int var1) {
		Class430 var3;
		int var4;
		for (var3 = this.field4749[var1]; var1 > 0; var1 = var4) {
			var4 = var1 - 1 >>> 1;
			Class430 var5 = this.field4749[var4];
			if (this.field4752 != null) {
				if (this.field4752.compare(var3.field4741, var5.field4741) >= 0) {
					break;
				}
			} else if (((Comparable)var3.field4741).compareTo(var5.field4741) >= 0) {
				break;
			}

			this.field4749[var1] = var5;
			this.field4749[var1].field4738 = var1;
		}

		this.field4749[var1] = var3;
		this.field4749[var1].field4738 = var1;
	}

	@ObfInfo(name = "ag", desc = "(IB)V", opaque = "0")
	public void method8045(int var1) {
		Class430 var3 = this.field4749[var1];

		int var9;
		for (int var4 = this.field4751 >>> 1; var1 < var4; var1 = var9) {
			int var5 = (var1 << 1) + 1;
			Class430 var6 = this.field4749[var5];
			int var7 = (var1 << 1) + 2;
			Class430 var8 = this.field4749[var7];
			if (this.field4752 != null) {
				if (var7 < this.field4751 && this.field4752.compare(var6.field4741, var8.field4741) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.field4751 && ((Comparable)var6.field4741).compareTo(var8.field4741) > 0) {
				var9 = var7;
			} else {
				var9 = var5;
			}

			if (this.field4752 != null) {
				if (this.field4752.compare(var3.field4741, this.field4749[var9].field4741) <= 0) {
					break;
				}
			} else if (((Comparable)var3.field4741).compareTo(this.field4749[var9].field4741) <= 0) {
				break;
			}

			this.field4749[var1] = this.field4749[var9];
			this.field4749[var1].field4738 = var1;
		}

		this.field4749[var1] = var3;
		this.field4749[var1].field4738 = var1;
	}

	public boolean contains(Object var1) {
		return this.field4750.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4752 != null) {
			Arrays.sort(var1, this.field4752);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new Class419(this);
	}
}
