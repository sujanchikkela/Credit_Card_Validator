package com.sujan.io;

import org.junit.Test;

import static org.junit.Assert.assertThrows;

public class RecordIOFactoryTest {

    @Test
    public void test_recordIOFactory_CSV() {
        RecordIOFactory factory = new RecordIOFactory();
        assert (factory.getRecordIO("file.csv") instanceof CsvRecordInputOutput);
    }

    @Test
    public void test_recordIOFactory_XML() {
        RecordIOFactory factory = new RecordIOFactory();
        assert (factory.getRecordIO("file.xml") instanceof XmlRecordInputOutput);
    }

    @Test
    public void test_recordIOFactory_JSON() {
        RecordIOFactory factory = new RecordIOFactory();
        assert (factory.getRecordIO("file.json") instanceof JsonRecordInputOutput);
    }

    @Test
    public void test_recordIOFactory_unsupported() {
        RecordIOFactory factory = new RecordIOFactory();
        assertThrows(UnsupportedOperationException.class, () -> factory.getRecordIO("file.proto"));
    }

}

