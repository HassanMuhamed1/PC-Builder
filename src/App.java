public class App {
    public static void main(String[] args) throws Exception {
        PC gamingPC = new PCBuilder()
        .setCPU("Intel i9-12900K")
        .setGPU("NVIDIA RTX 3080 Ti")
        .setRAM("32GB DDR4")
        .setStorage("2TB NVMe SSD")
        .setPowerSupply("850W 80+ Gold")
        .build();

        System.out.println(gamingPC);
    }
}
