package ruffkat.hombucha.store;

import ruffkat.hombucha.model.Ferment;
import ruffkat.hombucha.model.Sample;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import java.util.Calendar;

public class SamplesImpl
        extends Repository<Sample>
        implements Samples {

    public SamplesImpl() {
        super(Sample.class);
    }

    @Override
    public <Q extends Quantity> Sample<Q> create(Ferment ferment, Measure<Q> measurement) {
        Sample<Q> sample = new Sample<Q>();
        sample.setFerment(ferment);
        sample.setTakenAt(Calendar.getInstance());
        sample.setMeasurement(measurement);
        return sample;
    }
}
