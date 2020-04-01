package practice.domain;

public class Student {
	private String name;
	private int age;

	/**
	 * 重写hashcode方法，建立Student对象的hash算法内容 通过学生对象特有的姓名和年龄算出hash值
	 */
	@Override
	public int hashCode() {
		final int NUM = 31;
		return name.hashCode() + age * NUM;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student)) {
			throw new ClassCastException("类型错误");
		}
		Student stu = (Student) obj;
		return this.name == stu.name && this.age == stu.age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
