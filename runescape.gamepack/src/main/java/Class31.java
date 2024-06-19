import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;
import java.awt.LayoutManager;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.image.ImageObserver;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.net.URL;
import java.util.Iterator;

public abstract class Class31 extends Applet implements Runnable, FocusListener, WindowListener {
	public static Class190 field5405;
	public static Class31 field176;
	public static Class7 field208;
	public static boolean field179;
	public static int field115;
	public static int field177;
	public static int field181;
	public static int field186;
	public static int field187;
	public static int field200;
	public static int field4594;
	public static int field4955;
	public static Font field59;
	public static FontMetrics field3153;
	public static Image field48;
	public static GarbageCollectorMXBean field1818;
	public static long field178;
	public static long field197;
	public static long field210;
	public static long[] field185;
	public static long[] field191;
	public static volatile boolean field207;
	public Class9 field211;
	public boolean field180;
	public boolean field196;
	public boolean field201;
	public int field175;
	public int field183;
	public int field188;
	public int field189;
	public int field190;
	public int field192;
	public int field194;
	public int field195;
	public Canvas field198;
	public Frame field205;
	public Clipboard field204;
	public final EventQueue field206;
	public volatile boolean field199;
	public volatile boolean field202;
	public volatile long field193;

	static {
		field176 = null;
		field177 = 0;
		field178 = 0L;
		field179 = false;
		field181 = 20;
		field186 = 1;
		field187 = 0;
		field185 = new long[32];
		field191 = new long[32];
		field200 = 500;
		field207 = true;
		field208 = new Class7();
		field197 = -1L;
		field210 = -1L;
	}

	public Class31() {
		this.field180 = false;
		this.field189 = 0;
		this.field190 = 0;
		this.field196 = false;
		this.field199 = true;
		this.field201 = false;
		this.field202 = false;
		this.field193 = 0L;
		EventQueue var1 = null;

		try {
			var1 = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable var3) {
		}

		this.field206 = var1;
		Class30.method3934(new Class14());
	}

	public abstract void init();

	public abstract void method484();

	public abstract void method493();

	public abstract void method495(boolean var1);

	public abstract void method496();

	public abstract void method503();

	public abstract void method538();

	public final void method465(int var1, int var2) {
		if (this.field194 != var1 || this.field195 != var2) {
			this.method548();
		}

		this.field194 = var1;
		this.field195 = var2;
	}

	public final void method626(Object var1) {
		if (this.field206 != null) {
			for (int var3 = 0; var3 < 50 && this.field206.peekEvent() != null; ++var3) {
				Class493.method8960(1L);
			}

			if (var1 != null) {
				this.field206.postEvent(new ActionEvent(var1, 1001, "dummy"));
			}

		}
	}

	public Class173 method467() {
		if (this.field211 == null) {
			this.field211 = new Class9();
			this.field211.method130(this.field198);
		}

		return this.field211;
	}

	public void method468() {
		this.field204 = this.getToolkit().getSystemClipboard();
	}

	public void method469(String var1) {
		this.field204.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	public Clipboard method470() {
		return this.field204;
	}

	public final void method490() {
		Class41.method2981();
		field208.method79(this.field198);
	}

	public final void method472() {
		field208.method94();
	}

	public void method473(Class35 var1, int var2) {
		field208.method75(var1, var2);
	}

	public final void method603() {
		Canvas var2 = this.field198;
		var2.addMouseListener(Class33.field223);
		var2.addMouseMotionListener(Class33.field223);
		var2.addFocusListener(Class33.field223);
	}

	public final void method531() {
		Container var2 = this.method635();
		if (var2 != null) {
			Class425 var3 = this.method501();
			this.field183 = Math.max(var3.field4690, this.field192);
			this.field188 = Math.max(var3.field4688, this.field175);
			if (this.field183 <= 0) {
				this.field183 = 1;
			}

			if (this.field188 <= 0) {
				this.field188 = 1;
			}

			Client.field182 = Math.min(this.field183, this.field194);
			Client.field5261 = Math.min(this.field188, this.field195);
			this.field189 = (this.field183 - Client.field182) / 2;
			this.field190 = 0;
			this.field198.setSize(Client.field182, Client.field5261);
			Client.field3241 = new Class49(Client.field182, Client.field5261, this.field198, this.field196);
			if (this.field205 == var2) {
				Insets var4 = this.field205.getInsets();
				this.field198.setLocation(var4.left + this.field189, var4.top + this.field190);
			} else {
				this.field198.setLocation(this.field189, this.field190);
			}

			this.field199 = true;
			this.method538();
		}
	}

	public void method584() {
		int var2 = this.field189;
		int var3 = this.field190;
		int var4 = this.field183 - Client.field182 - var2;
		int var5 = this.field188 - Client.field5261 - var3;
		if (var2 > 0 || var4 > 0 || var3 > 0 || var5 > 0) {
			try {
				Container var6 = this.method635();
				int var7 = 0;
				int var8 = 0;
				if (this.field205 == var6) {
					Insets var9 = this.field205.getInsets();
					var7 = var9.left;
					var8 = var9.top;
				}

				Graphics var11 = var6.getGraphics();
				var11.setColor(Color.black);
				if (var2 > 0) {
					var11.fillRect(var7, var8, var2, this.field188);
				}

				if (var3 > 0) {
					var11.fillRect(var7, var8, this.field183, var3);
				}

				if (var4 > 0) {
					var11.fillRect(this.field183 + var7 - var4, var8, var4, this.field188);
				}

				if (var5 > 0) {
					var11.fillRect(var7, var8 + this.field188 - var5, this.field183, var5);
				}
			} catch (Exception var10) {
			}
		}

	}

	public final void method477() {
		field208.method84(this.field198);
		Class33.method4769(this.field198);
		if (this.field211 != null) {
			this.field211.method132(this.field198);
		}

		this.method498();
		field208.method79(this.field198);
		Canvas var2 = this.field198;
		var2.addMouseListener(Class33.field223);
		var2.addMouseMotionListener(Class33.field223);
		var2.addFocusListener(Class33.field223);
		if (this.field211 != null) {
			this.field211.method130(this.field198);
		}

		this.method548();
	}

	public final void method478(int var1, int var2, int var3, int var4) {
		try {
			if (field176 != null) {
				++field177;
				if (field177 >= 3) {
					this.method499("alreadyloaded");
					return;
				}

				this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
				return;
			}

			field176 = this;
			Client.field182 = var1;
			Client.field5261 = var2;
			Class548.field5223 = var3;
			Class548.field5348 = var4;
			Class548.field5351 = this;
			if (Client.field209 == null) {
				Client.field209 = new Class182();
			}

			Client.field209.method3646(this, 1);
		} catch (Exception var7) {
			Class548.method8904((String)null, var7);
			this.method499("crash");
		}

	}

	public final synchronized void method498() {
		Container var2 = this.method635();
		if (this.field198 != null) {
			this.field198.removeFocusListener(this);
			var2.remove(this.field198);
		}

		Client.field182 = Math.max(var2.getWidth(), this.field192);
		Client.field5261 = Math.max(var2.getHeight(), this.field175);
		Insets var3;
		if (this.field205 != null) {
			var3 = this.field205.getInsets();
			Client.field182 -= var3.right + var3.left;
			Client.field5261 -= var3.top + var3.bottom;
		}

		this.field198 = new Class13(this);
		var2.setBackground(Color.BLACK);
		var2.setLayout((LayoutManager)null);
		var2.add(this.field198);
		this.field198.setSize(Client.field182, Client.field5261);
		this.field198.setVisible(true);
		this.field198.setBackground(Color.BLACK);
		if (this.field205 == var2) {
			var3 = this.field205.getInsets();
			this.field198.setLocation(var3.left + this.field189, this.field190 + var3.top);
		} else {
			this.field198.setLocation(this.field189, this.field190);
		}

		this.field198.addFocusListener(this);
		this.field198.requestFocus();
		this.field199 = true;
		if (Client.field3241 != null && Client.field3241.field5484 == Client.field182 && Client.field5261 == Client.field3241.field5482) {
			((Class49)Client.field3241).method889(this.field198);
			Client.field3241.method877(0, 0);
		} else {
			Client.field3241 = new Class49(Client.field182, Client.field5261, this.field198, this.field196);
		}

		this.field202 = false;
		this.field193 = Class327.method3047();
	}

	public void method480(boolean var1) {
		if (this.field196 != var1) {
			this.field196 = var1;
			Client.field3241.method10289(var1);
			Client.field3241.method10286();
		}

	}

	public final boolean method481() {
		String var2 = this.getDocumentBase().getHost().toLowerCase();
		if (!var2.equals("jagex.com") && !var2.endsWith(".jagex.com")) {
			if (!var2.equals("runescape.com") && !var2.endsWith(".runescape.com")) {
				if (var2.endsWith("127.0.0.1")) {
					return true;
				} else {
					while (var2.length() > 0 && var2.charAt(var2.length() - 1) >= '0' && var2.charAt(var2.length() - 1) <= '9') {
						var2 = var2.substring(0, var2.length() - 1);
					}

					if (var2.endsWith("192.168.1.")) {
						return true;
					} else {
						this.method499("invalidhost");
						return false;
					}
				}
			} else {
				return true;
			}
		} else {
			return true;
		}
	}

	public void run() {
		try {
			if (Class548.field1908 != null) {
				String var1 = Class548.field1908.toLowerCase();
				if (var1.indexOf("sun") != -1 || var1.indexOf("apple") != -1) {
					String var2 = Class548.field1900;
					if (var2.equals("1.1") || var2.startsWith("1.1.") || var2.equals("1.2") || var2.startsWith("1.2.") || var2.equals("1.3") || var2.startsWith("1.3.") || var2.equals("1.4") || var2.startsWith("1.4.") || var2.equals("1.5") || var2.startsWith("1.5.") || var2.equals("1.6.0")) {
						this.method499("wrongjava");
						return;
					}

					if (var2.startsWith("1.6.0_")) {
						int var3;
						for (var3 = 6; var3 < var2.length() && Class412.method293(var2.charAt(var3)); ++var3) {
						}

						String var4 = var2.substring(6, var3);
						if (Class412.method3873(var4) && Class412.method3402(var4) < 10) {
							this.method499("wrongjava");
							return;
						}
					}

					field186 = 5;
				}
			}

			this.setFocusCycleRoot(true);
			this.method498();
			this.method493();

			Object var7;
			try {
				var7 = new Class178();
			} catch (Throwable var5) {
				var7 = new Class172();
			}

			field5405 = (Class190)var7;

			while (field178 == 0L || Class327.method3047() < field178) {
				field4955 = field5405.method3557(field181, field186);

				for (int var8 = 0; var8 < field4955; ++var8) {
					this.method482();
				}

				this.method558();
				this.method626(this.field198);
			}
		} catch (Exception var6) {
			Class548.method8904((String)null, var6);
			this.method499("crash");
		}

		this.method487();
	}

	public void method482() {
		long var2 = Class327.method3047();
		long var4 = field191[field115];
		field191[field115] = var2;
		field115 = field115 + 1 & 31;
		if (var4 != 0L && var2 > var4) {
		}

		synchronized(this) {
			Client.field4885 = field207;
		}

		this.method484();
	}

	public final void method483() {
		this.field199 = true;
	}

	public void method558() {
		Container var2 = this.method635();
		long var3 = Class327.method3047();
		long var5 = field185[field4594];
		field185[field4594] = var3;
		field4594 = 1 + field4594 & 31;
		if (0L != var5 && var3 > var5) {
			int var7 = (int)(var3 - var5);
			field187 = ((var7 >> 1) + 32000) / var7;
		}

		if (++field200 - 1 > 50) {
			field200 -= 50;
			this.field199 = true;
			this.field198.setSize(Client.field182, Client.field5261);
			this.field198.setVisible(true);
			if (this.field205 == var2) {
				Insets var8 = this.field205.getInsets();
				this.field198.setLocation(var8.left + this.field189, this.field190 + var8.top);
			} else {
				this.field198.setLocation(this.field189, this.field190);
			}
		}

		if (this.field202) {
			this.method477();
		}

		this.method500();
		this.method495(this.field199);
		if (this.field199) {
			this.method584();
		}

		this.field199 = false;
	}

	public final void method500() {
		Class425 var2 = this.method501();
		if (this.field183 != var2.field4690 || var2.field4688 != this.field188 || this.field201) {
			this.method531();
			this.field201 = false;
		}

	}

	public final void method548() {
		this.field201 = true;
	}

	public final synchronized void method487() {
		if (!field179) {
			field179 = true;

			try {
				this.field198.removeFocusListener(this);
			} catch (Exception var6) {
			}

			try {
				this.method496();
			} catch (Exception var5) {
			}

			if (this.field205 != null) {
				try {
					System.exit(0);
				} catch (Throwable var4) {
				}
			}

			if (Client.field209 != null) {
				try {
					Client.field209.method3658();
				} catch (Exception var3) {
				}
			}

			this.method503();
		}
	}

	public final void start() {
		if (field176 == this && !field179) {
			field178 = 0L;
		}
	}

	public final void stop() {
		if (field176 == this && !field179) {
			field178 = Class327.method3047() + 4000L;
		}
	}

	public final void destroy() {
		if (field176 == this && !field179) {
			field178 = Class327.method3047();
			Class493.method8960(5000L);
			this.method487();
		}
	}

	public final void update(Graphics var1) {
		this.paint(var1);
	}

	public final synchronized void paint(Graphics var1) {
		if (field176 == this && !field179) {
			this.field199 = true;
			if (Class327.method3047() - this.field193 > 1000L) {
				Rectangle var2 = var1.getClipBounds();
				if (var2 == null || var2.width >= Client.field182 && var2.height >= Client.field5261) {
					this.field202 = true;
				}
			}

		}
	}

	public final void focusGained(FocusEvent var1) {
		field207 = true;
		this.field199 = true;
	}

	public final void focusLost(FocusEvent var1) {
		field207 = false;
	}

	public final void windowActivated(WindowEvent var1) {
	}

	public final void windowClosed(WindowEvent var1) {
	}

	public final void windowClosing(WindowEvent var1) {
		this.destroy();
	}

	public final void windowDeactivated(WindowEvent var1) {
	}

	public final void windowDeiconified(WindowEvent var1) {
	}

	public final void windowIconified(WindowEvent var1) {
	}

	public final void windowOpened(WindowEvent var1) {
	}

	public final void method497(int var1, String var2, boolean var3, boolean var4) {
		try {
			Graphics var6 = this.field198.getGraphics();
			if (field59 == null) {
				field59 = new Font("Helvetica", 1, 13);
				field3153 = this.field198.getFontMetrics(field59);
			}

			if (var3 && !var4) {
				var6.setColor(Color.black);
				var6.fillRect(0, 0, Client.field182, Client.field5261);
			}

			Color var7 = new Color(140, 17, 17);

			try {
				if (field48 == null) {
					field48 = this.field198.createImage(304, 34);
				}

				Graphics var8 = field48.getGraphics();
				var8.setColor(var7);
				var8.drawRect(0, 0, 303, 33);
				var8.fillRect(2, 2, var1 * 3, 30);
				var8.setColor(Color.black);
				var8.drawRect(1, 1, 301, 31);
				var8.fillRect(2 + var1 * 3, 2, 300 - var1 * 3, 30);
				var8.setFont(field59);
				var8.setColor(Color.white);
				var8.drawString(var2, (304 - field3153.stringWidth(var2)) / 2, 22);
				var6.drawImage(field48, Client.field182 / 2 - 152, Client.field5261 / 2 + (var4 ? 50 : -18), (ImageObserver)null);
			} catch (Exception var11) {
				int var9 = Client.field182 / 2 - 152;
				int var10 = Client.field5261 / 2 - 18;
				var6.setColor(var7);
				var6.drawRect(var9, var10, 303, 33);
				var6.fillRect(var9 + 2, var10 + 2, var1 * 3, 30);
				var6.setColor(Color.black);
				var6.drawRect(var9 + 1, var10 + 1, 301, 31);
				var6.fillRect(var1 * 3 + var9 + 2, var10 + 2, 300 - var1 * 3, 30);
				var6.setFont(field59);
				var6.setColor(Color.white);
				var6.drawString(var2, var9 + (304 - field3153.stringWidth(var2)) / 2, var10 + 22);
			}
		} catch (Exception var12) {
			this.field198.repaint();
		}

	}

	public final void method612() {
		field48 = null;
		field59 = null;
		field3153 = null;
	}

	public void method499(String var1) {
		if (!this.field180) {
			this.field180 = true;
			System.out.println("error_game_" + var1);

			try {
				this.getAppletContext().showDocument(new URL(this.getCodeBase(), "error_game_" + var1 + ".ws"), "_self");
			} catch (Exception var4) {
			}

		}
	}

	public Container method635() {
		return (Container)(this.field205 != null ? this.field205 : this);
	}

	public Class425 method501() {
		Container var2 = this.method635();
		int var3 = Math.max(var2.getWidth(), this.field192);
		int var4 = Math.max(var2.getHeight(), this.field175);
		if (this.field205 != null) {
			Insets var5 = this.field205.getInsets();
			var3 -= var5.right + var5.left;
			var4 -= var5.top + var5.bottom;
		}

		return new Class425(var3, var4);
	}

	public final boolean method502() {
		return this.field205 != null;
	}

	public static void method164() {
		field5405.method3556();

		int var1;
		for (var1 = 0; var1 < 32; ++var1) {
			field185[var1] = 0L;
		}

		for (var1 = 0; var1 < 32; ++var1) {
			field191[var1] = 0L;
		}

		field4955 = 0;
	}

	public static int method3811() {
		int var1 = 0;
		if (field1818 == null || !field1818.isValid()) {
			try {
				Iterator var2 = ManagementFactory.getGarbageCollectorMXBeans().iterator();

				while (var2.hasNext()) {
					GarbageCollectorMXBean var3 = (GarbageCollectorMXBean)var2.next();
					if (var3.isValid()) {
						field1818 = var3;
						field210 = -1L;
						field197 = -1L;
					}
				}
			} catch (Throwable var10) {
			}
		}

		if (field1818 != null) {
			long var11 = Class327.method3047();
			long var4 = field1818.getCollectionTime();
			if (-1L != field197) {
				long var6 = var4 - field197;
				long var8 = var11 - field210;
				if (var8 != 0L) {
					var1 = (int)(100L * var6 / var8);
				}
			}

			field197 = var4;
			field210 = var11;
		}

		return var1;
	}
}
