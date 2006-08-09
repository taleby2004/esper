package net.esper.csv;

/**
 * An exception thrown by the CSVAdapter in processing CSV files
 * and sending CSV entries as events to the runtime engine.
 */
public class CSVAdapterException extends RuntimeException
{
	/**
	 * Ctor.
	 * @param cause - inner exception
	 */
	public CSVAdapterException(Throwable cause)
	{
		super(cause);
	}
	
	/**
	 * Ctor.
	 * @param message - error message
	 */
	public CSVAdapterException(String message)
	{
		super(message);
	}

	/**
	 * @param message - error message
	 * @param cause - inner exception
	 */
	public CSVAdapterException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
