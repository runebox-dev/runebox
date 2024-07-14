import io.runebox.ObfInfo;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

@ObfInfo(name = "gj")
public class Class166 extends Class520 {
	@ObfInfo(name = "ad", desc = "Z")
	public boolean field1807;
	@ObfInfo(name = "aq", desc = "Z")
	public boolean field1815;
	@ObfInfo(name = "av", desc = "B")
	public byte field1806;
	@ObfInfo(name = "aj", desc = "B")
	public byte field1812;
	@ObfInfo(name = "ak", desc = "[I")
	public int[] field1809;
	@ObfInfo(name = "an", desc = "Ljava/lang/String;")
	public String field1813;
	@ObfInfo(name = "ag", desc = "Ljava/util/List;")
	public List field1808;
	@ObfInfo(name = "ap", desc = "J", longMultiplier = -2959055586149088951L)
	public long field1810;

	static {
		new BitSet(65536);
	}

	public Class166(Class562 var1) {
		this.field1807 = true;
		this.field1813 = null;
		this.method3429(var1);
	}

	@ObfInfo(name = "aq", desc = "(B)[I")
	public int[] method3424() {
		if (this.field1809 == null) {
			String[] var2 = new String[this.field1808.size()];
			this.field1809 = new int[this.field1808.size()];

			for (int var3 = 0; var3 < this.field1808.size(); this.field1809[var3] = var3++) {
				var2[var3] = ((Class131)this.field1808.get(var3)).field1528.method9790();
			}

			Class521.method3990(var2, this.field1809);
		}

		return this.field1809;
	}

	@ObfInfo(name = "ad", desc = "(Lfa;I)V")
	public void method3425(Class131 var1) {
		this.field1808.add(var1);
		this.field1809 = null;
	}

	@ObfInfo(name = "ag", desc = "(IB)V")
	public void method3437(int var1) {
		this.field1808.remove(var1);
		this.field1809 = null;
	}

	@ObfInfo(name = "ak", desc = "(I)I")
	public int method3445() {
		return this.field1808.size();
	}

	@ObfInfo(name = "ap", desc = "(Ljava/lang/String;I)I", opaque = "-1112513857")
	public int method3428(String var1) {
		if (!this.field1807) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field1808.size(); ++var3) {
				if (((Class131)this.field1808.get(var3)).field1528.method9789().equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	@ObfInfo(name = "an", desc = "(Lvp;I)V", opaque = "-15655574")
	public void method3429(Class562 var1) {
		int var3 = var1.method9902();
		if ((var3 & 1) != 0) {
			this.field1815 = true;
		}

		if ((var3 & 2) != 0) {
			this.field1807 = true;
		}

		int var4 = 2;
		if ((var3 & 4) != 0) {
			var4 = var1.method9902();
		}

		super.field5234 = var1.method9833();
		this.field1810 = var1.method9833();
		this.field1813 = var1.method9837();
		var1.method9835();
		this.field1806 = var1.method9955();
		this.field1812 = var1.method9955();
		int var5 = var1.method9997();
		if (var5 > 0) {
			this.field1808 = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; ++var6) {
				Class131 var7 = new Class131();
				if (this.field1815) {
					var1.method9833();
				}

				if (this.field1807) {
					var7.field1528 = new Class561(var1.method9837());
				}

				var7.field1530 = var1.method9955();
				var7.field1527 = var1.method9997();
				if (var4 >= 3) {
					var1.method9835();
				}

				this.field1808.add(var6, var7);
			}
		}

	}

	@ObfInfo(name = "jc", desc = "(Lde;I)V", opaque = "-1095725803")
	public static void method3449(Class83 var0) {
		if (Client.field577) {
			Client.method6615(var0, Client.field732, false);
		}

	}
}
