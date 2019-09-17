package edu.baylor.ecs.cil.gitanalysis.comparator;

import edu.baylor.ecs.cil.ccmm.properties.MetaEntity;

public class ReturnEntityComparator {

    public int compare(MetaEntity a, MetaEntity b) {
        return (a.equals(b)) ? 1 : 0;
    }

}
