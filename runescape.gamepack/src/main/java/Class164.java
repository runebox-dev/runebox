import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

public class Class164 {
	public Class105 field1808;
	public Class191 field1809;
	public Class192 field1807;
	public int field1812;
	public int field1816;
	public String field1813;
	public String field1814;
	public String field1815;

	public Class164() {
		this.field1812 = -1;
		this.field1816 = 0;
	}

	public Class191 method3426() {
		return this.field1809;
	}

	public boolean method3427(String var1, String var2, Class106 var3) {
		if (var1 != null && !var1.isEmpty()) {
			if (var3 == null) {
				return false;
			} else {
				this.method3488();

				try {
					this.field1815 = var1;
					this.field1808 = var3.method2759(new URL(this.field1815));
					this.field1812 = 0;
				} catch (MalformedURLException var6) {
					this.method3488();
					this.field1812 = 4;
					return false;
				}

				if (!var2.isEmpty()) {
					this.field1814 = var2;
				}

				return true;
			}
		} else {
			return false;
		}
	}

	public void method3428(String var1, String var2, String var3) {
		this.field1809 = Class191.method3562();
		this.field1813 = var1;
		this.field1809.method3751(this.field1813, var2, var3);
	}

	public void method3429(Class106 var1) {
		switch(this.field1812) {
		case 0:
			this.method3440(var1);
			break;
		case 1:
			this.method3441();
			break;
		default:
			return;
		}

	}

	public int method3430() {
		return this.field1812;
	}

	public int method3492(String var1) {
		return this.field1807.field1984.containsKey(var1) ? (Integer)this.field1807.field1984.get(var1) : -1;
	}

	public String method3475(String var1) {
		return (String)((String)(this.field1807.field1983.containsKey(var1) ? this.field1807.field1983.get(var1) : null));
	}

	public ArrayList method3433() {
		return this.field1807.field1978;
	}

	public ArrayList method3483() {
		return this.field1807.field1981;
	}

	public ArrayList method3435() {
		return this.field1807.field1977;
	}

	public String method3436() {
		return this.field1807.field1980;
	}

	public float[] method3479() {
		return this.field1807.field1979;
	}

	public String method3438() {
		return this.field1807.method3768();
	}

	public void method3488() {
		this.field1808 = null;
	}

	public void method3440(Class106 var1) {
		if (this.field1808 != null && this.field1808.method2742()) {
			byte[] var3 = this.field1808.method2743();
			if (var3 == null) {
				this.method3488();
				this.field1812 = 4;
			} else {
				try {
					Class490 var4 = new Class490(var3);
					JSONObject var5 = var4.method8942();
					if (var5 == null) {
						return;
					}

					try {
						this.field1816 = var5.getInt("version");
					} catch (Exception var7) {
						this.method3488();
						this.field1812 = 6;
						return;
					}

					if (this.field1816 < 2) {
						if (!this.field1807.method3760(var5, this.field1816, var1)) {
							this.field1812 = 6;
						}
					} else if (this.field1816 == 2) {
						Class184 var6 = Class395.method7419();
						var6.method3664(var5, this.field1816, var1);
						this.field1807 = var6.method3674(this.field1814);
						if (this.field1807 != null) {
							this.method3441();
							this.field1812 = 1;
						} else {
							this.field1812 = 7;
						}
					}
				} catch (UnsupportedEncodingException var8) {
					this.method3488();
					this.field1812 = 6;
					return;
				}

				if (this.field1807 != null) {
					this.field1812 = this.field1807.field1978.size() > 0 ? 1 : 2;
				}

				this.field1808 = null;
			}
		}
	}

	public void method3441() {
		Iterator var2 = this.field1807.field1978.iterator();

		Class161 var3;
		do {
			if (!var2.hasNext()) {
				var2 = this.field1807.field1978.iterator();

				while (var2.hasNext()) {
					var3 = (Class161)var2.next();
					if (var3.field1797 != null) {
						byte[] var4 = var3.field1797.method2743();
						if (var4 != null && var4.length > 0) {
							this.field1812 = 2;
							return;
						}
					}
				}

				this.method3488();
				this.field1812 = 5;
				return;
			}

			var3 = (Class161)var2.next();
		} while(var3.field1797 == null || var3.field1797.method2742());

	}

	public boolean method3468(String var1, Class106 var2) {
		try {
			JSONObject var4 = (new Class490(var1.getBytes())).method8942();

			try {
				this.field1816 = var4.getInt("version");
			} catch (Exception var6) {
				this.method3488();
				this.field1812 = 6;
				return false;
			}

			if (!this.field1807.method3760(var4, this.field1816, var2)) {
				this.field1812 = 6;
			}

			this.field1812 = this.field1807.field1978.size() > 0 ? 1 : 2;
		} catch (UnsupportedEncodingException var7) {
			this.field1812 = 6;
		}

		return this.field1812 < 3;
	}
}
