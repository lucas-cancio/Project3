package main;

import java.util.Objects;

/**
 * Collider.java
 * 
 * Square collider object with position, size, velocity, and AABB.
 * 
 * @author Daniel
 *
 */
public class Collider{
	
	private float x, y;
	private final float size;
	
	private float velX, velY;
	
	private AABB aabb;
	
	public Collider(float x, float y, float size, float velX, float velY){
		this.x = x;
		this.y = y;
		this.size = size;
		this.velX = velX;
		this.velY = velY;
		
		aabb = new AABB();
	}
	
	public void update(){
		
		// Update position
		x += velX;
		y += velY;
		
		// Update AABB
		aabb.lowerBoundX = x - (size / 2);
		aabb.lowerBoundY = y - (size / 2);
		
		aabb.upperBoundX = x + (size / 2);
		aabb.upperBoundY = y + (size / 2);
	}

	
	public void setX(float x){
		this.x = x;
	}
	
	public float getX(){
		return x;
	}
	
	public void setY(float y){
		this.y = y;
	}
	
	public float getY(){
		return y;
	}
	
	public float getSize(){
		return size;
	}
	
	public void setVelX(float velX){
		this.velX = velX;
	}
	
	public float getVelX(){
		return velX;
	}
	
	public void setVelY(float velY){
		this.velY = velY;
	}
	
	public float getVelY(){
		return velY;
	}
	
	public AABB getAABB(){
		return aabb;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Collider)) return false;
		Collider collider = (Collider) o;
		return Float.compare(collider.x, x) == 0 &&
				Float.compare(collider.y, y) == 0 &&
				Float.compare(collider.size, size) == 0 &&
				Float.compare(collider.velX, velX) == 0 &&
				Float.compare(collider.velY, velY) == 0 &&
				aabb.equals(collider.aabb);
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y, size, velX, velY, aabb);
	}
}
