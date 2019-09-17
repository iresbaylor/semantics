package edu.baylor.ecs.cil.gitanalysis.clonereasons;

public enum CloneReason {

    ARGUMENT("Argument is same"),
    DATABASE("Database call is same"),
    HTTP_METHOD(""),
    META_ENTITY(""),
    RETURN_ENTITY(""),
    SECURITY_ROLES("");


    private final String cloneReason;

    CloneReason(String cloneReason) {
        this.cloneReason = cloneReason;
    }

    public String getCloneReason() {
        return this.cloneReason;
    }

}
