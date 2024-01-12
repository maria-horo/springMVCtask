package activity;

import java.util.Comparator;

public class CompareByName implements Comparator<Student>{
	@Override
	public int compare(Student x, Student y) {
		return y.name.compareTo(x.name);
	}
}
