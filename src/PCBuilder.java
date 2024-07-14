public class PCBuilder {
    String CPU;
    String GPU;
    String RAM;
    String storage;
    String powerSupply;

    public PCBuilder setCPU(String CPU){
        this.CPU=CPU;
        return this;
    }
    public PCBuilder setGPU(String GPU){
        this.GPU=GPU;
        return this;
    }
    public PCBuilder setRAM(String RAM){
        this.RAM=RAM;
        return this;
    }
    public PCBuilder setStorage(String storage){
        this.storage=storage;
        return this;
    }
    public PCBuilder setPowerSupply(String powerSupply){
        this.powerSupply=powerSupply;
        return this;
    }

    public PC build(){
        return new PC(this);
    }
}
