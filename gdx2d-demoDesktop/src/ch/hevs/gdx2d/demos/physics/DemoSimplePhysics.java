package ch.hevs.gdx2d.demos.physics;

import ch.hevs.gdx2d.components.physics.primitives.PhysicsBox;
import ch.hevs.gdx2d.components.physics.primitives.PhysicsCircle;
import ch.hevs.gdx2d.components.physics.primitives.PhysicsStaticBox;
import ch.hevs.gdx2d.components.physics.utils.PhysicsScreenBoundaries;
import ch.hevs.gdx2d.desktop.PortableApplication;
import ch.hevs.gdx2d.desktop.physics.DebugRenderer;
import ch.hevs.gdx2d.lib.GdxGraphics;
import ch.hevs.gdx2d.lib.physics.PhysicsWorld;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.physics.box2d.World;

/**
 * Demonstrates the basic usage of the physics with a simple demo
 * Based on examples from box2d
 *
 * @author Pierre-André Mudry (mui)
 * @version 1.13
 */
public class DemoSimplePhysics extends PortableApplication {

	// Contains all the objects that will be simulated
	World world = PhysicsWorld.getInstance();
	PhysicsCircle ball;
	DebugRenderer debugRenderer;

	public static void main(String[] args) {
		new DemoSimplePhysics();
	}

	@Override
	public void onInit() {
		setTitle("Simple physics simulation, mui 2013");

		int w = getWindowWidth(), h = getWindowHeight();

		// Build the walls around the screen
		new PhysicsScreenBoundaries(w, h);

		// The slope on which the objects roll
		new PhysicsStaticBox("slope", new Vector2(w / 2, h / 2), w / 3 * 2, 16, (float) Math.PI / 12.0f);

		// Build the falling object
		ball = new PhysicsCircle("none", new Vector2(w * 0.7f, h - 0.1f * h), 12, 0.5f, 0.3f, 0.3f);
		ball.setBodyLinearVelocity(-1f, 1);

		// Build the dominoes
		int nDominoes = 20;
		int dominoSpace = (w - 60) / nDominoes;

		for (int i = 0; i < nDominoes; i++) {
			new PhysicsBox("box" + i, new Vector2(60 + i * dominoSpace, 120), 6, 60, 0.1f, 0.1f, 0.3f);
		}

		debugRenderer = new DebugRenderer();
	}

	@Override
	public void onGraphicRender(GdxGraphics g) {
		g.clear();

		debugRenderer.render(world, g.getCamera().combined);
		PhysicsWorld.updatePhysics(Gdx.graphics.getRawDeltaTime());

		g.drawSchoolLogoUpperRight();
		g.drawFPS();
	}

}
