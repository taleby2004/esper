package com.espertech.esperio.message.fix;

/**
 * Exception parsing a fix message.
 */
public class FixMsgUnrecognizableException extends FixMsgParserException
{
    /**
     * Ctor.
     * @param message error message
     * @param fixMsgText fix text
     */
    public FixMsgUnrecognizableException(String message, String fixMsgText) {
        super(message + " for message text '" + fixMsgText + "'");
    }

    /**
     * Ctor.
     * @param message error message
     */
    public FixMsgUnrecognizableException(String message) {
        super(message);
    }
}
