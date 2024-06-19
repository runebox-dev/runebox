import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Class33 implements MouseListener, MouseMotionListener, FocusListener {
	public static Class33 field223;
	public static Class382 field2397;
	public static int field220;
	public static int field227;
	public static int field229;
	public static int field237;
	public static int field238;
	public static int field239;
	public static long field232;
	public static long field240;
	public static volatile int field224;
	public static volatile int field225;
	public static volatile int field226;
	public static volatile int field233;
	public static volatile int field234;
	public static volatile int field241;
	public static volatile int field244;
	public static volatile long field228;
	public static volatile long field236;

	static {
		field223 = new Class33();
		field241 = 0;
		field225 = 0;
		field226 = -1;
		field233 = -1;
		field228 = -1L;
		field227 = 0;
		field229 = 0;
		field220 = 0;
		field232 = 0L;
		field224 = 0;
		field244 = 0;
		field234 = 0;
		field236 = 0L;
		field237 = 0;
		field238 = 0;
		field239 = 0;
		field240 = 0L;
	}

	public final int method678(MouseEvent var1) {
		int var3 = var1.getButton();
		if (!var1.isAltDown() && var3 != 2) {
			return !var1.isMetaDown() && var3 != 3 ? 1 : 2;
		} else {
			return 4;
		}
	}

	public final synchronized void mousePressed(MouseEvent var1) {
		if (field223 != null) {
			field241 = 0;
			field244 = var1.getX();
			field234 = var1.getY();
			field236 = Class327.method3047();
			field224 = this.method678(var1);
			if (field224 != 0) {
				field225 = field224;
			}
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseReleased(MouseEvent var1) {
		if (field223 != null) {
			field241 = 0;
			field225 = 0;
		}

		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final void mouseClicked(MouseEvent var1) {
		if (var1.isPopupTrigger()) {
			var1.consume();
		}

	}

	public final synchronized void mouseEntered(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseExited(MouseEvent var1) {
		if (field223 != null) {
			field241 = 0;
			field226 = -1;
			field233 = -1;
			field228 = var1.getWhen();
		}

	}

	public final synchronized void mouseDragged(MouseEvent var1) {
		this.mouseMoved(var1);
	}

	public final synchronized void mouseMoved(MouseEvent var1) {
		if (field223 != null) {
			field241 = 0;
			field226 = var1.getX();
			field233 = var1.getY();
			field228 = var1.getWhen();
		}

	}

	public final void focusGained(FocusEvent var1) {
	}

	public final synchronized void focusLost(FocusEvent var1) {
		if (field223 != null) {
			field225 = 0;
		}

	}

	public static Class228 method714(int var0) {
		Class228 var2 = (Class228)Class228.field2393.method5993((long)var0);
		if (var2 != null) {
			return var2;
		} else {
			byte[] var3 = field2397.method7216(14, var0);
			var2 = new Class228();
			if (var3 != null) {
				var2.method4389(new Class521(var3));
			}

			Class228.field2393.method5987(var2, (long)var0);
			return var2;
		}
	}

	public static void method4769(Component var0) {
		var0.removeMouseListener(field223);
		var0.removeMouseMotionListener(field223);
		var0.removeFocusListener(field223);
		field225 = 0;
	}

	public static int method5159() {
		return ++field241 - 1;
	}
}
