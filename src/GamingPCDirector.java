
import java.lang.module.ModuleDescriptor;

public class GamingPCDirector extends PCDirector {
    public GamingPCDirector(PCBuilder builder){
        super(builder);
    }
    @Override
    public void directorPC(){
        builder.setCPU("Intel i9-12900K")
        .setGPU("NVIDIA RTX 3080 Ti")
        .setRAM("32GB DDR5")
        .setStorage("2TB NVMe SSD")
        .setPowerSupply("850W 80+ Gold");
    }
}
