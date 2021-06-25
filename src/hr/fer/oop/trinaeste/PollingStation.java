package hr.fer.oop.trinaeste;

import java.util.Objects;

public class PollingStation {

    private int countyId;
    private String county;
    private String label;
    private String place;

    private int id;
    private String title;
    private String location;
    private String address;

    public PollingStation(int countyId, String county, String label, String place, int id, String title, String location, String address) {
        this.countyId = countyId;
        this.county = county;
        this.label = label;
        this.place = place;
        this.id = id;
        this.title = title;
        this.location = location;
        this.address = address;
    }

    public int getCountyId() {
        return countyId;
    }

    public String getCounty() {
        return county;
    }

    public String getLabel() {
        return label;
    }

    public String getPlace() {
        return place;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.countyId, this.place, this.id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PollingStation other = (PollingStation) obj;
        if (this.countyId != other.countyId) {
            return false;
        }
        if (!Objects.equals(this.place, other.place)) {
            return false;
        }
        return this.id == other.id;
    }      
}
