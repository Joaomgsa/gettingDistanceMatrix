package org.example.model.entities;

public class SourcesToTargets {

    private Integer distance;
    private Integer time;
    private Integer source_index;
    private Integer target_index;

    public SourcesToTargets() {
    }

    public SourcesToTargets(Integer distance, Integer time, Integer source_index, Integer target_index) {
        this.distance = distance;
        this.time = time;
        this.source_index = source_index;
        this.target_index = target_index;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getSource_index() {
        return source_index;
    }

    public void setSource_index(Integer source_index) {
        this.source_index = source_index;
    }

    public Integer getTarget_index() {
        return target_index;
    }

    public void setTarget_index(Integer target_index) {
        this.target_index = target_index;
    }

    @Override
    public String toString() {
        return "SourcesToTargets{" +
                "distance:" + distance +
                ", time:" + time +
                ", source_index:" + source_index +
                ", target_index:" + target_index +
                '}';
    }

}
