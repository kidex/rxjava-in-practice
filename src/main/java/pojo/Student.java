package pojo;

public class Student {
	private String name;
	private Double firstGrade;
	private Double secondGrade;
	private Double thirdGrade;
	private Double averageGrade;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static class builder {
		private String name;
		private Double firstGrade;
		private Double secondGrade;
		private Double thirdGrade;
		private Double averageGrade;


		public builder () {}

		public builder name(String name) {
			this.name = name;
			return this;
		}

		public builder firstGrade(Double firstGrade) {
			this.firstGrade = firstGrade;
			return this;
		}

		public builder secondGrade(Double secondGrade) {
			this.secondGrade = secondGrade;
			return this;
		}

		public builder thirdGrade(Double thirdGrade) {
			this.thirdGrade = thirdGrade;
			return this;
		}

		public builder averageGrade(Double averageGrade) {
			this.averageGrade = averageGrade;
			return this;
		}

		public Student build() {
			return new Student(
					name,
					firstGrade,
					secondGrade,
					thirdGrade,
					averageGrade
			);
		}
	}

	public Double getFirstGrade() {
		return firstGrade;
	}

	public void setFirstGrade(Double firstGrade) {
		this.firstGrade = firstGrade;
	}

	public Double getSecondGrade() {
		return secondGrade;
	}

	public void setSecondGrade(Double secondGrade) {
		this.secondGrade = secondGrade;
	}

	public Double getThirdGrade() {
		return thirdGrade;
	}

	public void setThirdGrade(Double thirdGrade) {
		this.thirdGrade = thirdGrade;
	}

	public Double getAverageGrade() {
		return averageGrade;
	}

	public void setAverageGrade(Double averageGrade) {
		this.averageGrade = averageGrade;
	}

	public Student computeAndSetAverageGrade() {
		this.averageGrade = Double.parseDouble(String.format("%.2f", (this.firstGrade + this.secondGrade + this.thirdGrade) / 3));
		return this;
	}

	public Student() {
		this.firstGrade = 1.0;
		this.secondGrade = 1.0;
		this.thirdGrade = 1.0;
		this.averageGrade = 1.0;
	}

	public Student(String name, Double firstGrade, Double secondGrade, Double thirdGrade, Double averageGrade) {
		this.name = name;
		this.firstGrade = firstGrade;
		this.secondGrade = secondGrade;
		this.thirdGrade = thirdGrade;
		this.averageGrade = averageGrade;
	}
}
