package org.example.model.entities;

import java.util.List;

public class EndBodyResponse {

    private List<Sources> sources;
    private List<Targets> targets;
    private List<SourcesToTargets> sourcesToTargets;
    private String units;
    private String distance_units;
    private String mode;

    public EndBodyResponse() {
    }

    public EndBodyResponse(List<Sources> sources, List<Targets> targets, List<SourcesToTargets> sourcesToTargets, String units, String distance_units, String mode) {
        this.sources = sources;
        this.targets = targets;
        this.sourcesToTargets = sourcesToTargets;
        this.units = units;
        this.distance_units = distance_units;
        this.mode = mode;
    }


}
