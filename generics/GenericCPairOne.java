package generics;

public class GenericCPairOne<E> {
	E first;
	E second;
	public GenericCPairOne(E f, E g) {
		// TODO Auto-generated constructor stub
		this.first = f;
		this.second = g;
	}
	
	public E getObject() {
		return this.first ;
	}

}
