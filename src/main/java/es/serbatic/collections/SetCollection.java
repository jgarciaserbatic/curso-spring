package es.serbatic.collections;

import java.util.Set;

public class SetCollection implements Collection {

	private Set<String> set;

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "SetCollection [set=" + set + "]";
	}
}
