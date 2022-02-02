package sti.hknn.service;

public class Main {
    private StiService stiService;

    public Main(StiService stiService){
        this.stiService = stiService;
    }
    public Main(){

    }
    public static void main(String[] args) {
        Main main = new Main(new StiServiceImpl());
        main.stiService.init();
    }
}
