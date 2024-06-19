import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;

public class Class171 extends Class506 {
	public boolean field1847;
	public boolean field1848;
	public byte field1852;
	public byte field1853;
	public int[] field1849;
	public String field1851;
	public List field1854;
	public long field1850;

	static {
		new BitSet(65536);
	}

	public Class171(Class521 var1) {
		this.field1847 = true;
		this.field1851 = null;
		this.method3537(var1);
	}

	public int[] method3533() {
		if (this.field1849 == null) {
			String[] var2 = new String[this.field1854.size()];
			this.field1849 = new int[this.field1854.size()];

			for (int var3 = 0; var3 < this.field1854.size(); this.field1849[var3] = var3++) {
				var2[var3] = ((Class140)this.field1854.get(var3)).field1601.method10261();
			}

			Class91.method2406(var2, this.field1849);
		}

		return this.field1849;
	}

	public void method3534(Class140 var1) {
		this.field1854.add(var1);
		this.field1849 = null;
	}

	public void method3549(int var1) {
		this.field1854.remove(var1);
		this.field1849 = null;
	}

	public int method3536() {
		return this.field1854.size();
	}

	public int method3539(String var1) {
		if (!this.field1847) {
			throw new RuntimeException("Displaynames not available");
		} else {
			for (int var3 = 0; var3 < this.field1854.size(); ++var3) {
				if (((Class140)this.field1854.get(var3)).field1601.method10260().equalsIgnoreCase(var1)) {
					return var3;
				}
			}

			return -1;
		}
	}

	public void method3537(Class521 var1) {
		int var3 = var1.method9405();
		if ((var3 & 1) != 0) {
			this.field1848 = true;
		}

		if ((var3 & 2) != 0) {
			this.field1847 = true;
		}

		int var4 = 2;
		if ((var3 & 4) != 0) {
			var4 = var1.method9405();
		}

		super.field5170 = var1.method9411();
		this.field1850 = var1.method9411();
		this.field1851 = var1.method9415();
		var1.method9413();
		this.field1853 = var1.method9406();
		this.field1852 = var1.method9406();
		int var5 = var1.method9407();
		if (var5 > 0) {
			this.field1854 = new ArrayList(var5);

			for (int var6 = 0; var6 < var5; ++var6) {
				Class140 var7 = new Class140();
				if (this.field1848) {
					var1.method9411();
				}

				if (this.field1847) {
					var7.field1601 = new Class567(var1.method9415());
				}

				var7.field1602 = var1.method9406();
				var7.field1607 = var1.method9407();
				if (var4 >= 3) {
					var1.method9413();
				}

				this.field1854.add(var6, var7);
			}
		}

	}
}
