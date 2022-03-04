import java.io.*;
import java.util.Properties;
//원래 답, Properties 클래스를 상속
public class FileProperties extends Properties implements FileIO{
    public void readFromFile(String filename) throws IOException{
        load(new FileInputStream(filename));
    }
    public void writeToFile(String filename) throws IOException{
        store(new FileOutputStream(filename), "written by FileProperties");
    }
    public void setValue(String key, String value){
        setProperty(key, value);
    }
    public String getValue(String key){
        return getProperty(key);
    }
}


/*
내가 작성한 답안, Properties 인스턴스를 위임, 동작은 올바르게 함, throws와 try catch문 중복으로 예외 처리를 해버린듯
public class FileProperties implements FileIO{
    private Properties p;
    public FileProperties(){
        this.p = new Properties();
    }
    public void readFromFile(String filename) throws IOException{
        try(FileReader file = new FileReader(filename)){
            this.p.load(file);
        }
        catch(Exception e){
            e.printStackTrace();
        } 
    }
    public void writeToFile(String filename) throws IOException{
        try(FileWriter file = new FileWriter(filename)){
            this.p.store(file, "written by FileProperties");
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public void setValue(String key, String value){
        p.setProperty(key, value);
    }
    public String getValue(String key){
        return p.getProperty(key);
    }
}
*/