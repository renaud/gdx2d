package hevs.gdx2d.demos.shaders;

import hevs.gdx2d.components.geometry.Vector2D;
import hevs.gdx2d.components.graphics.Polygon;
import hevs.gdx2d.lib.GdxGraphics;
import hevs.gdx2d.lib.PortableApplication;

import com.badlogic.gdx.graphics.Color;

/**
 * 
 * Shows how to interwind shaders and normal GDX operations
 * @author Pierre-André Mudry (mui)
 * @version 0.1
 */
public class DemoShaderSimple extends PortableApplication{

	public DemoShaderSimple(boolean onAndroid) {
		super(onAndroid);
	}
	
	@Override
	public void onInit() {	
		this.setTitle("Simple shader demo, mui 2013");
	}
	
	@Override
	public void onGraphicRender(GdxGraphics g) {
		if(g.shaderRenderer == null)
			g.setShader("data/shader/pulse.fs");
		
		g.clear();
		
		// Draws a yellow circle
		g.setColor(Color.YELLOW);
		g.drawCircle(30, 30, 20);
		
		// Draws the shader
		g.drawShader();
		
		// Draws a green rectangle
		g.setColor(Color.GREEN);
		
		g.drawFilledRectangle(80, 30, 10, 10, 0, Color.RED);
		g.drawFilledRectangle(80, 30, 20, 20, 0, new Color(0.5f, 0.5f, 0.5f, 0.5f));
		
		// Draws a blue polygon
		Vector2D points[] = {
				new Vector2D(200, 200),
				new Vector2D(250, 250),
				new Vector2D(300, 200)				
		};
		
		Polygon p = new Polygon(points);
		g.drawFilledPolygon(p, Color.BLUE);
		
	}
		
	public static void main(String args[]){
		new DemoShaderSimple(false);
	}
}
