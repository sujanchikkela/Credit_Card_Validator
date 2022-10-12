package com.sujan.io;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.sujan.CreditCard.CreditCard;
import com.sujan.CreditCard.CreditCardFactory;
import com.sujan.CreditCard.OutputRecord;
import com.sujan.CreditCard.FetchCards;

import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import org.json.JSONObject;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRecordInputOutput implements RecordIO {

    @Override
    public List<CreditCard> read(String filename) {
//        List<CreditCard> records = new ArrayList<>();
//        File file = new File(filename);
//        try (Reader reader = new FileReader(file)) {
//            InputStream inJson = SampleDTO.class.getResourceAsStream("/test.json");
//            SampleDTO sample = new ObjectMapper().readValue(inJson, SampleDTO.class);
//            MappingIterator<CreditCard> mi = getJsonReader().readValues(reader);
//            while (mi.hasNext()) {
//                CreditCard current = mi.next();
//                records.add(current);
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            InputStream json = FetchCards.class.getResourceAsStream("/input.json");
            FetchCards fetchCards = new ObjectMapper().readValue(json, FetchCards.class);
            return fetchCards.getCards();
        }
        catch (IOException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }


    @Override
    public boolean write(String filename, List<CreditCard> records) {
        File file = new File(filename);
        List<OutputRecord> outputRecordList = getOutputRecords(records);

        JSONObject obj = new JSONObject();
        ObjectMapper mapper = new ObjectMapper();
        try {
            obj.put("cards",outputRecordList);
//            getJsonMapper().writeValue(file,obj.);
            FileWriter writer = new FileWriter(file);
            writer.write(obj.toString());
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    private ObjectReader getJsonReader() {
        return getJsonMapper().readerFor(CreditCard.class);
    }

    private JsonMapper getJsonMapper() {
        JsonMapper mapper = new JsonMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.UPPER_CAMEL_CASE);
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        return mapper;
    }

    private List<OutputRecord> getOutputRecords(List<CreditCard> creditCards) {
        return creditCards
                .stream()
                .map(record -> {
                    String cardNumber = record.getCardNumber();
                    try {
                        return new OutputRecord(
                                cardNumber,
                                new CreditCardFactory().getCreditCard(cardNumber).toString());
                    } catch (UnsupportedOperationException e) {
                        return new OutputRecord(
                                cardNumber,
                                e.getMessage()
                        );
                    }
                })
                .collect(Collectors.toList());
    }
}
