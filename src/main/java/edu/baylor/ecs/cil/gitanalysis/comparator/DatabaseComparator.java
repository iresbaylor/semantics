package edu.baylor.ecs.cil.gitanalysis.comparator;

import edu.baylor.ecs.cil.ccmm.properties.DatabaseOperation;

public class DatabaseComparator {

    public int compare(DatabaseOperation a, DatabaseOperation b){
        return (a.equals(b)) ? 1 : 0;
    }

}
