package exercice1;

public abstract class Content {

	private int id;
	private String name;
	private String dateOfReproduction;
	Rate rate;

	public Content() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfReproduction() {
		return dateOfReproduction;
	}

	public void setDateOfReproduction(String dateOfReproduction) {
		this.dateOfReproduction = dateOfReproduction;
	}

	public Rate getRate() {
		return rate;
	}

	public final void setRate(String rates) {
		switch (rates) {
		case "LIKE":
			rate = Rate.LIKE;
			break;
		case "DONT LIKE":
			rate = Rate.DONT_LIKE;
			break;
		case "WITHOUT":
			rate = Rate.WITHOUT;
			break;
			
		case "BIGLIKE":
			rate=Rate.BIGLIKE;
			break;

		}
	}

	@Override
	public String toString() {
		return "Content [id=" + id + ", name=" + name + ", dateOfReproduction=" + dateOfReproduction + ", rate=" + rate
				+  "]";
	}

}
