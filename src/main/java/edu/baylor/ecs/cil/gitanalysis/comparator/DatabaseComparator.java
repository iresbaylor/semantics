package edu.baylor.ecs.cil.gitanalysis.comparator;

import edu.baylor.ecs.cil.ccmm.properties.DatabaseOperation;

public class DatabaseComparator {
    public DatabaseOperation compare(DatabaseOperation a, DatabaseOperation b){
        return (a.equals(b)) ? a : null;
    }
}
