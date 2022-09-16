package org.example;

import org.neo4j.graphdb.*;
import org.neo4j.logging.Log;
import org.neo4j.procedure.*;

import java.util.stream.Stream;

public class LongArrayProcedure {


    @Context
    public Transaction tx;

    @Context
    public Log log;


    @Procedure(value = "org.example.longArrayProcedure",
            name = "org.longArrayProcedure", mode = Mode.WRITE)
    @Description("Description")
    public Stream<LongArrayRecord> longArrayProcedure() {
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
