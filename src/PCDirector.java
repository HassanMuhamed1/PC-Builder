public abstract class PCDirector {
    protected  PCBuilder builder;
    public PCDirector(PCBuilder builder){
        this.builder=builder;
    }
    public abstract void directorPC(); 
}
