public class OfficePCDirector extends PCDirector{
    public OfficePCDirector(PCBuilder builder) {
        super(builder);
    }

    @Override
    public void directorPC() {
        builder.setCPU("Intel i5-12400")
               .setGPU("Integrated Intel Graphics")
               .setRAM("16GB DDR4")
               .setStorage("1TB SSD")
               .setPowerSupply("500W 80+ Bronze");
    } 

}
