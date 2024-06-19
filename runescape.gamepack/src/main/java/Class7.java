import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Class7 implements KeyListener, FocusListener {
	public Class35[] field32;
	public boolean[] field35;
	public Collection field33;
	public Collection field34;
	public volatile int field38;

	public Class7() {
		this.field32 = new Class35[3];
		this.field35 = new boolean[112];
		this.field38 = 0;
		this.field34 = new ArrayList(100);
		this.field33 = new ArrayList(100);
	}

	public void method75(Class35 var1, int var2) {
		this.field32[var2] = var1;
	}

	public int method74() {
		return this.field38;
	}

	public void method79(Component var1) {
		var1.setFocusTraversalKeysEnabled(false);
		var1.addKeyListener(this);
		var1.addFocusListener(this);
	}

	public synchronized void method84(Component var1) {
		var1.removeKeyListener(this);
		var1.removeFocusListener(this);
		synchronized(this) {
			this.field34.add(new Class38(4, 0));
		}
	}

	public void method94() {
		++this.field38;
		this.method77();
		Iterator var2 = this.field33.iterator();

		while (var2.hasNext()) {
			Class38 var3 = (Class38)var2.next();

			for (int var4 = 0; var4 < this.field32.length && !var3.method784(this.field32[var4]); ++var4) {
			}
		}

		this.field33.clear();
	}

	public final synchronized void keyPressed(KeyEvent var1) {
		int var2;
		label26: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = Class41.field296.length;
				if (var2 < var4) {
					var2 = Class503.method9254(var2);
					if (Class41.method6495(var2)) {
						var2 = -1;
					}
					break label26;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			if (!this.field35[var2]) {
				this.field38 = 0;
			}

			this.field35[var2] = true;
			this.field34.add(new Class38(1, var2));
		}

		var1.consume();
	}

	public final synchronized void keyReleased(KeyEvent var1) {
		int var2;
		label18: {
			var2 = var1.getKeyCode();
			if (var2 >= 0) {
				int var4 = Class41.field296.length;
				if (var2 < var4) {
					var2 = Class503.method9254(var2) & -129;
					break label18;
				}
			}

			var2 = -1;
		}

		if (var2 >= 0) {
			this.field35[var2] = false;
			this.field34.add(new Class38(2, var2));
		}

		var1.consume();
	}

	public final synchronized void keyTyped(KeyEvent var1) {
		char var2 = var1.getKeyChar();
		if (var2 != 0 && var2 != '\uffff' && Class57.method1082(var2)) {
			this.field34.add(new Class38(3, var2));
		}

		var1.consume();
	}

	public synchronized void method77() {
		Collection var2 = this.field33;
		this.field33 = this.field34;
		this.field34 = var2;
	}

	public final synchronized void focusGained(FocusEvent var1) {
		this.field34.add(new Class38(4, 1));
	}

	public final synchronized void focusLost(FocusEvent var1) {
		for (int var2 = 0; var2 < 112; ++var2) {
			if (this.field35[var2]) {
				this.field35[var2] = false;
				this.field34.add(new Class38(2, var2));
			}
		}

		this.field34.add(new Class38(4, 0));
	}

	public static Class232 method109(int var0) {
		Class232 var2 = (Class232)Class232.field2454.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = Class79.field2499.method7216(10, var0);
			var2 = new Class232();
			var2.field2447 = var0;
			if (var3 != null) {
				var2.method4435(new Class521(var3));
			}

			var2.method4411();
			if (var2.field2486 != -1) {
				var2.method4414(method109(var2.field2486), method109(var2.field2485));
			}

			if (-1 != var2.field2497) {
				var2.method4415(method109(var2.field2497), method109(var2.field2496));
			}

			if (var2.field2453 != -1) {
				var2.method4431(method109(var2.field2453), method109(var2.field2498));
			}

			if (!Class79.field3252 && var2.field2467) {
				if (var2.field2486 == -1 && var2.field2497 == -1 && -1 == var2.field2453) {
					var2.field2449 = var2.field2449 + Class378.field4194;
				}

				var2.field2446 = Class378.field4378;
				var2.field2461 = false;

				int var4;
				for (var4 = 0; var4 < var2.field2469.length; ++var4) {
					var2.field2469[var4] = null;
				}

				for (var4 = 0; var4 < var2.field2487.length; ++var4) {
					if (var4 != 4) {
						var2.field2487[var4] = null;
					}
				}

				var2.field2450 = -2;
				var2.field2492 = 0;
				if (var2.field2458 != null) {
					boolean var7 = false;

					for (Class506 var5 = var2.field2458.method9329(); var5 != null; var5 = var2.field2458.method9327()) {
						Class217 var6 = Class281.method5716((int)var5.field5170);
						if (var6.field2184) {
							var5.method9277();
						} else {
							var7 = true;
						}
					}

					if (!var7) {
						var2.field2458 = null;
					}
				}
			}

			Class232.field2454.method5987(var2, (long)var0);
			return var2;
		}
	}

	public static void method93(String var0, String var1, int var2, int var3, int var4, int var5) {
		Client.method3958(var0, var1, var2, var3, var4, var5, -1, false, -1);
	}
}
