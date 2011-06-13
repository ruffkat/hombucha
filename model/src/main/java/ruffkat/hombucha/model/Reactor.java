package ruffkat.hombucha.model;

import javax.measure.Measure;
import javax.measure.quantity.Volume;
import java.io.Serializable;
import java.util.Date;

public class Reactor implements Serializable, Sourced {
    private Long id;
    private String name;
    private Source source;
    private Date received;
    private Measure<Volume> volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Date getReceived() {
        return received;
    }

    public void setReceived(Date received) {
        this.received = received;
    }

    public Measure<Volume> getVolume() {
        return volume;
    }

    public void setVolume(Measure<Volume> volume) {
        this.volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reactor reactor = (Reactor) o;

        if (name != null ? !name.equals(reactor.name) : reactor.name != null) return false;
        if (received != null ? !received.equals(reactor.received) : reactor.received != null) return false;
        if (source != null ? !source.equals(reactor.source) : reactor.source != null) return false;
        if (volume != null ? !volume.equals(reactor.volume) : reactor.volume != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (source != null ? source.hashCode() : 0);
        result = 31 * result + (received != null ? received.hashCode() : 0);
        result = 31 * result + (volume != null ? volume.hashCode() : 0);
        return result;
    }
}
