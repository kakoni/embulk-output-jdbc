package org.embulk.output.jdbc.setter;

import java.util.Calendar;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Date;
import org.embulk.spi.time.Timestamp;
import org.embulk.output.jdbc.JdbcColumn;
import org.embulk.output.jdbc.BatchInsert;

public class SqlDateColumnSetter
        extends ColumnSetter
{
    private final Calendar calendar;

    public SqlDateColumnSetter(BatchInsert batch, JdbcColumn column,
            DefaultValueSetter defaultValue,
            Calendar calendar)
    {
        super(batch, column, defaultValue);
        this.calendar = calendar;
    }

    @Override
    public void nullValue() throws IOException, SQLException
    {
        defaultValue.setSqlDate();
    }

    @Override
    public void booleanValue(boolean v) throws IOException, SQLException
    {
        defaultValue.setSqlDate();
    }

    @Override
    public void longValue(long v) throws IOException, SQLException
    {
        defaultValue.setSqlDate();
    }

    @Override
    public void doubleValue(double v) throws IOException, SQLException
    {
        defaultValue.setSqlDate();
    }

    @Override
    public void stringValue(String v) throws IOException, SQLException
    {
        defaultValue.setSqlDate();
    }

    @Override
    public void timestampValue(Timestamp v) throws IOException, SQLException
    {
        batch.setSqlDate(v, calendar);
    }
}
