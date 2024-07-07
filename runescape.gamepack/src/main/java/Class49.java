import io.runebox.ObfInfo;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Shape;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.util.Hashtable;

@ObfInfo(name = "bw")
public final class Class49 extends Class569 {
	@ObfInfo(name = "ak", desc = "Ljava/awt/Component;")
	public Component field337;
	@ObfInfo(name = "al", desc = "Ljava/awt/Image;")
	public Image field338;

	public Class49(int var1, int var2, Component var3, boolean var4) {
		super.field5484 = var1;
		super.field5482 = var2;
		super.field5480 = new int[1 + var2 * var1];
		if (var4) {
			super.field5483 = new float[var2 * var1 + 1];
		}

		DataBufferInt var5 = new DataBufferInt(super.field5480, super.field5480.length);
		DirectColorModel var6 = new DirectColorModel(32, 16711680, 65280, 255);
		WritableRaster var7 = Raster.createWritableRaster(var6.createCompatibleSampleModel(super.field5484, super.field5482), var5, (Point)null);
		this.field338 = new BufferedImage(var6, var7, false, new Hashtable());
		this.method889(var3);
		this.method10286();
	}

	@ObfInfo(name = "ak", desc = "(Ljava/awt/Component;I)V")
	public final void method889(Component var1) {
		this.field337 = var1;
	}

	@ObfInfo(name = "al", desc = "(III)V")
	public final void method877(int var1, int var2) {
		this.method879(this.field337.getGraphics(), var1, var2);
	}

	@ObfInfo(name = "aj", desc = "(IIIII)V")
	public final void method875(int var1, int var2, int var3, int var4) {
		this.method891(this.field337.getGraphics(), var1, var2, var3, var4);
	}

	@ObfInfo(name = "az", desc = "(Ljava/awt/Graphics;III)V")
	public final void method879(Graphics var1, int var2, int var3) {
		try {
			var1.drawImage(this.field338, var2, var3, this.field337);
		} catch (Exception var6) {
			this.field337.repaint();
		}

	}

	@ObfInfo(name = "af", desc = "(Ljava/awt/Graphics;IIIIB)V")
	public final void method891(Graphics var1, int var2, int var3, int var4, int var5) {
		try {
			Shape var7 = var1.getClip();
			var1.clipRect(var2, var3, var4, var5);
			var1.drawImage(this.field338, 0, 0, this.field337);
			var1.setClip(var7);
		} catch (Exception var8) {
			this.field337.repaint();
		}

	}
}
