package main;

import java.util.Objects;

/**
 * Collision.java
 * 
 * Collision object containing a pair of objects.
 * 
 * @author Daniel
 *
 */
public class Collision{
	
	public Collider collider1;
	public Collider collider2;
	
	public Collision(Collider collider1, Collider collider2){
		this.collider1 = collider1;
		this.collider2 = collider2;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Collision)) return false;
		Collision collision = (Collision) o;
		return collider1.equals(collision.collider1) &&
				collider2.equals(collision.collider2);
	}

	@Override
	public int hashCode() {
		return Objects.hash(collider1, collider2);
	}
}
