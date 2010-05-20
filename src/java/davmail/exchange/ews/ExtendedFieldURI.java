/*
 * DavMail POP/IMAP/SMTP/CalDav/LDAP Exchange Gateway
 * Copyright (C) 2010  Mickael Guessant
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package davmail.exchange.ews;

import java.io.IOException;
import java.io.Writer;

/**
 * Extended MAPI property.
 */
public class ExtendedFieldURI implements FieldURI {
    protected final String propertyTag;
    protected final String propertyType;

    public ExtendedFieldURI(String propertyTag, String propertyType) {
        this.propertyTag = propertyTag;
        this.propertyType = propertyType;
    }

    public void write(Writer writer) throws IOException {
        writer.write("<t:ExtendedFieldURI PropertyTag=\"");
        writer.write(propertyTag);
        writer.write("\" PropertyType=\"");
        writer.write(propertyType);
        writer.write("\"/>");
    }

    public static final ExtendedFieldURI PR_INSTANCE_KEY = new ExtendedFieldURI("0x0FF6", "Binary");
    public static final ExtendedFieldURI PR_MESSAGE_SIZE = new ExtendedFieldURI("0x0E08", "Integer");
    public static final ExtendedFieldURI PR_INTERNET_ARTICLE_NUMBER = new ExtendedFieldURI("0x0E23", "Integer");
    public static final ExtendedFieldURI JUNK_FLAG = new ExtendedFieldURI("0x1083", "Integer");
    public static final ExtendedFieldURI PR_FLAG_STATUS = new ExtendedFieldURI("0x1090", "Integer");
    public static final ExtendedFieldURI PR_MESSAGE_FLAGS = new ExtendedFieldURI("0x0E07", "Integer");
    public static final ExtendedFieldURI PR_ACTION_FLAG = new ExtendedFieldURI("0x1081", "Integer");
}
