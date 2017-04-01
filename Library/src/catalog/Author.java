package catalog;

/*�������� ���� �����, ����� ���������� �� ����� ������. ������� ������ ����������
 ������:
 - ��*�;
 - ��������;
 ������ ���������������� ���� ������ �� ����� �����. �������� ����������� ����
 ������ ��� ���������.*/
public class Author extends Human {
	private String name;
	private String surname;

	public Author(int hight, int weight, int age, String name, String surname) {
		super(hight, weight, age);
		this.name = name;
		this.surname = surname;
	}

	public  String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Author other = (Author) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "{" + name + "," + surname + "}";
	}
}
