package pojo;

public class Employee {
	private String name;
	private String company;

	public Employee() {
	}

	public Employee(final String name, final String company) {
		this.name = name;
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(final String company) {
		this.company = company;
	}

	public static class builder {
		private String name;
		private String company;


		public builder() {
		}

		public builder name(final String name) {
			this.name = name;
			return this;
		}

		public builder company(final String company) {
			this.company = company;
			return this;
		}

		public Employee build() {
			return new Employee(
					name,
					company
			);
		}
	}
}
