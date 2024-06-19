import java.util.ArrayList;
import java.util.Arrays;

public class Class32 {
	public int[] field217;
	public int[] field219;

	public Class32() {
		this.field219 = new int[112];
		this.field217 = new int[192];
		Arrays.fill(this.field219, 3);
		Arrays.fill(this.field217, 3);
	}

	public void method641(int var1, int var2) {
		if (this.method649(var1) && this.method651(var2)) {
			this.field219[var1] = var2;
		}

	}

	public void method642(char var1, int var2) {
		if (this.method650(var1) && this.method651(var2)) {
			this.field217[var1] = var2;
		}

	}

	public int method660(int var1) {
		return this.method649(var1) ? this.field219[var1] : 0;
	}

	public int method646(char var1) {
		return this.method650(var1) ? this.field217[var1] : 0;
	}

	public boolean method645(int var1) {
		return this.method649(var1) && (this.field219[var1] == 1 || 3 == this.field219[var1]);
	}

	public boolean method643(char var1) {
		return this.method650(var1) && (1 == this.field217[var1] || this.field217[var1] == 3);
	}

	public boolean method647(int var1) {
		return this.method649(var1) && (2 == this.field219[var1] || this.field219[var1] == 3);
	}

	public boolean method648(char var1) {
		return this.method650(var1) && (2 == this.field217[var1] || this.field217[var1] == 3);
	}

	public boolean method649(int var1) {
		if (var1 >= 0 && var1 < 112) {
			return true;
		} else {
			System.out.println("Invalid keycode: " + var1);
			return false;
		}
	}

	public boolean method650(char var1) {
		if (var1 >= 0 && var1 < 192) {
			return true;
		} else {
			System.out.println("Invalid keychar: " + var1);
			return false;
		}
	}

	public boolean method651(int var1) {
		if (var1 >= 0 && var1 < 4) {
			return true;
		} else {
			System.out.println("Invalid mode: " + var1);
			return false;
		}
	}

	public static void method674(int var0, int var1) {
		if (Client.field4851.method2637() != 0 && var0 != -1) {
			ArrayList var3 = new ArrayList();
			var3.add(new Class357(Client.field3528, var0, 0, Client.field4851.method2637(), false));
			Class70.method1940(var3, 0, 0, 0, 0, true);
			Client.field737 = true;
		}

	}
}
