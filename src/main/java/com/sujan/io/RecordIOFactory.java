package com.sujan.io;

public class RecordIOFactory {
    public RecordIO getRecordIO(String fileName) {
        if (fileName.endsWith(".csv")) {
            return new CsvRecordInputOutput();
        } else if (fileName.endsWith(".json")) {
            return new JsonRecordInputOutput();
        } else if (fileName.endsWith(".xml")) {
            return new XmlRecordInputOutput();
        } else {
            throw new UnsupportedOperationException();
        }
    }
}