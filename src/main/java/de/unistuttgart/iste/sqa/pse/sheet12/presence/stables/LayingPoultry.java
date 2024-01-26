package de.unistuttgart.iste.sqa.pse.sheet12.presence.stables;

import java.util.Optional;

/**
 * This class represents a laying poultry which can be bred in the stable.
 *
 * @version 1.0
 * @AmoresSchneyinck
 */
public class LayingPoultry {
	private final int id;
	private final String type;
	private final double age;
	private final double weight;

	private final Optional<Veterinary> veterinary;

	public LayingPoultry(
			final int id,
			final String type,
			final double age,
			final double weight,
			final Optional<Veterinary> veterinary) {
		super();
		this.id = id;
		this.type = type;
		this.age = age;
		this.weight = weight;
		this.veterinary = veterinary;
	}

	public double getWeight() {
		return weight;
	}
}
