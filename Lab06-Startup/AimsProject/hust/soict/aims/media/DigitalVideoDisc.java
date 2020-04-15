package hust.soict.aims.media;

public class DigitalVideoDisc {

	private String title;

	private String category;

	private String director;

	private int length;

	private float cost;

	/**
	 * Constructor for DigitalVideoDisc
	 */
	public DigitalVideoDisc() {
		super();
	}

	/**
	 * Returns the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * Sets the title
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return Returns the category.
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            The category to set.
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return Returns the cost.
	 */
	public float getCost() {
		return cost;
	}

	/**
	 * @param cost
	 *            The cost to set.
	 */
	public void setCost(float cost) {
		this.cost = cost;
	}

	/**
	 * @return Returns the director.
	 */
	public String getDirector() {
		return director;
	}

	/**
	 * @param director
	 *            The director to set.
	 */
	public void setDirector(String director) {
		this.director = director;
	}

	/**
	 * @return Returns the length.
	 */
	public int getLength() {
		return length;
	}

	/**
	 * @param length
	 *            The length to set.
	 */
	public void setLength(int length) {
		this.length = length;
	}
}