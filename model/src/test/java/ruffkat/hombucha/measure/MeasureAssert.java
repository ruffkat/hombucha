package ruffkat.hombucha.measure;

import org.junit.Assert;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;

public class MeasureAssert extends Assert {

    public static <Q extends Quantity> void assertMeasureEquals(Measure<Q> expected, Measure<Q> observed) {
        assertEquals(expected.getUnit(), observed.getUnit());
        assertEquals(Measurements.decimalValue(expected), Measurements.decimalValue(observed));
    }

    public static <Q extends Quantity> void assertRangeEquals(Range<Q> expected, Range<Q> observed) {
        assertMeasureEquals(expected.getLow(), observed.getLow());
        assertMeasureEquals(expected.getHigh(), observed.getHigh());
    }
}
