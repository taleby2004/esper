package com.espertech.esperio.message.fix;

/**
 * Indicates an invalid Fix message.
 */
public class FixMsgInvalidException extends FixMsgParserException
{
    /**
     * Ctor.
     * @param message invalid fix message
     */
    public FixMsgInvalidException(String message) {
        super(message);
    }
}
