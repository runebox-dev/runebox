import java.net.MalformedURLException;
import java.net.URL;

public class Class363 {
	public Class105 field3976;
	public Class549 field3977;

	public Class363(String var1, Class106 var2) {
		try {
			this.field3976 = var2.method2759(new URL(var1));
		} catch (MalformedURLException var4) {
			this.field3976 = null;
		}

	}

	public Class363(Class105 var1) {
		this.field3976 = var1;
	}

	public Class549 method7117() {
		if (this.field3977 == null && this.field3976 != null && this.field3976.method2742()) {
			if (this.field3976.method2743() != null) {
				this.field3977 = Class46.method8418(this.field3976.method2743());
			}

			this.field3976 = null;
		}

		return this.field3977;
	}
}
