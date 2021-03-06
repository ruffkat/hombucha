package ruffkat.hombucha.store;

import ruffkat.hombucha.model.Ferment;
import ruffkat.hombucha.model.Sample;

import javax.measure.Measure;
import javax.measure.quantity.Quantity;
import javax.time.TimeSource;

public class SamplesImpl
        extends AbstractRepository<Sample>
        implements Samples {
    private final TimeSource timeSource;

    public SamplesImpl(TimeSource timeSource) {
        super(Sample.class);
        this.timeSource = timeSource;
    }

    @Override
    public <Q extends Quantity> Sample<Q> create(Ferment ferment, Measure<Q> measurement) {
        Sample<Q> sample = new Sample<Q>();
        sample.setFerment(ferment);
        sample.setTaken(timeSource.instant());
        sample.setMeasurement(measurement);
        return sample;
    }
}
