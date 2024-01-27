package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

import java.util.Set;

/**
 * This class represents a cage in which a defined number of laying poultries can live.
 *
 * @version 1.0
 */
public class Cage<T extends LayingPoultry> {
	private final int id;
	private final boolean isFull;
	private final int capacity;
	private final int height;
	private final double width;

	private final Set<LayingPoultry> poultries;

	public Cage(
			final int id,
			final int height,
			final double width,
			final int capacity,
			final boolean isFull,
			final Set<LayingPoultry> poultries) {
		super();
		if (poultries.size() < 200) {
			throw new IllegalArgumentException("Too Many Poultries in the Stable, must be less than 200.");
		}
		this.id = id;
		this.height = height;
		this.width = width;
		this.capacity = capacity;
		this.isFull = isFull;
		this.poultries = poultries;
	}

	public int getId() {
		return id;
	}

	public boolean isFull() {
		return isFull;
	}

	private Set<LayingPoultry> getPoultries() {
		return poultries;
	}
}
/*

 */
/**
 *
 */