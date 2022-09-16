package org.example;

import org.neo4j.graphdb.*;
import org.neo4j.logging.Log;
import org.neo4j.procedure.*;

import java.util.stream.Stream;

public class UpdateUmbrellaSpreadMtrigger {


    @Context
    public Transaction tx;

    @Context
    public Log log;


    @Procedure(value = "org.enkelt.procedures.updateUmbrellaSpreadMtrigger",
            name = "org.enkelt.procedures.updateUmbrellaSpreadMtrigger", mode = Mode.WRITE)
    @Description("Description")
    public Stream<LongArrayRecord> updateUmbrellaSpreadMtrigger(@Name("Node") Node mtrigger) {
        long[] longArray = new long[1];
        return Stream.of(new LongArrayRecord(longArray));
    }

    public class LongArrayRecord{
        public long[] value;

        LongArrayRecord(long[] value) {
            this.value= value;
        }
    }
}
