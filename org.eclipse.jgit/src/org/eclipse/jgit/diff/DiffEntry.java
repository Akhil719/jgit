/** A value class representing a change to a file */
	 * @throws IOException
	 * @throws IllegalArgumentException
	 * @throws IOException
	 * @throws IllegalArgumentException
	 * @throws IOException
	 * @throws IllegalArgumentException
		List<DiffEntry> r = new ArrayList<DiffEntry>();
	/** @return the old file mode, if described in the patch */
	/** @return the new file mode, if described in the patch */
	/** @return the type of change this patch makes on {@link #getNewPath()} */
	 *         {@link ChangeType#COPY} or {@link ChangeType#RENAME}.
	 *            and {@link Integer#SIZE}).
	 *
	 * @return true, if the tree filter matched; false if not
}