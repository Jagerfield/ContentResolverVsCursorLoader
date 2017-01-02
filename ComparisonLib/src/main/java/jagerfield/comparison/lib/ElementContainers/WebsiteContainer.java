package jagerfield.comparison.lib.ElementContainers;

import android.database.Cursor;
import jagerfield.comparison.lib.FieldElements.WebsiteElement.WebsiteElement;
import jagerfield.comparison.lib.Utilities.Utility;
import com.google.gson.annotations.Expose;

import java.util.HashSet;
import java.util.Set;

public class WebsiteContainer
{
    @Expose
    private WebsiteElement website;

    public WebsiteContainer(Cursor cursor)
    {
        website = new WebsiteElement(cursor);
    }

    public static Set<String> getFieldColumns()
    {
        Set<String> columns = new HashSet<>();
        columns.add(WebsiteElement.column);
        return columns;
    }

    public String getWebsite()
    {
        String result = Utility.elementValue(website);
        return result;
    }

}