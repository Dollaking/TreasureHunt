package treasurehunt.configuration;

import java.io.File;

public abstract class Configuration {
    private String fileName;
    private File configFile;
    public Configuration (String name){
        this.fileName = name;
    }

    public void saveConfig(){

    }

    public void reloadConfig(){

    }

    public void createConfig() {

    }

    public abstract void loadConfig();

    public String getFileName(){
        return this.fileName;
    }

    public File getFile(){
        return this.configFile;
    }

}
