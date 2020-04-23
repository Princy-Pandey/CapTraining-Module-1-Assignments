package LabAssignment2;

public abstract class Item {
	private String title;
	private int numberOfCopies, id;
	
	public Item(String title, int numberOfCopies, int id) {
		this.title = title;
		this.numberOfCopies = numberOfCopies;
		this.id = id;
	}
	

	@Override
	public String toString() {
		return "Item [title=" + title + ", numberOfCopies=" + numberOfCopies + ", id=" + id + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id != other.id)
			return false;
		if (numberOfCopies != other.numberOfCopies)
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		return true;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getNumberOfCopies() {
		return numberOfCopies;
	}

	public void setNumberOfCopies(int numberOfCopies) {
		this.numberOfCopies = numberOfCopies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public abstract void print();
	
	public void checkIn()
	{
		
	}
}
