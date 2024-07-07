import io.runebox.ObfInfo;
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

@ObfInfo(name = "be")
public abstract class Class31 extends Applet implements Runnable, FocusListener, WindowListener {
	@ObfInfo(owner = "vm", name = "ah", desc = "Lhh;")
	public static Class190 field5405;
	@ObfInfo(name = "al", desc = "Lbe;")
	public static Class31 field176;
	@ObfInfo(name = "bq", desc = "Lag;")
	public static Class7 field208;
	@ObfInfo(name = "af", desc = "Z")
	public static boolean field179;
	@ObfInfo(owner = "av", name = "ax", desc = "I", intMultiplier = -1673014015)
	public static int field115;
	@ObfInfo(name = "aj", desc = "I", intMultiplier = 1393456911)
	public static int field177;
	@ObfInfo(name = "ab", desc = "I", intMultiplier = 1073455795)
	public static int field181;
	@ObfInfo(name = "ac", desc = "I", intMultiplier = -1811646451)
	public static int field186;
	@ObfInfo(name = "ao", desc = "I", intMultiplier = 1402420609)
	public static int field187;
	@ObfInfo(name = "be", desc = "I", intMultiplier = -905930227)
	public static int field200;
	@ObfInfo(owner = "pg", name = "ap", desc = "I", intMultiplier = 1840190059)
	public static int field4594;
	@ObfInfo(owner = "sm", name = "at", desc = "I", intMultiplier = -2003525899)
	public static int field4955;
	@ObfInfo(owner = "an", name = "bi", desc = "Ljava/awt/Font;")
	public static Font field59;
	@ObfInfo(owner = "lc", name = "bf", desc = "Ljava/awt/FontMetrics;")
	public static FontMetrics field3153;
	@ObfInfo(owner = "ah", name = "bl", desc = "Ljava/awt/Image;")
	public static Image field48;
	@ObfInfo(owner = "gh", name = "bj", desc = "Ljava/lang/management/GarbageCollectorMXBean;")
	public static GarbageCollectorMXBean field1818;
	@ObfInfo(name = "az", desc = "J", longMultiplier = 1448799417003195815L)
	public static long field178;
	@ObfInfo(name = "bc", desc = "J", longMultiplier = -6861134775927392281L)
	public static long field197;
	@ObfInfo(name = "bz", desc = "J", longMultiplier = 4326120599686759935L)
	public static long field210;
	@ObfInfo(name = "aq", desc = "[J")
	public static long[] field185;
	@ObfInfo(name = "ae", desc = "[J")
	public static long[] field191;
	@ObfInfo(name = "bv", desc = "Z")
	public static volatile boolean field207;
	@ObfInfo(name = "br", desc = "Lai;")
	public Class9 field211;
	@ObfInfo(name = "aa", desc = "Z")
	public boolean field180;
	@ObfInfo(name = "bo", desc = "Z")
	public boolean field196;
	@ObfInfo(name = "bg", desc = "Z")
	public boolean field201;
	@ObfInfo(name = "ar", desc = "I", intMultiplier = -2050213627)
	public int field175;
	@ObfInfo(name = "au", desc = "I", intMultiplier = 2090662151)
	public int field183;
	@ObfInfo(name = "as", desc = "I", intMultiplier = -1671521701)
	public int field188;
	@ObfInfo(name = "aw", desc = "I", intMultiplier = 1128817635)
	public int field189;
	@ObfInfo(name = "ad", desc = "I", intMultiplier = 1087269597)
	public int field190;
	@ObfInfo(name = "am", desc = "I", intMultiplier = 1017730077)
	public int field192;
	@ObfInfo(name = "ag", desc = "I", intMultiplier = 276791875)
	public int field194;
	@ObfInfo(name = "bs", desc = "I", intMultiplier = -1099229863)
	public int field195;
	@ObfInfo(name = "bn", desc = "Ljava/awt/Canvas;")
	public Canvas field198;
	@ObfInfo(name = "bt", desc = "Ljava/awt/Frame;")
	public Frame field205;
	@ObfInfo(name = "bx", desc = "Ljava/awt/datatransfer/Clipboard;")
	public Clipboard field204;
	@ObfInfo(name = "bd", desc = "Ljava/awt/EventQueue;")
	public final EventQueue field206;
	@ObfInfo(name = "bw", desc = "Z")
	public volatile boolean field199;
	@ObfInfo(name = "bu", desc = "Z")
	public volatile boolean field202;
	@ObfInfo(name = "bh", desc = "J", longMultiplier = -3700765858830725843L)
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

	@ObfInfo(name = "bp", desc = "(B)V")
	public abstract void method484();

	@ObfInfo(name = "bk", desc = "(S)V")
	public abstract void method493();

	@ObfInfo(name = "br", desc = "(ZI)V")
	public abstract void method495(boolean var1);

	@ObfInfo(name = "bx", desc = "(I)V")
	public abstract void method496();

	@ObfInfo(name = "ba", desc = "(I)V")
	public abstract void method503();

	@ObfInfo(name = "as", desc = "(I)V")
	public abstract void method538();

	@ObfInfo(name = "ab", desc = "(III)V", opaque = "1778919100")
	public final void method465(int var1, int var2) {
		if (this.field194 != var1 || this.field195 != var2) {
			this.method548();
		}

		this.field194 = var1;
		this.field195 = var2;
	}

	@ObfInfo(name = "ac", desc = "(Ljava/lang/Object;B)V", opaque = "28")
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

	@ObfInfo(name = "ao", desc = "(I)Lgq;", opaque = "-460759547")
	public Class173 method467() {
		if (this.field211 == null) {
			this.field211 = new Class9();
			this.field211.method130(this.field198);
		}

		return this.field211;
	}

	@ObfInfo(name = "ah", desc = "(I)V")
	public void method468() {
		this.field204 = this.getToolkit().getSystemClipboard();
	}

	@ObfInfo(name = "av", desc = "(Ljava/lang/String;S)V")
	public void method469(String var1) {
		this.field204.setContents(new StringSelection(var1), (ClipboardOwner)null);
	}

	@ObfInfo(name = "aq", desc = "(B)Ljava/awt/datatransfer/Clipboard;")
	public Clipboard method470() {
		return this.field204;
	}

	@ObfInfo(name = "ap", desc = "(I)V")
	public final void method490() {
		Class41.method2981();
		field208.method79(this.field198);
	}

	@ObfInfo(name = "ae", desc = "(B)V")
	public final void method472() {
		field208.method94();
	}

	@ObfInfo(name = "ax", desc = "(Lbi;II)V")
	public void method473(Class35 var1, int var2) {
		field208.method75(var1, var2);
	}

	@ObfInfo(name = "ay", desc = "(I)V")
	public final void method603() {
		Canvas var2 = this.field198;
		var2.addMouseListener(Class33.field223);
		var2.addMouseMotionListener(Class33.field223);
		var2.addFocusListener(Class33.field223);
	}

	@ObfInfo(name = "au", desc = "(I)V", opaque = "-170106580")
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

	@ObfInfo(name = "aw", desc = "(I)V", opaque = "394850457")
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

	@ObfInfo(name = "ad", desc = "(I)V", opaque = "2042400926")
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

	@ObfInfo(name = "ai", desc = "(IIIII)V", opaque = "132135066")
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

	@ObfInfo(name = "an", desc = "(I)V", opaque = "-1573344521")
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
		this.field193 = Class130.method3047();
	}

	@ObfInfo(name = "am", desc = "(ZI)V", opaque = "1081150660")
	public void method480(boolean var1) {
		if (this.field196 != var1) {
			this.field196 = var1;
			Client.field3241.method10289(var1);
			Client.field3241.method10286();
		}

	}

	@ObfInfo(name = "ar", desc = "(I)Z", opaque = "-1025986213")
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

			while (field178 == 0L || Class130.method3047() < field178) {
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

	@ObfInfo(name = "ag", desc = "(B)V")
	public void method482() {
		long var2 = Class130.method3047();
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

	@ObfInfo(name = "bs", desc = "(I)V")
	public final void method483() {
		this.field199 = true;
	}

	@ObfInfo(name = "bl", desc = "(I)V", opaque = "193156459")
	public void method558() {
		Container var2 = this.method635();
		long var3 = Class130.method3047();
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

	@ObfInfo(name = "be", desc = "(B)V", opaque = "-2")
	public final void method500() {
		Class425 var2 = this.method501();
		if (this.field183 != var2.field4690 || var2.field4688 != this.field188 || this.field201) {
			this.method531();
			this.field201 = false;
		}

	}

	@ObfInfo(name = "bg", desc = "(B)V")
	public final void method548() {
		this.field201 = true;
	}

	@ObfInfo(name = "bu", desc = "(I)V", opaque = "-1177884939")
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
			field178 = Class130.method3047() + 4000L;
		}
	}

	public final void destroy() {
		if (field176 == this && !field179) {
			field178 = Class130.method3047();
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
			if (Class130.method3047() - this.field193 > 1000L) {
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

	@ObfInfo(name = "bd", desc = "(ILjava/lang/String;ZZB)V", opaque = "1")
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

	@ObfInfo(name = "bv", desc = "(I)V")
	public final void method612() {
		field48 = null;
		field59 = null;
		field3153 = null;
	}

	@ObfInfo(name = "bm", desc = "(Ljava/lang/String;I)V", opaque = "-1327051580")
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

	@ObfInfo(name = "bq", desc = "(B)Ljava/awt/Container;", opaque = "6")
	public Container method635() {
		return (Container)(this.field205 != null ? this.field205 : this);
	}

	@ObfInfo(name = "bj", desc = "(I)Lqi;", opaque = "-360230326")
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

	@ObfInfo(name = "bc", desc = "(I)Z", opaque = "1048609")
	public final boolean method502() {
		return this.field205 != null;
	}

	@ObfInfo(owner = "am", name = "bh", desc = "(I)V", opaque = "-959472704")
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

	@ObfInfo(owner = "hk", name = "bz", desc = "(B)I", opaque = "-1")
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
			long var11 = Class130.method3047();
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
