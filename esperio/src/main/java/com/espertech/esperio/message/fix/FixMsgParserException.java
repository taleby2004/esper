package com.espertech.esperio.message.fix;

/**
 * Exception parsing a fix message.
 */
public class FixMsgParserException extends Exception
{
    /**
     * Ctor.
     * @param message error message
     */
    public FixMsgParserException(String message) {
        super(message);
    }

    /**
     * Ctor.
     * @param message error message
     * @param cause inner exception
     */
    public FixMsgParserException(String message, Throwable cause) {
        super(message, cause);
    }
}
