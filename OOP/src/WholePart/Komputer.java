/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WholePart;

/**
 *
 * @author Adit
 */
public class Komputer {
    private final Monitor monitor;
    private final Mouse mouse;
    private final CPU cpu;
    private final Keyboard keyboard;
    
    public Komputer(){
        monitor = new Monitor();
        mouse = new Mouse();
        cpu = new CPU();
        keyboard = new Keyboard();
    }
    
    public void infoKomputer(){
        System.out.println("Tipe Monitor = "+monitor.getTipe());
        System.out.println("Brand Monitor = "+monitor.getBrand());
        System.out.println("Tipe Mouse = "+mouse.getBrand());
        System.out.println("DPI Mouse = "+mouse.getDPI()+" DPI");
        System.out.println("Processor CPU = "+cpu.getProcessor());
        System.out.println("RAM = "+cpu.getRam()+" GB");
        System.out.println("HDD = "+cpu.getHdd()+" GB");
        System.out.println("Brand Keyboard = "+keyboard.getBrand());
    }
    
    public void setMonitor(String tipe, String brand){
        monitor.setTipe(tipe);
        monitor.setBrand(brand);
    }
    
    public void setMouse(String brand, int DPI){
        mouse.setBrand(brand);
        mouse.setDPI(DPI);
    }
    
    public void setMouse(String brand){
        mouse.setBrand(brand);
    }
    
    public void setMouse(int DPI){
        mouse.setDPI(DPI);
    }
    
    public void setCPU(String processor, int ram, int hdd){
        cpu.setProcessor(processor);
        cpu.setRam(ram);
        cpu.setHdd(hdd);
    }
    
    public void setKeyboard(String brand){
        keyboard.setBrand(brand);
    }
}

class Monitor{
    private String tipe;
    private String brand;
    
    public Monitor(){
        this.tipe = "-";
        this.brand = "-";
    }
    
    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}

class Mouse{
    private String brand;
    private int DPI;
    
    public Mouse(){
        this.brand = "-";
        this.DPI = 0;
    }
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDPI() {
        return DPI;
    }

    public void setDPI(int DPI) {
        this.DPI = DPI;
    }
}

class CPU{
    private String processor;
    private int ram;
    private int hdd;

    public CPU(){
        this.processor = "-";
        this.ram = 0;
        this.hdd = 0;
    }
    
    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(int hdd) {
        this.hdd = hdd;
    }
}

class Keyboard{
    private String brand;
    
    public Keyboard(){
        this.brand = "-";
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    
}