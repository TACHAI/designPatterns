package builderDesgin.ex1.ex2;

import builderDesgin.ex1.Builder;

import java.util.concurrent.CompletableFuture;

/**
 * Create by tachai on 2020-05-12 21:07
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class Computer {
    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    public Computer(){
        throw new RuntimeException("can`t init");
    }

    private Computer(Builder builder){
        cpu = builder.cpu;
        screen = builder.screen;
        memory = builder.memory;
        mainboard = builder.mainboard;
    }
    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;

        public Builder(){}{}
        public Builder cpu(String var){
            cpu =var;
            return this;
        }
        public Builder screen(String var){
            screen = var;
            return this;
        }
        public Builder memory(String var){
            memory = var;
            return this;
        }
        public Builder mianboard(String var){
            mainboard = var;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }
}
