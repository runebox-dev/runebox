import io.runebox.ObfInfo;
import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfInfo(name = "qc")
public class Class419 extends AbstractQueue {
	@ObfInfo(name = "ak", desc = "[Lqq;")
	public Class433[] field4671;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 2142862631)
	public int field4669;
	@ObfInfo(name = "af", desc = "I", intMultiplier = -2033455181)
	public int field4670;
	@ObfInfo(name = "al", desc = "Ljava/util/Map;")
	public Map field4668;
	@ObfInfo(name = "az", desc = "Ljava/util/Comparator;")
	public final Comparator field4667;

	public Class419(int var1) {
		this(var1, (Comparator)null);
	}

	public Class419(int var1, Comparator var2) {
		this.field4670 = 0;
		this.field4671 = new Class433[var1];
		this.field4668 = new HashMap();
		this.field4667 = var2;
	}

	@ObfInfo(name = "ak", desc = "(B)V")
	public void method7782() {
		int var2 = (this.field4671.length << 1) + 1;
		this.field4671 = (Class433[])((Class433[])Arrays.copyOf(this.field4671, var2));
	}

	public int size() {
		return this.field4669;
	}

	public boolean offer(Object var1) {
		if (this.field4668.containsKey(var1)) {
			throw new IllegalArgumentException("");
		} else {
			++this.field4670;
			int var2 = this.field4669;
			if (var2 >= this.field4671.length) {
				this.method7782();
			}

			++this.field4669;
			if (var2 == 0) {
				this.field4671[0] = new Class433(var1, 0);
				this.field4668.put(var1, this.field4671[0]);
			} else {
				this.field4671[var2] = new Class433(var1, var2);
				this.field4668.put(var1, this.field4671[var2]);
				this.method7798(var2);
			}

			return true;
		}
	}

	public Object peek() {
		return 0 == this.field4669 ? null : this.field4671[0].field4714;
	}

	public Object poll() {
		if (this.field4669 == 0) {
			return null;
		} else {
			++this.field4670;
			Object var1 = this.field4671[0].field4714;
			this.field4668.remove(var1);
			--this.field4669;
			if (this.field4669 == 0) {
				this.field4671[this.field4669] = null;
			} else {
				this.field4671[0] = this.field4671[this.field4669];
				this.field4671[0].field4715 = 0;
				this.field4671[this.field4669] = null;
				this.method7789(0);
			}

			return var1;
		}
	}

	public boolean remove(Object var1) {
		Class433 var2 = (Class433)this.field4668.remove(var1);
		if (var2 == null) {
			return false;
		} else {
			++this.field4670;
			--this.field4669;
			if (this.field4669 == var2.field4715) {
				this.field4671[this.field4669] = null;
				return true;
			} else {
				Class433 var3 = this.field4671[this.field4669];
				this.field4671[this.field4669] = null;
				this.field4671[var2.field4715] = var3;
				this.field4671[var2.field4715].field4715 = var2.field4715;
				this.method7789(var2.field4715);
				if (var3 == this.field4671[var2.field4715]) {
					this.method7798(var2.field4715);
				}

				return true;
			}
		}
	}

	@ObfInfo(name = "al", desc = "(IB)V", opaque = "0")
	public void method7798(int var1) {
		Class433 var3;
		int var4;
		for (var3 = this.field4671[var1]; var1 > 0; var1 = var4) {
			var4 = var1 - 1 >>> 1;
			Class433 var5 = this.field4671[var4];
			if (this.field4667 != null) {
				if (this.field4667.compare(var3.field4714, var5.field4714) >= 0) {
					break;
				}
			} else if (((Comparable)var3.field4714).compareTo(var5.field4714) >= 0) {
				break;
			}

			this.field4671[var1] = var5;
			this.field4671[var1].field4715 = var1;
		}

		this.field4671[var1] = var3;
		this.field4671[var1].field4715 = var1;
	}

	@ObfInfo(name = "aj", desc = "(II)V", opaque = "-2079494242")
	public void method7789(int var1) {
		Class433 var3 = this.field4671[var1];

		int var9;
		for (int var4 = this.field4669 >>> 1; var1 < var4; var1 = var9) {
			int var5 = 1 + (var1 << 1);
			Class433 var6 = this.field4671[var5];
			int var7 = 2 + (var1 << 1);
			Class433 var8 = this.field4671[var7];
			if (this.field4667 != null) {
				if (var7 < this.field4669 && this.field4667.compare(var6.field4714, var8.field4714) > 0) {
					var9 = var7;
				} else {
					var9 = var5;
				}
			} else if (var7 < this.field4669 && ((Comparable)var6.field4714).compareTo(var8.field4714) > 0) {
				var9 = var7;
			} else {
				var9 = var5;
			}

			if (this.field4667 != null) {
				if (this.field4667.compare(var3.field4714, this.field4671[var9].field4714) <= 0) {
					break;
				}
			} else if (((Comparable)var3.field4714).compareTo(this.field4671[var9].field4714) <= 0) {
				break;
			}

			this.field4671[var1] = this.field4671[var9];
			this.field4671[var1].field4715 = var1;
		}

		this.field4671[var1] = var3;
		this.field4671[var1].field4715 = var1;
	}

	public boolean contains(Object var1) {
		return this.field4668.containsKey(var1);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field4667 != null) {
			Arrays.sort(var1, this.field4667);
		} else {
			Arrays.sort(var1);
		}

		return var1;
	}

	public Iterator iterator() {
		return new Class434(this);
	}
}
