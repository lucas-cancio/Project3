package main;

import java.util.Objects;

/**
 * AABB.java
 * 
 * Axis-aligned bounding box used to store collider hitbox information.
 * 
 * @author Daniel
 *
 */
public class AABB{
	public float lowerBoundX;
	public float lowerBoundY;
	
	public float upperBoundX;
	public float upperBoundY;
	
	public boolean isOverlapping(AABB aabb) {
		if (lowerBoundX > aabb.upperBoundX || lowerBoundY > aabb.upperBoundY ||
				aabb.lowerBoundX > upperBoundX || aabb.lowerBoundY > upperBoundY)
			return false;

		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof AABB)) return false;
		AABB aabb = (AABB) o;
		return Float.compare(aabb.lowerBoundX, lowerBoundX) == 0 &&
				Float.compare(aabb.lowerBoundY, lowerBoundY) == 0 &&
				Float.compare(aabb.upperBoundX, upperBoundX) == 0 &&
				Float.compare(aabb.upperBoundY, upperBoundY) == 0;
	}

	@Override
	public int hashCode() {
		return Objects.hash(lowerBoundX, lowerBoundY, upperBoundX, upperBoundY);
	}
}
