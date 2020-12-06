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
//	@Override
//	public boolean equals(Object object) {
//
//		if (object instanceof Collision) {
//			Collision other = (Collision) object;
//			if (this.collider1.getAABB().lowerBoundX == other.collider2.getAABB().lowerBoundX &&
//				this.collider1.getAABB().lowerBoundY == other.collider2.getAABB().lowerBoundY &&
//				this.collider1.getAABB().upperBoundX == other.collider2.getAABB().upperBoundX &&
//				this.collider1.getAABB().upperBoundY == other.collider2.getAABB().upperBoundY){
//				return true;
//			}
//			else{
//				return false;
//			}
//		}
//		return false;
//	}

//	@Override
//	public boolean equals(Object obj) {
//		return (this.firstName.equals(((User) obj).firstName)
//				&& this.lastName.equals(((User) obj).lastName) && this.email
//				.equals(((User) obj).email));
//	}
}
