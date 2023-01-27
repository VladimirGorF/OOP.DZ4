public abstract class Shield implements Protection{
    protected int defence;

    public Shield(int defence) {
        this.defence = defence;
    }

    @Override
    public String toString() {
        return "  defence = " + defence +"\n";
    }

    public int getDefence() {
        return defence;
    }
    
}
