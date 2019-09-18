package edu.baylor.ecs.cil.gitanalysis.comparator;

import edu.baylor.ecs.cil.ccmm.properties.HttpMethod;

public class HttpMethodComparator {

    public HttpMethod compare(HttpMethod a, HttpMethod b){
        return (a.equals(b)) ? a : null;
    }

}
