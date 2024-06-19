import java.util.ArrayList;
import java.util.Iterator;

public class Class441 extends Class447 {
	public ArrayList field4784;

	public Class441(Class447 var1, ArrayList var2) {
		super(var1);
		super.field4807 = "ClearRequestTask";
		this.field4784 = var2;
	}

	public boolean method7832() {
		if (this.field4784.isEmpty()) {
			return true;
		} else {
			Iterator var2 = this.field4784.iterator();

			while (var2.hasNext()) {
				Class357 var3 = (Class357)var2.next();

				try {
					if (Class332.field3455.contains(var3)) {
						if (var3 == null) {
							Class332.field3455.remove(var3);
						} else {
							if (var3.field3940.field3509 > 0) {
								--var3.field3940.field3509;
							}

							if (var3.field3940.field3509 == 0) {
								var3.field3940.method6319();
								var3.field3940.method6313();
								var3.field3940.method6400(0);
							}

							Class332.method4921(var3.field3937, var3.field3933);
							Class332.field3455.remove(var3);
						}
					}
				} catch (Exception var5) {
					Class548.method8904((String)null, var5);
					this.method8379(var5.getMessage());
					Class332.field3455.clear();
					return true;
				}
			}

			return true;
		}
	}
}
