package jagerfield.comparison.lib.FieldElements.EventElements;

import android.database.Cursor;
import android.provider.ContactsContract;
import jagerfield.comparison.lib.Abstracts.ElementParent;
import jagerfield.comparison.lib.Utilities.Utility;
import com.google.gson.annotations.Expose;

public class EventTypeElement extends ElementParent
{
    @Expose
    private String eventType = "";
    @Expose
    private final String elementType;
    public static final String column = ContactsContract.CommonDataKinds.Event.TYPE;
    public static final String mime = ContactsContract.CommonDataKinds.Event.CONTENT_ITEM_TYPE;

    public EventTypeElement(Cursor cursor)
    {
        elementType = this.getClass().getSimpleName();
        setValue(cursor);
    }
    @Override
    public String getElementType()
    {
        return elementType;
    }
    @Override
    public String getValue()
    {
        return eventType;
    }
    @Override
    public void setValue(Cursor cursor)
    {
        if (cursor==null)
        {
            return;
        }

        eventType = Utility.getEventType(Utility.getColumnIndex(cursor, column));

        if (eventType == null)
        {
            eventType = "OTHER";
        }
    }

}