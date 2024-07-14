public class PC {
    private String CPU;
    private String GPU;
    private String RAM;
    private String storage;
    private String powerSupply;

    PC(PCBuilder builder){
        this.CPU=builder.CPU;
        this.GPU=builder.GPU;
        this.RAM=builder.RAM;
        this.storage=builder.storage;
        this.powerSupply=builder.powerSupply;
    }
    public String getCPU(){
        return CPU;
    }
    public String getGPU(){
        return GPU;
    }
    public String getRAM(){
        return RAM;
    }
    public String getstorage(){
        return storage;
    }
    public String getpowerSupply(){
        return powerSupply;
    }

    @Override
    public String toString() {
        return "GamingPC:\n" +
                "1-CPU: '" + CPU + '\''+'\n' +
                "2-GPU: '" + GPU + '\''+'\n' +
                "3-RAM: '" + RAM + '\''+'\n' +
                "4-storage: '" + storage + '\''+'\n' +
                "5-powerSupply: '" + powerSupply +'\''+ '\n' ;
    }
}
